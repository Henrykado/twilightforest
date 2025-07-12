package twilightforest.item;

import java.util.List;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

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
