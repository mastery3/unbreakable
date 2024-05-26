package mastery3.unbreakable;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import net.minecraft.enchantment.*;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.tag.EntityTypeTags;
import net.minecraft.registry.tag.ItemTags;

public class UnbreakableEnchantment extends Enchantment {
	protected UnbreakableEnchantment() {
		super(Enchantment.properties(ItemTags.DURABILITY_ENCHANTABLE, 1, 1, Enchantment.leveledCost(35, 35), Enchantment.leveledCost(150, 50), 5, new EquipmentSlot[]{EquipmentSlot.MAINHAND}));
		//super(Enchantment.Rarity.VERY_RARE, EnchantmentTarget.BREAKABLE, new EquipmentSlot[] {EquipmentSlot.MAINHAND, EquipmentSlot.OFFHAND, EquipmentSlot.HEAD, EquipmentSlot.CHEST, EquipmentSlot.LEGS, EquipmentSlot.FEET});
	}
	
	/*@Override
	public int getMinPower(int level) {
		return 40 * level;
	}
	
	@Override
	public int getMaxPower(int level) {
		return 10000000;
	}
	*/
	
	@Override
	public boolean isAcceptableItem(ItemStack stack) {
		return stack.isDamageable() ? true : super.isAcceptableItem(stack);
	}
	@Override
	public boolean isTreasure() {
		return true;
	 }
	 @Override
	 public boolean isCursed() {
		return false;
	 }
  
}