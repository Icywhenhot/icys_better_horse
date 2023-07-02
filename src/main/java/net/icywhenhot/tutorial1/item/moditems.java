package net.icywhenhot.tutorial1.item;

import net.icywhenhot.tutorial1.TutorialMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class moditems
{
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject CHICKPEAS = ITEMS.register("chickpeas",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)));

    public static final RegistryObject CHICKPEAS_SEEDS = ITEMS.register("chickpeas_seeds",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)));



    public  static  void register(IEventBus eventbus){
        ITEMS.register(eventbus);
    }

}
