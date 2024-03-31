
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.jojohe.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.jojohe.block.RedWoolStairsBlock;
import net.mcreator.jojohe.block.MagentaWallpaperDarkOakBlock;
import net.mcreator.jojohe.block.MagentaWallpaperBlock;
import net.mcreator.jojohe.block.LimestoneStairsBlock;
import net.mcreator.jojohe.block.LimestoneSlabsBlock;
import net.mcreator.jojohe.block.LimestoneBricksBlock;
import net.mcreator.jojohe.block.LimestoneBrickStairsBlock;
import net.mcreator.jojohe.block.LimestoneBrickSlabsBlock;
import net.mcreator.jojohe.block.LimestoneBlock;
import net.mcreator.jojohe.block.FancyWhiteTrapdoorBlock;
import net.mcreator.jojohe.block.FancyWhiteDoorBlock;
import net.mcreator.jojohe.block.DarkOakPanelBlock;
import net.mcreator.jojohe.block.DarkBlueWoolBlock;
import net.mcreator.jojohe.block.ChiseledLimestoneBlock;
import net.mcreator.jojohe.JojoheMod;

public class JojoheModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, JojoheMod.MODID);
	public static final RegistryObject<Block> MAGENTA_WALLPAPER_DARK_OAK = REGISTRY.register("magenta_wallpaper_dark_oak", () -> new MagentaWallpaperDarkOakBlock());
	public static final RegistryObject<Block> MAGENTA_WALLPAPER = REGISTRY.register("magenta_wallpaper", () -> new MagentaWallpaperBlock());
	public static final RegistryObject<Block> DARK_BLUE_WOOL = REGISTRY.register("dark_blue_wool", () -> new DarkBlueWoolBlock());
	public static final RegistryObject<Block> RED_WOOL_STAIRS = REGISTRY.register("red_wool_stairs", () -> new RedWoolStairsBlock());
	public static final RegistryObject<Block> LIMESTONE = REGISTRY.register("limestone", () -> new LimestoneBlock());
	public static final RegistryObject<Block> LIMESTONE_BRICKS = REGISTRY.register("limestone_bricks", () -> new LimestoneBricksBlock());
	public static final RegistryObject<Block> CHISELED_LIMESTONE = REGISTRY.register("chiseled_limestone", () -> new ChiseledLimestoneBlock());
	public static final RegistryObject<Block> LIMESTONE_BRICK_STAIRS = REGISTRY.register("limestone_brick_stairs", () -> new LimestoneBrickStairsBlock());
	public static final RegistryObject<Block> LIMESTONE_STAIRS = REGISTRY.register("limestone_stairs", () -> new LimestoneStairsBlock());
	public static final RegistryObject<Block> LIMESTONE_SLABS = REGISTRY.register("limestone_slabs", () -> new LimestoneSlabsBlock());
	public static final RegistryObject<Block> LIMESTONE_BRICK_SLABS = REGISTRY.register("limestone_brick_slabs", () -> new LimestoneBrickSlabsBlock());
	public static final RegistryObject<Block> FANCY_WHITE_DOOR = REGISTRY.register("fancy_white_door", () -> new FancyWhiteDoorBlock());
	public static final RegistryObject<Block> FANCY_WHITE_TRAPDOOR = REGISTRY.register("fancy_white_trapdoor", () -> new FancyWhiteTrapdoorBlock());
	public static final RegistryObject<Block> DARK_OAK_PANEL = REGISTRY.register("dark_oak_panel", () -> new DarkOakPanelBlock());
}
