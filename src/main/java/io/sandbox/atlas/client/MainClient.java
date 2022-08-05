package io.sandbox.atlas.client;

import io.sandbox.atlas.block_entities.BlockEntityLoader;
import io.sandbox.atlas.client.atlas_device.AtlasDeviceBlockRenderer;
import io.sandbox.atlas.screens.ScreenLoader;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.BlockEntityRendererRegistry;

public class MainClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        // Config Menu
        // HandledScreens.<AtlasDeviceConfigGui, AtlasDeviceConfigScreen>register(
        //     Main.ATLAS_DEVICE_CONFIG_SCREEN_HANDLER_TYPE,
        //     (gui, inventory, title) -> new AtlasDeviceConfigScreen(gui, inventory, title)
        // );

        // Dungeon Menu
        ScreenLoader.initClient();

        BlockEntityRendererRegistry.register(BlockEntityLoader.ATLAS_DEVICE_BLOCK_ENTITY, AtlasDeviceBlockRenderer::new);
    }
    
}