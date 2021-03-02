package com.github.kelton208.keltons_lib.main.builder;

import org.bukkit.Bukkit;
import org.bukkit.NamespacedKey;
import org.bukkit.boss.BarColor;
import org.bukkit.boss.BarFlag;
import org.bukkit.boss.BarStyle;
import org.bukkit.boss.BossBar;
import org.bukkit.entity.Player;

import java.io.Serializable;

public class BossBarBuild
        implements Cloneable, Serializable {

    private final BossBar bar;
    private int max = 100;

    public BossBarBuild(String name, BarColor color, BarStyle style, BarFlag... flags) {
        this.bar = Bukkit.createBossBar(name, color, style, flags);
    }

    public BossBarBuild(NamespacedKey key, String name, BarColor color, BarStyle style, BarFlag... flags) {
        this.bar = Bukkit.createBossBar(key, name, color, style, flags);
    }

    public BossBarBuild setColor(BarColor color) {
        this.bar.setColor(color);
        return this;
    }

    public BossBarBuild setStyle(BarStyle style) {
        this.bar.setStyle(style);
        return this;
    }

    public BossBarBuild setTitle(String name) {
        this.bar.setTitle(name);
        return this;
    }

    public BossBarBuild addFlags(BarFlag... flags) {
        for(BarFlag flag : flags) this.bar.addFlag(flag);
        return this;
    }

    public BossBarBuild toggleVisible() {
        this.bar.setVisible(!this.bar.isVisible());
        return this;
    }

    public BossBarBuild addPlayer(Player... players) {
        for(Player p : players) this.bar.addPlayer(p);
        return this;
    }

    public BossBarBuild setProgress(int pro) {
        this.bar.setProgress(pro / (float) this.max);
        return this;
    }

    public BossBarBuild setMax(int max) {
        this.max = max;
        return this;
    }

    public BossBar toBossBar() {
        return this.bar;
    }
}
