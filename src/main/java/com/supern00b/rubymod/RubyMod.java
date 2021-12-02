package com.supern00b.rubymod;

import com.supern00b.rubymod.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RubyMod implements ModInitializer {
	public static final String MOD_ID = "rubymodbysupern00b";
	public static final Logger LOGGER = LogManager.getLogger("rubymodbysupern00b");

	@Override
	public void onInitialize() {

		ModItems.RegisterModItems();

		LOGGER.info("Hello Fabric world!");
	}
}
