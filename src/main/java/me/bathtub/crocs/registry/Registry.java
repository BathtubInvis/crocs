package me.bathtub.crocs.registry;

import me.bathtub.crocs.registry.amor.ArmorInit;
import me.bathtub.crocs.registry.block.BlockInit;
import me.bathtub.crocs.registry.item.ItemInit;
import net.minecraftforge.eventbus.api.IEventBus;

public class Registry {
    public static void register(IEventBus bus) {
        ArmorInit.ARMOR.register(bus);
        BlockInit.BLOCKS.register(bus);
        ItemInit.ITEMS.register(bus);
    }
}
