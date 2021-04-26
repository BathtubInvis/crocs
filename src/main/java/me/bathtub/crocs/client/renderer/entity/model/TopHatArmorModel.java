package me.bathtub.crocs.client.renderer.entity.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;

public class TopHatArmorModel extends BipedModel<LivingEntity> {
	private final ModelRenderer helmet;
	private final ModelRenderer hat;
	private final ModelRenderer main;
	private final ModelRenderer cube_r1;
	private final ModelRenderer chain;
	private final ModelRenderer cube_r2;
	private final ModelRenderer s;
	private final ModelRenderer SMain;

	public TopHatArmorModel(float modelSize) {
		super(modelSize, 0.0F, 64, 64);

		bipedHeadwear = new ModelRenderer(this);
		bipedHead = new ModelRenderer(this);

		helmet = new ModelRenderer(this);
		helmet.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		hat = new ModelRenderer(this);
		hat.setRotationPoint(0.0F, 0.0F, 0.0F);
		helmet.addChild(hat);
		

		main = new ModelRenderer(this);
		main.setRotationPoint(0.0F, 0.0F, 0.0F);
		hat.addChild(main);
		main.setTextureOffset(0, 13).addBox(-4.0F, -43.0F, -4.0F, 8.0F, 10.0F, 8.0F, 0.0F, false);
		main.setTextureOffset(24, 13).addBox(-3.5F, -44.0F, -3.5F, 7.0F, 1.0F, 7.0F, 0.0F, false);
		main.setTextureOffset(32, 21).addBox(-3.5F, -43.5F, -3.75F, 7.0F, 1.0F, 1.0F, 0.0F, false);
		main.setTextureOffset(31, 30).addBox(-3.5F, -43.5F, 2.75F, 7.0F, 1.0F, 1.0F, 0.0F, false);
		main.setTextureOffset(0, 0).addBox(-6.0F, -33.0F, -6.0F, 12.0F, 1.0F, 12.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-8.0F, -43.0F, 3.25F);
		main.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, -1.5708F, 0.0F);
		cube_r1.setTextureOffset(4, 33).addBox(-0.5F, -0.5F, -11.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(8, 33).addBox(-0.5F, -0.5F, -5.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(12, 33).addBox(-7.0F, -0.5F, -5.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(16, 33).addBox(-7.0F, -0.5F, -11.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(0, 31).addBox(-6.75F, -0.5F, -11.75F, 7.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(16, 31).addBox(-6.75F, -0.5F, -5.25F, 7.0F, 1.0F, 1.0F, 0.0F, false);

		chain = new ModelRenderer(this);
		chain.setRotationPoint(0.0F, 0.0F, 0.0F);
		hat.addChild(chain);
		chain.setTextureOffset(32, 27).addBox(-4.0F, -34.0F, -5.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		chain.setTextureOffset(35, 32).addBox(-2.0F, -33.75F, -4.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		chain.setTextureOffset(30, 35).addBox(1.0F, -33.75F, -4.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		chain.setTextureOffset(23, 35).addBox(3.75F, -33.75F, -4.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		chain.setTextureOffset(19, 35).addBox(3.75F, -33.75F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		chain.setTextureOffset(15, 35).addBox(3.75F, -33.75F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		chain.setTextureOffset(11, 35).addBox(3.75F, -33.75F, 3.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		chain.setTextureOffset(7, 35).addBox(1.0F, -33.75F, 3.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		chain.setTextureOffset(3, 35).addBox(-2.0F, -33.75F, 3.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		chain.setTextureOffset(34, 34).addBox(-4.75F, -33.75F, 3.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		chain.setTextureOffset(27, 34).addBox(-4.75F, -33.75F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		chain.setTextureOffset(24, 33).addBox(-4.75F, -33.75F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		chain.setTextureOffset(20, 33).addBox(-4.75F, -33.75F, -4.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		chain.setTextureOffset(24, 17).addBox(-1.0F, -34.0F, -5.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		chain.setTextureOffset(24, 15).addBox(2.0F, -34.0F, -5.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		chain.setTextureOffset(0, 15).addBox(2.0F, -34.0F, 4.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		chain.setTextureOffset(0, 13).addBox(-1.0F, -34.0F, 4.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		chain.setTextureOffset(4, 6).addBox(-4.0F, -34.0F, 4.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(5.0F, -33.5F, -4.5F);
		chain.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, -1.5708F, 0.0F);
		cube_r2.setTextureOffset(4, 0).addBox(0.5F, -0.5F, 9.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r2.setTextureOffset(4, 2).addBox(3.5F, -0.5F, 9.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r2.setTextureOffset(4, 4).addBox(6.5F, -0.5F, 9.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r2.setTextureOffset(0, 17).addBox(6.5F, -0.5F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r2.setTextureOffset(0, 19).addBox(3.5F, -0.5F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r2.setTextureOffset(24, 13).addBox(0.5F, -0.5F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		s = new ModelRenderer(this);
		s.setRotationPoint(0.0F, 0.0F, 0.0F);
		hat.addChild(s);
		

		SMain = new ModelRenderer(this);
		SMain.setRotationPoint(0.0F, -1.0F, 0.0F);
		s.addChild(SMain);
		SMain.setTextureOffset(32, 25).addBox(-2.0F, -41.0F, -5.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		SMain.setTextureOffset(32, 23).addBox(-2.0F, -38.0F, -5.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		SMain.setTextureOffset(0, 9).addBox(-2.0F, -35.0F, -5.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		SMain.setTextureOffset(0, 33).addBox(-2.0F, -40.0F, -5.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		SMain.setTextureOffset(31, 32).addBox(1.0F, -37.0F, -5.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		SMain.setTextureOffset(0, 0).addBox(-0.5F, -41.5F, -5.1F, 1.0F, 8.0F, 1.0F, 0.0F, false);

		bipedHead.addChild(helmet);
		bipedHeadwear.addChild(helmet);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}