package noah.matheu.armor;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import noah.matheu.MyCode;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
public class iceArmor extends ItemArmor {
	
	public iceArmor(ArmorMaterial material, int id, int placment) {
		super(material, id, placment);
	
	
	if (placment == 0) {
		this.setTextureName("noahsmod:iceHelmet");
	}
	else if (placment == 1) {
		this.setTextureName("noahsmod:iceChestpiece");
	}
	else if (placment == 2) {
		this.setTextureName("noahsmod:icePants");
	}
	else if (placment == 3) {
		this.setTextureName("noahsmod:iceShoes");
	}
	}
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type){
		
		if (stack.getItem() == MyCode.iceHelmet || (stack.getItem() == MyCode.iceChestpiece || (stack.getItem() == MyCode.iceShoes))){
		return "noahsmod:textures/armor/iceArmor1.png";
	}
	
		if (stack.getItem() == MyCode.icePants){
		return "noahsmod:textures/armor/iceArmor2.png";
		
	} else{
		return null;
	}
	
	}

	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
		if (player.getCurrentArmor(2) != null) {
			ItemStack chestplate = player.getCurrentArmor(2);
			if (chestplate.getItem() == MyCode.iceChestpiece)
				player.addPotionEffect(new PotionEffect(Potion.fireResistance.getId(), 20));
}}}


