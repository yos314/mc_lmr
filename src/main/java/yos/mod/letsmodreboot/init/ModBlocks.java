package yos.mod.letsmodreboot.init;

import net.minecraftforge.fml.common.registry.GameRegistry;
import yos.mod.letsmodreboot.block.BlockFlag;
import yos.mod.letsmodreboot.block.BlockLMR;
import yos.mod.letsmodreboot.reference.Reference;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {
    public static final BlockLMR flag = new BlockFlag();

    public static void init(){
        GameRegistry.registerBlock(flag, "flag");
    }
}
