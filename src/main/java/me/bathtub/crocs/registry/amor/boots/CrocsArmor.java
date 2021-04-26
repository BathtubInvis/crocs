package me.bathtub.crocs.registry.amor.boots;

import me.bathtub.crocs.Crocs;
import me.bathtub.crocs.client.renderer.entity.model.ClientReference;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class CrocsArmor extends ArmorItem {
    private static int healthBuffer = 0;

    public CrocsArmor(IArmorMaterial materialIn, EquipmentSlotType slot, Properties builderIn) {
        super(materialIn, slot, builderIn);
    }

    @Override
    public void onArmorTick(ItemStack stack, World world, PlayerEntity player) {
        healthBuffer++;
        if (healthBuffer >= 1200) {
            healthBuffer = 0;
            player.addPotionEffect(new EffectInstance(Effects.REGENERATION, 60, 255));
        }
    }

    @Nullable
    @Override
    public <A extends BipedModel<?>> A getArmorModel(LivingEntity entityLiving, ItemStack itemStack, EquipmentSlotType armorSlot, A _default) {
        return Crocs.SIDED_SYSTEM.getCrocsArmorModel(armorSlot);
    }
}
