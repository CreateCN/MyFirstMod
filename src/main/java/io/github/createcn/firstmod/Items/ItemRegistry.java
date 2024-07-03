package io.github.createcn.firstmod.Items;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "firstmod");

    public static RegistryObject<Item> Banana = ITEMS.register("banana",)
    ;{
        return new Banana();
    })
}
