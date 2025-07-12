package twilightforest.item;


import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.world.World;
import twilightforest.TwilightForestMod;

public class ItemTFIronwoodAxe extends ItemAxe {

    protected ItemTFIronwoodAxe(Item.ToolMaterial par2EnumToolMaterial) {
        super(par2EnumToolMaterial);
        this.setCreativeTab(TFItems.creativeTab);
    }

    /**
     * Return whether this item is repairable in an anvil.
     */
    @Override
    public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack) {
        // repair with ironwood ingots
        return par2ItemStack.getItem() == TFItems.ironwoodIngot || super.getIsRepairable(par1ItemStack, par2ItemStack);
    }

    @Override
    public boolean onBlockDestroyed(ItemStack itemStack, World world, Block blockID, int x, int y, int z,
                                    EntityLivingBase par7EntityLiving) {
        if (super.onBlockDestroyed(itemStack, world, blockID, x, y, z, par7EntityLiving)) {
            return true;
        } else {
            return false;
        }
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

    public float func_150893_a(ItemStack p_150893_1_, Block p_150893_2_)
    {
        return p_150893_2_.getMaterial() != Material.leaves ? super.func_150893_a(p_150893_1_, p_150893_2_) : this.efficiencyOnProperMaterial;
    }
}
