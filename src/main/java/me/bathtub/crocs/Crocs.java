package me.bathtub.crocs;

import me.bathtub.crocs.client.renderer.entity.model.ClientReference;
import me.bathtub.crocs.registry.Registry;
import me.bathtub.crocs.registry.item.ItemInit;
import me.bathtub.crocs.world.oreGen.OreGen;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("crocs")
public class Crocs {
    public static final String MOD_ID = "crocs";
    private static final Logger LOGGER = LogManager.getLogger();
    public static final ClientReference SIDED_SYSTEM = new ClientReference();

    public Crocs() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        bus.addListener(this::setup);

        Registry.register(bus);

        MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, OreGen::generateOres);
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {}

    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {
        LOGGER.info("HELLO ENJOY YOUR CROCS");
    }

    public static class ItemGroups {
        public static final ItemGroup MATERIALS = new MATERIALS("materials");

        private static class MATERIALS extends ItemGroup {
            public MATERIALS(String label) {
                super(label);
            }

            @Override
            public ItemStack createIcon() {
                return ItemInit.CROCIUM_INGOT.get().getDefaultInstance();
            }
        }
    }
}
