package yos.mod.letsmodreboot.proxy;


import yos.mod.letsmodreboot.init.ModItems;

public class ClientProxy extends CommonProxy {
    @Override
    public void preInit() {
    }

    @Override
    public void init(){
        ModItems.registerItemRenderer();
    }

    @Override
    public void postInit(){

    }
}
