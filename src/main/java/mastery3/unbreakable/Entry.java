package mastery3.unbreakable;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.fabricmc.api.ModInitializer;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class Entry implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger("sharpness6");

    public void onInitialize() {
		LOGGER.info("Go make that OP weapon :)");
    }
    public static Enchantment UNBREAKABLE = Registry.register(
            Registries.ENCHANTMENT,
            new Identifier("mastery3", "unbreakable"),
            new UnbreakableEnchantment()
    );
}
