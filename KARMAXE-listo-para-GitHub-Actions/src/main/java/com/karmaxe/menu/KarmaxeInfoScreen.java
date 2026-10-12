package com.karmaxe.menu;

import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;

public class KarmaxeInfoScreen extends Screen {
    private final Screen parent;
    private final String heading;
    private final String message;

    public KarmaxeInfoScreen(Screen parent, String heading, String message) {
        super(Component.literal(heading));
        this.parent = parent;
        this.heading = heading;
        this.message = message;
    }

    @Override
    protected void init() {
        this.addRenderableWidget(Button.builder(Component.literal("VOLVER"),
                b -> this.minecraft.setScreen(parent))
                .bounds(this.width / 2 - 100, this.height - 45, 200, 20).build());
    }

    @Override
    public void render(GuiGraphics graphics, int mouseX, int mouseY, float partialTick) {
        this.renderBackground(graphics);
        graphics.drawCenteredString(this.font, heading, this.width / 2, this.height / 2 - 35, 0xFFD86B);
        graphics.drawCenteredString(this.font, message, this.width / 2, this.height / 2 - 10, 0xFFFFFF);
        super.render(graphics, mouseX, mouseY, partialTick);
    }

    @Override public boolean isPauseScreen() { return false; }
}
