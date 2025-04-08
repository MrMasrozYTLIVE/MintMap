package net.mitask.mintmap.events;

import net.glasslauncher.mods.glassmappinglib.api.event.WaypointsLoadedEvent;
import net.mine_diver.unsafeevents.listener.EventListener;
import net.mitask.mintmap.MintMap;

import static net.mitask.mintmap.MintMap.LOGGER;

public class WaypointsLoad {
    @EventListener
    public void loadWaypoints(WaypointsLoadedEvent event) {
        LOGGER.info("Loading waypoints");
        MintMap.getInstance().setWorldWaypointData(event.worldWaypointData);
    }
}
