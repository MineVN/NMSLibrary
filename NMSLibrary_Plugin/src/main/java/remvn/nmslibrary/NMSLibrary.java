package remvn.nmslibrary;

import org.bukkit.plugin.java.JavaPlugin;

public class NMSLibrary extends JavaPlugin {

	static NMS nms;
	
	public void onEnable() {
		String packageName = this.getServer().getClass().getPackage().getName();
		String version = packageName.substring(packageName.lastIndexOf('.') + 1);
		try {
			Class<?> clazz = Class.forName("remvn.nmslibrary." + version + ".NMSHandler");
			nms = (NMS) clazz.newInstance();
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
            this.getLogger().severe("Could not find support for this CraftBukkit version.");
            this.setEnabled(false);
            return;
		}
		this.getLogger().info("Loading support for " + version);
	}

	public void onDisable() {

	}

	public NMS getNms() {
		return nms;
	}
	
	public static NMS getAPI() {
		return nms;
	}
	
}
