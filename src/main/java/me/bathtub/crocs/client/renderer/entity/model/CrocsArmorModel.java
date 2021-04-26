// Made with Blockbench 3.8.3
// Exported for Minecraft version 1.15 - 1.16
// Paste this class into your mod and generate all required imports
package me.bathtub.crocs.client.renderer.entity.model;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;

public class CrocsArmorModel extends BipedModel<LivingEntity> {
	private final ModelRenderer rightCroc;
	private final ModelRenderer leftCroc;

	public CrocsArmorModel(float modelSize) {
		super(modelSize, 0.0F, 64, 32);

		rightCroc = new ModelRenderer(this);
		bipedRightLeg.addChild(rightCroc);
		setRotationAngle(rightCroc, 0.0F, 0.0F, 0.0F);
		rightCroc.setTextureOffset(48, 26).addBox(-2.0F, 10.0F, -6.0F, 4.0F, 2.0F, 4.0F, 0.0F, false);

		leftCroc = new ModelRenderer(this);
		bipedLeftLeg.addChild(leftCroc);
		setRotationAngle(leftCroc, 0.0F, 0.0F, 0.0F);
		leftCroc.setTextureOffset(48, 26).addBox(-1.8F, 10.0F, -6.0F, 4.0F, 2.0F, 4.0F, 0.0F, false);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}