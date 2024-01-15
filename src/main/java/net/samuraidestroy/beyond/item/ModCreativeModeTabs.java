package net.samuraidestroy.beyond.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.samuraidestroy.beyond.Beyond;
import net.samuraidestroy.beyond.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Beyond.MOD_ID);
    public static final RegistryObject<CreativeModeTab> CHAPTER_I = CREATIVE_MODE_TABS.register("chapter_i_tab", () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SOUL_GEM.get())).title(Component.translatable("creativetab.chapter_i_tab")).displayItems((itemDisplayParameters, output) -> {
        output.accept(ModItems.SOUL_SHARD.get());
        output.accept(ModItems.SOUL_GEM.get());
        output.accept(ModItems.SOUL_STEEL.get());
        output.accept(ModItems.ENERGISED_SOUL_SHARD.get());
        output.accept(ModBlocks.SOUL_SHARD_BLOCK.get());
        output.accept(ModBlocks.SOUL_GEM_BLOCK.get());
        output.accept(ModBlocks.SOUL_STEEL_BLOCK.get());
        output.accept(ModBlocks.SOUL_GEM_ORE.get());
        output.accept(ModBlocks.DEEPSLATE_SOUL_GEM_ORE.get());
    }).build());
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
