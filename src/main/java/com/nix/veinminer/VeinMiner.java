package com.nix.veinminer;

import com.nix.veinminer.Artikel.ArtikelRegistrier;
import com.nix.veinminer.Blocks.BlockRegistrier;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import static com.nix.veinminer.Utils.*;

@Mod(MOD_ID)
public class VeinMiner {
    public VeinMiner(){
        ArtikelRegistrier.ITEM_REGISTRIER.register(FMLJavaModLoadingContext.get().getModEventBus());
        BlockRegistrier.BLOCK_REGISTRIER.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
