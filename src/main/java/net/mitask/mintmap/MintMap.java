package net.mitask.mintmap;

import net.modificationstation.stationapi.api.mod.entrypoint.Entrypoint;
import net.modificationstation.stationapi.api.util.Namespace;
import net.modificationstation.stationapi.api.util.Null;
import org.apache.logging.log4j.core.Logger;

public class MintMap {
    @Entrypoint.Namespace public static Namespace NAMESPACE = Null.get();
    @Entrypoint.Logger public static Logger LOGGER = Null.get();
}
