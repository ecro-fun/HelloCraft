package io.taraxacum.hellocraft;

import io.taraxacum.lib.Registry;
import org.bukkit.plugin.java.JavaPlugin;

public class HelloCraft extends JavaPlugin {

    private static HelloCraft instance;

    private boolean init;

    private Registry registry;

    public static HelloCraft getInstance() {
        return instance;
    }

    public static Registry getRegistry() {
        return instance.registry;
    }

    @Override
    public void onEnable() {
        if (!this.init) {
            this.init();
            this.init = true;
        }
        // todo enable
    }

    @Override
    public void onDisable() {
        // todo disable
    }

    private void init() {
        instance = this;
        this.registry = new Registry();
        // todo init
    }
}
