package com.karmaxe.menu;

import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.gui.screens.worldselection.SelectWorldScreen;
import net.minecraft.client.gui.screens.multiplayer.JoinMultiplayerScreen;
import net.minecraft.network.chat.Component;

public class KarmaxePlayScreen extends Screen {
    private final Screen parent;

    public KarmaxePlayScreen(Screen parent) {
        super(Component.literal("KARMAXE - JUGAR"));
        this.parent = parent;
    }

    @Override
    protected void init() {
        int center = this.width / 2;
        int buttonWidth = Math.min(240, this.width - 40);
        int x = center - buttonWidth / 2;
        int y = this.height / 2 - 20;

        this.addRenderableWidget(Button.builder(Component.literal("UN JUGADOR"),
                b -> this.minecraft.setScreen(new SelectWorldScreen(this)))
                .bounds(x, y - 24, buttonWidth, 20).build());

        this.addRenderableWidget(Button.builder(Component.literal("MULTIJUGADOR"),
                b -> this.minecraft.setScreen(new JoinMultiplayerScreen(this)))
                .bounds(x, y + 2, buttonWidth, 20).build());

        this.addRenderableWidget(Button.builder(Component.literal("VOLVER"),
                b -> this.minecraft.setScreen(parent))
                .bounds(x, y + 34, buttonWidth, 20).build());
    }

    @Override
    public void render(GuiGraphics graphics, int mouseX, int mouseY, float partialTick) {
        this.renderBackground(graphics);
        graphics.drawCenteredString(this.font, "KARMAXE", this.width / 2, this.height / 2 - 75, 0xFFD86B);
        graphics.drawCenteredString(this.font, "ELIGE CÓMO QUIERES JUGAR", this.width / 2,
                this.height / 2 - 58, 0xFFFFFF);
        super.render(graphics, mouseX, mouseY, partialTick);
    }

    @Override public boolean isPauseScreen() { return false; }
}
