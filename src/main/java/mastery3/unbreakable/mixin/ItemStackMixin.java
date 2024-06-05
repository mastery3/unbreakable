package mastery3.unbreakable.mixin;

import java.util.Random;

import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.At;
import mastery3.unbreakable.Entry;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;

@Mixin(ItemStack.class)
public class ItemStackMixin {
    @Inject(method="isDamageable", at=@At("HEAD"), cancellable=true)
    private void inject(CallbackInfoReturnable<Boolean> cir) {
        if (EnchantmentHelper.getLevel(Entry.UNBREAKABLE, ((ItemStack)(Object)this)) > 0) {
            cir.setReturnValue(Boolean.valueOf(false));
        }
    }
}