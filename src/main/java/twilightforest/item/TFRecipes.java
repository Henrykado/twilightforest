package twilightforest.item;

import static net.minecraftforge.oredict.RecipeSorter.Category.SHAPELESS;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.RecipeSorter;
import net.minecraftforge.oredict.ShapelessOreRecipe;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry;
import twilightforest.TwilightForestMod;
import twilightforest.block.BlockTFFireJet;
import twilightforest.block.BlockTFPlant;
import twilightforest.block.BlockTFTowerDevice;
import twilightforest.block.TFBlocks;

public class TFRecipes {

    public static void registerRecipes() {

        // ore dictionary
        OreDictionary.registerOre("logWood", new ItemStack(TFBlocks.log, 1, OreDictionary.WILDCARD_VALUE));
        //OreDictionary.registerOre("logWood", new ItemStack(TFBlocks.magicLog, 1, OreDictionary.WILDCARD_VALUE));
        for (int i = 0; i < 10; i++) OreDictionary.registerOre("treeSapling", new ItemStack(TFBlocks.sapling, 1, i));
        OreDictionary.registerOre("treeLeaves", new ItemStack(TFBlocks.leaves, 1, OreDictionary.WILDCARD_VALUE));
        //OreDictionary.registerOre("treeLeaves", new ItemStack(TFBlocks.magicLeaves, 1, OreDictionary.WILDCARD_VALUE));
        OreDictionary.registerOre("plankWood", new ItemStack(TFBlocks.towerWood, 1, OreDictionary.WILDCARD_VALUE));
        for (int i = 0; i < 8; i++)
            OreDictionary.registerOre("plankWood", new ItemStack(TFBlocks.planks, i, OreDictionary.WILDCARD_VALUE));
        OreDictionary.registerOre("feather", new ItemStack(TFItems.feather, 1, OreDictionary.WILDCARD_VALUE));

        // register my ores, just for fun
        OreDictionary.registerOre("ingotFiery", new ItemStack(TFItems.fieryIngot));
        OreDictionary.registerOre("oreIronwood", new ItemStack(TFItems.ironwoodRaw));
        OreDictionary.registerOre("ingotIronwood", new ItemStack(TFItems.ironwoodIngot));
        OreDictionary.registerOre("ingotSteeleaf", new ItemStack(TFItems.steeleafIngot));
        OreDictionary.registerOre("oreKnightmetal", new ItemStack(TFItems.shardCluster));
        OreDictionary.registerOre("ingotKnightmetal", new ItemStack(TFItems.knightMetal));
        OreDictionary.registerOre("fieryEssence", new ItemStack(TFItems.fieryBlood));
        OreDictionary.registerOre("fieryEssence", new ItemStack(TFItems.fieryTears));

        // in order for all critters recipes to work
        OreDictionary.registerOre("firefly", new ItemStack(TFBlocks.firefly, 1, OreDictionary.WILDCARD_VALUE));
        OreDictionary.registerOre("firefly", new ItemStack(TFItems.critter, 1, 0));
        OreDictionary.registerOre("cicada", new ItemStack(TFBlocks.cicada, 1, OreDictionary.WILDCARD_VALUE));
        OreDictionary.registerOre("cicada", new ItemStack(TFItems.critter, 1, 1));
        OreDictionary.registerOre("moonworm", new ItemStack(TFBlocks.moonworm, 1, OreDictionary.WILDCARD_VALUE));
        OreDictionary.registerOre("moonworm", new ItemStack(TFItems.critter, 1, 2));

        // nagastone stuff
        OreDictionary.registerOre(
                "nagastoneStairs",
                new ItemStack(TFBlocks.nagastoneStairsLeft, 1, OreDictionary.WILDCARD_VALUE));
        OreDictionary.registerOre(
                "nagastoneStairs",
                new ItemStack(TFBlocks.nagastoneStairsRight, 1, OreDictionary.WILDCARD_VALUE));
        OreDictionary.registerOre(
                "nagastoneStairsMossy",
                new ItemStack(TFBlocks.nagastoneStairsMossyLeft, 1, OreDictionary.WILDCARD_VALUE));
        OreDictionary.registerOre(
                "nagastoneStairsMossy",
                new ItemStack(TFBlocks.nagastoneStairsMossyRight, 1, OreDictionary.WILDCARD_VALUE));
        OreDictionary.registerOre(
                "nagastoneStairsWeathered",
                new ItemStack(TFBlocks.nagastoneStairsWeatheredLeft, 1, OreDictionary.WILDCARD_VALUE));
        OreDictionary.registerOre(
                "nagastoneStairsWeathered",
                new ItemStack(TFBlocks.nagastoneStairsWeatheredRight, 1, OreDictionary.WILDCARD_VALUE));

        // recipe sorter
        RecipeSorter.register(
                TwilightForestMod.ID + ":mapcloning",
                TFMapCloningRecipe.class,
                SHAPELESS,
                "after:minecraft:shapeless");

        // smelting for logs
        GameRegistry.addSmelting(TFBlocks.log, new ItemStack(Items.coal, 1, 1), 0.1F);
        GameRegistry.addSmelting(TFBlocks.magicLog, new ItemStack(Items.coal, 1, 1), 0.1F);

        // recipes
        GameRegistry.addRecipe(
                new ItemStack(Blocks.planks, 4, 0),
                new Object[] { "w", 'w', new ItemStack(TFBlocks.log, 1, 0) });
        GameRegistry.addRecipe(
                new ItemStack(TFBlocks.planks, 4, 1),
                new Object[] { "w", 'w', new ItemStack(TFBlocks.log, 1, 1) });
        GameRegistry.addRecipe(
                new ItemStack(TFBlocks.planks, 4, 2),
                new Object[] { "w", 'w', new ItemStack(TFBlocks.log, 1, 2) });
        GameRegistry.addRecipe(
                new ItemStack(TFBlocks.planks, 4, 3),
                new Object[] { "w", 'w', new ItemStack(TFBlocks.log, 1, 3) });
        GameRegistry.addRecipe(
                new ItemStack(TFBlocks.planks, 4, 4),
                new Object[] { "w", 'w', new ItemStack(TFBlocks.magicLog, 1, 0) });
        GameRegistry.addRecipe(
                new ItemStack(TFBlocks.planks, 4, 5),
                new Object[] { "w", 'w', new ItemStack(TFBlocks.magicLog, 1, 1) });
        GameRegistry.addRecipe(
                new ItemStack(TFBlocks.planks, 4, 6),
                new Object[] { "w", 'w', new ItemStack(TFBlocks.magicLog, 1, 2) });
        GameRegistry.addRecipe(
                new ItemStack(TFBlocks.planks, 4, 7),
                new Object[] { "w", 'w', new ItemStack(TFBlocks.magicLog, 1, 3) });

        Item[] doors = new Item[] { TFItems.doorTwilight, TFItems.doorCanopy, TFItems.doorMangrove,
                TFItems.doorDarkwood };
        ItemStack[] trapdoors = new ItemStack[] { new ItemStack(TFBlocks.trapdoorTwilight, 2, 0),
                new ItemStack(TFBlocks.trapdoorCanopy, 2, 0), new ItemStack(TFBlocks.trapdoorMangrove, 2, 0),
                new ItemStack(TFBlocks.trapdoorDarkwood, 2, 0) };
        ItemStack[] stairs = new ItemStack[] { new ItemStack(TFBlocks.woodenStairsTwilight, 8, 0),
                new ItemStack(TFBlocks.woodenStairsCanopy, 8, 0), new ItemStack(TFBlocks.woodenStairsMangrove, 8, 0),
                new ItemStack(TFBlocks.woodenStairsDarkwood, 8, 0) };
        /*
         * Block[] chests = new Block[] { TFBlocks.chestTwilight, TFBlocks.chestCanopy, TFBlocks.chestMangrove,
         * TFBlocks.chestDarkwood, TFBlocks.chestTime, TFBlocks.chestTrans, TFBlocks.chestMine, TFBlocks.chestSort };
         * Block[] trappedChests = new Block[] { TFBlocks.trappedChestTwilight, TFBlocks.trappedChestCanopy,
         * TFBlocks.trappedChestMangrove, TFBlocks.trappedChestDarkwood, TFBlocks.trappedChestTime,
         * TFBlocks.trappedChestTrans, TFBlocks.trappedChestMine, TFBlocks.trappedChestSort }; for (int i = 0; i <
         * doors.length; i++) { if (!TwilightForestMod.isGTNHLoaded) { GameRegistry.addRecipe( new ItemStack(doors[i],
         * 1, 0), new Object[] { "##", "##", "##", '#', new ItemStack(TFBlocks.planks, 1, i) }); GameRegistry.addRecipe(
         * trapdoors[i], new Object[] { "###", "###", '#', new ItemStack(TFBlocks.planks, 1, i) });
         * GameRegistry.addRecipe( new ItemStack(chests[i], 2), new Object[] { "###", "#0#", "###", '#', new
         * ItemStack(TFBlocks.planks, 1, i), '0', new ItemStack(Blocks.chest) }); GameRegistry.addShapelessRecipe( new
         * ItemStack(trappedChests[i]), new Object[] { new ItemStack(chests[i]), new ItemStack(Blocks.tripwire_hook) });
         * } GameRegistry.addRecipe( stairs[i], new Object[] { "#  ", "## ", "###", '#', new ItemStack(TFBlocks.planks,
         * 1, i) }); GameRegistry.addRecipe( new ItemStack(TFBlocks.woodenSlab, 6, i), new Object[] { "###", '#', new
         * ItemStack(TFBlocks.planks, 1, i) }); }
         */

        // Dyes from TF plants
        GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 2, 13), new Object[] { TFBlocks.hugeWaterLily });
        GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 2, 1), new Object[] { TFBlocks.thornRose });

        GameRegistry.addRecipe(
                new ItemStack(TFBlocks.nagastoneStairsLeft, 8, 0),
                new Object[] { "#  ", "## ", "###", '#', new ItemStack(TFBlocks.nagastoneEtched, 1, 0) });
        GameRegistry.addRecipe(
                new ItemStack(TFBlocks.nagastoneStairsRight, 8, 0),
                new Object[] { "###", " ##", "  #", '#', new ItemStack(TFBlocks.nagastoneEtched, 1, 0) });
        GameRegistry.addRecipe(
                new ItemStack(TFBlocks.nagastoneStairsMossyLeft, 8, 0),
                new Object[] { "#  ", "## ", "###", '#', new ItemStack(TFBlocks.nagastoneEtchedMossy, 1, 0) });
        GameRegistry.addRecipe(
                new ItemStack(TFBlocks.nagastoneStairsMossyRight, 8, 0),
                new Object[] { "###", " ##", "  #", '#', new ItemStack(TFBlocks.nagastoneEtchedMossy, 1, 0) });
        GameRegistry.addRecipe(
                new ItemStack(TFBlocks.nagastoneStairsWeatheredLeft, 8, 0),
                new Object[] { "#  ", "## ", "###", '#', new ItemStack(TFBlocks.nagastoneEtchedWeathered, 1, 0) });
        GameRegistry.addRecipe(
                new ItemStack(TFBlocks.nagastoneStairsWeatheredRight, 8, 0),
                new Object[] { "###", " ##", "  #", '#', new ItemStack(TFBlocks.nagastoneEtchedWeathered, 1, 0) });
        GameRegistry.addRecipe(
                new ShapelessOreRecipe(
                        new ItemStack(TFBlocks.nagastoneEtched, 3, 0),
                        new Object[] { "nagastoneStairs", "nagastoneStairs", "nagastoneStairs", "nagastoneStairs" }));
        GameRegistry.addRecipe(
                new ShapelessOreRecipe(
                        new ItemStack(TFBlocks.nagastoneEtchedMossy, 3, 0),
                        new Object[] { "nagastoneStairsMossy", "nagastoneStairsMossy", "nagastoneStairsMossy",
                                "nagastoneStairsMossy" }));
        GameRegistry.addRecipe(
                new ShapelessOreRecipe(
                        new ItemStack(TFBlocks.nagastoneEtchedWeathered, 3, 0),
                        new Object[] { "nagastoneStairsWeathered", "nagastoneStairsWeathered",
                                "nagastoneStairsWeathered", "nagastoneStairsWeathered" }));
        GameRegistry.addRecipe(
                new ItemStack(TFBlocks.spiralStoneBricks, 8, 0),
                new Object[] { "#XX", "#XX", "###", '#', Blocks.stone, 'X', new ItemStack(Blocks.stone_slab, 1, 0) });
        GameRegistry.addRecipe(
                new ItemStack(TFBlocks.spiralStoneBricks, 8, 0),
                new Object[] { "#XX", "#XX", "###", '#', Blocks.stone, 'X', new ItemStack(Blocks.stone_slab, 1, 5) });
        GameRegistry.addRecipe(
                new ItemStack(TFBlocks.spiralStoneBricks, 8, 0),
                new Object[] { "#XX", "#XX", "###", '#', Blocks.stonebrick, 'X',
                        new ItemStack(Blocks.stone_slab, 1, 0) });
        GameRegistry.addRecipe(
                new ItemStack(TFBlocks.spiralStoneBricks, 8, 0),
                new Object[] { "#XX", "#XX", "###", '#', Blocks.stonebrick, 'X',
                        new ItemStack(Blocks.stone_slab, 1, 5) });

        addEnchantedRecipe(
                TFItems.plateNaga,
                Enchantment.projectileProtection,
                3,
                new Object[] { "# #", "###", "###", '#', TFItems.nagaScale });
        addEnchantedRecipe(
                TFItems.legsNaga,
                Enchantment.fireProtection,
                2,
                new Object[] { "###", "# #", "# #", '#', TFItems.nagaScale });
        /*GameRegistry.addRecipe(
                new ItemStack(TFItems.legsNaga),
                "###", "# #", "# #", '#', TFItems.nagaScale);*/

        GameRegistry.addRecipe(
                new ShapelessOreRecipe(
                        new ItemStack(TFBlocks.fireflyJar, 1, 0),
                        new Object[] { "firefly", Items.glass_bottle }));

        GameRegistry.addShapelessRecipe(
                new ItemStack(TFItems.scepterTwilight),
                new Object[] { new ItemStack(TFItems.scepterTwilight, 1, TFItems.scepterTwilight.getMaxDamage()),
                        Items.ender_pearl });
        GameRegistry.addShapelessRecipe(
                new ItemStack(TFItems.scepterLifeDrain),
                new Object[] { new ItemStack(TFItems.scepterLifeDrain, 1, TFItems.scepterLifeDrain.getMaxDamage()),
                        Items.fermented_spider_eye });
        // aah, why are there so many potions of strength
        GameRegistry.addShapelessRecipe(
                new ItemStack(TFItems.scepterZombie),
                new Object[] { new ItemStack(TFItems.scepterZombie, 1, TFItems.scepterZombie.getMaxDamage()),
                        new ItemStack(Items.rotten_flesh), new ItemStack(Items.potionitem, 1, 16281) });
        GameRegistry.addShapelessRecipe(
                new ItemStack(TFItems.scepterZombie),
                new Object[] { new ItemStack(TFItems.scepterZombie, 1, TFItems.scepterZombie.getMaxDamage()),
                        new ItemStack(Items.rotten_flesh), new ItemStack(Items.potionitem, 1, 16313) });
        GameRegistry.addShapelessRecipe(
                new ItemStack(TFItems.scepterZombie),
                new Object[] { new ItemStack(TFItems.scepterZombie, 1, TFItems.scepterZombie.getMaxDamage()),
                        new ItemStack(Items.rotten_flesh), new ItemStack(Items.potionitem, 1, 16345) });
        GameRegistry.addShapelessRecipe(
                new ItemStack(TFItems.scepterZombie),
                new Object[] { new ItemStack(TFItems.scepterZombie, 1, TFItems.scepterZombie.getMaxDamage()),
                        new ItemStack(Items.rotten_flesh), new ItemStack(Items.potionitem, 1, 16377) });
        GameRegistry.addShapelessRecipe(
                new ItemStack(TFItems.scepterZombie),
                new Object[] { new ItemStack(TFItems.scepterZombie, 1, TFItems.scepterZombie.getMaxDamage()),
                        new ItemStack(Items.rotten_flesh), new ItemStack(Items.potionitem, 1, 8201) });
        GameRegistry.addShapelessRecipe(
                new ItemStack(TFItems.scepterZombie),
                new Object[] { new ItemStack(TFItems.scepterZombie, 1, TFItems.scepterZombie.getMaxDamage()),
                        new ItemStack(Items.rotten_flesh), new ItemStack(Items.potionitem, 1, 8265) });
        GameRegistry.addShapelessRecipe(
                new ItemStack(TFItems.scepterZombie),
                new Object[] { new ItemStack(TFItems.scepterZombie, 1, TFItems.scepterZombie.getMaxDamage()),
                        new ItemStack(Items.rotten_flesh), new ItemStack(Items.potionitem, 1, 8233) });

        GameRegistry.addShapelessRecipe(
                new ItemStack(TFItems.magicMapFocus),
                new Object[] { TFItems.feather, TFItems.torchberries, Items.glowstone_dust });
        GameRegistry.addRecipe(
                new ItemStack(TFItems.emptyMagicMap),
                new Object[] { "###", "#X#", "###", '#', Items.paper, 'X', TFItems.magicMapFocus });
        GameRegistry.addRecipe(
                new ItemStack(TFItems.emptyMazeMap),
                new Object[] { "###", "#X#", "###", '#', Items.paper, 'X', TFItems.mazeMapFocus });
        GameRegistry.addShapelessRecipe(
                new ItemStack(TFItems.emptyOreMap),
                new Object[] { new ItemStack(TFItems.mazeMap, 1, Short.MAX_VALUE), Blocks.gold_block,
                        Blocks.diamond_block, Blocks.iron_block });
        GameRegistry.addShapelessRecipe(
                new ItemStack(TFItems.emptyOreMap),
                new Object[] { new ItemStack(TFItems.emptyMazeMap, 1, Short.MAX_VALUE), Blocks.gold_block,
                        Blocks.diamond_block, Blocks.iron_block });

        GameRegistry.addRecipe(
                new ItemStack(Items.arrow, 4),
                new Object[] { "X", "#", "Y", 'Y', TFItems.feather, 'X', Items.flint, '#', Items.stick });

        GameRegistry.addShapelessRecipe(
                new ItemStack(Items.stick),
                new Object[] { new ItemStack(TFBlocks.plant, 1, BlockTFPlant.META_ROOT_STRAND) });
        GameRegistry.addRecipe(
                new ItemStack(Blocks.torch, 5),
                new Object[] { "B", "S", 'B', TFItems.torchberries, 'S', Items.stick });

        GameRegistry.addShapelessRecipe(
                new ItemStack(TFItems.ironwoodRaw),
                new Object[] { TFItems.liveRoot, Items.iron_ingot, Items.gold_nugget });
        GameRegistry.addSmelting(TFItems.ironwoodRaw, new ItemStack(TFItems.ironwoodIngot, 2), 1.0F);

        GameRegistry.addRecipe(
                new ItemStack(TFItems.ironwoodHelm),
                new Object[] { "###", "# #", '#', TFItems.ironwoodIngot });
        GameRegistry.addRecipe(
                new ItemStack(TFItems.ironwoodPlate),
                new Object[] { "# #", "###", "###", '#', TFItems.ironwoodIngot });
        GameRegistry.addRecipe(
                new ItemStack(TFItems.ironwoodLegs),
                new Object[] { "###", "# #", "# #", '#', TFItems.ironwoodIngot });
        GameRegistry.addRecipe(
                new ItemStack(TFItems.ironwoodBoots),
                new Object[] { "# #", "# #", '#', TFItems.ironwoodIngot });
        GameRegistry.addRecipe(
                new ItemStack(TFItems.ironwoodSword),
                new Object[] { "#", "#", "X", '#', TFItems.ironwoodIngot, 'X', Items.stick });
        GameRegistry.addRecipe(
                new ItemStack(TFItems.ironwoodShovel),
                new Object[] { "#", "X", "X", '#', TFItems.ironwoodIngot, 'X', Items.stick });
        GameRegistry.addRecipe(
                new ItemStack(TFItems.ironwoodPick),
                new Object[] { "###", " X ", " X ", '#', TFItems.ironwoodIngot, 'X', Items.stick });
        GameRegistry.addRecipe(
                new ItemStack(TFItems.ironwoodAxe),
                new Object[] { "##", "#X", " X", '#', TFItems.ironwoodIngot, 'X', Items.stick });
        GameRegistry.addRecipe(
                new ItemStack(TFItems.ironwoodHoe),
                new Object[] { "##", " X", " X", '#', TFItems.ironwoodIngot, 'X', Items.stick });

        GameRegistry.addRecipe(
                new ItemStack(TFBlocks.uncraftingTable),
                new Object[] { "#X#", "#S#", "###", '#', Blocks.crafting_table, 'X', TFItems.carminite, 'S', Items.skull });

        //GameRegistry.addSmelting(TFItems.venisonRaw, new ItemStack(TFItems.venisonCooked), 0.3F);

        GameRegistry.addRecipe(
                new ShapelessOreRecipe(
                        new ItemStack(TFItems.fieryIngot),
                        new Object[] { "fieryEssence", Items.iron_ingot }));
        GameRegistry
                .addRecipe(new ItemStack(TFItems.fieryHelm), new Object[] { "###", "# #", '#', TFItems.fieryIngot });
        GameRegistry.addRecipe(
                new ItemStack(TFItems.fieryPlate),
                new Object[] { "# #", "###", "###", '#', TFItems.fieryIngot });
        GameRegistry.addRecipe(
                new ItemStack(TFItems.fieryLegs),
                new Object[] { "###", "# #", "# #", '#', TFItems.fieryIngot });
        GameRegistry
                .addRecipe(new ItemStack(TFItems.fieryBoots), new Object[] { "# #", "# #", '#', TFItems.fieryIngot });

        // Direct Fiery armor crafting
        if (!TwilightForestMod.isGTNHLoaded) {
            GameRegistry.addRecipe(
                    new ShapelessOreRecipe(
                            new ItemStack(TFItems.fieryHelm),
                            new Object[] { new ItemStack(Items.iron_helmet, 1, 0), "fieryEssence", "fieryEssence",
                                    "fieryEssence", "fieryEssence", "fieryEssence" }));
            GameRegistry.addRecipe(
                    new ShapelessOreRecipe(
                            new ItemStack(TFItems.fieryPlate),
                            new Object[] { new ItemStack(Items.iron_chestplate, 1, 0), "fieryEssence", "fieryEssence",
                                    "fieryEssence", "fieryEssence", "fieryEssence", "fieryEssence", "fieryEssence",
                                    "fieryEssence" }));
            GameRegistry.addRecipe(
                    new ShapelessOreRecipe(
                            new ItemStack(TFItems.fieryLegs),
                            new Object[] { new ItemStack(Items.iron_leggings, 1, 0), "fieryEssence", "fieryEssence",
                                    "fieryEssence", "fieryEssence", "fieryEssence", "fieryEssence", "fieryEssence" }));
            GameRegistry.addRecipe(
                    new ShapelessOreRecipe(
                            new ItemStack(TFItems.fieryBoots),
                            new Object[] { new ItemStack(Items.iron_boots, 1, 0), "fieryEssence", "fieryEssence",
                                    "fieryEssence", "fieryEssence" }));
        }

        addEnchantedRecipe(
                TFItems.fierySword,
                Enchantment.fireAspect,
                2,
                new Object[] { "#", "#", "X", '#', TFItems.fieryIngot, 'X', Items.blaze_rod });
        GameRegistry.addRecipe(
                new ItemStack(TFItems.fieryPick),
                new Object[] { "###", " X ", " X ", '#', TFItems.fieryIngot, 'X', Items.blaze_rod });

        GameRegistry.addRecipe(
                new ItemStack(
                TFItems.steeleafHelm),
                new Object[] { "###", "# #", '#', TFItems.steeleafIngot });
        GameRegistry.addRecipe(
                new ItemStack(
                TFItems.steeleafPlate),
                new Object[] { "# #", "###", "###", '#', TFItems.steeleafIngot });
        GameRegistry.addRecipe(
                new ItemStack(
                TFItems.steeleafLegs),
                new Object[] { "###", "# #", "# #", '#', TFItems.steeleafIngot });
        GameRegistry.addRecipe(
                new ItemStack(
                TFItems.steeleafBoots),
                new Object[] { "# #", "# #", '#', TFItems.steeleafIngot });
        GameRegistry.addRecipe(
                new ItemStack(
                TFItems.steeleafSword),
                new Object[] { "#", "#", "X", '#', TFItems.steeleafIngot, 'X', Items.stick });
        GameRegistry.addRecipe(
                new ItemStack(
                TFItems.steeleafShovel),
                new Object[] { "#", "X", "X", '#', TFItems.steeleafIngot, 'X', Items.stick });
        GameRegistry.addRecipe(
                new ItemStack(
                TFItems.steeleafPick),
                new Object[] { "###", " X ", " X ", '#', TFItems.steeleafIngot, 'X', Items.stick });
        GameRegistry.addRecipe(
                new ItemStack(
                        TFItems.steeleafAxe),
                new Object[]{"##", "#X", " X", '#', TFItems.steeleafIngot, 'X', Items.stick});
        GameRegistry.addRecipe(
                new ItemStack(
                        TFItems.steeleafHoe),
                new Object[]{"##", " X", " X", '#', TFItems.steeleafIngot, 'X', Items.stick});

        GameRegistry.addSmelting(TFItems.meefRaw, new ItemStack(TFItems.meefSteak), 0.3F);

        GameRegistry.addShapelessRecipe(
                new ItemStack(TFItems.moonwormQueen),
                new Object[] { new ItemStack(TFItems.moonwormQueen, 1, Short.MAX_VALUE), TFItems.torchberries,
                        TFItems.torchberries, TFItems.torchberries });

        GameRegistry.addRecipe(
                new ItemStack(TFItems.emptyMagicMap),
                new Object[] { "###", "#X#", "###", '#', Items.paper, 'X', TFItems.magicMapFocus });

        /*
         * GameRegistry.addShapelessRecipe( new ItemStack(TFItems.charmOfKeeping2), new Object[] {
         * TFItems.charmOfKeeping1, TFItems.charmOfKeeping1, TFItems.charmOfKeeping1, TFItems.charmOfKeeping1 });
         * GameRegistry.addShapelessRecipe( new ItemStack(TFItems.charmOfKeeping3), new Object[] {
         * TFItems.charmOfKeeping2, TFItems.charmOfKeeping2, TFItems.charmOfKeeping2, TFItems.charmOfKeeping2 });
         * GameRegistry.addShapelessRecipe( new ItemStack(TFItems.charmOfLife2), new Object[] { TFItems.charmOfLife1,
         * TFItems.charmOfLife1, TFItems.charmOfLife1, TFItems.charmOfLife1 });
         */

        GameRegistry.addRecipe(new TFMapCloningRecipe(TFItems.magicMap, TFItems.emptyMagicMap));
        GameRegistry.addRecipe(new TFMapCloningRecipe(TFItems.mazeMap, TFItems.emptyMazeMap));
        GameRegistry.addRecipe(new TFMapCloningRecipe(TFItems.oreMap, TFItems.emptyOreMap));

        // dark tower recipes
        GameRegistry.addRecipe(
                new ItemStack(TFBlocks.towerWood, 4, 0),
                new Object[] { "##", "##", '#', new ItemStack(TFBlocks.log, 1, 3) });
        GameRegistry.addRecipe(
                new ItemStack(TFBlocks.towerWood, 3, 1),
                new Object[] { "#", "#", "#", '#', new ItemStack(TFBlocks.towerWood, 1, 0) });
        GameRegistry.addRecipe(
                new ItemStack(TFBlocks.towerDevice, 8, BlockTFTowerDevice.META_VANISH_INACTIVE),
                new Object[] { "ewe", "wcw", "ewe", 'e', new ItemStack(TFBlocks.towerWood, 1, 1), 'w',
                        new ItemStack(TFBlocks.towerWood, 1, 0), 'c', new ItemStack(TFItems.carminite) });
        GameRegistry.addRecipe(
                new ItemStack(TFBlocks.towerDevice, 2, BlockTFTowerDevice.META_REAPPEARING_INACTIVE),
                new Object[] { "ere", "rcr", "ere", 'e', new ItemStack(TFBlocks.towerWood, 1, 1), 'r',
                        new ItemStack(Items.redstone), 'c', new ItemStack(TFItems.carminite) });
        GameRegistry.addRecipe(
                new ItemStack(TFBlocks.towerDevice, 1, BlockTFTowerDevice.META_BUILDER_INACTIVE),
                new Object[] { "ece", "cdc", "ece", 'e', new ItemStack(TFBlocks.towerWood, 1, 1), 'd',
                        new ItemStack(Blocks.dispenser), 'c', new ItemStack(TFItems.carminite) });
        GameRegistry.addRecipe(
                new ItemStack(TFBlocks.towerDevice, 1, BlockTFTowerDevice.META_REACTOR_INACTIVE),
                new Object[] { "ece", "coc", "ece", 'e', new ItemStack(TFBlocks.towerWood, 1, 1), 'o',
                        new ItemStack(Blocks.redstone_ore), 'c', new ItemStack(TFItems.carminite) });
        GameRegistry.addRecipe(
                new ItemStack(TFBlocks.fireJet, 1, BlockTFFireJet.META_ENCASED_SMOKER_OFF),
                new Object[] { "ere", "rsr", "ere", 'e', new ItemStack(TFBlocks.towerWood, 1, 1), 'r',
                        new ItemStack(Items.redstone), 's',
                        new ItemStack(TFBlocks.fireJet, 1, BlockTFFireJet.META_SMOKER) });
        GameRegistry.addRecipe(
                new ItemStack(TFBlocks.fireJet, 1, BlockTFFireJet.META_ENCASED_JET_IDLE),
                new Object[] { "ere", "rjr", "lll", 'e', new ItemStack(TFBlocks.towerWood, 1, 1), 'r',
                        new ItemStack(Items.redstone), 'l', new ItemStack(Items.lava_bucket), 'j',
                        new ItemStack(TFBlocks.fireJet, 1, BlockTFFireJet.META_JET_IDLE) });

        GameRegistry.addRecipe(
                new ItemStack(TFItems.shardCluster),
                new Object[] { "###", "###", "###", '#', TFItems.armorShard });

        GameRegistry.addSmelting(TFItems.shardCluster, new ItemStack(TFItems.knightMetal), 1.0F);

        GameRegistry.addRecipe(
                new ItemStack(TFItems.knightlyHelm),
                new Object[] { "###", "# #", '#', TFItems.knightMetal });
        GameRegistry.addRecipe(
                new ItemStack(TFItems.knightlyPlate),
                new Object[] { "# #", "###", "###", '#', TFItems.knightMetal });
        /*GameRegistry.addRecipe(
                new ItemStack(TFItems.knightlyLegs),
                new Object[] { "###", "# #", "# #", '#', TFItems.knightMetal });
        GameRegistry.addRecipe(
                new ItemStack(TFItems.knightlyBoots),
                new Object[] { "# #", "# #", '#', TFItems.knightMetal });*/

        GameRegistry.addRecipe(
                new ItemStack(TFItems.knightlySword),
                new Object[] { "#", "#", "X", '#', TFItems.knightMetal, 'X', Items.stick });
        GameRegistry.addRecipe(
                new ItemStack(TFItems.knightlyPick),
                new Object[] { "###", " X ", " X ", '#', TFItems.knightMetal, 'X', Items.stick });
        GameRegistry.addRecipe(
                new ItemStack(TFItems.knightlyAxe),
                new Object[] { "##", "#X", " X", '#', TFItems.knightMetal, 'X', Items.stick });
        GameRegistry.addRecipe(
                new ItemStack(TFItems.knightlyAxe),
                new Object[] { "##", "X#", "X ", '#', TFItems.knightMetal, 'X', Items.stick });

        GameRegistry.addRecipe(
                new ItemStack(
                        TFItems.yetiHelm),
                new Object[]{"###", "# #", '#', TFItems.alphaFur});
        GameRegistry.addRecipe(
                new ItemStack(
                        TFItems.yetiPlate),
                new Object[]{"# #", "###", "###", '#', TFItems.alphaFur});
        GameRegistry.addRecipe(
                new ItemStack(
                        TFItems.yetiLegs),
                new Object[]{"###", "# #", "# #", '#', TFItems.alphaFur});
        GameRegistry.addRecipe(
                new ItemStack(
                        TFItems.yetiBoots),
                new Object[]{"# #", "# #", '#', TFItems.alphaFur});

        GameRegistry
                .addRecipe(new ItemStack(TFItems.arcticHelm), new Object[] { "###", "# #", '#', TFItems.arcticFur });
        GameRegistry.addRecipe(
                new ItemStack(TFItems.arcticPlate),
                new Object[] { "# #", "###", "###", '#', TFItems.arcticFur });
        GameRegistry.addRecipe(
                new ItemStack(TFItems.arcticLegs),
                new Object[] { "###", "# #", "# #", '#', TFItems.arcticFur });
        GameRegistry
                .addRecipe(new ItemStack(TFItems.arcticBoots), new Object[] { "# #", "# #", '#', TFItems.arcticFur });

        GameRegistry
                .addRecipe(new ItemStack(TFBlocks.auroraSlab, 6, 0), new Object[] { "###", '#', TFBlocks.auroraBlock });
        GameRegistry.addRecipe(
                new ItemStack(TFBlocks.auroraPillar, 2, 0),
                new Object[] { "#", "#", '#', TFBlocks.auroraBlock });

        GameRegistry.addRecipe(
                new ItemStack(TFItems.giantPick),
                new Object[] { "###", " X ", " X ", '#', TFBlocks.giantCobble, 'X', TFBlocks.giantLog });
        GameRegistry.addRecipe(
                new ItemStack(TFItems.giantSword),
                new Object[] { "#", "#", "X", '#', TFBlocks.giantCobble, 'X', TFBlocks.giantLog });

        GameRegistry.addShapelessRecipe(
                new ItemStack(Blocks.cobblestone, 64),
                new Object[] { new ItemStack(TFBlocks.giantCobble) });
        GameRegistry.addShapelessRecipe(
                new ItemStack(Blocks.planks, 64),
                new Object[] { new ItemStack(TFBlocks.giantLog) });
        GameRegistry.addShapelessRecipe(
                new ItemStack(Blocks.leaves, 64),
                new Object[] { new ItemStack(TFBlocks.giantLeaves) });

        GameRegistry.addRecipe(
                new ItemStack(TFItems.chainBlock),
                new Object[] { "BMM", "  M", "MM ", 'M', TFItems.knightMetal,
                        'B', TFBlocks.knightmetalStorage });

        GameRegistry.addRecipe(
                new ItemStack(TFItems.tripleBow),
                new Object[] { "SC ", "S T", "SC ", 'S', Items.string,
                        'C', TFItems.carminite, 'T', TFItems.fieryTears });

        GameRegistry.addShapelessRecipe(
                new ItemStack(TFBlocks.starIce, 1),
                new ItemStack(Blocks.ice),
                new ItemStack(Items.glowstone_dust));

        if (!Loader.isModLoaded("dreamcraft")) {
            GameRegistry.addShapelessRecipe(
                    new ItemStack(TFItems.knightMetal, 9),
                    new Object[] { new ItemStack(TFBlocks.knightmetalStorage) });
            GameRegistry.addRecipe(
                    new ItemStack(TFBlocks.knightmetalStorage),
                    new Object[] { "###", "###", "###", '#', TFItems.knightMetal });
            GameRegistry.addShapelessRecipe(
                    new ItemStack(TFItems.arcticFur, 9),
                    new Object[] { new ItemStack(TFBlocks.arcticFurStorage) });
            GameRegistry.addRecipe(
                    new ItemStack(TFBlocks.arcticFurStorage),
                    new Object[] { "###", "###", "###", '#', TFItems.arcticFur });
            GameRegistry.addShapelessRecipe(
                    new ItemStack(TFItems.carminite, 9),
                    new Object[] { new ItemStack(TFBlocks.carminiteStorage) });
            GameRegistry.addRecipe(
                    new ItemStack(TFBlocks.carminiteStorage),
                    new Object[] { "###", "###", "###", '#', TFItems.carminite });
            GameRegistry.addShapelessRecipe(
                    new ItemStack(TFItems.fieryIngot, 9),
                    new Object[] { new ItemStack(TFBlocks.fieryMetalStorage) });
            GameRegistry.addRecipe(
                    new ItemStack(TFBlocks.fieryMetalStorage),
                    new Object[] { "###", "###", "###", '#', TFItems.fieryIngot });
            GameRegistry.addShapelessRecipe(
                    new ItemStack(TFItems.ironwoodIngot, 9),
                    new Object[] { new ItemStack(TFBlocks.ironwoodStorage) });
            GameRegistry.addRecipe(
                    new ItemStack(TFBlocks.ironwoodStorage),
                    new Object[] { "###", "###", "###", '#', TFItems.ironwoodIngot });
            GameRegistry.addShapelessRecipe(
                    new ItemStack(TFItems.steeleafIngot, 9),
                    new Object[] { new ItemStack(TFBlocks.steeleafStorage) });
            GameRegistry.addRecipe(
                    new ItemStack(TFBlocks.steeleafStorage),
                    new Object[] { "###", "###", "###", '#', TFItems.steeleafIngot });
        }

    }

    /**
     * Add a recipe for an enchanted item. Always shaped.
     * 
     * @param item
     * @param enchantment
     * @param enchantmentLevel
     * @param ingredientArray
     */
    public static void addEnchantedRecipe(Item item, Enchantment enchantment, int enchantmentLevel,
            Object... ingredientArray) {
        ItemStack result = new ItemStack(item);
        if (enchantment != null) {
            result.addEnchantment(enchantment, enchantmentLevel);
        }

        GameRegistry.addRecipe(result, ingredientArray);
    }

    /**
     * Add a recipe for an enchanted item. Always shaped.
     * 
     * @param item
     * @param enchantment
     * @param enchantmentLevel
     * @param ingredientArray
     */
    public static void addEnchantedRecipe(Item item, Enchantment enchantment, int enchantmentLevel,
            Enchantment enchantment2, int enchantmentLevel2, Object... ingredientArray) {
        ItemStack result = new ItemStack(item);
        if (enchantment != null) {
            result.addEnchantment(enchantment, enchantmentLevel);
        }
        if (enchantment2 != null) {
            result.addEnchantment(enchantment2, enchantmentLevel2);
        }

        GameRegistry.addRecipe(result, ingredientArray);
    }
}
