package com.lilithsthrone.game.character.body.valueEnums;

import com.lilithsthrone.utils.Colour;
import com.lilithsthrone.utils.Util;

/**
 * @since 0.1.86
 * @version 0.1.86
 * @author Innoxia
 */
public enum LabiaSize {

	ZERO_TINY(0, "tiny", Colour.GENERIC_SIZE_ONE),
	ONE_SMALL(1, "small", Colour.GENERIC_SIZE_TWO),
	TWO_AVERAGE(2, "average-sized", Colour.GENERIC_SIZE_THREE),
	THREE_LARGE(3, "large", Colour.GENERIC_SIZE_FOUR),
	FOUR_MASSIVE(4, "massive", Colour.GENERIC_SIZE_FIVE);
	
	
	private int value;
	private String descriptor;
	private Colour colour;

	private LabiaSize(int value, String descriptor, Colour colour) {
		this.value = value;
		this.descriptor = descriptor;
		this.colour=colour;
	}

	public int getValue() {
		return value;
	}

	public String getName() {
		return descriptor;
	}
	
	public static LabiaSize getRandomLabiaSize() {
		return LabiaSize.values()[Util.random.nextInt(LabiaSize.values().length)];
	}
	
	public static LabiaSize getLabiaSizeFromInt(int size) {
		for(LabiaSize as : LabiaSize.values()) {
			if(size == as.getValue()) {
				return as;
			}
		}
		return ZERO_TINY;
	}

	public Colour getColour() {
		return colour;
	}
}
