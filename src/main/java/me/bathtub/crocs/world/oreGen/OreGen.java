package me.bathtub.crocs.world.oreGen;

import me.bathtub.crocs.registry.block.BlockInit;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.template.BlockMatchRuleTest;
import net.minecraft.world.gen.feature.template.RuleTest;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class OreGen {
    public static final RuleTest BASE_STONE_END = new BlockMatchRuleTest(Blocks.END_STONE);

    public static void generateOres(final BiomeLoadingEvent e) {
        if(!(e.getCategory().equals(Biome.Category.NETHER) || e.getCategory().equals(Biome.Category.THEEND))) {

        }
        else if (e.getCategory().equals(Biome.Category.NETHER)) {

        }
        else if (e.getCategory().equals(Biome.Category.THEEND)) {
            generateOre(e.getGeneration(), BASE_STONE_END, BlockInit.CROCIUM_ORE.get().getDefaultState(), 4, 0, 255, 4);
        }
    }

    private static void generateOre(BiomeGenerationSettingsBuilder settings, RuleTest fillerType, BlockState state, int veinSize, int minHeight, int maxHeight, int amountPerChunk) {
        settings.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                Feature.ORE.withConfiguration(new OreFeatureConfig(fillerType, state, veinSize)).withPlacement(Placement.RANGE.configure(new TopSolidRangeConfig(minHeight, 0, maxHeight)))
                        .square().count(amountPerChunk));
    }
}
