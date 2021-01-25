package remvn.nmslibrary;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import remvn.nmslibrary.version_api.NMS;

import java.util.logging.Logger;

public class NMSLibrary extends JavaPlugin {

	public static Logger logger = Logger.getLogger("NMSLibrary");
	
	static NMS nms;
	
	public void onEnable() {
		initNMSHandler();
	}
	
	public static NMS getNMS(String version) {
		switch (version) {
		case "v1_12_R1":
			return new remvn.nmslibrary.v1_12_R1.NMSHandler();
		case "v1_14_R1": 
			return new remvn.nmslibrary.v1_14_R1.NMSHandler();
		case "v1_16_R3":
			return new remvn.nmslibrary.v1_16_R3.NMSHandler();
		default:
			return null;
		}
	}
	
	public static boolean shade() {
		if(!initNMSHandler()) return false;
		return true;
	}
	
	public static boolean initNMSHandler() {
		String packageName = Bukkit.getServer().getClass().getPackage().getName();
		String version = packageName.substring(packageName.lastIndexOf('.') + 1);
		nms = getNMS(version);
		if(nms == null) {
			logger.severe("Could not find support for this CraftBukkit version.");
			return false;
		}
		logger.info("Loading support for " + version);		
		return true;
	}

	public void onDisable() {

	}

	public static NMS getAPI() {
		return nms;
	}
	
}
