package twilightforest.item;

import java.util.List;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.StatCollector;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import twilightforest.TwilightForestMod;

public class ItemTFSteeleafArmor extends ItemArmor {

    public ItemTFSteeleafArmor(ItemArmor.ArmorMaterial par2EnumArmorMaterial, int renderIndex, int armorType) {
        super(par2EnumArmorMaterial, renderIndex, armorType);
        this.setCreativeTab(TFItems.creativeTab);
    }

    /**
     * Return an item rarity from EnumRarity
     */
    @Override
    public EnumRarity getRarity(ItemStack par1ItemStack) {
        return EnumRarity.uncommon;
    }

    @Override
    public String getArmorTexture(ItemStack itemstack, Entity entity, int slot, String layer) {
        if (itemstack.getItem() == TFItems.steeleafPlate || itemstack.getItem() == TFItems.steeleafHelm
                || itemstack.getItem() == TFItems.steeleafBoots) {
            return TwilightForestMod.ARMOR_DIR + "steeleaf_1.png";
        }
        if (itemstack.getItem() == TFItems.steeleafLegs) {
            return TwilightForestMod.ARMOR_DIR + "steeleaf_2.png";
        }
        return TwilightForestMod.ARMOR_DIR + "steeleaf_1.png";
    }

    /**
     * Return whether this item is repairable in an anvil.
     */
    @Override
    public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack) {
        // repair with steeleaf ingots
        return par2ItemStack.getItem() == TFItems.steeleafIngot ? true
                : super.getIsRepairable(par1ItemStack, par2ItemStack);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List<String> par3List,
            boolean par4) {
        super.addInformation(par1ItemStack, par2EntityPlayer, par3List, par4);
        par3List.add(EnumChatFormatting.DARK_GREEN + StatCollector.translateToLocal(getUnlocalizedName() + ".tooltip"));
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
