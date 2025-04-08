package net.mitask.mintmap.mixin;

import net.glasslauncher.mods.glassmappinglib.api.Waypoint;
import net.minecraft.entity.player.PlayerEntity;
import net.mitask.mintmap.MintMap;
import net.modificationstation.stationapi.api.util.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import static net.mitask.mintmap.MintMap.LOGGER;

@Mixin(PlayerEntity.class)
public class PlayerMixin {
    @Inject(method = "jump", at = @At("HEAD"))
    public void jump(CallbackInfo ci) {
        var ID = Identifier.of("minecraft:overworld");
        var data = MintMap.getInstance().getWorldWaypointData().get(ID).waypoints();
        var player = PlayerEntity.class.cast(this);
        int x = (int) player.x;
        int y = (int) player.y;
        int z = (int) player.z;

        LOGGER.info("Waypoint data:");
        for(Waypoint waypoint : data) {
            LOGGER.info("{} - {}, {}, {}", waypoint.name, waypoint.x, waypoint.y, waypoint.z);
        }

        data.add(new Waypoint(ID, x, y, z, "%s|%s|%s".formatted(x, y, z)));
    }
}
