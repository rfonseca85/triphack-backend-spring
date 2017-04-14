package ca.rfonseca85.triphack.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FareDTO {

	private String total_price;
	private PricePerAdultDTO price_per_adult;
	private RestrictionsDTO restrictions;

	private String tax;
	public String getTotal_price() {
		return total_price;
	}
	public void setTotal_price(String total_price) {
		this.total_price = total_price;
	}
	public PricePerAdultDTO getPrice_per_adult() {
		return price_per_adult;
	}
	public void setPrice_per_adult(PricePerAdultDTO price_per_adult) {
		this.price_per_adult = price_per_adult;
	}
	public RestrictionsDTO getRestrictions() {
		return restrictions;
	}
	public void setRestrictions(RestrictionsDTO restrictions) {
		this.restrictions = restrictions;
	}
	public String getTax() {
		return tax;
	}
	public void setTax(String tax) {
		this.tax = tax;
	}
	
}
