package me.bathtub.crocs.client.renderer.entity.model.sidedSystem;

import net.minecraft.inventory.EquipmentSlotType;

public interface ISidedReference {
    default <A> A getCrocsArmorModel(EquipmentSlotType armorSlot) {
        return null;
    }
    default <A> A getTopHatArmorModel(EquipmentSlotType armorSlot) {
        return null;
    }
}
