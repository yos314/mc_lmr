package yos.mod.letsmodreboot.proxy;


import yos.mod.letsmodreboot.init.ModBlocks;
import yos.mod.letsmodreboot.init.ModItems;

public class ClientProxy extends CommonProxy {
    @Override
    public void preInit() {
    }

    @Override
    public void init(){
        ModItems.registerItemRenderer();
        ModBlocks.registerItemRenderer();
    }

    @Override
    public void postInit(){

    }
}
