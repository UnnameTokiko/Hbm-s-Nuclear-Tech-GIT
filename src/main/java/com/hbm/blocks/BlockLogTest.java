package com.hbm.blocks;

import com.hbm.lib.RefStrings;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockLog;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class BlockLogTest extends BlockLog {

	
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister reg)
    {
        this.field_150167_a = new IIcon[1];
        this.field_150166_b = new IIcon[1];
        this.field_150167_a[0] = reg.registerIcon(RefStrings.MODID + ":pvc_log_side");
        this.field_150166_b[0] = reg.registerIcon(RefStrings.MODID + ":pvc_log_top");
    }
	
}
