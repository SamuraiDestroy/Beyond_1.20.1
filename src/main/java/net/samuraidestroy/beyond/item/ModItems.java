package net.samuraidestroy.beyond.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.samuraidestroy.beyond.Beyond;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Beyond.MOD_ID);

    public static final RegistryObject<Item> SOUL_SHARD = ITEMS.register("soul_shard", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SOUL_GEM = ITEMS.register("soul_gem", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SOUL_STEEL = ITEMS.register("soul_steel", () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
