
public static class ModelTravelersBackpackBlock extends Block {
	public static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;
	private static final VoxelShape BACKPACK_SHAPE_NORTH = Block.makeCuboidShape(1.0D, 0.0D, 4.0D, 15.0D, 10.0D, 12.0D);
	private static final VoxelShape BACKPACK_SHAPE_SOUTH = Block.makeCuboidShape(1.0D, 0.0D, 4.0D, 15.0D, 10.0D, 12.0D);
	private static final VoxelShape BACKPACK_SHAPE_EAST = Block.makeCuboidShape(4.0D, 0.0D, 1.0D, 12.0D, 10.0D, 15.0D);
	private static final VoxelShape BACKPACK_SHAPE_WEST = Block.makeCuboidShape(4.0D, 0.0D, 1.0D, 12.0D, 10.0D, 15.0D);

	public ModelTravelersBackpackBlock(Block.Properties builder) {
		super(builder.hardnessAndResistance(1.0F, Float.MAX_VALUE).harvestLevel(0));
		this.setDefaultState(this.stateContainer.getBaseState().with(FACING, Direction.NORTH));
	}

	@Override
	public BlockRenderType getRenderType(BlockState state) {
		return BlockRenderType.ENTITYBLOCK_ANIMATED;
	}

	@Override
	public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
		switch (state.get(FACING)) {
			case SOUTH :
				return BACKPACK_SHAPE_SOUTH;
			case EAST :
				return BACKPACK_SHAPE_EAST;
			case WEST :
				return BACKPACK_SHAPE_WEST;
			default :
				return BACKPACK_SHAPE_NORTH;
		}
	}

	@Override
	public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player,
			Hand handIn, BlockRayTraceResult hit) {
		if (worldIn.getTileEntity(pos) instanceof TravelersBackpackTileEntity) {
			TravelersBackpackTileEntity te = (TravelersBackpackTileEntity) worldIn.getTileEntity(pos);

			if (TravelersBackpackConfig.SERVER.enableBackpackBlockWearable.get()) {
				if (player.isSneaking() && !worldIn.isRemote) {
					if (!CapabilityUtils.isWearingBackpack(player)) {
						if (!TravelersBackpack.enableCurios()) {
							if (worldIn.setBlockState(pos, Blocks.AIR.getDefaultState(), 7)) {
								ItemStack stack = new ItemStack(asItem(), 1);
								te.transferToItemStack(stack);
								CapabilityUtils.equipBackpack(player, stack);

								if (te.isSleepingBagDeployed()) {
									Direction bagDirection = state.get(TravelersBackpackBlock.FACING);
									worldIn.setBlockState(pos.offset(bagDirection), Blocks.AIR.getDefaultState());
									worldIn.setBlockState(pos.offset(bagDirection).offset(bagDirection),
											Blocks.AIR.getDefaultState());
								}
							} else {
								player.sendMessage(new TranslationTextComponent(Reference.FAIL), player.getUniqueID());
							}
						} else {
							player.sendMessage(new TranslationTextComponent(Reference.FAIL), player.getUniqueID());
						}
					} else {
						player.sendMessage(new TranslationTextComponent(Reference.OTHER_BACKPACK),
								player.getUniqueID());
					}
				} else {
					te.openGUI(player, te, pos);
				}
			} else {
				te.openGUI(player, te, pos);
			}
		}
		return ActionResultType.SUCCESS;
	}

	@Override
	public void onExplosionDestroy(World worldIn, BlockPos pos, Explosion explosionIn) {
	}

	@Override
	public void onBlockExploded(final BlockState state, final World world, final BlockPos pos,
			final Explosion explosion) {
		return;
	}

	/*
	 * @Override public void onReplaced(BlockState state, World world, BlockPos pos,
	 * BlockState newState, boolean isMoving) { TileEntity te =
	 * world.getTileEntity(pos);
	 * 
	 * if(te instanceof TravelersBackpackTileEntity && !world.isRemote()) {
	 * ((TravelersBackpackTileEntity)te).drop(world, pos, asItem());
	 * 
	 * if(((TravelersBackpackTileEntity)te).isSleepingBagDeployed()) { Direction
	 * direction = state.get(FACING); world.setBlockState(pos.offset(direction),
	 * Blocks.AIR.getDefaultState());
	 * world.setBlockState(pos.offset(direction).offset(direction),
	 * Blocks.AIR.getDefaultState()); } } world.setBlockState(pos,
	 * Blocks.AIR.getDefaultState(), world.isRemote ? 11 : 3);
	 * super.onReplaced(state, world, pos, newState, isMoving); }
	 */

	@Override
	public void onBlockHarvested(World worldIn, BlockPos pos, BlockState state, PlayerEntity player) {
		TileEntity te = worldIn.getTileEntity(pos);

		if (te instanceof TravelersBackpackTileEntity && !worldIn.isRemote()) {
			((TravelersBackpackTileEntity) te).drop(worldIn, pos, asItem());

			if (((TravelersBackpackTileEntity) te).isSleepingBagDeployed()) {
				Direction direction = state.get(FACING);
				worldIn.setBlockState(pos.offset(direction), Blocks.AIR.getDefaultState());
				worldIn.setBlockState(pos.offset(direction).offset(direction), Blocks.AIR.getDefaultState());
			}
		}

		worldIn.setBlockState(pos, Blocks.AIR.getDefaultState(), worldIn.isRemote ? 11 : 3);

		super.onBlockHarvested(worldIn, pos, state, player);
	}

	@Override
	public BlockState getStateForPlacement(BlockItemUseContext context) {
		return this.getDefaultState().with(FACING, context.getPlacementHorizontalFacing().getOpposite());
	}

	@Override
	protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
		builder.add(FACING);
	}

	@Override
	public ItemStack getPickBlock(BlockState state, RayTraceResult target, IBlockReader world, BlockPos pos,
			PlayerEntity player) {
		ItemStack stack = new ItemStack(asItem(), 1);

		if (world.getTileEntity(pos) instanceof TravelersBackpackTileEntity) {
			TravelersBackpackTileEntity te = (TravelersBackpackTileEntity) world.getTileEntity(pos);
			te.transferToItemStack(stack);
		}
		return stack;
	}

	@Override
	public boolean hasTileEntity(BlockState state) {
		return true;
	}

	@Override
	public TileEntity createTileEntity(BlockState state, IBlockReader world) {
		return new TravelersBackpackTileEntity();
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
	}
}