
public static class ModelTravelersBackpackItem extends BlockItem {
	private final Block block;

	public ModelTravelersBackpackItem(Block block) {
		super(block, new Item.Properties().group(Reference.TRAVELERS_BACKPACK_TAB).maxStackSize(1)
				.setISTER(() -> TravelersBackpackItemStackRenderer::new));
		this.block = block;
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
		ItemStack itemstack = playerIn.getHeldItem(handIn);

		if (!worldIn.isRemote) {
			if (handIn == Hand.MAIN_HAND) {
				if (itemstack.getItem() == this && !playerIn.isSneaking()) {
					TravelersBackpackInventory.openGUI((ServerPlayerEntity) playerIn,
							playerIn.inventory.getCurrentItem(), Reference.TRAVELERS_BACKPACK_ITEM_SCREEN_ID);
				}
			}
		}
		return ActionResult.resultPass(itemstack);
	}

	@Override
	public ActionResultType onItemUse(ItemUseContext context) {
		BlockPos pos = context.getPos();
		PlayerEntity player = context.getPlayer();
		World world = context.getWorld();

		if (context.getHand() == Hand.MAIN_HAND && !player.isSneaking()) {
			return ActionResultType.FAIL;
		}

		BlockState blockState = context.getWorld().getBlockState(context.getPos());

		if (!blockState.isReplaceable(new BlockItemUseContext(context))) {
			pos = pos.offset(context.getFace());
		}

		ItemStack stack = player.getHeldItem(context.getHand());

		if (!stack.isEmpty() && player.canPlayerEdit(pos, context.getPlacementHorizontalFacing(), stack)) {
			BlockState blockState1 = block.getStateForPlacement(new BlockItemUseContext(context));

			if (placeBlockAt(stack, player, world, pos, blockState1)) {
				if (stack.getTag() != null) {
					if (world.getTileEntity(pos) instanceof TravelersBackpackTileEntity) {
						((TravelersBackpackTileEntity) world.getTileEntity(pos)).loadAllData(stack.getTag());
					}
					// ((TravelersBackpackTileEntity)world.getTileEntity(pos)).loadAllData(stack.getTag());
				}
				blockState1 = world.getBlockState(pos);
				SoundType soundtype = blockState1.getBlock().getSoundType(blockState1, world, pos, player);
				world.playSound(player, pos, soundtype.getPlaceSound(), SoundCategory.BLOCKS,
						(soundtype.getVolume() + 1.0F) / 2.0F, soundtype.getPitch() * 0.8F);
				stack.shrink(1);
			}
			return ActionResultType.SUCCESS;
		} else {
			return ActionResultType.FAIL;
		}
	}

	public boolean placeBlockAt(ItemStack stack, PlayerEntity player, World world, BlockPos pos, BlockState newState) {
		if (!world.setBlockState(pos, newState, 11)) {
			return false;
		}

		BlockState state = world.getBlockState(pos);

		if (state.getBlock() == block) {
			setTileEntityNBT(world, player, pos, stack);
			block.onBlockPlacedBy(world, pos, state, player, stack);

			if (player instanceof ServerPlayerEntity) {
				CriteriaTriggers.PLACED_BLOCK.trigger((ServerPlayerEntity) player, pos, stack);
			}
		}
		return true;
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public ITextComponent getDisplayName(ItemStack stack) {
		return new TranslationTextComponent("block.travelersbackpack.travelers_backpack");
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip,
			ITooltipFlag flagIn) {
		tooltip.add(new TranslationTextComponent(this.getTranslationKey()).mergeStyle(TextFormatting.BLUE));
	}

	@Nullable
	@Override
	public ICapabilityProvider initCapabilities(ItemStack stack, @Nullable CompoundNBT nbt) {
		if (TravelersBackpack.enableCurios()) {
			return new ICapabilityProvider() {
				final LazyOptional<ICurio> curio = LazyOptional.of(TravelersBackpackCurios::createBackpackProvider);

				@Nonnull
				@Override
				public <T> LazyOptional<T> getCapability(@Nonnull Capability<T> cap, @Nullable Direction side) {
					return CuriosCapability.ITEM.orEmpty(cap, curio);
				}
			};
		}
		return null;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
	}
}
