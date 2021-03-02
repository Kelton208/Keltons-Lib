package com.github.kelton208.keltons_lib.main.builder;

import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.io.Serializable;
import java.util.List;

public class ItemBuild
        implements Cloneable, Serializable {

    private final ItemStack stack;
    private ItemMeta meta;

    public ItemBuild() {
        this.stack = new ItemStack(Material.AIR);
    }

    private ItemBuild(ItemStack base) {
        this.stack = base;
    }

    public ItemBuild setBase(Material type, String name, List<String> lore) {
        this.setType(type);
        this.setName(name);
        this.setLore(lore);
        return this;
    }

    public ItemBuild setAmount(int amount) {
        this.stack.setAmount(amount);
        return this;
    }

    public ItemBuild setType(Material type) {
        this.stack.setType(type);
        this.meta = stack.getItemMeta();
        return this;
    }

    public ItemBuild setName(String name) {
        this.meta.setDisplayName(name);
        return this;
    }

    public ItemBuild setLore(List<String> lore) {
        this.meta.setLore(lore);
        return this;
    }

    public ItemBuild addFlag(ItemFlag... flag) {
        this.meta.addItemFlags(flag);
        return this;
    }

    public ItemBuild addEnchant(Enchantment e, int level) {
        this.meta.addEnchant(e, level, true);
        return this;
    }

    public ItemBuild addAttribute(Attribute att, AttributeModifier mod) {
        this.meta.addAttributeModifier(att, mod);
        return this;
    }

    public ItemBuild removeEnchant(Enchantment e) {
        this.meta.removeEnchant(e);
        return this;
    }

    public ItemBuild removeFlag(ItemFlag... flag) {
        this.meta.removeItemFlags(flag);
        return this;
    }

    public ItemBuild removeAttribute(Attribute a) {
        this.meta.removeAttributeModifier(a);
        return this;
    }

    public ItemBuild removeAttribute(EquipmentSlot slot) {
        this.meta.removeAttributeModifier(slot);
        return this;
    }

    public ItemBuild setUnbr(boolean b) {
        this.meta.setUnbreakable(b);
        return this;
    }

    public ItemBuild reset() {
        this.setName(null);
        this.setLore(null);
        this.setType(Material.AIR);
        this.setItemMeta(this.toItem().getItemMeta());
        return this;
    }

    public ItemBuild setItemMeta(ItemMeta meta) {
        this.stack.setItemMeta(meta);
        return this;
    }

    public ItemStack toItem() {
        return this.stack;
    }
}
