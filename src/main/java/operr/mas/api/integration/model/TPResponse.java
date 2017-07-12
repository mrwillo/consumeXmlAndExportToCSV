package operr.mas.api.integration.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "TPResponse")
public class TPResponse {

  @XmlElement(name="pull_Roster")
  PullRoster PullRoster;


  public PullRoster getPullRoster() {
    return PullRoster;
  }


  public void setPullRoster(PullRoster pullRoster) {
    this.PullRoster = pullRoster;
  }


  @Override
  public String toString() {
    return "TPResponse [pullRoster=" + PullRoster + "]";
  }


}
