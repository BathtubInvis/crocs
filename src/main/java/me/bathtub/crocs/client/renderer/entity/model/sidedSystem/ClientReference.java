package me.bathtub.crocs.client.renderer.entity.model.sidedSystem;

import me.bathtub.crocs.client.renderer.entity.model.CrocsArmorModel;
import me.bathtub.crocs.client.renderer.entity.model.TopHatArmorModel;
import net.minecraft.inventory.EquipmentSlotType;

@SuppressWarnings("unchecked")
public class ClientReference implements ISidedReference {
    private final CrocsArmorModel crocsArmorModel = new CrocsArmorModel(1.0F);
    private final CrocsArmorModel crocsArmorBoots = new CrocsArmorModel(0.5F);

    private final TopHatArmorModel topHatArmorModel = new TopHatArmorModel(1.0F);
    private final TopHatArmorModel topHatHelmet = new TopHatArmorModel(0.5F);

    @Override
    public <A> A getCrocsArmorModel(EquipmentSlotType armorSlot) {
        return (A) (armorSlot == EquipmentSlotType.FEET ? crocsArmorBoots : crocsArmorModel);
    }

    @Override
    public <A> A getTopHatArmorModel(EquipmentSlotType armorSlot) {
        return (A) (armorSlot == EquipmentSlotType.HEAD ? topHatHelmet : topHatArmorModel);
    }
}
