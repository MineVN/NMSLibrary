package remvn.nmslibrary.v1_14_R1;

import remvn.nmslibrary.EntityNMS;
import remvn.nmslibrary.NBT;
import remvn.nmslibrary.NMS;

public class NMSHandler implements NMS {

	public EntityNMS getEntityNMS() {
		return new EntityNMSHandler();
	}

	public NBT getNBT() {
		return new NBTHandler();
	}

}
