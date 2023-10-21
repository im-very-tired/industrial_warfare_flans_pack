//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Springfield 1876 carbine
// Model Creator: 
// Created on: 16.09.2023 - 15:55:29
// Last changed on: 16.09.2023 - 15:55:29

package com.flansmod.client.model.industwar; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelSpringfield1876 extends ModelGun //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelSpringfield1876() //Same as Filename
	{
		defaultBarrelModel = new ModelRendererTurbo[2];
		defaultBarrelModel[0] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 3
		defaultBarrelModel[1] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 4

		defaultBarrelModel[0].addBox(0F, 0F, 0F, 19, 1, 1, 0F); // Box 3
		defaultBarrelModel[0].setRotationPoint(1F, -2.5F, -0.5F);

		defaultBarrelModel[1].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 4
		defaultBarrelModel[1].setRotationPoint(1F, -4F, -1F);
		defaultBarrelModel[1].rotateAngleZ = -0.48869219F;


		defaultStockModel = new ModelRendererTurbo[2];
		defaultStockModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		defaultStockModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 2

		defaultStockModel[0].addFlexBox(0F, 0F, 0F, 12, 6, 2, 0F, 0.00F, -4.00F, 0F, 0F, ModelRendererTurbo.MR_LEFT); // Box 1
		defaultStockModel[0].setRotationPoint(-10F, -2F, -1F);

		defaultStockModel[1].addFlexBox(0F, 0F, 0F, 9, 2, 2, 0F, 0.00F, -1.00F, 0F, 0F, ModelRendererTurbo.MR_LEFT); // Box 2
		defaultStockModel[1].setRotationPoint(2F, -2F, -1F);


		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this, 5, 13, textureX, textureY); // Box 5

		ammoModel[0].addShapeBox(0F, 1F, 0F, 3, 1, 1, 0F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F); // Box 5
		ammoModel[0].setRotationPoint(1F, -3.5F, -0.5F);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}