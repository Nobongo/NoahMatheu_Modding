package noah.matheu;

//Recipes
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;
import net.minecraft.init.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraft.item.crafting.FurnaceRecipes;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

//MyBlocksImpotrs




import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

//MyBlocks
import noah.matheu.MyBlocks.RubyOre;
import noah.matheu.MyBlocks.Cage;

//import noah.matheu.MyItems.ForgeTutorial;
import noah.matheu.MyItems.ItemBlasterRifle;
//MyItems Imports
import noah.matheu.MyItems.RubyGem;
import noah.matheu.MyItems.Rock;
import noah.matheu.MyItems.SnowGrenade;
import net.minecraft.item.ItemFood;
import noah.matheu.MyItems.IceBlade;


//my tools
import net.minecraftforge.common.util.EnumHelper;
import noah.matheu.MyItems.IceSword;
import noah.matheu.armor.iceArmor;



public class MyCode {
	
	//List Items Here #setupITEMS
			public static Item rubyGem;
			public static Item Rock = new ItemFood(1000, 5, true);
			public static Item iceblade;
			public static Item snowgrenade;
			//tools
			public static Item IceSword;
			public static Item.ToolMaterial ICE = EnumHelper.addToolMaterial("ICE", 2,1000,5.5F,1.5F,12);
			
			public static ArmorMaterial iceArmorMaterial = EnumHelper.addArmorMaterial("iceArmorMaterial",15, new int[]{2, 7, 5, 2}, 12);
			public static int iceHelmetID;
			public static int iceChestpieceID;
			public static int icePantsID;
			public static int iceShoesID;	
			
			public static Item iceHelmet =new iceArmor(iceArmorMaterial, iceHelmetID, 0).setUnlocalizedName("iceHelmet");
			public static Item iceChestpiece =new iceArmor(iceArmorMaterial, iceChestpieceID, 1).setUnlocalizedName("iceChestpiece");
			public static Item icePants =new iceArmor(iceArmorMaterial, icePantsID, 2).setUnlocalizedName("icePants");
			public static Item iceShoes =new iceArmor(iceArmorMaterial, iceShoesID, 3).setUnlocalizedName("iceShoes");
			
			
			
			
	//ListBlocks here #setupBLOCK
	public static Block rubyOre;
	public static Block cage;
  
	public static void MyBlocks(){	
		
		//Blocks #setupBLOCK
//RubyOre
		rubyOre = new RubyOre (Material.ground)
		.setHardness(0.9F)
		.setStepSound(Block.soundTypeGravel)
		.setBlockName("rubyOre")
		.setCreativeTab(CreativeTabs.tabBlock)
		.setBlockTextureName("redstone_ore");
		
		cage = new Cage (Material.ground)
		.setHardness(1.0F)
		.setStepSound(Block.soundTypeStone)
		.setBlockName("cage")
		.setCreativeTab(CreativeTabs.tabBlock)
		.setBlockTextureName("iron_bars");
		
		//Harvest Level 
		

		//Register #setupBLOCK
	//RubyOre
		GameRegistry.registerBlock(rubyOre,"RubyOre");
	//Cage
		GameRegistry.registerBlock(cage,"Cage");
		
		
		
		
		
		


		
	}
	public static void MyRecipes(){
		
		GameRegistry.addShapelessRecipe( new ItemStack(Blocks.fire),  new Object[] {new ItemStack(Items.flint_and_steel)});
		GameRegistry.addShapelessRecipe( new ItemStack(rubyGem),  new Object[] {new ItemStack(rubyOre)});
		
		GameRegistry.addRecipe(new ItemStack(Blocks.lit_furnace, 2), new Object[]{
			" A ",
			" B ",
			"   ",
			'A', Blocks.fire, 'B', Blocks.furnace,
		});
			
			
		GameRegistry.addRecipe(new ItemStack(Blocks.web, 5), new Object[]{
			"A A",
			" A ",
			"A A",
			'A', Items.string,
		});
			
		GameRegistry.addRecipe(new ItemStack(Blocks.ice, 16), new Object[]{
			"ACA",
			"DBD",
			"ACA",
			'A', Blocks.snow, 'B', Items.water_bucket, 'C', Items.snowball, 'D', Items.glass_bottle,
		});
		GameRegistry.addRecipe(new ItemStack(Blocks.dragon_egg, 1), new Object[]{
			"ACA",
			"DBD",
			"ACA",
			'A', Items.diamond, 'B', Blocks.beacon, 'C', Items.redstone, 'D', Blocks.stone_button,
		});
		GameRegistry.addRecipe(new ItemStack(Blocks.farmland, 1), new Object[]{
			"ADA",
			"BBB",
			"CCC",
			'A', Items.wooden_hoe, 'B', Blocks.dirt, 'C', Items.water_bucket, 'D', Items.stone_hoe,
		
		});
		
		GameRegistry.addRecipe(new ItemStack(cage, 5), new Object[]{
			"AAA",
			"A A",
			"AAA",
			'A', Blocks.iron_bars,
		});
		GameRegistry.addRecipe(new ItemStack(iceblade, 1), new Object[]{
			"AA ",
			"AA ",
			"AA ",
			'A', Blocks.ice,
		});
		GameRegistry.addRecipe(new ItemStack(IceSword, 1), new Object[]{
			" A ",
			" B ",
			"   ",
			'A', iceblade, 'B', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(iceHelmet, 1), new Object[]{
			"AAA",
			"A A ",
			"   ",
			'A', Blocks.ice,
		});
		GameRegistry.addRecipe(new ItemStack(iceChestpiece, 1), new Object[]{
			"A A",
			"AAA",
			"AAA",
			'A', Blocks.ice,
		});
		GameRegistry.addRecipe(new ItemStack(icePants, 1), new Object[]{
			"AAA",
			"A A",
			"A A",
			'A', Blocks.ice,
		});
		GameRegistry.addRecipe(new ItemStack(iceShoes, 1), new Object[]{
			"   ",
			"A A",
			"A A",
			'A', Blocks.ice,
		});
		GameRegistry.addRecipe(new ItemStack(Rock, 8), new Object[]{
			"AAA",
			"ABA",
			"AAA",
			'A', Blocks.ice, 'B', Items.cooked_beef,
		});
		GameRegistry.addRecipe(new ItemStack(snowgrenade, 1), new Object[]{
			"AAA",
			"ABA",
			"AAA",
			'A', Blocks.ice, 'B', Blocks.tnt,
		});
		
		GameRegistry.addSmelting(Blocks.ice, new ItemStack(Blocks.water, 1), 3F);
		
		GameRegistry.addSmelting(Items.spawn_egg, new ItemStack(Items.gunpowder, 1, 50), 3F);
		
		
		
		
		
		ItemStack newEnchantment = new ItemStack(Items.stick,1);
		newEnchantment.addEnchantment(Enchantment.sharpness, 127);
		newEnchantment.addEnchantment(Enchantment.looting, 127);
		GameRegistry.addSmelting(Items.diamond, newEnchantment, 3F);
		





	}
	public static void MyItems(){
		rubyGem = new RubyGem();
		IceSword = new IceSword(ICE);
		iceblade = new IceBlade();
		
		GameRegistry.registerItem(rubyGem,"rubyGem");
		Rock = new Rock(1000, 5, true).setUnlocalizedName("rock").setTextureName("coal");
		GameRegistry.registerItem(Rock,"Rock");
		GameRegistry.registerItem(IceSword,"IceSword");
		GameRegistry.registerItem(iceblade,"IceBlade");
		GameRegistry.registerItem(iceHelmet,"IceHelmet");
		GameRegistry.registerItem(iceChestpiece,"IceChestpiece");
		GameRegistry.registerItem(icePants,"IcePants");
		GameRegistry.registerItem(iceShoes,"IceShoes");
		
		   snowgrenade = new SnowGrenade();
		   GameRegistry.registerItem(snowgrenade, "snowgrenade");
		
	

}}