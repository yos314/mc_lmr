package yos.mod.letsmodreboot.item;

import yos.mod.letsmodreboot.creativetab.CreativeTabLMR;
import yos.mod.letsmodreboot.reference.Reference;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemLMR extends Item {
    public ItemLMR(){
        super();
        this.setCreativeTab(CreativeTabLMR.LMR_TAB);
    }

    @Override
    public String getUnlocalizedName(){
        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack){
        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName){
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
