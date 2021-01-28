package remvn.nmslibrary.v1_14_R1;


import org.bukkit.craftbukkit.v1_14_R1.inventory.CraftItemStack;

import net.minecraft.server.v1_14_R1.ItemStack;
import net.minecraft.server.v1_14_R1.NBTTagCompound;
import remvn.nmslibrary.version_api.NBT;

public class NBTHandler implements NBT {

	
    public NBTTagCompound getTag(org.bukkit.inventory.ItemStack item) {
        ItemStack itemNMS = CraftItemStack.asNMSCopy(item);
        NBTTagCompound tag = new NBTTagCompound();
        if(itemNMS.hasTag()) tag = itemNMS.getTag();
        return tag;
    }

    public void setTag(org.bukkit.inventory.ItemStack item, ItemStack itemNMS, NBTTagCompound tag) {
        itemNMS.setTag(tag);
        item.setItemMeta(CraftItemStack.asBukkitCopy(itemNMS).getItemMeta());
    }

    public void addStringTag(org.bukkit.inventory.ItemStack item, String key, String value) {
        ItemStack itemNMS = CraftItemStack.asNMSCopy(item);
        NBTTagCompound tag = getTag(item);
        tag.setString(key, value);
        setTag(item, itemNMS, tag);
    }

    public void addIntTag(org.bukkit.inventory.ItemStack item, String key, int value) {
        ItemStack itemNMS = CraftItemStack.asNMSCopy(item);
        NBTTagCompound tag = getTag(item);
        tag.setInt(key, value);
        setTag(item, itemNMS, tag);
    }

    public void addDoubleTag(org.bukkit.inventory.ItemStack item, String key, double value) {
        ItemStack itemNMS = CraftItemStack.asNMSCopy(item);
        NBTTagCompound tag = getTag(item);
        tag.setDouble(key, value);
        setTag(item, itemNMS, tag);
    }

    public boolean hasKey(org.bukkit.inventory.ItemStack item, String key) {
        ItemStack itemNMS = CraftItemStack.asNMSCopy(item);
        if(!itemNMS.hasTag()) return false;
        return itemNMS.getTag().hasKey(key);
    }

    public int getIntTag(org.bukkit.inventory.ItemStack item, String key) {
        if(!hasKey(item, key)) return 0;
        NBTTagCompound tag = getTag(item);
        return tag.getInt(key);
    }

    public String getStringTag(org.bukkit.inventory.ItemStack item, String key) {
        if(!hasKey(item, key)) return "";
        NBTTagCompound tag = getTag(item);
        return tag.getString(key);
    }

    public double getDoubleTag(org.bukkit.inventory.ItemStack item, String key) {
        if(!hasKey(item, key)) return 0;
        NBTTagCompound tag = getTag(item);
        return tag.getDouble(key);
    }

}
