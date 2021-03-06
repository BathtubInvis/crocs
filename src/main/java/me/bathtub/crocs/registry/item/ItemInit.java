package me.bathtub.crocs.registry.item;

import me.bathtub.crocs.Crocs;
import me.bathtub.crocs.registry.block.BlockInit;
import me.bathtub.crocs.registry.item.tools.ToolMaterials;
import me.bathtub.crocs.registry.item.tools.pickaxe.CrociumPickaxe;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Crocs.MOD_ID);

    public static final RegistryObject<Item> CROCIUM_INGOT = ITEMS.register("crocium_ingot", () -> new Item(new Item.Properties().isImmuneToFire().group(Crocs.ItemGroups.MATERIALS)));

    public static final RegistryObject<CrociumPickaxe> CROCIUM_PICKAXE = ITEMS.register("crocium_pickaxe", () -> new CrociumPickaxe(ToolMaterials.CROCIUM, 0, 5.8F, new Item.Properties().isImmuneToFire().group(Crocs.ItemGroups.MATERIALS)));

    public static void register(IEventBus bus) {
        registerBlockItems();
        ITEMS.register(bus);
    }

    private static void registerBlockItems() {
        BlockInit.ORES.getEntries().forEach((E) -> {
            ITEMS.register(E.getId().getPath(), () -> new BlockItem(E.get(), new Item.Properties().group(Crocs.ItemGroups.MATERIALS)));
        });
        BlockInit.BLOCKS.getEntries().forEach((E) -> {
            ITEMS.register(E.getId().getPath(), () -> new BlockItem(E.get(), new Item.Properties().group(Crocs.ItemGroups.BUILDING_BLOCKS)));
        });
    }
}
