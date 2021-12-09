package com.plethora.servercomms.objects.items;

import java.util.function.Supplier;

import net.minecraft.item.MusicDiscItem;
import net.minecraft.util.SoundEvent;

public class WandererMusicDisc extends MusicDiscItem{

    public WandererMusicDisc(int comparatorValue, Supplier<SoundEvent> soundSupplier, Properties builder) {
        super(comparatorValue, soundSupplier, builder);
    }
    
}
