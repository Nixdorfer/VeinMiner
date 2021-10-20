package com.nix.veinminer.Blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class ErzaderGraber extends Block {
    public ErzaderGraber(){
        super(AbstractBlock.Properties
                .of(Material.METAL)
                .strength(1.5f, 5)
                .sound(SoundType.METAL)
                .dynamicShape());
    }
}
