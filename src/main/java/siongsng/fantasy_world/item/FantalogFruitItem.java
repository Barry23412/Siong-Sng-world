
package siongsng.fantasy_world.item;

import siongsng.fantasy_world.itemgroup.SiongSngworldfoodItemGroup;
import siongsng.fantasy_world.SiongsngsFantasyWorldModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;

@SiongsngsFantasyWorldModElements.ModElement.Tag
public class FantalogFruitItem extends SiongsngsFantasyWorldModElements.ModElement {
	@ObjectHolder("siongsngs_fantasy_world:fantalog_fruit")
	public static final Item block = null;
	public FantalogFruitItem(SiongsngsFantasyWorldModElements instance) {
		super(instance, 222);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(SiongSngworldfoodItemGroup.tab).maxStackSize(64).rarity(Rarity.UNCOMMON)
					.food((new Food.Builder()).hunger(5).saturation(0.4f).build()));
			setRegistryName("fantalog_fruit");
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}
	}
}
