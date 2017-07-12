package operr.mas.api.integration.model;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Legs {
	
	public List<Leg> leg;

	public List<Leg> getLeg() {
		return leg;
	}

	public void setLeg(List<Leg> leg) {
		this.leg = leg;
	}
	
	
}
