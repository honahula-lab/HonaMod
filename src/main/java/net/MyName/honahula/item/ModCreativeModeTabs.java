package net.MyName.honahula.item;

import net.MyName.honahula.honahula;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, honahula.Mod_ID);

    public static final RegistryObject<CreativeModeTab> honahula_tab = CREATIVE_MODE_TABS.register("honahula_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SAPPHIRE.get()))
                    .title(Component.translatable("creativetab.honahula_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.SAPPHIRE.get());
                    })

                    .build());

    public static void register(IEventBus eventbus){
        CREATIVE_MODE_TABS.register(eventbus);

    }

}
