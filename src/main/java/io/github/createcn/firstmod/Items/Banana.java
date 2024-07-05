package io.github.createcn.firstmod.Items;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class Banana extends Item {

    public Banana(){
        super(new Properties().tab(CreativeModeTab.TAB_MISC));
    }
//
    @Override
    public String getDescriptionId(ItemStack stack) {
        return "item.io.github.createcn.firstmod.banana";
    }
}