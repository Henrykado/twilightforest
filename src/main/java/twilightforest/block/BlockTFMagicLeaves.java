package twilightforest.block;

import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLeaves;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import twilightforest.TwilightForestMod;
import twilightforest.item.TFItems;

public class BlockTFMagicLeaves extends BlockLeaves {

    public static IIcon SPR_TRANSLEAVES;
    public static IIcon SPR_TRANSLEAVES_OPAQUE;
    public static IIcon SPR_TRANSFX;

    private static final int SAPLING_ITEM_META_OFFSET = 5;

    protected BlockTFMagicLeaves() {
        super();
        this.setHardness(0.2F);
        this.setLightOpacity(2);
        this.setStepSound(Block.soundTypeGrass);
        this.setCreativeTab(TFItems.creativeTab);
    }

    /**
     * Returns the color this block should be rendered. Used by leaves.
     */
    @Override
    public int getRenderColor(int par1) {
        return 108 << 16 | 204 << 8 | 234;
    }

    /**
     * Returns a integer with hex for 0xrrggbb with this color multiplied against the blocks color. Note only called
     * when first determining what to render.
     */
    @Override
    public int colorMultiplier(IBlockAccess world, int x, int y, int z) {
        int red = 0;
        int green = 0;
        int blue = 0;

        int fade;
        float spring;
        float fall;

        fade = x * 27 + y * 63 + z * 39;
        if ((fade & 256) != 0) {
            fade = 255 - (fade & 255);
        }
        fade &= 255;
        spring = (255 - fade) / 255F;
        fall = fade / 255F;
        red = (int) (spring * 108 + fall * 96);
        green = (int) (spring * 204 + fall * 107);
        blue = (int) (spring * 234 + fall * 121);

        return red << 16 | green << 8 | blue;
    }

    /**
     * The type of render function that is called for this block
     */
    @Override
    public int getRenderType() {
        return TwilightForestMod.proxy.getMagicLeavesBlockRenderID();
    }

    /**
     * Returns which pass should this block be rendered on. 0 for solids and 1 for alpha
     */
    @Override
    public int getRenderBlockPass() {
        return 0;
    }

    @Override
    public boolean isOpaqueCube() {
        return Blocks.leaves.isOpaqueCube();
    }

    @Override
    public IIcon getIcon(int side, int meta) {
        if (Blocks.leaves.isOpaqueCube()) {
            return SPR_TRANSLEAVES_OPAQUE;
        } else {
            return SPR_TRANSLEAVES;
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister par1IconRegister) {
        BlockTFMagicLeaves.SPR_TRANSLEAVES = par1IconRegister.registerIcon(TwilightForestMod.ID + ":trans_leaves");
        BlockTFMagicLeaves.SPR_TRANSLEAVES_OPAQUE = par1IconRegister
                .registerIcon(TwilightForestMod.ID + ":trans_leaves_opaque");
    }

    /**
     * A randomly called display update to be able to add particles or other items for display
     */
    @Override
    public void randomDisplayTick(World world, int x, int y, int z, Random rand) {
        for (int i = 0; i < 1; ++i) {
            this.sparkleRunes(world, x, y, z, rand);
        }
    }

    /**
     * The leaf sparkles.
     */
    private void sparkleRunes(World world, int x, int y, int z, Random rand) {
        double offset = 0.0625D;

        int side = rand.nextInt(5) + 1;
        double rx = x + rand.nextFloat();
        double ry = y + rand.nextFloat();
        double rz = z + rand.nextFloat();

        if (side == 0 && world.isAirBlock(x, y + 1, z)) {
            ry = y + 1 + offset;
        }

        if (side == 1 && world.isAirBlock(x, y - 1, z)) {
            ry = y - offset;
        }

        if (side == 2 && world.isAirBlock(x, y, z + 1)) {
            rz = z + 1 + offset;
        }

        if (side == 3 && world.isAirBlock(x, y, z - 1)) {
            rz = z - offset;
        }

        if (side == 4 && world.isAirBlock(x + 1, y, z)) {
            rx = x + 1 + offset;
        }

        if (side == 5 && world.isAirBlock(x - 1, y, z)) {
            rx = x - offset;
        }

        if (rx < x || rx > x + 1 || ry < y || ry > y + 1 || rz < z || rz > z + 1) {
            TwilightForestMod.proxy.spawnParticle(world, "leafrune", rx, ry, rz, 0.0D, 0.0D, 0.0D);
        }
    }

    /**
     * Localisation Function, [leafblock-meta & 3] will be added to the unlocalised name
     */
    @Override
    public String[] func_150125_e() {
        return new String[] { "time", "trans", "mine", "sort" };
    }

    /**
     * returns the items that will be dropped
     */
    @Override
    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_) {
        return Item.getItemFromBlock(TFBlocks.sapling);
    }

    /**
     * DROPCHANCE for Saplings, higher Values returned here will get LOWER chance overall! For comparison: Vanilla
     * Trees: 40 Vanilla Dark Oak: 80 Thaumcraft Greatwood: ~200 Thaumcraft Silverwood: ~250
     */
    @Override
    protected int func_150123_b(int metadata) {
        return 150;
    }

    /**
     * Additional Drops can be spawned here chance is 200, in vanilla code, same logic as the previous function, used
     * for apples in vanilla
     */
    @Override
    @SuppressWarnings("ALL")
    protected void func_150124_c(World world, int x, int y, int z, int metadata, int chance) {
        if (world.rand.nextInt(chance) == 0)
            this.dropBlockAsItem(world, x, y, z, new ItemStack(TFBlocks.firefly, 2, 0));
    }
}
