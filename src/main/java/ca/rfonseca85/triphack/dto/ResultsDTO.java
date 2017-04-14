package ca.rfonseca85.triphack.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ResultsDTO {

	private List<ItinerariesDTO> itineraries;
	private FareDTO fare;


	public List<ItinerariesDTO> getItineraries() {
		return itineraries;
	}

	public void setItineraries(List<ItinerariesDTO> itineraries) {
		this.itineraries = itineraries;
	}

	public FareDTO getFare() {
		return fare;
	}

	public void setFare(FareDTO fare) {
		this.fare = fare;
	}
	
	
	
}
