package io.github.createcn.firstmod.Items;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemRegistry {
    // 使用常量代替硬编码字符串提高可维护性
    public static final String MOD_ID = "io.github.createcn.firstmod";
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MOD_ID);

    public static final RegistryObject<Item> BANANA = ITEMS.register("Banana", Banana::new);

    public ItemRegistry() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ITEMS.register(modEventBus);

        // 添加事件监听器
        modEventBus.addListener(this::addCreative);
    }

    /**
     * 在创意模式的物品栏中添加香蕉物品。
     * 目标是将其添加到Miscellaneous物品组中。
     *
     * @param event 创意模式物品栏构建内容事件。
     */
    private void addCreative(Event event) {
        if (event instanceof CreativeModeTabEvent.BuildContents) {
            CreativeModeTabEvent.BuildContents buildContentsEvent = (CreativeModeTabEvent.BuildContents) event;
            CreativeModeTab tab = buildContentsEvent.getTab();
        }
    }
}

// 假设这个事件类在其他地方定义
class CreativeModeTabEvent extends Event {
    static class BuildContents extends CreativeModeTabEvent {
        private CreativeModeTab tab;

        public CreativeModeTab getTab() {
            return tab; // 模拟获取当前Tab
        }

    }
}
