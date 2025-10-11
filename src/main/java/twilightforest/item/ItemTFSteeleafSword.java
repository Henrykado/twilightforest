package twilightforest.item;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import twilightforest.TwilightForestMod;
import twilightforest.entity.EntitySteelleaf;

public class ItemTFSteeleafSword extends ItemSword {

    public ItemTFSteeleafSword(Item.ToolMaterial par2EnumToolMaterial) {
        super(par2EnumToolMaterial);
        this.setCreativeTab(TFItems.creativeTab);
    }

    // code adapted from Botania's Terra Blade
    @Override
    public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
        super.onUpdate(par1ItemStack, par2World, par3Entity, par4, par5);

        if (par3Entity instanceof EntityPlayer player) {
            PotionEffect haste = player.getActivePotionEffect(Potion.digSpeed);
            float check = haste == null ? 0.16666667F : haste.getAmplifier() == 1 ? 0.5F : 0.4F;

            if (player.getCurrentEquippedItem() == par1ItemStack && player.swingProgress == check
                    && !par2World.isRemote
                    && par2World.rand.nextInt(2) == 0) {
                if (cancelProjectile) {
                    cancelProjectile = false;
                    return;
                }
                par2World.spawnEntityInWorld(new EntitySteelleaf(par2World, player));
                // par2World.playSoundAtEntity(player, "botania:terraBlade", 0.4F, 1.4F);
            }
        }
    }

    boolean cancelProjectile = false;

    public boolean hitEntity(ItemStack stack, EntityLivingBase p_77644_2_, EntityLivingBase p_77644_3_) {
        cancelProjectile = true;

        return super.hitEntity(stack, p_77644_2_, p_77644_3_);
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
}
