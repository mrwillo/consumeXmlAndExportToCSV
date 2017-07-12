package operr.mas.api.integration.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class MasResponse {
	
	@XmlElement(name="recipient_name")
	public String name;
}
