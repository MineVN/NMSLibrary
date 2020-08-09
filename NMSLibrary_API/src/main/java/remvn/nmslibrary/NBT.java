package remvn.nmslibrary;

import org.bukkit.inventory.ItemStack;

public interface NBT {
	
    void addStringTag(ItemStack item, String key, String value);
    void addIntTag(ItemStack item, String key, int value);
    void addDoubleTag(ItemStack item, String key, double value);

    boolean hasKey(ItemStack item, String key);

    int getIntTag(ItemStack item, String key);
    String getStringTag(ItemStack item, String key);
    double getDoubleTag(ItemStack item, String key);
    
}
