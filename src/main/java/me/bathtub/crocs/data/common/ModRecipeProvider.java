package me.bathtub.crocs.data.common;

import me.bathtub.crocs.Crocs;
import me.bathtub.crocs.registry.amor.ArmorInit;
import me.bathtub.crocs.registry.item.ItemInit;
import net.minecraft.data.*;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider {
    public ModRecipeProvider(DataGenerator generatorIn) {
        super(generatorIn);
    }
    @Override
    protected void registerRecipes(Consumer<IFinishedRecipe> consumer) {
        CookingRecipeBuilder.smeltingRecipe(getIngredientFromItem(ItemInit.CROCIUM_ORE.get()), ItemInit.CROCIUM_INGOT.get(), 0.7f, 200)
                .addCriterion("has_item", hasItem(ItemInit.CROCIUM_ORE.get()))
                .build(consumer, recipeID("crocium_ingot_smelting"));
        CookingRecipeBuilder.blastingRecipe(getIngredientFromItem(ItemInit.CROCIUM_ORE.get()), ItemInit.CROCIUM_INGOT.get(), 0.7f, 100)
                .addCriterion("has_item", hasItem(ItemInit.CROCIUM_ORE.get()))
                .build(consumer, recipeID("crocium_ingot_blasting"));

        ShapedRecipeBuilder.shapedRecipe(ArmorInit.CROCS.get(), 1)
                .patternLine("# #")
                .patternLine("# #")
                .key('#', ItemInit.CROCIUM_INGOT.get())
                .addCriterion("has_item", hasItem(ItemInit.CROCIUM_INGOT.get()))
                .build(consumer);
    }

    private static ResourceLocation recipeID(String path) {
        return new ResourceLocation(Crocs.MOD_ID, path);
    }

    private static Ingredient getIngredientFromItem(Item item) {
        return Ingredient.fromItems(item);
    }
}
