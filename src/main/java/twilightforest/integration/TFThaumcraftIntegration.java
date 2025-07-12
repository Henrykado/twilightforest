package twilightforest.integration;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

import cpw.mods.fml.common.FMLLog;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import twilightforest.block.TFBlocks;
import twilightforest.item.TFItems;

/**
 * Provides methods to register Thaumcraft integration. Kept in a separate class to prevent crashes when thaumcraft is
 * not present.
 */
public class TFThaumcraftIntegration {

    /**
     * Register a block with Thaumcraft aspects
     */
    public static void registerTCObjectTag(Block block, int meta, AspectList list) {
        if (meta == -1) {
            meta = OreDictionary.WILDCARD_VALUE;
        }
        ThaumcraftApi.registerObjectTag(new ItemStack(block, 1, meta), list);
    }

    /**
     * Register an item with Thaumcraft aspects
     */
    public static void registerTCObjectTag(Item item, int meta, AspectList list) {
        if (meta == -1) {
            meta = OreDictionary.WILDCARD_VALUE;
        }
        ThaumcraftApi.registerObjectTag(new ItemStack(item, 1, meta), list);
    }

    /**
     * Use the thaumcraft API to register our things with aspects and biomes with values
     */
    public static void registerThaumcraftIntegration() {
        try {
            // items
            registerTCObjectTag(TFItems.nagaScale, -1, (new AspectList()).add(Aspect.MOTION, 2).add(Aspect.ARMOR, 3));
            registerTCObjectTag(
                    TFItems.scepterTwilight,
                    -1,
                    (new AspectList()).add(Aspect.MAGIC, 8).add(Aspect.ELDRITCH, 8).add(Aspect.WEAPON, 8));
            registerTCObjectTag(
                    TFItems.scepterLifeDrain,
                    -1,
                    (new AspectList()).add(Aspect.MAGIC, 8).add(Aspect.LIFE, 8).add(Aspect.HUNGER, 8));
            registerTCObjectTag(
                    TFItems.scepterZombie,
                    -1,
                    (new AspectList()).add(Aspect.MAGIC, 8).add(Aspect.UNDEAD, 8).add(Aspect.ENTROPY, 8));
            registerTCObjectTag(
                    TFItems.magicMapFocus,
                    -1,
                    (new AspectList()).add(Aspect.MAGIC, 4).add(Aspect.SENSES, 8));
            registerTCObjectTag(
                    TFItems.mazeMapFocus,
                    -1,
                    (new AspectList()).add(Aspect.MAGIC, 4).add(Aspect.SENSES, 8).add(Aspect.ORDER, 4));
            registerTCObjectTag(
                    TFItems.feather,
                    -1,
                    (new AspectList()).add(Aspect.FLIGHT, 2).add(Aspect.AIR, 1).add(Aspect.DARKNESS, 1));
            registerTCObjectTag(
                    TFItems.liveRoot,
                    -1,
                    (new AspectList()).add(Aspect.MAGIC, 1).add(Aspect.TREE, 2).add(Aspect.LIFE, 2));
            registerTCObjectTag(
                    TFItems.ironwoodIngot,
                    -1,
                    (new AspectList()).add(Aspect.MAGIC, 2).add(Aspect.TREE, 1).add(Aspect.METAL, 4)
                            .add(Aspect.CRAFT, 2));
            registerTCObjectTag(TFItems.torchberries, -1, (new AspectList()).add(Aspect.PLANT, 2).add(Aspect.LIGHT, 2));
            registerTCObjectTag(
                    TFItems.fieryBlood,
                    -1,
                    (new AspectList()).add(Aspect.FIRE, 8).add(Aspect.LIFE, 8).add(Aspect.MAGIC, 4));
            registerTCObjectTag(
                    TFItems.trophy,
                    -1,
                    (new AspectList()).add(Aspect.LIFE, 6).add(Aspect.BEAST, 6).add(Aspect.SOUL, 6));
            registerTCObjectTag(
                    TFItems.steeleafIngot,
                    -1,
                    (new AspectList()).add(Aspect.PLANT, 4).add(Aspect.METAL, 2));
            registerTCObjectTag(
                    TFItems.minotaurAxe,
                    -1,
                    (new AspectList()).add(Aspect.TOOL, 2).add(Aspect.WEAPON, 4).add(Aspect.CRYSTAL, 6)
                            .add(Aspect.GREED, 8));
            registerTCObjectTag(
                    TFItems.mazebreakerPick,
                    -1,
                    (new AspectList()).add(Aspect.CRYSTAL, 6).add(Aspect.TOOL, 8).add(Aspect.MINE, 8));
            registerTCObjectTag(
                    TFItems.oreMagnet,
                    -1,
                    (new AspectList()).add(Aspect.GREED, 10).add(Aspect.TOOL, 6).add(Aspect.METAL, 8)
                            .add(Aspect.MOTION, 6));
            registerTCObjectTag(
                    TFItems.crumbleHorn,
                    -1,
                    (new AspectList()).add(Aspect.ENTROPY, 12).add(Aspect.BEAST, 2));
            registerTCObjectTag(
                    TFItems.peacockFan,
                    -1,
                    (new AspectList()).add(Aspect.AIR, 8).add(Aspect.MOTION, 6).add(Aspect.FLIGHT, 10));
            registerTCObjectTag(
                    TFItems.moonwormQueen,
                    -1,
                    (new AspectList()).add(Aspect.LIGHT, 12).add(Aspect.MAGIC, 1));
            registerTCObjectTag(
                    TFItems.charmOfLife1,
                    -1,
                    (new AspectList()).add(Aspect.LIFE, 2).add(Aspect.HEAL, 2).add(Aspect.GREED, 4));
            registerTCObjectTag(
                    TFItems.charmOfKeeping1,
                    -1,
                    (new AspectList()).add(Aspect.DEATH, 1).add(Aspect.TRAVEL, 2).add(Aspect.GREED, 4));
            registerTCObjectTag(TFItems.towerKey, -1, (new AspectList()).add(Aspect.MECHANISM, 4).add(Aspect.MAGIC, 4));
            /*registerTCObjectTag(
                    TFItems.transformPowder,
                    -1,
                    (new AspectList()).add(Aspect.MAGIC, 8).add(Aspect.EXCHANGE, 4));
            registerTCObjectTag(
                    TFItems.borerEssence,
                    -1,
                    (new AspectList()).add(Aspect.BEAST, 2).add(Aspect.TREE, 2).add(Aspect.SOUL, 4)
                            .add(Aspect.MAGIC, 2));*/
            registerTCObjectTag(TFItems.armorShard, -1, (new AspectList()).add(Aspect.METAL, 1));
            registerTCObjectTag(TFItems.knightMetal, -1, (new AspectList()).add(Aspect.METAL, 8).add(Aspect.ORDER, 1));
            registerTCObjectTag(
                    TFItems.phantomHelm,
                    -1,
                    (new AspectList()).add(Aspect.METAL, 6).add(Aspect.ARMOR, 6).add(Aspect.UNDEAD, 6));
            registerTCObjectTag(
                    TFItems.phantomPlate,
                    -1,
                    (new AspectList()).add(Aspect.METAL, 8).add(Aspect.ARMOR, 8).add(Aspect.UNDEAD, 8));
            registerTCObjectTag(TFItems.armorShard, -1, (new AspectList()).add(Aspect.METAL, 1));
            registerTCObjectTag(
                    TFItems.lampOfCinders,
                    -1,
                    (new AspectList()).add(Aspect.FIRE, 4).add(Aspect.MAGIC, 4).add(Aspect.TOOL, 4));
            registerTCObjectTag(
                    TFItems.fieryTears,
                    -1,
                    (new AspectList()).add(Aspect.FIRE, 8).add(Aspect.LIFE, 8).add(Aspect.MAGIC, 4));
            registerTCObjectTag(
                    TFItems.alphaFur,
                    -1,
                    (new AspectList()).add(Aspect.COLD, 3).add(Aspect.BEAST, 3).add(Aspect.MAGIC, 4)
                            .add(Aspect.ARMOR, 1));
            registerTCObjectTag(TFItems.iceBomb, -1, (new AspectList()).add(Aspect.COLD, 3).add(Aspect.AIR, 1));
            registerTCObjectTag(TFItems.arcticFur, -1, (new AspectList()).add(Aspect.COLD, 3).add(Aspect.BEAST, 3));
            registerTCObjectTag(
                    TFItems.tripleBow,
                    -1,
                    (new AspectList()).add(Aspect.TREE, 6).add(Aspect.BEAST, 6).add(Aspect.CLOTH, 6)
                            .add(Aspect.WEAPON, 9).add(Aspect.AIR, 3));
            registerTCObjectTag(
                    TFItems.seekerBow,
                    -1,
                    (new AspectList()).add(Aspect.MIND, 3).add(Aspect.BEAST, 2).add(Aspect.CLOTH, 2)
                            .add(Aspect.WEAPON, 3).add(Aspect.AIR, 1));
            registerTCObjectTag(
                    TFItems.iceBow,
                    -1,
                    (new AspectList()).add(Aspect.COLD, 2).add(Aspect.BEAST, 2).add(Aspect.CLOTH, 2)
                            .add(Aspect.WEAPON, 3).add(Aspect.AIR, 1));
            registerTCObjectTag(
                    TFItems.enderBow,
                    -1,
                    (new AspectList()).add(Aspect.TRAVEL, 2).add(Aspect.BEAST, 2).add(Aspect.CLOTH, 2)
                            .add(Aspect.WEAPON, 3).add(Aspect.AIR, 1));
            registerTCObjectTag(
                    TFItems.iceSword,
                    -1,
                    (new AspectList()).add(Aspect.WEAPON, 4).add(Aspect.CRYSTAL, 4).add(Aspect.COLD, 4));
            registerTCObjectTag(
                    TFItems.glassSword,
                    -1,
                    (new AspectList()).add(Aspect.WEAPON, 5).add(Aspect.CRYSTAL, 4));
            registerTCObjectTag(
                    TFItems.cubeTalisman,
                    -1,
                    (new AspectList()).add(Aspect.VOID, 4).add(Aspect.MAGIC, 4).add(Aspect.ENTROPY, 4));
            registerTCObjectTag(
                    TFItems.cubeOfAnnihilation,
                    -1,
                    (new AspectList()).add(Aspect.VOID, 7).add(Aspect.MAGIC, 7).add(Aspect.ENTROPY, 7));

            // food
            registerTCObjectTag(
                    TFItems.venisonRaw,
                    -1,
                    (new AspectList()).add(Aspect.HUNGER, 2).add(Aspect.FLESH, 4).add(Aspect.BEAST, 2));
            registerTCObjectTag(
                    TFItems.venisonCooked,
                    -1,
                    (new AspectList()).add(Aspect.HUNGER, 4).add(Aspect.FLESH, 4).add(Aspect.CRAFT, 1));
            registerTCObjectTag(
                    TFItems.hydraChop,
                    -1,
                    (new AspectList()).add(Aspect.HUNGER, 6).add(Aspect.FLESH, 6).add(Aspect.LIFE, 4));
            registerTCObjectTag(
                    TFItems.meefRaw,
                    -1,
                    (new AspectList()).add(Aspect.BEAST, 2).add(Aspect.FLESH, 4).add(Aspect.LIFE, 2));
            registerTCObjectTag(
                    TFItems.meefSteak,
                    -1,
                    (new AspectList()).add(Aspect.FIRE, 1).add(Aspect.BEAST, 1).add(Aspect.FLESH, 4)
                            .add(Aspect.LIFE, 2));
            registerTCObjectTag(
                    TFItems.meefStroganoff,
                    -1,
                    (new AspectList()).add(Aspect.HUNGER, 4).add(Aspect.BEAST, 2).add(Aspect.FLESH, 4));
            registerTCObjectTag(TFItems.mazeWafer, -1, (new AspectList()).add(Aspect.HUNGER, 2));
            registerTCObjectTag(
                    TFItems.experiment115,
                    -1,
                    (new AspectList()).add(Aspect.HUNGER, 3).add(Aspect.MECHANISM, 1));

            // blocks
            registerTCObjectTag(TFBlocks.firefly, -1, (new AspectList()).add(Aspect.FLIGHT, 1).add(Aspect.LIGHT, 2));
            registerTCObjectTag(TFItems.critter, 0, (new AspectList()).add(Aspect.FLIGHT, 1).add(Aspect.LIGHT, 2));
            registerTCObjectTag(TFBlocks.leaves, -1, (new AspectList()).add(Aspect.PLANT, 2));
            registerTCObjectTag(
                    TFBlocks.mazestone,
                    -1,
                    (new AspectList()).add(Aspect.ORDER, 2).add(Aspect.TRAP, 1).add(Aspect.ARMOR, 1));
            registerTCObjectTag(TFBlocks.hedge, 0, (new AspectList()).add(Aspect.PLANT, 1).add(Aspect.WEAPON, 1));
            registerTCObjectTag(TFBlocks.hedge, 1, (new AspectList()).add(Aspect.PLANT, 3).add(Aspect.DARKNESS, 1));
            registerTCObjectTag(TFBlocks.root, -1, (new AspectList()).add(Aspect.TREE, 2));
            registerTCObjectTag(TFBlocks.cicada, -1, (new AspectList()).add(Aspect.SENSES, 2));
            registerTCObjectTag(TFItems.critter, 1, (new AspectList()).add(Aspect.SENSES, 2));
            registerTCObjectTag(
                    TFBlocks.uncraftingTable,
                    -1,
                    (new AspectList()).add(Aspect.TREE, 4).add(Aspect.ENTROPY, 8).add(Aspect.EXCHANGE, 12)
                            .add(Aspect.CRAFT, 16));
            registerTCObjectTag(
                    TFBlocks.fireJet,
                    -1,
                    (new AspectList()).add(Aspect.FIRE, 4).add(Aspect.AIR, 2).add(Aspect.MOTION, 2));
            registerTCObjectTag(
                    TFBlocks.oldNagastone,
                    -1,
                    (new AspectList()).add(Aspect.ORDER, 1).add(Aspect.MOTION, 1).add(Aspect.EARTH, 2));
            registerTCObjectTag(
                    TFBlocks.nagastoneHead,
                    -1,
                    (new AspectList()).add(Aspect.ORDER, 1).add(Aspect.MOTION, 1).add(Aspect.EARTH, 2));
            registerTCObjectTag(
                    TFBlocks.nagastoneBody,
                    -1,
                    (new AspectList()).add(Aspect.ORDER, 1).add(Aspect.MOTION, 1).add(Aspect.EARTH, 2));
            registerTCObjectTag(
                    TFBlocks.nagastoneEtched,
                    0,
                    (new AspectList()).add(Aspect.EXCHANGE, 1).add(Aspect.ORDER, 1).add(Aspect.EARTH, 2));
            registerTCObjectTag(
                    TFBlocks.nagastoneEtched,
                    1,
                    (new AspectList()).add(Aspect.EXCHANGE, 1).add(Aspect.PLANT, 1).add(Aspect.EARTH, 2));
            registerTCObjectTag(
                    TFBlocks.nagastoneEtched,
                    2,
                    (new AspectList()).add(Aspect.EXCHANGE, 1).add(Aspect.ENTROPY, 1).add(Aspect.EARTH, 2));
            registerTCObjectTag(
                    TFBlocks.nagastoneStairsLeft,
                    -1,
                    (new AspectList()).add(Aspect.EXCHANGE, 1).add(Aspect.ORDER, 1).add(Aspect.EARTH, 2));
            registerTCObjectTag(
                    TFBlocks.nagastoneStairsRight,
                    -1,
                    (new AspectList()).add(Aspect.EXCHANGE, 1).add(Aspect.ORDER, 1).add(Aspect.EARTH, 2));
            registerTCObjectTag(
                    TFBlocks.nagastoneStairsMossyLeft,
                    -1,
                    (new AspectList()).add(Aspect.EXCHANGE, 1).add(Aspect.PLANT, 1).add(Aspect.EARTH, 2));
            registerTCObjectTag(
                    TFBlocks.nagastoneStairsMossyRight,
                    -1,
                    (new AspectList()).add(Aspect.EXCHANGE, 1).add(Aspect.PLANT, 1).add(Aspect.EARTH, 2));
            registerTCObjectTag(
                    TFBlocks.nagastoneStairsWeatheredLeft,
                    -1,
                    (new AspectList()).add(Aspect.EXCHANGE, 1).add(Aspect.ENTROPY, 1).add(Aspect.EARTH, 2));
            registerTCObjectTag(
                    TFBlocks.nagastoneStairsWeatheredRight,
                    -1,
                    (new AspectList()).add(Aspect.EXCHANGE, 1).add(Aspect.ENTROPY, 1).add(Aspect.EARTH, 2));
            registerTCObjectTag(
                    TFBlocks.nagastonePillar,
                    -1,
                    (new AspectList()).add(Aspect.MOTION, 1).add(Aspect.ORDER, 1).add(Aspect.EARTH, 2));
            registerTCObjectTag(
                    TFBlocks.nagastonePillarMossy,
                    -1,
                    (new AspectList()).add(Aspect.MOTION, 1).add(Aspect.PLANT, 1).add(Aspect.EARTH, 2));
            registerTCObjectTag(
                    TFBlocks.nagastonePillarWeathered,
                    -1,
                    (new AspectList()).add(Aspect.MOTION, 1).add(Aspect.ENTROPY, 1).add(Aspect.EARTH, 2));
            registerTCObjectTag(
                    TFBlocks.spiralStoneBricks,
                    -1,
                    (new AspectList()).add(Aspect.EXCHANGE, 2).add(Aspect.EARTH, 2));
            registerTCObjectTag(TFBlocks.magicLeaves, -1, (new AspectList()).add(Aspect.PLANT, 2));
            registerTCObjectTag(
                    TFBlocks.towerWood,
                    -1,
                    (new AspectList()).add(Aspect.TREE, 2).add(Aspect.MECHANISM, 2));
            registerTCObjectTag(
                    TFBlocks.towerDevice,
                    -1,
                    (new AspectList()).add(Aspect.TREE, 4).add(Aspect.MECHANISM, 4).add(Aspect.MAGIC, 4));
            registerTCObjectTag(
                    TFBlocks.towerTranslucent,
                    -1,
                    (new AspectList()).add(Aspect.TREE, 4).add(Aspect.MECHANISM, 4).add(Aspect.MAGIC, 4)
                            .add(Aspect.VOID, 2));
            registerTCObjectTag(
                    TFBlocks.trophy,
                    -1,
                    (new AspectList()).add(Aspect.LIFE, 6).add(Aspect.BEAST, 6).add(Aspect.SOUL, 6));
            registerTCObjectTag(TFBlocks.plant, 3, (new AspectList()).add(Aspect.PLANT, 1));
            registerTCObjectTag(TFBlocks.plant, 4, (new AspectList()).add(Aspect.PLANT, 1));
            registerTCObjectTag(TFBlocks.plant, 5, (new AspectList()).add(Aspect.PLANT, 2));
            registerTCObjectTag(TFBlocks.plant, 8, (new AspectList()).add(Aspect.PLANT, 2).add(Aspect.MAGIC, 1));
            registerTCObjectTag(
                    TFBlocks.plant,
                    9,
                    (new AspectList()).add(Aspect.PLANT, 2).add(Aspect.DARKNESS, 1).add(Aspect.LIGHT, 1));
            registerTCObjectTag(TFBlocks.plant, 10, (new AspectList()).add(Aspect.PLANT, 2).add(Aspect.DARKNESS, 1));
            registerTCObjectTag(TFBlocks.plant, 11, (new AspectList()).add(Aspect.PLANT, 2).add(Aspect.DARKNESS, 1));
            registerTCObjectTag(TFBlocks.plant, 13, (new AspectList()).add(Aspect.PLANT, 2).add(Aspect.LIGHT, 2));
            registerTCObjectTag(TFBlocks.plant, 14, (new AspectList()).add(Aspect.PLANT, 2));
            registerTCObjectTag(TFBlocks.sapling, -1, (new AspectList()).add(Aspect.PLANT, 4).add(Aspect.TREE, 2));
            registerTCObjectTag(TFBlocks.moonworm, -1, (new AspectList()).add(Aspect.DARKNESS, 2).add(Aspect.LIGHT, 2));
            registerTCObjectTag(TFItems.critter, 2, (new AspectList()).add(Aspect.DARKNESS, 2).add(Aspect.LIGHT, 2));
            registerTCObjectTag(
                    TFBlocks.shield,
                    -1,
                    (new AspectList()).add(Aspect.TRAP, 1).add(Aspect.MAGIC, 1).add(Aspect.ARMOR, 1));
            registerTCObjectTag(
                    TFBlocks.trophyPedestal,
                    -1,
                    (new AspectList()).add(Aspect.GREED, 6).add(Aspect.BEAST, 5));
            registerTCObjectTag(
                    TFBlocks.auroraBlock,
                    -1,
                    (new AspectList()).add(Aspect.COLD, 2).add(Aspect.CRYSTAL, 2));
            registerTCObjectTag(
                    TFBlocks.underBrick,
                    -1,
                    (new AspectList()).add(Aspect.DARKNESS, 2).add(Aspect.EARTH, 2));
            registerTCObjectTag(TFBlocks.portal, -1, (new AspectList()).add(Aspect.MAGIC, 1).add(Aspect.MOTION, 2));
            registerTCObjectTag(TFBlocks.trophy, -1, (new AspectList()).add(Aspect.PLANT, 2).add(Aspect.LIGHT, 10));
            registerTCObjectTag(
                    TFBlocks.shield,
                    -1,
                    (new AspectList()).add(Aspect.EARTH, 1).add(Aspect.ORDER, 2).add(Aspect.ARMOR, 2));
            registerTCObjectTag(
                    TFBlocks.thorns,
                    -1,
                    (new AspectList()).add(Aspect.PLANT, 3).add(Aspect.ENTROPY, 2).add(Aspect.TRAP, 2));
            registerTCObjectTag(
                    TFBlocks.thornRose,
                    -1,
                    (new AspectList()).add(Aspect.PLANT, 1).add(Aspect.TRAP, 1).add(Aspect.SENSES, 2));
            registerTCObjectTag(
                    TFBlocks.burntThorns,
                    -1,
                    (new AspectList()).add(Aspect.ENTROPY, 2).add(Aspect.FIRE, 1));
            registerTCObjectTag(TFBlocks.leaves3, -1, (new AspectList()).add(Aspect.PLANT, 2));
            registerTCObjectTag(
                    TFBlocks.deadrock,
                    -1,
                    (new AspectList()).add(Aspect.EARTH, 1).add(Aspect.ENTROPY, 1).add(Aspect.DEATH, 1));
            registerTCObjectTag(
                    TFBlocks.darkleaves,
                    -1,
                    (new AspectList()).add(Aspect.PLANT, 2).add(Aspect.DARKNESS, 2));
            registerTCObjectTag(TFBlocks.auroraPillar, -1, (new AspectList()).add(Aspect.COLD, 2).add(Aspect.ORDER, 2));
            registerTCObjectTag(TFBlocks.auroraSlab, -1, (new AspectList()).add(Aspect.COLD, 2).add(Aspect.ORDER, 2));
            registerTCObjectTag(
                    TFBlocks.auroraDoubleSlab,
                    -1,
                    (new AspectList()).add(Aspect.COLD, 2).add(Aspect.ORDER, 2));
            registerTCObjectTag(
                    TFBlocks.trollSteinn,
                    -1,
                    (new AspectList()).add(Aspect.EARTH, 1).add(Aspect.ORDER, 1).add(Aspect.CRYSTAL, 1));
            registerTCObjectTag(
                    TFBlocks.wispyCloud,
                    -1,
                    (new AspectList()).add(Aspect.WEATHER, 1).add(Aspect.AIR, 1).add(Aspect.FLIGHT, 1));
            registerTCObjectTag(TFBlocks.fluffyCloud, -1, (new AspectList()).add(Aspect.WEATHER, 2).add(Aspect.AIR, 2));
            registerTCObjectTag(
                    TFBlocks.giantCobble,
                    -1,
                    (new AspectList()).add(Aspect.EARTH, 8).add(Aspect.ENTROPY, 8));
            registerTCObjectTag(TFBlocks.giantLog, -1, (new AspectList()).add(Aspect.TREE, 32));
            registerTCObjectTag(TFBlocks.giantLeaves, -1, (new AspectList()).add(Aspect.PLANT, 32));
            registerTCObjectTag(
                    TFBlocks.giantObsidian,
                    -1,
                    (new AspectList()).add(Aspect.FIRE, 16).add(Aspect.DARKNESS, 8).add(Aspect.EARTH, 16));
            registerTCObjectTag(
                    TFBlocks.uberousSoil,
                    -1,
                    (new AspectList()).add(Aspect.EARTH, 4).add(Aspect.SENSES, 2).add(Aspect.PLANT, 2));
            registerTCObjectTag(TFBlocks.hugeStalk, -1, (new AspectList()).add(Aspect.PLANT, 2).add(Aspect.TREE, 2));
            registerTCObjectTag(
                    TFBlocks.hugeGloomBlock,
                    -1,
                    (new AspectList()).add(Aspect.PLANT, 2).add(Aspect.DARKNESS, 1).add(Aspect.LIGHT, 1));
            registerTCObjectTag(TFBlocks.trollVidr, -1, (new AspectList()).add(Aspect.PLANT, 2));
            registerTCObjectTag(
                    TFBlocks.unripeTrollBer,
                    -1,
                    (new AspectList()).add(Aspect.PLANT, 2).add(Aspect.DARKNESS, 1));
            registerTCObjectTag(TFBlocks.trollBer, -1, (new AspectList()).add(Aspect.PLANT, 2).add(Aspect.LIGHT, 4));
            registerTCObjectTag(
                    TFBlocks.knightmetalStorage,
                    -1,
                    (new AspectList()).add(Aspect.METAL, 12).add(Aspect.ORDER, 12));
            registerTCObjectTag(TFBlocks.hugeLilyPad, -1, (new AspectList()).add(Aspect.WATER, 3).add(Aspect.PLANT, 6));
            registerTCObjectTag(
                    TFBlocks.hugeWaterLily,
                    -1,
                    (new AspectList()).add(Aspect.WATER, 2).add(Aspect.PLANT, 2).add(Aspect.SENSES, 2));
            registerTCObjectTag(TFBlocks.slider, -1, (new AspectList()).add(Aspect.MOTION, 4).add(Aspect.TRAP, 6));
            registerTCObjectTag(TFBlocks.castleBlock, -1, (new AspectList()).add(Aspect.ORDER, 2));
            registerTCObjectTag(
                    TFBlocks.castleMagic,
                    -1,
                    (new AspectList()).add(Aspect.ORDER, 2).add(Aspect.MAGIC, 3).add(Aspect.ENERGY, 2));
            registerTCObjectTag(TFBlocks.forceField, -1, (new AspectList()).add(Aspect.MAGIC, 3).add(Aspect.ARMOR, 4));

            FMLLog.info("[TwilightForest] Loaded ThaumcraftApi integration.");
        } catch (Exception e) {
            FMLLog.warning(
                    "[TwilightForest] Had an %s error while trying to register with ThaumcraftApi.",
                    e.getLocalizedMessage());
            // whatever.
        }
    }
}
