package yos.mod.letsmodreboot.init;


import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import yos.mod.letsmodreboot.item.ItemLMR;
import yos.mod.letsmodreboot.item.ItemMapleLeaf;
import net.minecraftforge.fml.common.registry.GameRegistry;
import yos.mod.letsmodreboot.reference.Reference;
import yos.mod.letsmodreboot.reference.Resources;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {
    public static final ItemLMR mapleLeaf = new ItemMapleLeaf();

    public static void init() {
        GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
    }

    public static void registerItemRenderer(){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(mapleLeaf, 0, new ModelResourceLocation(Resources.MAPLE_LEAF_TEXTURE, "inventory"));
    }

}
