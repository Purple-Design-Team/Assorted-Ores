
package net.mcreator.assorteditems.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.assorteditems.ElementsAssortedItemsMod;

import java.util.Set;
import java.util.HashMap;

@ElementsAssortedItemsMod.ModElement.Tag
public class ItemEmeraldPickaxe extends ElementsAssortedItemsMod.ModElement {
	@GameRegistry.ObjectHolder("assorted_items:emerald_pickaxe")
	public static final Item block = null;
	public ItemEmeraldPickaxe(ElementsAssortedItemsMod instance) {
		super(instance, 133);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemPickaxe(EnumHelper.addToolMaterial("EMERALD_PICKAXE", 2, 323, 7f, -2f, 17)) {
			{
				this.attackSpeed = -3f;
			}
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("pickaxe", 2);
				return ret.keySet();
			}
		}.setUnlocalizedName("emerald_pickaxe").setRegistryName("emerald_pickaxe").setCreativeTab(CreativeTabs.TOOLS));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("assorted_items:emerald_pickaxe", "inventory"));
	}
}