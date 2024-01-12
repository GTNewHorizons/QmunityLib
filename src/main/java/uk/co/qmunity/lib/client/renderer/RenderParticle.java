package uk.co.qmunity.lib.client.renderer;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import uk.co.qmunity.lib.effect.EntityFXParticle;

@SideOnly(Side.CLIENT)
public class RenderParticle extends Render {

    @Override
    public void doRender(Entity entity, double x, double y, double z, float var8, float partialTickTime) {

        EntityFXParticle e = (EntityFXParticle) entity;

        e.particle.render(x, y, z, partialTickTime);
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity var1) {

        return null;
    }

}
