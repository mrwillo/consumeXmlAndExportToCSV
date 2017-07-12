package operr.mas.api.integration.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Leg {
	
	@XmlElement(name="pickup_address")
	String pickupAdress;

	public String getPickupAdress() {
		return pickupAdress;
	}

	public void setPickupAdress(String pickupAdress) {
		this.pickupAdress = pickupAdress;
	}
	
}
