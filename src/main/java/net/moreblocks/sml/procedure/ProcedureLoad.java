package net.moreblocks.sml.procedure;

import net.moreblocks.sml.ElementsMoreblocksMod;

import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.common.MinecraftForge;

import java.util.Map;

import java.io.IOException;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.BufferedWriter;

@ElementsMoreblocksMod.ModElement.Tag
public class ProcedureLoad extends ElementsMoreblocksMod.ModElement {
	public ProcedureLoad(ElementsMoreblocksMod instance) {
		super(instance, 311);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		File bread = new File("MoreBlocks Configs", File.separator + "main");
		bread.mkdirs();
		File main = new File("MoreBlocks Configs", File.separator + "main.json");
		if (!main.exists()) {
			try {
				main.createNewFile();
			} catch (IOException exception) {
				exception.printStackTrace();
			}
		}
		File config = new File("MoreBlocks Configs", File.separator + "Spawn-config.json");
		if (!config.exists()) {
			try {
				config.createNewFile();
			} catch (IOException exception) {
				exception.printStackTrace();
			}
		}
		File Big = new File("MoreBlocks Configs", File.separator + "main.locale");
		if (!Big.exists()) {
			try {
				Big.createNewFile();
			} catch (IOException exception) {
				exception.printStackTrace();
			}
		}
		try {
			FileWriter mainwriter = new FileWriter(main);
			BufferedWriter mainbw = new BufferedWriter(mainwriter);
			{
				mainbw.write("{");
				mainbw.newLine();
			}
			{
				mainbw.write("    \"Load config\":\"True\",");
				mainbw.newLine();
			}
			{
				mainbw.write("    \"Version\":\"2.4.5\",");
				mainbw.newLine();
			}
			{
				mainbw.write("    \"ModId\":\"moreblocks\",");
				mainbw.newLine();
			}
			{
				mainbw.write("    \"Name\":\"More Blocks\",");
				mainbw.newLine();
			}
			{
				mainbw.write("    \"Config-Version\":\"1.0.0\"");
				mainbw.newLine();
			}
			{
				mainbw.write("}");
			}
			mainbw.close();
			mainwriter.close();
		} catch (FileNotFoundException fileNotFoundException) {
			fileNotFoundException.printStackTrace();
		} catch (IOException exception) {
			exception.printStackTrace();
		}
		try {
			FileWriter configwriter = new FileWriter(config);
			BufferedWriter configbw = new BufferedWriter(configwriter);
			{
				configbw.write("{");
				configbw.newLine();
			}
			{
				configbw.write("    //# False");
				configbw.newLine();
			}
			{
				configbw.write("    \"Bread_foxes\":\"false\",");
				configbw.newLine();
			}
			{
				configbw.write("    //# False");
				configbw.newLine();
			}
			{
				configbw.write("    \"Spawn_9_Tailed_Foxes\":\"false\",");
				configbw.newLine();
			}
			{
				configbw.write("    //# False");
				configbw.newLine();
			}
			{
				configbw.write("    \"Spawn_Foxes\":\"false\",");
				configbw.newLine();
			}
			{
				configbw.write("    //# True");
				configbw.newLine();
			}
			{
				configbw.write("    \"Hide Auto Tamed Fox Name\":\"true\"");
				configbw.newLine();
			}
			{
				configbw.write("}");
			}
			configbw.close();
			configwriter.close();
		} catch (FileNotFoundException fileNotFoundException) {
			fileNotFoundException.printStackTrace();
		} catch (IOException exception) {
			exception.printStackTrace();
		}
		try {
			FileWriter Bigwriter = new FileWriter(Big);
			BufferedWriter Bigbw = new BufferedWriter(Bigwriter);
			{
				Bigbw.write("{");
				Bigbw.newLine();
			}
			{
				Bigbw.write("    //# False");
				Bigbw.newLine();
			}
			{
				Bigbw.write("    \"Bread_foxes\":\"false\",");
				Bigbw.newLine();
			}
			{
				Bigbw.write("    //# False");
				Bigbw.newLine();
			}
			{
				Bigbw.write("    \"Spawn_9_Tailed_Foxes\":\"false\",");
				Bigbw.newLine();
			}
			{
				Bigbw.write("    //# False");
				Bigbw.newLine();
			}
			{
				Bigbw.write("    \"Spawn_Foxes\":\"false\",");
				Bigbw.newLine();
			}
			{
				Bigbw.write("    //# True");
				Bigbw.newLine();
			}
			{
				Bigbw.write("    \"Hide Auto Tamed Fox Name\":\"true\"");
				Bigbw.newLine();
			}
			{
				Bigbw.write("},");
				Bigbw.newLine();
			}
			{
				Bigbw.write("{");
				Bigbw.newLine();
			}
			{
				Bigbw.write("    \"Load config\":\"True\",");
				Bigbw.newLine();
			}
			{
				Bigbw.write("    \"Version\":\"2.4.5\",");
				Bigbw.newLine();
			}
			{
				Bigbw.write("    \"ModId\":\"moreblocks\",");
				Bigbw.newLine();
			}
			{
				Bigbw.write("    \"Name\":\"More Blocks\",");
				Bigbw.newLine();
			}
			{
				Bigbw.write("    \"Config-Version\":\"1.0.0\"");
				Bigbw.newLine();
			}
			{
				Bigbw.write("}");
			}
			Bigbw.close();
			Bigwriter.close();
		} catch (FileNotFoundException fileNotFoundException) {
			fileNotFoundException.printStackTrace();
		} catch (IOException exception) {
			exception.printStackTrace();
		}
		System.out.println("Config File Loaded");
	}

	@Override
	public void init(FMLInitializationEvent event) {
		this.executeProcedure(new java.util.HashMap<>());
	}

	@Override
	public void preInit(FMLPreInitializationEvent event) {
		MinecraftForge.EVENT_BUS.register(this);
	}
}
