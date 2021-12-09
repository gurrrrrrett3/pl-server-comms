package com.plethora.servercomms.objects.lists;

import com.plethora.servercomms.servercomms;
import com.plethora.servercomms.objects.items.WandererMusicDisc;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Items {
    
    public static final DeferredRegister<Item> ITEMS = 
    DeferredRegister.create(ForgeRegistries.ITEMS, servercomms.MODID);

    //ITEMS

    public static final RegistryObject<Item> WANDERER_MUSIC_DISC = 
    ITEMS.register("wanderer_music_disc", 
    () -> new WandererMusicDisc(1, Sounds.WANDERER_DISC_LAZY, new Item.Properties().tab(ItemGroup.TAB_MISC).stacksTo(1)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
