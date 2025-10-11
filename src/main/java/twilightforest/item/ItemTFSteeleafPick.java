package twilightforest.item;

import java.util.Set;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;

import com.google.common.collect.Sets;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import twilightforest.TwilightForestMod;

public class ItemTFSteeleafPick extends ItemTool {

    private static final Set<Block> blockSet = Sets.newHashSet(
            Blocks.cobblestone,
            Blocks.double_stone_slab,
            Blocks.stone_slab,
            Blocks.stone,
            Blocks.sandstone,
            Blocks.mossy_cobblestone,
            Blocks.iron_ore,
            Blocks.iron_block,
            Blocks.coal_ore,
            Blocks.gold_block,
            Blocks.gold_ore,
            Blocks.diamond_ore,
            Blocks.diamond_block,
            Blocks.ice,
            Blocks.netherrack,
            Blocks.lapis_ore,
            Blocks.lapis_block,
            Blocks.redstone_ore,
            Blocks.lit_redstone_ore,
            Blocks.rail,
            Blocks.detector_rail,
            Blocks.golden_rail,
            Blocks.activator_rail,
            Blocks.grass,
            Blocks.dirt,
            Blocks.sand,
            Blocks.gravel,
            Blocks.snow_layer,
            Blocks.snow,
            Blocks.clay,
            Blocks.farmland,
            Blocks.soul_sand,
            Blocks.mycelium,
            Blocks.planks,
            Blocks.bookshelf,
            Blocks.log,
            Blocks.log2,
            Blocks.chest,
            Blocks.pumpkin,
            Blocks.lit_pumpkin);

    protected ItemTFSteeleafPick(Item.ToolMaterial par2EnumToolMaterial) {
        super(2.0F, par2EnumToolMaterial, blockSet);
        this.setCreativeTab(TFItems.creativeTab);
    }

    /**
     * Return whether this item is repairable in an anvil.
     */
    @Override
    public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack) {
        // repair with steeleaf ingots
        return par2ItemStack.getItem() == TFItems.steeleafIngot || super.getIsRepairable(par1ItemStack, par2ItemStack);
    }

    /**
     * Properly register icon source
     */
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister par1IconRegister) {
        this.itemIcon = par1IconRegister
                .registerIcon(TwilightForestMod.ID + ":" + this.getUnlocalizedName().substring(5));
    }

    @Override
    public float func_150893_a(ItemStack p_150893_1_, Block p_150893_2_) {
        return p_150893_2_.getMaterial() != Material.iron && p_150893_2_.getMaterial() != Material.anvil
                && p_150893_2_.getMaterial() != Material.rock
                && p_150893_2_.getMaterial() != Material.wood
                && p_150893_2_.getMaterial() != Material.plants
                && p_150893_2_.getMaterial() != Material.vine
                && p_150893_2_.getMaterial() != Material.leaves ? super.func_150893_a(p_150893_1_, p_150893_2_)
                        : this.efficiencyOnProperMaterial;
    }
}
