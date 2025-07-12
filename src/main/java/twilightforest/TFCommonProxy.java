package twilightforest;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

import cpw.mods.fml.common.network.IGuiHandler;
import twilightforest.inventory.ContainerTFUncrafting;

public class TFCommonProxy implements IGuiHandler {

    /**
     * Called during the pre-load step. Register stuff here. Obviously most stuff in the common category will be just
     * registered in the mod file
     */
    public void doPreLoadRegistration() {
        ;
    }

    /**
     * Called during the load step. Register stuff here. Obviously most stuff in the common category will be just
     * registered in the mod file
     */
    public void doOnLoadRegistration() {
        ;
    }

    public int getCritterBlockRenderID() {
        return 0;
    }

    public int getPlantBlockRenderID() {
        return 0;
    }

    public int getCakeBlockRenderID() {
        return 0;
    }

    public int getChestBlockRenderID() {
        return 0;
    }

    public int getComplexBlockRenderID() {
        return 0;
    }

    public int getNagastoneBlockRenderID() {
        return 0;
    }

    public int getNewNagastoneBlockRenderID() {
        return 0;
    }

    public int getNagastoneEtchedStairsBlockRenderID() {
        return 0;
    }

    public int getSpiralBricksBlockRenderID() {
        return 0;
    }

    public int getMagicLeavesBlockRenderID() {
        return 0;
    }

    public int getPedestalBlockRenderID() {
        return 0;
    }

    public int getThornsBlockRenderID() {
        return 0;
    }

    public int getKnightmetalBlockRenderID() {
        return 0;
    }

    public int getFieryMetalBlockRenderID() {
        return 0;
    }

    public int getHugeLilyPadBlockRenderID() {
        return 0;
    }

    public int getCastleMagicBlockRenderID() {
        return 0;
    }

    public int registerArmorRenderID(String prefix) {
        return 0;
    }

    public World getClientWorld() {
        return null;
    }

    /**
     * Spawns a particle. This is my copy of RenderGlobal.spawnParticle where I implement custom particles. Null op
     * except on the client.
     */
    public void spawnParticle(World world, String particleType, double x, double y, double z, double velX, double velY,
            double velZ) {
        ;
    }

    @Override
    public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
        if (id == TwilightForestMod.GUI_ID_UNCRAFTING) {
            return new ContainerTFUncrafting(player.inventory, world, x, y, z);
        } else {
            return null;
        }
    }

    @Override
    public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
        if (id == TwilightForestMod.GUI_ID_UNCRAFTING) {
            return new twilightforest.client.GuiTFGoblinCrafting(player.inventory, world, x, y, z);
        } else {
            return null;
        }
    }

    public ModelBiped getKnightlyArmorModel(int armorSlot) {
        return null;
    }

    public ModelBiped getPhantomArmorModel(int armorSlot) {
        return null;
    }

    public ModelBiped getYetiArmorModel(int armorSlot) {
        return null;
    }

    public ModelBiped getArcticArmorModel(int armorSlot) {
        return null;
    }

    public ModelBiped getFieryArmorModel(int armorSlot) {
        return null;
    }

    public ModelBiped getTrophyArmorModel(int boss) {
        return null;
    }

    public ModelBiped getCritterArmorModel(int critter) {
        return null;
    }

    public void doBlockAnnihilateEffect(World worldObj, int blockX, int blockY, int blockZ) {}

    public boolean checkForSound(ChunkCoordinates chunkcoordinates) {
        return true;
    }

    public void stopSound(World worldIn, int x, int y, int z) {}

    public void playSound(World worldObj, ChunkCoordinates chunkcoordinates, ResourceLocation soundResource) {}

}
