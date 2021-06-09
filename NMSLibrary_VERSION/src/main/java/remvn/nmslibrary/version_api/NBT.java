package remvn.nmslibrary.version_api;

import org.bukkit.inventory.ItemStack;

public interface NBT {
	
    /**
     * Adding string tag from ItemStack
     * @param item item
     * @param key key
     * @param value value
     */
    void addStringTag(ItemStack item, String key, String value);
    
    /**
     * Adding int tag to ItemStack
     * @param item item
     * @param key key
     * @param value value
     */
    void addIntTag(ItemStack item, String key, int value);
    
    /**
     * Adding Double tag to ItemStack
     * @param item item
     * @param key key
     * @param value value
     */
    void addDoubleTag(ItemStack item, String key, double value);

    /**
     * check if tag exist with key
     * @param item item
     * @param key key
     * @return haskey
     */
    boolean hasKey(ItemStack item, String key);

    /**
     * Getting int tag from ItemStack
     * @param item item
     * @param key key
     * @return inttag
     */
    int getIntTag(ItemStack item, String key);
    
    /**
     * Getting String tag from ItemStack
     * @param item item
     * @param key key
     * @return stringtag
     */
    String getStringTag(ItemStack item, String key);
    
    /**
     * Getting Double tag from ItemStack
     * @param item item
     * @param key key
     * @return doubletag
     */
    double getDoubleTag(ItemStack item, String key);
    
}
