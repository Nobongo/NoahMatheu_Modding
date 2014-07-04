/*
 * Copyright 2014 ShooShoSha (me@shooshosha.com)
 *
 * This file is part of Forge-Tutorials.
 *
 * This work is licensed under the Creative Commons Attribution-ShareAlike 3.0 Unported License. To 
 * view a copy of this license, visit http://creativecommons.org/licenses/by-sa/3.0/.
 */
package noah.matheu.MyItems;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.IIcon;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import noah.matheu.MyItems.RubyGem;




/**
 * @author kobrien
 *
 */


public class EntityGrenade extends EntityThrowable {
	private double explosionRadius = 3.0F;
	/**
	 * @param par1World where the entity will spawn
	 */
	public EntityGrenade(World par1World) {
		super(par1World);
		
		
	}
	/**
	 * @param par1World
	 * @param arg1Double
	 * @param arg2Double
	 * @param arg3Double
	 */
	public EntityGrenade(World par1World, double arg1Double, double arg2Double, double arg3Double) {
		super(par1World, arg1Double, arg2Double, arg3Double);
	}
	/**
	 * @param par1World
	 * @param arg1EntityLivingBase
	 */
	public EntityGrenade(World par1World, EntityLivingBase arg1EntityLivingBase) {
		
		super(par1World, arg1EntityLivingBase);
	}



	/**
	 * @see net.minecraft.entity.projectile.EntityThrowable#onImpact(net.minecraft.util.MovingObjectPosition)
	 */
	@Override
	protected void onImpact(MovingObjectPosition par1MovingObjectPosition) {
		this.worldObj.createExplosion(this, this.posX, this.posY, this.posZ, (float)this.explosionRadius, true);
		this.setDead();
	
	
	    }
}
	
	
	
	
	
	


