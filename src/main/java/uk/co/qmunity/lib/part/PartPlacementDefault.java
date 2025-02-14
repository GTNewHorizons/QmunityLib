package uk.co.qmunity.lib.part;

import net.minecraft.world.World;

import uk.co.qmunity.lib.part.compat.IMultipartCompat;
import uk.co.qmunity.lib.vec.Vec3i;

public class PartPlacementDefault implements IPartPlacement {

    @Override
    public boolean placePart(IPart part, World world, Vec3i location, IMultipartCompat multipartSystem,
            boolean simulated) {

        return multipartSystem.addPartToWorld(part, world, location, simulated);
    }

}
