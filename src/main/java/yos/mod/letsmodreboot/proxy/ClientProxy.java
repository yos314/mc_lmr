package yos.mod.letsmodreboot.proxy;


import yos.mod.letsmodreboot.init.ModItems;

public class ClientProxy extends CommonProxy {
    @Override
    public static void preInit() {

    }

    @Override
    public static void init(){
        ModItems.registerItemRenderer();
    }

    @Override
    public static void postInit(){

    }
}
