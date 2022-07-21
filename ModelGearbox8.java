/*******************************************************************************
 * @author Reika Kalseki
 *
 * Copyright 2017
 *
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
// Date: 17/02/2013 2:05:40 AM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package Reika.RotaryCraft.Models.Animated;

import java.util.ArrayList;

import org.lwjgl.opengl.GL11;

import net.minecraft.tileentity.TileEntity;

import Reika.DragonAPI.Instantiable.Rendering.LODModelPart;
import Reika.RotaryCraft.Base.ModelGearboxBase;


public class ModelGearbox8 extends ModelGearboxBase
{
	//fields

	LODModelPart Shape12;
	LODModelPart Shape13;
	LODModelPart Shape14;
	LODModelPart Shape15;
	LODModelPart Shape16;
	LODModelPart Shape17;
	LODModelPart Shape18;
	LODModelPart Shape19;
	LODModelPart Shape20;
	LODModelPart Shape21;
	LODModelPart Shape22;
	LODModelPart Shape23;
	LODModelPart Shape24;
	LODModelPart Shape25;
	LODModelPart Shape26;
	LODModelPart Shape27;
	LODModelPart Shape30;
	LODModelPart Shape31;
	LODModelPart Shape32;
	LODModelPart Shape33;
	LODModelPart Shape34;
	LODModelPart Shape35;
	LODModelPart Shape36;
	LODModelPart Shape37;
	LODModelPart Shape38;
	LODModelPart Shape39;
	LODModelPart Shape40;
	LODModelPart Shape41;

	LODModelPart Shape28;
	LODModelPart Shape29;

	public ModelGearbox8() {
		super();

		Shape12 = new LODModelPart(this, 0, 27);
		Shape12.addBox(0F, 0F, 0F, 4, 2, 2);
		Shape12.setRotationPoint(-8.5F, 15F, -1F);
		Shape12.setTextureSize(128, 32);
		Shape12.mirror = true;
		this.setRotation(Shape12, 0F, 0F, 0F);
		Shape12.mirror = false;
		Shape13 = new LODModelPart(this, 0, 27);
		Shape13.addBox(0F, 0F, 0F, 4, 2, 2);
		Shape13.setRotationPoint(-8.5F, 16F, -1.4F);
		Shape13.setTextureSize(128, 32);
		Shape13.mirror = true;
		this.setRotation(Shape13, 0.7853982F, 0F, 0F);
		Shape13.mirror = false;
		Shape14 = new LODModelPart(this, 100, 0);
		Shape14.addBox(0F, 0F, 0F, 1, 4, 4);
		Shape14.setRotationPoint(-5F, 15.5F, -5.7F);
		Shape14.setTextureSize(128, 32);
		Shape14.mirror = true;
		this.setRotation(Shape14, 0F, 0F, 0F);
		Shape15 = new LODModelPart(this, 100, 0);
		Shape15.addBox(0F, 0F, 0F, 1, 4, 4);
		Shape15.setRotationPoint(-5F, 17.5F, -6.5F);
		Shape15.setTextureSize(128, 32);
		Shape15.mirror = true;
		this.setRotation(Shape15, 0.8028515F, 0F, 0F);
		Shape16 = new LODModelPart(this, 100, 0);
		Shape16.addBox(0F, 0F, 0F, 1, 6, 6);
		Shape16.setRotationPoint(0F, 13F, -5.3F);
		Shape16.setTextureSize(128, 32);
		Shape16.mirror = true;
		this.setRotation(Shape16, 0.7853982F, 0F, 0F);
		Shape17 = new LODModelPart(this, 100, 0);
		Shape17.addBox(0F, 0F, 0F, 1, 6, 6);
		Shape17.setRotationPoint(-4F, 14.5F, -0.5F);
		Shape17.setTextureSize(128, 32);
		Shape17.mirror = true;
		this.setRotation(Shape17, 0.7853982F, 0F, 0F);
		Shape18 = new LODModelPart(this, 100, 0);
		Shape18.addBox(0F, 0F, 0F, 1, 3, 3);
		Shape18.setRotationPoint(-5F, 14.5F, 2F);
		Shape18.setTextureSize(128, 32);
		Shape18.mirror = true;
		this.setRotation(Shape18, 0.7853982F, 0F, 0F);
		Shape19 = new LODModelPart(this, 100, 0);
		Shape19.addBox(0F, 0F, 0F, 1, 3, 3);
		Shape19.setRotationPoint(-5F, 13F, 2.5F);
		Shape19.setTextureSize(128, 32);
		Shape19.mirror = true;
		this.setRotation(Shape19, 0F, 0F, 0F);
		Shape19.mirror = false;
		Shape20 = new LODModelPart(this, 0, 27);
		Shape20.addBox(0F, 0F, 0F, 8, 2, 2);
		Shape20.setRotationPoint(-6F, 13F, -2.4F);
		Shape20.setTextureSize(128, 32);
		Shape20.mirror = true;
		this.setRotation(Shape20, 0.7853982F, 0F, 0F);
		Shape21 = new LODModelPart(this, 0, 27);
		Shape21.addBox(0F, 0F, 0F, 10, 2, 2);
		Shape21.setRotationPoint(-5F, 17.5F, -5F);
		Shape21.setTextureSize(128, 32);
		Shape21.mirror = true;
		this.setRotation(Shape21, 0.7853982F, 0F, 0F);
		Shape22 = new LODModelPart(this, 100, 0);
		Shape22.addBox(0F, 0F, 0F, 1, 4, 4);
		Shape22.setRotationPoint(5F, 12.4F, 1.8F);
		Shape22.setTextureSize(128, 32);
		Shape22.mirror = true;
		this.setRotation(Shape22, 0F, 0F, 0F);
		Shape23 = new LODModelPart(this, 100, 0);
		Shape23.addBox(0F, 0F, 0F, 1, 4, 4);
		Shape23.setRotationPoint(5F, 14.5F, 1F);
		Shape23.setTextureSize(128, 32);
		Shape23.mirror = true;
		this.setRotation(Shape23, 0.7853982F, 0F, 0F);
		Shape24 = new LODModelPart(this, 0, 27);
		Shape24.addBox(0F, 0F, 0F, 3, 2, 2);
		Shape24.setRotationPoint(5.5F, 15F, -1F);
		Shape24.setTextureSize(128, 32);
		Shape24.mirror = true;
		this.setRotation(Shape24, 0F, 0F, 0F);
		Shape25 = new LODModelPart(this, 0, 27);
		Shape25.addBox(0F, 0F, 0F, 3, 2, 2);
		Shape25.setRotationPoint(5.5F, 16F, -1.4F);
		Shape25.setTextureSize(128, 32);
		Shape25.mirror = true;
		this.setRotation(Shape25, 0.7853982F, 0F, 0.0174533F);
		Shape26 = new LODModelPart(this, 100, 0);
		Shape26.addBox(0F, 0F, 0F, 1, 4, 4);
		Shape26.setRotationPoint(5F, 15.5F, -5.5F);
		Shape26.setTextureSize(128, 32);
		Shape26.mirror = true;
		this.setRotation(Shape26, 0F, 0F, 0F);
		Shape27 = new LODModelPart(this, 100, 0);
		Shape27.addBox(0F, 0F, 0F, 1, 4, 4);
		Shape27.setRotationPoint(5F, 17.5F, -6.5F);
		Shape27.setTextureSize(128, 32);
		Shape27.mirror = true;
		this.setRotation(Shape27, 0.7853982F, 0F, 0F);
		Shape28 = new LODModelPart(this, 100, 19);
		Shape28.addBox(0F, 0F, 0F, 2, 7, 3);
		Shape28.setRotationPoint(-2F, 16F, -5F);
		Shape28.setTextureSize(128, 32);
		Shape28.mirror = true;
		this.setRotation(Shape28, 0F, 0F, 0F);
		Shape29 = new LODModelPart(this, 100, 19);
		Shape29.addBox(0F, 0F, 0F, 2, 10, 3);
		Shape29.setRotationPoint(1F, 13F, 2.4F);
		Shape29.setTextureSize(128, 32);
		Shape29.mirror = true;
		this.setRotation(Shape29, 0F, 0F, 0F);
		Shape30 = new LODModelPart(this, 0, 27);
		Shape30.addBox(0F, 0F, 0F, 8, 2, 2);
		Shape30.setRotationPoint(-3F, 14.5F, 2.5F);
		Shape30.setTextureSize(128, 32);
		Shape30.mirror = true;
		this.setRotation(Shape30, 0.7853982F, 0F, 0F);
		Shape31 = new LODModelPart(this, 0, 27);
		Shape31.addBox(0F, 0F, 0F, 8, 2, 2);
		Shape31.setRotationPoint(-3F, 13.5F, 3F);
		Shape31.setTextureSize(128, 32);
		Shape31.mirror = true;
		this.setRotation(Shape31, 0F, 0F, 0F);
		Shape32 = new LODModelPart(this, 100, 0);
		Shape32.addBox(0F, 0F, 0F, 1, 4, 4);
		Shape32.setRotationPoint(5F, 14F, -2F);
		Shape32.setTextureSize(128, 32);
		Shape32.mirror = true;
		this.setRotation(Shape32, 0F, 0F, 0F);
		Shape33 = new LODModelPart(this, 100, 0);
		Shape33.addBox(0F, 0F, 0F, 1, 4, 4);
		Shape33.setRotationPoint(5F, 16F, -3F);
		Shape33.setTextureSize(128, 32);
		Shape33.mirror = true;
		this.setRotation(Shape33, 0.7853982F, 0F, 0F);
		Shape34 = new LODModelPart(this, 100, 0);
		Shape34.addBox(0F, 0F, 0F, 1, 4, 4);
		Shape34.setRotationPoint(-5F, 11F, -3F);
		Shape34.setTextureSize(128, 32);
		Shape34.mirror = true;
		this.setRotation(Shape34, 0F, 0F, 0F);
		Shape35 = new LODModelPart(this, 100, 0);
		Shape35.addBox(0F, 0F, 0F, 1, 4, 4);
		Shape35.setRotationPoint(-5F, 13F, -4F);
		Shape35.setTextureSize(128, 32);
		Shape35.mirror = true;
		this.setRotation(Shape35, 0.8028515F, 0F, 0F);
		Shape36 = new LODModelPart(this, 100, 0);
		Shape36.addBox(0F, 0F, 0F, 1, 6, 6);
		Shape36.setRotationPoint(-4F, 11.4F, 0.8F);
		Shape36.setTextureSize(128, 32);
		Shape36.mirror = true;
		this.setRotation(Shape36, 0F, 0F, 0F);
		Shape37 = new LODModelPart(this, 100, 0);
		Shape37.addBox(0F, 0F, 0F, 1, 6, 6);
		Shape37.setRotationPoint(0F, 10F, -4F);
		Shape37.setTextureSize(128, 32);
		Shape37.mirror = true;
		this.setRotation(Shape37, 0F, 0F, 0F);
		Shape38 = new LODModelPart(this, 100, 0);
		Shape38.addBox(0F, 0F, 0F, 1, 4, 4);
		Shape38.setRotationPoint(-5F, 14F, -2F);
		Shape38.setTextureSize(128, 32);
		Shape38.mirror = true;
		this.setRotation(Shape38, 0F, 0F, 0F);
		Shape39 = new LODModelPart(this, 100, 0);
		Shape39.addBox(0F, 0F, 0F, 1, 4, 4);
		Shape39.setRotationPoint(-5F, 16F, -3F);
		Shape39.setTextureSize(128, 32);
		Shape39.mirror = true;
		this.setRotation(Shape39, 0.8028515F, 0F, 0F);
		Shape40 = new LODModelPart(this, 0, 27);
		Shape40.addBox(0F, 0F, 0F, 10, 2, 2);
		Shape40.setRotationPoint(-5F, 16.5F, -4.6F);
		Shape40.setTextureSize(128, 32);
		Shape40.mirror = true;
		this.setRotation(Shape40, 0F, 0F, 0F);
		Shape41 = new LODModelPart(this, 0, 27);
		Shape41.addBox(0F, 0F, 0F, 8, 2, 2);
		Shape41.setRotationPoint(-6F, 12F, -2F);
		Shape41.setTextureSize(128, 32);
		Shape41.mirror = true;
		this.setRotation(Shape41, 0F, 0F, 0F);

		addSupport(Shape28);
		addSupport(Shape29);
	}

	@Override
	public void renderAll(TileEntity te, ArrayList li, float phi, float theta) {
		super.renderAll(te, li, phi, theta);

		double d1 = 0;
		double d2 = 0.8125;
		double d3 = -0.0625;
		//GL11.glTranslated(0, 0.0625, 0.006125);
		GL11.glTranslated(d1, d2, d3);
		GL11.glRotatef(phi*1.1F, 1, 0, 0);
		GL11.glTranslated(-d1, -d2, -d3);
		Shape16.render(te, f5);
		Shape37.render(te, f5);
		Shape20.render(te, f5);
		Shape34.render(te, f5);
		Shape35.render(te, f5);
		Shape41.render(te, f5);
		GL11.glTranslated(d1, d2, d3);
		GL11.glRotatef(-phi*1.1F, 1, 0, 0);
		GL11.glTranslated(-d1, -d2, -d3);
		//GL11.glTranslated(0, -0.0625, -0.006125);

		d1 = 0;
		d2 = 1.092;
		d3 = -0.224;
		GL11.glTranslated(0, 0.0625, 0.006125);
		GL11.glTranslated(d1, d2, d3);
		GL11.glRotatef(-phi*1.25F, 1, 0, 0);
		GL11.glTranslated(-d1, -d2, -d3);
		Shape21.render(te, f5);
		Shape40.render(te, f5);
		Shape26.render(te, f5);
		Shape27.render(te, f5);
		Shape14.render(te, f5);
		Shape15.render(te, f5);
		GL11.glTranslated(d1, d2, d3);
		GL11.glRotatef(phi*1.25F, 1, 0, 0);
		GL11.glTranslated(-d1, -d2, -d3);
		GL11.glTranslated(0, -0.0625, -0.006125);

		d1 = 0;
		d2 = 0.9025;
		d3 = 0.25;
		GL11.glTranslated(0, 0.015125, -0.006125);
		GL11.glTranslated(d1, d2, d3);
		GL11.glRotatef(-phi*1.25F, 1, 0, 0);
		GL11.glTranslated(-d1, -d2, -d3);
		Shape22.render(te, f5);
		Shape36.render(te, f5);
		Shape23.render(te, f5);
		Shape17.render(te, f5);
		Shape18.render(te, f5);
		Shape19.render(te, f5);
		Shape30.render(te, f5);
		Shape31.render(te, f5);
		GL11.glTranslated(d1, d2, d3);
		GL11.glRotatef(phi*1.25F, 1, 0, 0);
		GL11.glTranslated(-d1, -d2, -d3);
		GL11.glTranslated(0, -0.015125, 0.006125);

		GL11.glTranslated(0, 1, 0);
		GL11.glRotatef(phi*1.25F, 1, 0, 0);
		GL11.glTranslated(0, -1, 0);
		Shape24.render(te, f5);
		Shape25.render(te, f5);
		Shape32.render(te, f5);
		Shape33.render(te, f5);
		GL11.glTranslated(0, 1, 0);
		GL11.glRotatef(-phi*1.25F, 1, 0, 0);
		GL11.glTranslated(0, -1, 0);

		GL11.glTranslated(0, 1, 0);
		GL11.glRotatef(phi, 1, 0, 0);
		GL11.glTranslated(0, -1, 0);
		Shape12.render(te, f5);
		Shape13.render(te, f5);
		Shape38.render(te, f5);
		Shape39.render(te, f5);
		GL11.glTranslated(0, 1, 0);
		GL11.glRotatef(-phi, 1, 0, 0);
		GL11.glTranslated(0, -1, 0);

		this.renderSupports(te, li);
	}

}
