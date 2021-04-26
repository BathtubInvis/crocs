package me.bathtub.crocs.client.renderer.entity.model;

import net.minecraft.inventory.EquipmentSlotType;

public class ClientReference implements ISidedReference {
    private final CrocsArmorModel crocsArmorModel = new CrocsArmorModel(1.0F);
    private final CrocsArmorModel crocsArmorBoots = new CrocsArmorModel(0.5F);

    @SuppressWarnings("unchecked")
    @Override
    public <A> A getCrocsArmorModel(EquipmentSlotType armorSlot) {
        return (A) (armorSlot == EquipmentSlotType.FEET ? crocsArmorBoots : crocsArmorModel);
    }
}
