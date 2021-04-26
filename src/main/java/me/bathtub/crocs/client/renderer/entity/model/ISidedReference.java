package me.bathtub.crocs.client.renderer.entity.model;

import net.minecraft.inventory.EquipmentSlotType;

public interface ISidedReference {
    default <A> A getCrocsArmorModel(EquipmentSlotType armorSlot) {
        return null;
    }
}
