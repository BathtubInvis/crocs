package me.bathtub.crocs.data.client;

import me.bathtub.crocs.Crocs;
import me.bathtub.crocs.registry.block.BlockInit;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, Crocs.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        //simpleBlock(BlockInit.CROCIUM_ORE.get());
    }
}
