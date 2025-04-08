package net.mitask.mintmap;

import lombok.Getter;
import lombok.Setter;
import net.glasslauncher.mods.glassmappinglib.api.DimensionWaypointData;
import net.modificationstation.stationapi.api.mod.entrypoint.Entrypoint;
import net.modificationstation.stationapi.api.util.Identifier;
import net.modificationstation.stationapi.api.util.Namespace;
import net.modificationstation.stationapi.api.util.Null;
import org.apache.logging.log4j.core.Logger;

import java.util.Map;

public class MintMap {
    @Entrypoint.Namespace public static final Namespace NAMESPACE = Null.get();
    @Entrypoint.Logger public static final Logger LOGGER = Null.get();

    private static MintMap INSTANCE;
    @Setter @Getter private Map<Identifier, DimensionWaypointData> worldWaypointData;

    public static MintMap getInstance() {
        if(INSTANCE == null) INSTANCE = new MintMap();

        return INSTANCE;
    }
}
