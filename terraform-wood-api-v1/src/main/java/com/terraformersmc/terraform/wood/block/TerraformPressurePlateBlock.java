package com.terraformersmc.terraform.wood.block;

import net.minecraft.block.PressurePlateBlock;

/**
 * A simple wrapper around the parent PressurePlateBlock class allowing access to the constructor.
 */
public class TerraformPressurePlateBlock extends PressurePlateBlock {
	public TerraformPressurePlateBlock(Settings settings) {
		super(ActivationRule.EVERYTHING, settings);
	}

	public TerraformPressurePlateBlock(ActivationRule rule, Settings settings) {
		super(rule, settings);
	}
}
