package net.max.projectx;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.max.projectx.block.ModBlocks;
import net.max.projectx.event.PlayerTickHandler;
import net.max.projectx.item.ModItems;
import net.max.projectx.networking.ModMessages;
import net.max.projectx.painting.ModPaintings;
import net.max.projectx.util.ModLootTableModifiers;
import net.max.projectx.villager.ModVillagers;
import net.max.projectx.world.feature.ModConfiguredFeatures;
import net.max.projectx.world.gen.ModOreGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProjectX implements ModInitializer {
	public static final String MOD_ID = "projectx";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);



	@Override
	public void onInitialize() {
		ModConfiguredFeatures.registerConfiguredFeatures();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();


		ModPaintings.registerPainting();

		ModOreGeneration.generateOres();

		ModVillagers.registerVillagers();
		ModVillagers.registerTrades();

		ModLootTableModifiers.modifyLootTables();
		ModMessages.registerC2SPackets();

		ServerTickEvents.START_SERVER_TICK.register(new PlayerTickHandler());

	}
}
