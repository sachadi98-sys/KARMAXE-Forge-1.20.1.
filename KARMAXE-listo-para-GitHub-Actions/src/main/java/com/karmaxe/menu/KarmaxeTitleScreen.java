package com.karmaxe.menu;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.gui.screens.OptionsScreen;
import net.minecraft.client.gui.screens.worldselection.SelectWorldScreen;
import net.minecraft.client.gui.screens.multiplayer.JoinMultiplayerScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;

public class KarmaxeTitleScreen extends Screen {
    private static final ResourceLocation BACKGROUND =
            new ResourceLocation("karmaxe", "textures/gui/menu_background.png");

    public KarmaxeTitleScreen() {
        super(Component.literal("KARMAXE"));
    }

    @Override
    public void render(GuiGraphics graphics, int mouseX, int mouseY, float partialTick) {
        RenderSystem.setShaderTexture(0, BACKGROUND);
        graphics.blit(BACKGROUND, 0, 0, 0, 0, this.width, this.height,
                this.width, this.height);
        // Las zonas de los botones corresponden a los rótulos del arte de fondo.
    }

    @Override
    public boolean mouseClicked(double mouseX, double mouseY, int button) {
        if (button != 0) return super.mouseClicked(mouseX, mouseY, button);
        double x = mouseX / this.width;
        double y = mouseY / this.height;

        if (inside(x, y, 0.32, 0.44, 0.68, 0.54)) {
            this.minecraft.setScreen(new KarmaxePlayScreen(this));
            return true;
        }
        if (inside(x, y, 0.32, 0.55, 0.50, 0.64)) {
            this.minecraft.setScreen(new KarmaxeInfoScreen(this, "MUNDO",
                    "Información del mundo de la serie KARMAXE."));
            return true;
        }
        if (inside(x, y, 0.50, 0.55, 0.68, 0.64)) {
            this.minecraft.setScreen(new KarmaxeInfoScreen(this, "INTEGRANTES",
                    "Personaliza esta pantalla con los nombres de tus amigos."));
            return true;
        }
        if (inside(x, y, 0.32, 0.65, 0.50, 0.74)) {
            this.minecraft.setScreen(new KarmaxeInfoScreen(this, "MODS",
                    "Pantalla inicial para la lista de mods de la serie."));
            return true;
        }
        if (inside(x, y, 0.50, 0.65, 0.68, 0.74)) {
            this.minecraft.setScreen(new OptionsScreen(this, this.minecraft.options));
            return true;
        }
        if (inside(x, y, 0.39, 0.75, 0.61, 0.83)) {
            this.minecraft.stop();
            return true;
        }
        return super.mouseClicked(mouseX, mouseY, button);
    }

    private static boolean inside(double x, double y, double left, double top,
                                  double right, double bottom) {
        return x >= left && x <= right && y >= top && y <= bottom;
    }

    @Override public boolean isPauseScreen() { return false; }
}
