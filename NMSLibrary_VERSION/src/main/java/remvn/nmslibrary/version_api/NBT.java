package remvn.nmslibrary.version_api;

import org.bukkit.inventory.ItemStack;

public interface NBT {
	
    /**
     * @param item
     * @param key
     * @param value
     */
    void addStringTag(ItemStack item, String key, String value);
    
    /**
     * @param item
     * @param key
     * @param value
     */
    void addIntTag(ItemStack item, String key, int value);
    
    /**
     * @param item
     * @param key
     * @param value
     */
    void addDoubleTag(ItemStack item, String key, double value);

    /**
     * @param item
     * @param key
     * @return
     */
    boolean hasKey(ItemStack item, String key);

    /**
     * @param item
     * @param key
     * @return
     */
    int getIntTag(ItemStack item, String key);
    
    /**
     * @param item
     * @param key
     * @return
     */
    String getStringTag(ItemStack item, String key);
    
    /**
     * @param item
     * @param key
     * @return
     */
    double getDoubleTag(ItemStack item, String key);
    
}
