package net.timeless.cosmicraft;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.timeless.cosmicraft.common.proxy.CommonProxy;

@Mod(modid = CosmiCraft.MODID, name = CosmiCraft.NAME, version = CosmiCraft.VERSION)
public class CosmiCraft
{
    public static final String MODID = "cosmicraft";
    public static final String VERSION = "0.0.0";
    public static final String NAME = "CosmiCraft";

    @SidedProxy(clientSide = "net.timeless.cosmicraft.client.proxy.ClientProxy", serverSide = "net.timeless.cosmicraft.common.proxy.CommonProxy")
    public static CommonProxy proxy;

    @Mod.Instance(CosmiCraft.MODID)
    public static CosmiCraft instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        proxy.preInit();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        proxy.postInit();
    }
}