package me.bathtub.crocs.data;

import me.bathtub.crocs.Crocs;
import me.bathtub.crocs.data.client.ModBlockStateProvider;
import me.bathtub.crocs.data.client.ModItemModelProvider;
import me.bathtub.crocs.data.common.ModLootTableProvider;
import me.bathtub.crocs.data.common.ModRecipeProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = Crocs.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator gen = event.getGenerator();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        gen.addProvider(new ModLootTableProvider(gen));
        gen.addProvider(new ModRecipeProvider(gen));
        gen.addProvider(new ModBlockStateProvider(gen, existingFileHelper));
        gen.addProvider(new ModItemModelProvider(gen, existingFileHelper));
    }
}
