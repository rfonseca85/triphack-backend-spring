package ca.rfonseca85.triphack.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OutboundDTO {

	private List<FlightsDTO> flights;

	public List<FlightsDTO> getFlights() {
		return flights;
	}

	public void setFlights(List<FlightsDTO> flights) {
		this.flights = flights;
	}
	
	
	
}
