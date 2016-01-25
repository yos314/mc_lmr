package yos.mod.letsmodreboot.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import yos.mod.letsmodreboot.block.BlockFlag;
import yos.mod.letsmodreboot.block.BlockLMR;
import yos.mod.letsmodreboot.reference.Reference;
import yos.mod.letsmodreboot.reference.Resources;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {
    public static final BlockLMR flag = new BlockFlag();

    public static void init(){
        GameRegistry.registerBlock(flag, "flag");
    }

    public static void registerItemRenderer(){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(flag), 0, new ModelResourceLocation(Resources.FLAG_TEXTURE, "inventory"));
    }
}