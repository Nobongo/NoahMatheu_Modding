/*
 * Copyright 2014 ShooShoSha (me@shooshosha.com)
 * 
 * This file is part of Forge-Tutorials.
 * 
 * This work is licensed under the Creative Commons Attribution-ShareAlike 3.0 Unported License. To
 * view a copy of this license, visit http://creativecommons.org/licenses/by-sa/3.0/.
 */
package noah.matheu;

import net.minecraft.item.Item;
import noah.matheu.MyItems.ItemBlasterRifle;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * @author shooshosha
 * 
 */

@Mod(modid = ForgeTutorial.ID, name = ForgeTutorial.NAME)
public class ForgeTutorial {
  public static final String ID = "forgetutorial";
  public static final String NAME = "Forge Tutorials";
  
  @EventHandler
  public void load(FMLPreInitializationEvent event) {
    Item blasterRifle = new ItemBlasterRifle();
    GameRegistry.registerItem(blasterRifle, "Blaster Rifle");
  }
  
}
