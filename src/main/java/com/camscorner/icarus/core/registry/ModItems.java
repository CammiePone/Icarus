package com.camscorner.icarus.core.registry;

import com.camscorner.icarus.Icarus;
import com.camscorner.icarus.common.items.WingItem;
import com.camscorner.icarus.common.items.WingItem.WingType;
import net.minecraft.item.Item;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.LinkedHashMap;

public class ModItems
{
	//----Item Map----//
	public static final LinkedHashMap<Item, Identifier> ITEMS = new LinkedHashMap<>();

	//-----Items-----//
	public static final Item WHITE_FEATHERED_WINGS = create("white_feathered_wings", new WingItem(DyeColor.WHITE, DyeColor.WHITE, WingType.FEATHERED));
	public static final Item ORANGE_FEATHERED_WINGS = create("orange_feathered_wings", new WingItem(DyeColor.ORANGE, DyeColor.ORANGE, WingType.FEATHERED));
	public static final Item MAGENTA_FEATHERED_WINGS = create("magenta_feathered_wings", new WingItem(DyeColor.MAGENTA, DyeColor.MAGENTA, WingType.FEATHERED));
	public static final Item LIGHT_BLUE_FEATHERED_WINGS = create("light_blue_feathered_wings", new WingItem(DyeColor.LIGHT_BLUE, DyeColor.LIGHT_BLUE, WingType.FEATHERED));
	public static final Item YELLOW_FEATHERED_WINGS = create("yellow_feathered_wings", new WingItem(DyeColor.YELLOW, DyeColor.YELLOW, WingType.FEATHERED));
	public static final Item LIME_FEATHERED_WINGS = create("lime_feathered_wings", new WingItem(DyeColor.LIME, DyeColor.LIME, WingType.FEATHERED));
	public static final Item PINK_FEATHERED_WINGS = create("pink_feathered_wings", new WingItem(DyeColor.PINK, DyeColor.PINK, WingType.FEATHERED));
	public static final Item GREY_FEATHERED_WINGS = create("grey_feathered_wings", new WingItem(DyeColor.GRAY, DyeColor.GRAY, WingType.FEATHERED));
	public static final Item LIGHT_GREY_FEATHERED_WINGS = create("light_grey_feathered_wings", new WingItem(DyeColor.LIGHT_GRAY, DyeColor.LIGHT_GRAY, WingType.FEATHERED));
	public static final Item CYAN_FEATHERED_WINGS = create("cyan_feathered_wings", new WingItem(DyeColor.CYAN, DyeColor.CYAN, WingType.FEATHERED));
	public static final Item PURPLE_FEATHERED_WINGS = create("purple_feathered_wings", new WingItem(DyeColor.PURPLE, DyeColor.PURPLE, WingType.FEATHERED));
	public static final Item BLUE_FEATHERED_WINGS = create("blue_feathered_wings", new WingItem(DyeColor.BLUE, DyeColor.BLUE, WingType.FEATHERED));
	public static final Item BROWN_FEATHERED_WINGS = create("brown_feathered_wings", new WingItem(DyeColor.BROWN, DyeColor.BROWN, WingType.FEATHERED));
	public static final Item GREEN_FEATHERED_WINGS = create("green_feathered_wings", new WingItem(DyeColor.GREEN, DyeColor.GREEN, WingType.FEATHERED));
	public static final Item RED_FEATHERED_WINGS = create("red_feathered_wings", new WingItem(DyeColor.RED, DyeColor.RED, WingType.FEATHERED));
	public static final Item BLACK_FEATHERED_WINGS = create("black_feathered_wings", new WingItem(DyeColor.BLACK, DyeColor.BLACK, WingType.FEATHERED));

	public static final Item WHITE_DRAGON_WINGS = create("white_dragon_wings", new WingItem(DyeColor.WHITE, DyeColor.WHITE, WingType.DRAGON));
	public static final Item ORANGE_DRAGON_WINGS = create("orange_dragon_wings", new WingItem(DyeColor.ORANGE, DyeColor.ORANGE, WingType.DRAGON));
	public static final Item MAGENTA_DRAGON_WINGS = create("magenta_dragon_wings", new WingItem(DyeColor.MAGENTA, DyeColor.PINK, WingType.DRAGON));
	public static final Item LIGHT_BLUE_DRAGON_WINGS = create("light_blue_dragon_wings", new WingItem(DyeColor.LIGHT_BLUE, DyeColor.WHITE, WingType.DRAGON));
	public static final Item YELLOW_DRAGON_WINGS = create("yellow_dragon_wings", new WingItem(DyeColor.YELLOW, DyeColor.YELLOW, WingType.DRAGON));
	public static final Item LIME_DRAGON_WINGS = create("lime_dragon_wings", new WingItem(DyeColor.LIME, DyeColor.PINK, WingType.DRAGON));
	public static final Item PINK_DRAGON_WINGS = create("pink_dragon_wings", new WingItem(DyeColor.PINK, DyeColor.WHITE, WingType.DRAGON));
	public static final Item GREY_DRAGON_WINGS = create("grey_dragon_wings", new WingItem(DyeColor.GRAY, DyeColor.LIGHT_GRAY, WingType.DRAGON));
	public static final Item LIGHT_GREY_DRAGON_WINGS = create("light_grey_dragon_wings", new WingItem(DyeColor.LIGHT_GRAY, DyeColor.WHITE, WingType.DRAGON));
	public static final Item CYAN_DRAGON_WINGS = create("cyan_dragon_wings", new WingItem(DyeColor.CYAN, DyeColor.LIGHT_BLUE, WingType.DRAGON));
	public static final Item PURPLE_DRAGON_WINGS = create("purple_dragon_wings", new WingItem(DyeColor.PURPLE, DyeColor.MAGENTA, WingType.DRAGON));
	public static final Item BLUE_DRAGON_WINGS = create("blue_dragon_wings", new WingItem(DyeColor.BLUE, DyeColor.LIGHT_BLUE, WingType.DRAGON));
	public static final Item BROWN_DRAGON_WINGS = create("brown_dragon_wings", new WingItem(DyeColor.BROWN, DyeColor.ORANGE, WingType.DRAGON));
	public static final Item GREEN_DRAGON_WINGS = create("green_dragon_wings", new WingItem(DyeColor.GREEN, DyeColor.LIME, WingType.DRAGON));
	public static final Item RED_DRAGON_WINGS = create("red_dragon_wings", new WingItem(DyeColor.RED, DyeColor.YELLOW, WingType.DRAGON));
	public static final Item BLACK_DRAGON_WINGS = create("black_dragon_wings", new WingItem(DyeColor.BLACK, DyeColor.PURPLE, WingType.DRAGON));

	public static final Item WHITE_MECHANICAL_FEATHERED_WINGS = create("white_mechanical_feathered_wings", new WingItem(DyeColor.WHITE, DyeColor.WHITE, WingType.MECHANICAL_FEATHERED));
	public static final Item ORANGE_MECHANICAL_FEATHERED_WINGS = create("orange_mechanical_feathered_wings", new WingItem(DyeColor.WHITE, DyeColor.ORANGE, WingType.MECHANICAL_FEATHERED));
	public static final Item MAGENTA_MECHANICAL_FEATHERED_WINGS = create("magenta_mechanical_feathered_wings", new WingItem(DyeColor.WHITE, DyeColor.MAGENTA, WingType.MECHANICAL_FEATHERED));
	public static final Item LIGHT_BLUE_MECHANICAL_FEATHERED_WINGS = create("light_blue_mechanical_feathered_wings", new WingItem(DyeColor.WHITE, DyeColor.LIGHT_BLUE, WingType.MECHANICAL_FEATHERED));
	public static final Item YELLOW_MECHANICAL_FEATHERED_WINGS = create("yellow_mechanical_feathered_wings", new WingItem(DyeColor.WHITE, DyeColor.YELLOW, WingType.MECHANICAL_FEATHERED));
	public static final Item LIME_MECHANICAL_FEATHERED_WINGS = create("lime_mechanical_feathered_wings", new WingItem(DyeColor.WHITE, DyeColor.LIME, WingType.MECHANICAL_FEATHERED));
	public static final Item PINK_MECHANICAL_FEATHERED_WINGS = create("pink_mechanical_feathered_wings", new WingItem(DyeColor.WHITE, DyeColor.PINK, WingType.MECHANICAL_FEATHERED));
	public static final Item GREY_MECHANICAL_FEATHERED_WINGS = create("grey_mechanical_feathered_wings", new WingItem(DyeColor.WHITE, DyeColor.GRAY, WingType.MECHANICAL_FEATHERED));
	public static final Item LIGHT_GREY_MECHANICAL_FEATHERED_WINGS = create("light_grey_mechanical_feathered_wings", new WingItem(DyeColor.WHITE, DyeColor.LIGHT_GRAY, WingType.MECHANICAL_FEATHERED));
	public static final Item CYAN_MECHANICAL_FEATHERED_WINGS = create("cyan_mechanical_feathered_wings", new WingItem(DyeColor.WHITE, DyeColor.CYAN, WingType.MECHANICAL_FEATHERED));
	public static final Item PURPLE_MECHANICAL_FEATHERED_WINGS = create("purple_mechanical_feathered_wings", new WingItem(DyeColor.WHITE, DyeColor.PURPLE, WingType.MECHANICAL_FEATHERED));
	public static final Item BLUE_MECHANICAL_FEATHERED_WINGS = create("blue_mechanical_feathered_wings", new WingItem(DyeColor.WHITE, DyeColor.BLUE, WingType.MECHANICAL_FEATHERED));
	public static final Item BROWN_MECHANICAL_FEATHERED_WINGS = create("brown_mechanical_feathered_wings", new WingItem(DyeColor.WHITE, DyeColor.BROWN, WingType.MECHANICAL_FEATHERED));
	public static final Item GREEN_MECHANICAL_FEATHERED_WINGS = create("green_mechanical_feathered_wings", new WingItem(DyeColor.WHITE, DyeColor.GREEN, WingType.MECHANICAL_FEATHERED));
	public static final Item RED_MECHANICAL_FEATHERED_WINGS = create("red_mechanical_feathered_wings", new WingItem(DyeColor.WHITE, DyeColor.RED, WingType.MECHANICAL_FEATHERED));
	public static final Item BLACK_MECHANICAL_FEATHERED_WINGS = create("black_mechanical_feathered_wings", new WingItem(DyeColor.WHITE, DyeColor.BLACK, WingType.MECHANICAL_FEATHERED));
	
	public static final Item WHITE_MECHANICAL_LEATHER_WINGS = create("white_mechanical_leather_wings", new WingItem(DyeColor.WHITE, DyeColor.WHITE, WingType.MECHANICAL_LEATHER));
	public static final Item ORANGE_MECHANICAL_LEATHER_WINGS = create("orange_mechanical_leather_wings", new WingItem(DyeColor.WHITE, DyeColor.ORANGE, WingType.MECHANICAL_LEATHER));
	public static final Item MAGENTA_MECHANICAL_LEATHER_WINGS = create("magenta_mechanical_leather_wings", new WingItem(DyeColor.WHITE, DyeColor.MAGENTA, WingType.MECHANICAL_LEATHER));
	public static final Item LIGHT_BLUE_MECHANICAL_LEATHER_WINGS = create("light_blue_mechanical_leather_wings", new WingItem(DyeColor.WHITE, DyeColor.LIGHT_BLUE, WingType.MECHANICAL_LEATHER));
	public static final Item YELLOW_MECHANICAL_LEATHER_WINGS = create("yellow_mechanical_leather_wings", new WingItem(DyeColor.WHITE, DyeColor.YELLOW, WingType.MECHANICAL_LEATHER));
	public static final Item LIME_MECHANICAL_LEATHER_WINGS = create("lime_mechanical_leather_wings", new WingItem(DyeColor.WHITE, DyeColor.LIME, WingType.MECHANICAL_LEATHER));
	public static final Item PINK_MECHANICAL_LEATHER_WINGS = create("pink_mechanical_leather_wings", new WingItem(DyeColor.WHITE, DyeColor.PINK, WingType.MECHANICAL_LEATHER));
	public static final Item GREY_MECHANICAL_LEATHER_WINGS = create("grey_mechanical_leather_wings", new WingItem(DyeColor.WHITE, DyeColor.GRAY, WingType.MECHANICAL_LEATHER));
	public static final Item LIGHT_GREY_MECHANICAL_LEATHER_WINGS = create("light_grey_mechanical_leather_wings", new WingItem(DyeColor.WHITE, DyeColor.LIGHT_GRAY, WingType.MECHANICAL_LEATHER));
	public static final Item CYAN_MECHANICAL_LEATHER_WINGS = create("cyan_mechanical_leather_wings", new WingItem(DyeColor.WHITE, DyeColor.CYAN, WingType.MECHANICAL_LEATHER));
	public static final Item PURPLE_MECHANICAL_LEATHER_WINGS = create("purple_mechanical_leather_wings", new WingItem(DyeColor.WHITE, DyeColor.PURPLE, WingType.MECHANICAL_LEATHER));
	public static final Item BLUE_MECHANICAL_LEATHER_WINGS = create("blue_mechanical_leather_wings", new WingItem(DyeColor.WHITE, DyeColor.BLUE, WingType.MECHANICAL_LEATHER));
	public static final Item BROWN_MECHANICAL_LEATHER_WINGS = create("brown_mechanical_leather_wings", new WingItem(DyeColor.WHITE, DyeColor.BROWN, WingType.MECHANICAL_LEATHER));
	public static final Item GREEN_MECHANICAL_LEATHER_WINGS = create("green_mechanical_leather_wings", new WingItem(DyeColor.WHITE, DyeColor.GREEN, WingType.MECHANICAL_LEATHER));
	public static final Item RED_MECHANICAL_LEATHER_WINGS = create("red_mechanical_leather_wings", new WingItem(DyeColor.WHITE, DyeColor.RED, WingType.MECHANICAL_LEATHER));
	public static final Item BLACK_MECHANICAL_LEATHER_WINGS = create("black_mechanical_leather_wings", new WingItem(DyeColor.WHITE, DyeColor.BLACK, WingType.MECHANICAL_LEATHER));
	
	public static final Item WHITE_LIGHT_WINGS = create("white_light_wings", new WingItem(DyeColor.WHITE, DyeColor.WHITE, WingType.LIGHT));
	public static final Item ORANGE_LIGHT_WINGS = create("orange_light_wings", new WingItem(DyeColor.ORANGE, DyeColor.ORANGE, WingType.LIGHT));
	public static final Item MAGENTA_LIGHT_WINGS = create("magenta_light_wings", new WingItem(DyeColor.MAGENTA, DyeColor.MAGENTA, WingType.LIGHT));
	public static final Item LIGHT_BLUE_LIGHT_WINGS = create("light_blue_light_wings", new WingItem(DyeColor.LIGHT_BLUE, DyeColor.LIGHT_BLUE, WingType.LIGHT));
	public static final Item YELLOW_LIGHT_WINGS = create("yellow_light_wings", new WingItem(DyeColor.YELLOW, DyeColor.YELLOW, WingType.LIGHT));
	public static final Item LIME_LIGHT_WINGS = create("lime_light_wings", new WingItem(DyeColor.LIME, DyeColor.LIME, WingType.LIGHT));
	public static final Item PINK_LIGHT_WINGS = create("pink_light_wings", new WingItem(DyeColor.PINK, DyeColor.PINK, WingType.LIGHT));
	public static final Item GREY_LIGHT_WINGS = create("grey_light_wings", new WingItem(DyeColor.GRAY, DyeColor.GRAY, WingType.LIGHT));
	public static final Item LIGHT_GREY_LIGHT_WINGS = create("light_grey_light_wings", new WingItem(DyeColor.LIGHT_GRAY, DyeColor.LIGHT_GRAY, WingType.LIGHT));
	public static final Item CYAN_LIGHT_WINGS = create("cyan_light_wings", new WingItem(DyeColor.CYAN, DyeColor.CYAN, WingType.LIGHT));
	public static final Item PURPLE_LIGHT_WINGS = create("purple_light_wings", new WingItem(DyeColor.PURPLE, DyeColor.PURPLE, WingType.LIGHT));
	public static final Item BLUE_LIGHT_WINGS = create("blue_light_wings", new WingItem(DyeColor.BLUE, DyeColor.BLUE, WingType.LIGHT));
	public static final Item BROWN_LIGHT_WINGS = create("brown_light_wings", new WingItem(DyeColor.BROWN, DyeColor.BROWN, WingType.LIGHT));
	public static final Item GREEN_LIGHT_WINGS = create("green_light_wings", new WingItem(DyeColor.GREEN, DyeColor.GREEN, WingType.LIGHT));
	public static final Item RED_LIGHT_WINGS = create("red_light_wings", new WingItem(DyeColor.RED, DyeColor.RED, WingType.LIGHT));
	public static final Item BLACK_LIGHT_WINGS = create("black_light_wings", new WingItem(DyeColor.BLACK, DyeColor.BLACK, WingType.LIGHT));
	
	public static final Item FLANDRES_WINGS = create("flandres_wings", new WingItem(DyeColor.WHITE, DyeColor.WHITE, WingType.UNIQUE));
	public static final Item DISCORDS_WINGS = create("discords_wings", new WingItem(DyeColor.WHITE, DyeColor.WHITE, WingType.UNIQUE));
	public static final Item ZANZAS_WINGS = create("zanzas_wings", new WingItem(DyeColor.WHITE, DyeColor.WHITE, WingType.UNIQUE));

	//-----Registry-----//
	public static void register()
	{
		ITEMS.keySet().forEach(item -> Registry.register(Registry.ITEM, ITEMS.get(item), item));
	}

	private static <T extends Item> T create(String name, T item)
	{
		ITEMS.put(item, new Identifier(Icarus.MOD_ID, name));
		return item;
	}
}
