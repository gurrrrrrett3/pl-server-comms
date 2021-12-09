package com.plethora.servercomms.objects.lists;

import com.plethora.servercomms.servercomms;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.common.util.Lazy;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Sounds {

    public static final DeferredRegister<SoundEvent> SOUNDS =
        DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, servercomms.MODID);

    //Wanderer Music Disc
    public static final RegistryObject<SoundEvent> WANDERER_DISC_SOUND = SOUNDS.register("item.wanderer_disc_sound", 
    () -> new SoundEvent(new ResourceLocation(servercomms.MODID, "item.wanderer_disc_sound")));

    public static final Lazy<SoundEvent> WANDERER_DISC_LAZY = Lazy
    .of(() -> new SoundEvent(new ResourceLocation(servercomms.MODID, "item.wanderer_disc")));
        
    public static final RegistryObject<SoundEvent> WANDERER_DISC = SOUNDS.register("item.wanderer_disc.disc", WANDERER_DISC_LAZY);


    public static void register(IEventBus eventBus) {
        SOUNDS.register(eventBus);
    }

}
