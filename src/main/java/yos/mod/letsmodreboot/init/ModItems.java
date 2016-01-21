package yos.mod.letsmodreboot.init;


import yos.mod.letsmodreboot.item.ItemLMR;
import yos.mod.letsmodreboot.item.ItemMapleLeaf;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
    public static final ItemLMR mapleLeaf = new ItemMapleLeaf();

    public static void init() {
        GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
    }
}
