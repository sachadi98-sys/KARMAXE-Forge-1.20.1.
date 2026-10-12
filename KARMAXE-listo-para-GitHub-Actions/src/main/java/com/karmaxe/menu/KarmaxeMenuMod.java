package com.karmaxe.menu;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ScreenEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod("karmaxe")
public class KarmaxeMenuMod {
    public KarmaxeMenuMod() {}

    @Mod.EventBusSubscriber(modid = "karmaxe", value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.FORGE)
    public static class ClientEvents {
        @SubscribeEvent
        public static void onScreenOpening(ScreenEvent.Opening event) {
            if (event.getNewScreen() instanceof net.minecraft.client.gui.screens.TitleScreen) {
                event.setNewScreen(new KarmaxeTitleScreen());
            }
        }
    }
}
