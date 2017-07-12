package operr.mas.api.integration.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class User {
	public String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
