package dev.louis.allofthecommands;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.minecraft.server.command.*;

public class AllOfTheCommands implements ModInitializer {
    /**
     * Runs the mod initializer.
     */
    @Override
    public void onInitialize() {
        CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) -> {
            ResetChunksCommand.register(dispatcher);
            DebugConfigCommand.register(dispatcher);
            DebugMobSpawningCommand.register(dispatcher);
            DebugPathCommand.register(dispatcher);
            TestCommand.register(dispatcher);
            SpawnArmorTrimsCommand.register(dispatcher);
            RaidCommand.register(dispatcher);
            WardenSpawnTrackerCommand.register(dispatcher);
        });
    }
}
