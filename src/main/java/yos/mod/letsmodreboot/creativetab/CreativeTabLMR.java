package yos.mod.letsmodreboot.creativetab;


import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import yos.mod.letsmodreboot.init.ModItems;
import yos.mod.letsmodreboot.reference.Reference;

public class CreativeTabLMR {
    public static final CreativeTabs LMR_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase()){
        @Override
        public Item getTabIconItem(){
            return ModItems.mapleLeaf;
        }

    };
}
