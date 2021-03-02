package com.github.kelton208.keltons_lib;

import net.minecraft.server.v1_16_R3.Packet;
import org.bukkit.craftbukkit.v1_16_R3.entity.CraftPlayer;
import org.bukkit.entity.Player;

public class PacketSender {

    public static void send(Player p, Packet<?> packet) {
        ((CraftPlayer) p.getPlayer()).getHandle().playerConnection.sendPacket(packet);
    }

}
