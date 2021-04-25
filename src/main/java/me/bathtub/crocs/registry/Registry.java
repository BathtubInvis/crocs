package me.bathtub.crocs.registry;

import me.bathtub.crocs.registry.item.ItemInit;
import net.minecraftforge.eventbus.api.IEventBus;

public class Registry {
    public static void register(IEventBus bus) {
        ItemInit.ITEMS.register(bus);
    }
}
