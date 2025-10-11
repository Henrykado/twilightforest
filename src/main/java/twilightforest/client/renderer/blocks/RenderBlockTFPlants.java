package twilightforest.client.renderer.blocks;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;

import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;
import twilightforest.block.BlockTFPlant;

public class RenderBlockTFPlants implements ISimpleBlockRenderingHandler {

    final int renderID;

    public RenderBlockTFPlants(int blockRenderID) {
        this.renderID = blockRenderID;
    }

    @Override
    public void renderInventoryBlock(Block block, int metadata, int modelID, RenderBlocks renderer) {
        // TODO Auto-generated method stub

    }

    @Override
    public boolean renderWorldBlock(IBlockAccess world, int x, int y, int z, Block block, int modelId,
            RenderBlocks renderer) {
        int meta = world.getBlockMetadata(x, y, z);
        if (meta == BlockTFPlant.META_MOSSPATCH) {
            renderMossPatch(x, y, z, block, renderer);
        } else if (meta == BlockTFPlant.META_CLOVERPATCH) {
            renderCloverPatch(x, y, z, block, renderer);
        } else if (meta == BlockTFPlant.META_MAYAPPLE) {
            renderMayapple(x, y, z, block, renderer);
        } else if (meta == BlockTFPlant.META_ROOT_STRAND) {
            renderer.renderBlockCrops(block, x, y, z);
        } else {
            renderer.renderCrossedSquares(block, x, y, z);
        }

        return true;
    }

    private void renderMayapple(int x, int y, int z, Block block, RenderBlocks renderer) {
        renderer.clearOverrideBlockTexture();
        renderer.setRenderBounds(4F / 16F, 6F / 16F, 4F / 16F, 13F / 16F, 6F / 16F, 13F / 16F);
        renderer.renderStandardBlock(block, x, y, z);

        renderer.overrideBlockTexture = BlockTFPlant.mayappleSide;
        // renderer.renderCrossedSquares(block, x + 0.5d, y, z - 0.5d);

        Tessellator tessellator = Tessellator.instance;
        tessellator.setBrightness(block.getMixedBrightnessForBlock(renderer.blockAccess, x, y, z));
        int l = block.colorMultiplier(renderer.blockAccess, x, y, z);
        float f = (float) (l >> 16 & 255) / 255.0F;
        float f1 = (float) (l >> 8 & 255) / 255.0F;
        float f2 = (float) (l & 255) / 255.0F;

        tessellator.setColorOpaque_F(f, f1, f2);

        IIcon iicon = renderer
                .getBlockIconFromSideAndMetadata(block, 0, renderer.blockAccess.getBlockMetadata(x, y, z));
        renderer.drawCrossedSquares(iicon, x + 1 / 32D, y, z + 1 / 32D, 1.0F);

        renderer.clearOverrideBlockTexture();
    }

    private void renderCloverPatch(int x, int y, int z, Block block, RenderBlocks renderer) {
        renderer.renderMinY = renderer.renderMaxY;
        renderer.renderStandardBlock(block, x, y, z);

        renderer.renderMinY = 0F;
        renderer.renderMaxY -= 0.01F;

        renderer.renderMinX += 1F / 16F;
        renderer.renderMinZ += 1F / 16F;
        renderer.renderMaxX -= 1F / 16F;
        renderer.renderMaxZ -= 1F / 16F;
        renderer.renderStandardBlock(block, x, y, z);
    }

    private void renderMossPatch(int x, int y, int z, Block block, RenderBlocks renderer) {
        renderer.setRenderBounds(0, 0, 0, 1, 1 / 16D, 1);
        renderer.renderStandardBlock(block, x, y, z);
    }

    @Override
    public boolean shouldRender3DInInventory(int modelId) {
        return false;
    }

    @Override
    public int getRenderId() {
        return renderID;
    }

}
