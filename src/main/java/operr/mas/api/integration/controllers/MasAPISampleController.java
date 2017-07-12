package operr.mas.api.integration.controllers;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import operr.mas.api.integration.impl.MasAgentIntegrationImpl;
import operr.mas.api.integration.model.Header;
import operr.mas.api.integration.model.Leg;
import operr.mas.api.integration.model.Legs;
import operr.mas.api.integration.model.PullRoster;
import operr.mas.api.integration.model.ResponseMessage;
import operr.mas.api.integration.model.TPResponse;
import operr.mas.api.integration.model.Trip;
import operr.mas.api.integration.model.User;

@Controller
@RequestMapping("/masApiSample")
public class MasAPISampleController {
	
	@RequestMapping(
            value = "/pullRosterTest",
            method = RequestMethod.POST,
            produces = MediaType.APPLICATION_XML_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody String xmlTest() throws IOException {
        ResponseMessage responseMessage = new ResponseMessage("xml-example","Hello World XML!");
        String filePath ="/Users/willo/workspace/sts-workspace/operr-mas/src/main/resources/sampleRes2.xml";
		String contents = new String(Files.readAllBytes(Paths.get(filePath))); 
        return contents;
    }
	
	@RequestMapping(
            value = "/pullRoster",
            method = RequestMethod.POST,
            produces = MediaType.APPLICATION_XML_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody TPResponse xmlPullRoster() throws IOException {
		TPResponse tpRes = buildSampleData();
		
		return tpRes;
    }
	
	@RequestMapping("/uploadMAS")
	public @ResponseBody String exportToCSV() {
		MasAgentIntegrationImpl masImpl = new MasAgentIntegrationImpl();
		masImpl.parseToCsv();
		return "exported: " + masImpl.parseToCsv();
	}
	
	private TPResponse buildSampleData() {

      Leg leg = new Leg();
      leg.setPickupAdress("cat lai-HCM city");
      List<Leg> legs_data = new ArrayList<Leg>();
      legs_data.add(leg);
      Header header = new Header();
      header.setWheelchair("wheelchair");
      Legs legs = new Legs();
      legs.setLeg(legs_data);
      Trip trip = new Trip();
      trip.setLegs(legs);
      PullRoster pullRoster = new PullRoster();
      pullRoster.setResponseStatus(1000);
      pullRoster.setResponseMessage("success");
//      pullRoster.setTrip(trip);
      TPResponse tp = new TPResponse();
      tp.setPullRoster(pullRoster);
      
      return tp;
	}
	
}
