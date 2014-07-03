package noah.matheu.MyItems;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;

public class IceBlade  extends Item {
	public IceBlade(){
	setMaxStackSize(64);
	setCreativeTab(CreativeTabs.tabMaterials);
	setUnlocalizedName("iceblade");
	
}
	@SideOnly(Side.CLIENT)
	private IIcon[] icons;
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister par1IconRegister)
	{
		this.itemIcon = par1IconRegister.registerIcon("NoahsMod:" + (this.getUnlocalizedName().substring(5)));
	}
}
