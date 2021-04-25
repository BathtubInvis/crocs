package me.bathtub.crocs.registry.item.tools.pickaxe;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.OreBlock;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.item.ExperienceOrbEntity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

public class CrociumPickaxe extends PickaxeItem {
    public CrociumPickaxe(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builder) {
        super(tier, attackDamageIn, attackSpeedIn, builder);
    }


    @Override
    public boolean onBlockDestroyed(ItemStack stack, World worldIn, BlockState state, BlockPos pos, LivingEntity entityLiving) {
        if (state.getBlock() instanceof OreBlock) {
            Random r = new Random();

            int x = pos.getX();
            int y = pos.getY();
            int z = pos.getZ();

            PlayerEntity player = (PlayerEntity) entityLiving;
            ItemEntity entity = new ItemEntity(worldIn, x, y, z, (worldIn.getRecipeManager().getRecipe(IRecipeType.SMELTING, new Inventory((new ItemStack((worldIn.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock()))), worldIn).isPresent() ? worldIn.getRecipeManager().getRecipe(IRecipeType.SMELTING, new Inventory((new ItemStack((worldIn.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock()))), worldIn).get().getRecipeOutput().copy() : ItemStack.EMPTY));
            ExperienceOrbEntity xpOrb = new ExperienceOrbEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), r.nextInt(20));
            worldIn.setBlockState(pos, Blocks.AIR.getDefaultState());
            worldIn.addEntity(entity);
            worldIn.addEntity(xpOrb);
        }
        return super.onBlockDestroyed(stack, worldIn, state, pos, entityLiving);
    }

    @Override
    public boolean isImmuneToFire() {
        return true;
    }
}
