package com.nix.veinminer.Blocks;

import com.nix.veinminer.Artikel.ArtikelRegistrier;
import com.nix.veinminer.ModGroup;
import com.nix.veinminer.Utils;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockRegistrier {
    public static final DeferredRegister<Block> BLOCK_REGISTRIER = DeferredRegister.create(ForgeRegistries.BLOCKS, Utils.MOD_ID);
    public static final RegistryObject<Item> erzaderGraberArtikel = ArtikelRegistrier.ITEM_REGISTRIER.register("vein_miner", () -> new BlockItem(BlockRegistrier.erzaderGraberBlock.get(), new Item.Properties().tab(ModGroup.itemGroup)));
    public static final RegistryObject<Block> erzaderGraberBlock = BLOCK_REGISTRIER.register("vein_miner", ErzaderGraber::new);
}
