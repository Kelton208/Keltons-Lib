package com.github.kelton208.keltons_lib.main;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Keltons_Lib extends JavaPlugin {

    private static final Keltons_Lib lib = (Keltons_Lib) Bukkit.getPluginManager().getPlugin("Keltons-Lib");

    @Override
    public void onEnable() {
        Bukkit.getLogger().info("Kelton's lib is now enabled");
    }

    @Override
    public void onDisable() {
        Bukkit.getLogger().info("Kelton's lib is now disabled");
    }

    public static Keltons_Lib getInstance() {
        return lib;
    }
}
