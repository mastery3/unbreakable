package mastery3.unbreakable;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.fabricmc.api.ModInitializer;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Entry implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger("sharpness6");

    public void onInitialize() {
		LOGGER.info("Go make that OP weapon :)");
    }
    public static Enchantment UNBREAKABLE = Registry.register(
            Registry.ENCHANTMENT,
            new Identifier("mastery3", "unbreakable"),
            new UnbreakableEnchantment()
    );
}
