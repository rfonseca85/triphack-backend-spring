package ca.rfonseca85.triphack.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FlightLowFareResultDTO {

	private String currency;
	private List<ResultsDTO> results;

	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public List<ResultsDTO> getResults() {
		return results;
	}
	public void setResults(List<ResultsDTO> results) {
		this.results = results;
	}

}

