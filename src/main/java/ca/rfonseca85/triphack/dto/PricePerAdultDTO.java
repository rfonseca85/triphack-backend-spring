package ca.rfonseca85.triphack.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PricePerAdultDTO {
	
	private String total_fare;
	private String tax;

	public String getTotal_fare() {
		return total_fare;
	}
	public void setTotal_fare(String total_fare) {
		this.total_fare = total_fare;
	}
	public String getTax() {
		return tax;
	}
	public void setTax(String tax) {
		this.tax = tax;
	}
	
}
