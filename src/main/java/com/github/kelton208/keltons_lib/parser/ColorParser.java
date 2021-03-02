package com.github.kelton208.keltons_lib.parser;

import org.bukkit.ChatColor;
import org.bukkit.boss.BarColor;

public class ColorParser {

    public BarColor toBarColor(ChatColor color) {
        switch (color) {
            case BLACK:
            case DARK_PURPLE:
                return BarColor.PURPLE;
            case DARK_BLUE:
            case DARK_AQUA:
            case BLUE:
            case AQUA:
                return BarColor.BLUE;
            case DARK_GREEN:
            case GREEN:
                return BarColor.GREEN;
            case DARK_RED:
            case RED:
                return BarColor.RED;
            case GOLD:
            case YELLOW:
                return BarColor.YELLOW;
            case LIGHT_PURPLE:
                return BarColor.PINK;
            case GRAY:
            case DARK_GRAY:
            case WHITE:
            default:
                return BarColor.WHITE;
        }
    }

    public BarColor toBarColor(String color) {
        return toBarColor(toChatColor(color));
    }

    public ChatColor toChatColor(String color) {
        switch (color) {
            case "BLACK":
                return ChatColor.BLACK;
            case "DARK_BLUE":
                return ChatColor.DARK_BLUE;
            case "DARK_GREEN":
                return ChatColor.DARK_GREEN;
            case "DARK_AQUA":
                return ChatColor.DARK_AQUA;
            case "DARK_RED":
                return ChatColor.DARK_RED;
            case "DARK_PURPLE":
                return ChatColor.DARK_PURPLE;
            case "GOLD":
                return ChatColor.GOLD;
            case "GRAY":
                return ChatColor.GRAY;
            case "DARK_GRAY":
                return ChatColor.DARK_GRAY;
            case "BLUE":
                return ChatColor.BLUE;
            case "GREEN":
                return ChatColor.GREEN;
            case "AQUA":
                return ChatColor.AQUA;
            case "RED":
                return ChatColor.RED;
            case "LIGHT_PURPLE":
                return ChatColor.LIGHT_PURPLE;
            case "YELLOW":
                return ChatColor.YELLOW;
            case "WHITE":
                return ChatColor.WHITE;
            case "MAGIC":
                return ChatColor.MAGIC;
            case "BOLD":
                return ChatColor.BOLD;
            case "STRIKETHROUGH":
                return ChatColor.STRIKETHROUGH;
            case "UNDERLINE":
                return ChatColor.UNDERLINE;
            case "ITALIC":
                return ChatColor.ITALIC;
            case "RESET":
                return ChatColor.RESET;
            default:
                return ChatColor.WHITE;
        }
    }
}
