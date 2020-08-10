package remvn.nmslibrary.version_api;

import org.bukkit.inventory.ItemStack;

public interface NBT {
	
    /**
     * Adding string tag from ItemStack
     * @param item
     * @param key
     * @param value
     */
    void addStringTag(ItemStack item, String key, String value);
    
    /**
     * Adding int tag to ItemStack
     * @param item
     * @param key
     * @param value
     */
    void addIntTag(ItemStack item, String key, int value);
    
    /**
     * Adding Double tag to ItemStack
     * @param item
     * @param key
     * @param value
     */
    void addDoubleTag(ItemStack item, String key, double value);

    /**
     * check if tag exist with key
     * @param item
     * @param key
     * @return
     */
    boolean hasKey(ItemStack item, String key);

    /**
     * Getting int tag from ItemStack
     * @param item
     * @param key
     * @return
     */
    int getIntTag(ItemStack item, String key);
    
    /**
     * Getting String tag from ItemStack
     * @param item
     * @param key
     * @return
     */
    String getStringTag(ItemStack item, String key);
    
    /**
     * Getting Double tag from ItemStack
     * @param item
     * @param key
     * @return
     */
    double getDoubleTag(ItemStack item, String key);
    
}
