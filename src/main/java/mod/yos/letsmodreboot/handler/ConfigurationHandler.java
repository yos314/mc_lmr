package mod.yos.letsmodreboot.handler;


import mod.yos.letsmodreboot.reference.Reference;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.io.File;

public class ConfigurationHandler {

    public static Configuration configuration;
    public static boolean testValue = false;

    public static void init(File configFile) {
        if (configuration == null) {
            configuration = new Configuration(configFile);
        }
    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event) {
        if (event.modID.equalsIgnoreCase(Reference.MOD_ID)) {
            loadConfiguration();
        }
    }

    private void loadConfiguration() {
        testValue = configuration.get(Configuration.CATEGORY_GENERAL, "configValue", false, "Example Config Value").getBoolean(true);
        if (configuration.hasChanged()) {
            configuration.save();
        }

    }

}