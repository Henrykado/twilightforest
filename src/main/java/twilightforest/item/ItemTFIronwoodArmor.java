package twilightforest.item;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import twilightforest.TwilightForestMod;

public class ItemTFIronwoodArmor extends ItemArmor {

    public ItemTFIronwoodArmor(ItemArmor.ArmorMaterial par2EnumArmorMaterial, int renderIndex, int armorType) {
        super(par2EnumArmorMaterial, renderIndex, armorType);
        this.setCreativeTab(TFItems.creativeTab);
    }

    // Return an item rarity from EnumRarity
    @Override
    public EnumRarity getRarity(ItemStack par1ItemStack) {
        return EnumRarity.uncommon;
    }

    @Override
    public String getArmorTexture(ItemStack itemstack, Entity entity, int slot, String layer) {
        if (itemstack.getItem() == TFItems.ironwoodPlate || itemstack.getItem() == TFItems.ironwoodHelm
                || itemstack.getItem() == TFItems.ironwoodBoots) {
            return TwilightForestMod.ARMOR_DIR + "ironwood_1.png";
        }
        if (itemstack.getItem() == TFItems.ironwoodLegs) {
            return TwilightForestMod.ARMOR_DIR + "ironwood_2.png";
        }
        return TwilightForestMod.ARMOR_DIR + "ironwood_1.png";
    }

    // Return whether this item is repairable in an anvil.
    @Override
    public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack) {
        // repair with ironwood ingots
        return par2ItemStack.getItem() == TFItems.ironwoodIngot ? true
                : super.getIsRepairable(par1ItemStack, par2ItemStack);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister par1IconRegister) {
        this.itemIcon = par1IconRegister
                .registerIcon(TwilightForestMod.ID + ":" + this.getUnlocalizedName().substring(5));
    }
}
