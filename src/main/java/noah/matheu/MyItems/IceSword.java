package noah.matheu.MyItems;


	
	import cpw.mods.fml.relauncher.Side;
	import cpw.mods.fml.relauncher.SideOnly;
	import net.minecraft.client.renderer.texture.IIconRegister;
	import net.minecraft.item.ItemSword;
	import net.minecraft.util.IIcon;
	
	public class IceSword extends ItemSword {
		public IceSword(ToolMaterial material) {
			super(material);
			setUnlocalizedName("IceSword");
		}
		@SideOnly(Side.CLIENT)
		private IIcon[] icons;
		@SideOnly(Side.CLIENT)
		public void registerIcons(IIconRegister par1IconRegister)
		{
			this.itemIcon = par1IconRegister.registerIcon("NoahsMod:" + (this.getUnlocalizedName().substring(5)));
		
		}
}


