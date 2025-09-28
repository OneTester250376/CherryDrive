package org.cherrydrive.mixins;

import net.minecraft.server.level.ServerPlayer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import com.storyteam.carmod.util.DonatorHandler;

@Mixin(DonatorHandler.class)
public class DonatorBypassMixin {

    @Inject(method = "isPlayerDonator", at = @At("HEAD"), cancellable = true, remap = false)
    private static void forceDonator(ServerPlayer serverPlayer, 
                                     CallbackInfoReturnable<Boolean> cir) {
		System.out.println(">>> DonatorBypassMixin: injected isPlayerDonator for " + serverPlayer);
        cir.setReturnValue(true); // ALLWAYS true
    }
}

