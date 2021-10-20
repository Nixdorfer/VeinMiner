package com.nix.veinminer;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class CustomTab extends ItemGroup {
    public CustomTab() {
        super("CustomTab");
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(Items.GOLD_INGOT);
    }
}
