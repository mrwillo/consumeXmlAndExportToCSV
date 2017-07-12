package operr.mas.api.integration.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "pull_Roster")
public class PullRoster {


  int ResponseStatus;
  String ResponseMessage;

//  @XmlElement(name = "trip")
//  Trip trip;

  public int getResponseStatus() {
    return ResponseStatus;
  }

  public void setResponseStatus(int responseStatus) {
    ResponseStatus = responseStatus;
  }

  public String getResponseMessage() {
    return ResponseMessage;
  }

  public void setResponseMessage(String responseMessage) {
    ResponseMessage = responseMessage;
  }

//  public Trip getTrip() {
//    return trip;
//  }
//
//  public void setTrip(Trip trip) {
//    this.trip = trip;
//  }
//
//  @Override
//  public String toString() {
//    return "PullRoster [ResponseStatus=" + ResponseStatus + ", ResponseMessage=" + ResponseMessage
//        + ", trip=" + trip + "]";
//  }

  

}
