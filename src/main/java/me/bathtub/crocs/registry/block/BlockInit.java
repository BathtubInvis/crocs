package me.bathtub.crocs.registry.block;

import me.bathtub.crocs.Crocs;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
    public static final DeferredRegister<Block> ORES = DeferredRegister.create(ForgeRegistries.BLOCKS, Crocs.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Crocs.MOD_ID);

    public static final RegistryObject<OreBlock> CROCIUM_ORE = ORES.register("crocium_ore",
            () -> new OreBlock(
                    AbstractBlock.Properties.create(Material.IRON, MaterialColor.AIR)
                            .sound(SoundType.STONE)
                            .harvestTool(ToolType.PICKAXE)
                            .harvestLevel(3)
                            .setRequiresTool()));
}
