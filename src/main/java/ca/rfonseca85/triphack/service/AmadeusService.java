package ca.rfonseca85.triphack.service;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import ca.rfonseca85.triphack.dto.FlightLowFareResultDTO;

@Component
public class AmadeusService {

	private String apikey = "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX"; //XXX Remove it
	private String uri = "https://api.sandbox.amadeus.com/v1.2/flights/low-fare-search";	
	

	
	
	public void getFlightLowFare()
	{
	    String url = uri + "?apikey="+apikey+"&origin=BOS&destination=LON&departure_date=2017-08-25";
	    
//	    Map<String, String> params = new HashMap<String, String>();
//	    params.put("id", "1");
	     
	    RestTemplate restTemplate = new RestTemplate();
	    FlightLowFareResultDTO flightLowFareResultDTO = restTemplate.getForObject(url, FlightLowFareResultDTO.class);
//	    System.out.println(restTemplate.getForObject(url, String.class));
	    
	    System.out.println(flightLowFareResultDTO.getResults().get(0).getItineraries().get(0).getOutbound().getFlights().get(0).getAircraft());
	}
	
	
}
