package me.bathtub.crocs.registry.amor;

import me.bathtub.crocs.Crocs;
import me.bathtub.crocs.registry.amor.armorEnum.ArmorMaterials;
import me.bathtub.crocs.registry.amor.boots.CrocsArmor;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ArmorInit {
    public static final DeferredRegister<Item> ARMOR = DeferredRegister.create(ForgeRegistries.ITEMS, Crocs.MOD_ID);

    public static final RegistryObject<ArmorItem> CROCS = ARMOR.register("crocs", () -> new CrocsArmor(ArmorMaterials.crocs, EquipmentSlotType.FEET, new Item.Properties().isImmuneToFire().group(Crocs.ItemGroups.MATERIALS)));
}
