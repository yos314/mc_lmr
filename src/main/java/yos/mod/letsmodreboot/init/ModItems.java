package yos.mod.letsmodreboot.init;


import yos.mod.letsmodreboot.item.ItemLMR;
import yos.mod.letsmodreboot.item.ItemMapleLeaf;
import net.minecraftforge.fml.common.registry.GameRegistry;
import yos.mod.letsmodreboot.reference.Reference;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {
    public static final ItemLMR mapleLeaf = new ItemMapleLeaf();

    public static void init() {
        GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
    }
}
