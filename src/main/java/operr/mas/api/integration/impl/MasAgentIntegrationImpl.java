package operr.mas.api.integration.impl;

import java.io.File;
import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import operr.mas.api.integration.interfaces.AgentIntegration;
import operr.mas.api.integration.model.Leg;
import operr.mas.api.integration.model.Legs;
import operr.mas.api.integration.model.MasResponse;
import operr.mas.api.integration.model.TPResponse;
import operr.mas.api.integration.processor.CSVWriter;

public class MasAgentIntegrationImpl implements AgentIntegration{

	public TPResponse pullData() {
		String url = "http://localhost:8080/masApiSample/pullRosterTest";
		// TODO Auto-generated method stub
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_XML);
		headers.set("Accept", "application/xml");
		
		RestTemplate rest = new RestTemplate();
		
		HttpEntity<String> request = new HttpEntity<String>("", headers);
		TPResponse tpRes = rest.postForObject(url, request, TPResponse.class);
		
		System.out.println(tpRes.getPullRoster());
		return tpRes;
	}

	public String parseToCsv() {
		// TODO Auto-generated method stub
		TPResponse tpRes = pullData();
		return "exceuted";
//		Legs legs = tpRes.getPullRoster().getTrip().getLegs();
//		File masCSVFile = new File("mas_data.csv");
//		CSVWriter.generateCSV(masCSVFile, legs.getLeg().toArray());
//		return masCSVFile.getAbsolutePath();
	}

}
