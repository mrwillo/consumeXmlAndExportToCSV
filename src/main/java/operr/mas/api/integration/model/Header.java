package operr.mas.api.integration.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Header {
  
  String wheelchair;

  public String getWheelchair() {
    return wheelchair;
  }

  public void setWheelchair(String wheelchair) {
    this.wheelchair = wheelchair;
  }
  
  
}
