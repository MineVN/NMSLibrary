package remvn.nmslibrary.v1_14_R1;

import remvn.nmslibrary.version_api.EntityNMS;
import remvn.nmslibrary.version_api.NBT;
import remvn.nmslibrary.version_api.NMS;

public class NMSHandler implements NMS {

	public EntityNMS getEntityNMS() {
		return new EntityNMSHandler();
	}

	public NBT getNBT() {
		return new NBTHandler();
	}

}
