package uk.co.qmunity.lib.part.compat.fmp;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Optional;
import uk.co.qmunity.lib.part.compat.IMultipartCompat;
import uk.co.qmunity.lib.ref.Dependencies;

public class FMPHelper {

    public static final boolean isLoaded() {

        return Loader.isModLoaded(Dependencies.FMP);
    }

    private static IMultipartCompat compat;

    public static final IMultipartCompat getCompat() {

        if (isLoaded()) initCompat();

        return compat;
    }

    @Optional.Method(modid = Dependencies.FMP)
    private static void initCompat() {

        if (compat == null) compat = new FMPCompat();
    }

}
