package net.david.tutorialmod.item;

import net.david.tutorialmod.TutorialMod;
import net.david.tutorialmod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup PV_TOKEN_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID, "pv_token_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.PV_TOKEN))
                    .displayName(Text.translatable("itemgroup.tutorialmod.pv_token_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.PV_TOKEN);
                        entries.add(ModItems.RAW_PV_TOKEN);
                    }).build());
    public static final ItemGroup PV_TOKEN_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID, "token_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.TOKEN_BLOCK))
                    .displayName(Text.translatable("itemgroup.tutorialmod.pv_token_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.TOKEN_BLOCK);
                        entries.add(ModBlocks.RAW_TOKEN_BLOCK);
                    }).build());



    public static void registerItemGroups(){
        TutorialMod.LOGGER.info("Registering Item Groups for " + TutorialMod.MOD_ID);
    }
}
