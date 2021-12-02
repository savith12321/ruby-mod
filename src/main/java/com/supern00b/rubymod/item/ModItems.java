package com.supern00b.rubymod.item;

import com.supern00b.rubymod.RubyMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item RAINBOW_METAL = registerItem("rainbow_metal", new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(RubyMod.MOD_ID, name), item);
    }

    public static void RegisterModItems(){
        RubyMod.LOGGER.info("Registering Items for " + RubyMod.MOD_ID);
    }
}
