package yos.mod.letsmodreboot.block;


import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import yos.mod.letsmodreboot.creativetab.CreativeTabLMR;
import yos.mod.letsmodreboot.reference.Reference;

public class BlockLMR extends Block {
    public BlockLMR(Material material){
        super(material);
        this.setCreativeTab(CreativeTabLMR.LMR_TAB);
    }
    public  BlockLMR(){
        this(Material.rock);
    }

    @Override
    public String getUnlocalizedName(){
        return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName){
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
