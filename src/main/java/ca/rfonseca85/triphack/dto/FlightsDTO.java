package ca.rfonseca85.triphack.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FlightsDTO {

    private String departs_at;
    private String arrives_at;
    private LocalDTO origin;
    private LocalDTO destination;

    private String marketing_airline;
    private String operating_airline;
    private String flight_number;
    private String aircraft;
    private BookingInfoDTO booking_info;

    
    public String getDeparts_at() {
		return departs_at;
	}
	public void setDeparts_at(String departs_at) {
		this.departs_at = departs_at;
	}
	public String getArrives_at() {
		return arrives_at;
	}
	public void setArrives_at(String arrives_at) {
		this.arrives_at = arrives_at;
	}
	public LocalDTO getOrigin() {
		return origin;
	}
	public void setOrigin(LocalDTO origin) {
		this.origin = origin;
	}
	public LocalDTO getDestination() {
		return destination;
	}
	public void setDestination(LocalDTO destination) {
		this.destination = destination;
	}
	public String getMarketing_airline() {
		return marketing_airline;
	}
	public void setMarketing_airline(String marketing_airline) {
		this.marketing_airline = marketing_airline;
	}
	public String getOperating_airline() {
		return operating_airline;
	}
	public void setOperating_airline(String operating_airline) {
		this.operating_airline = operating_airline;
	}
	public String getFlight_number() {
		return flight_number;
	}
	public void setFlight_number(String flight_number) {
		this.flight_number = flight_number;
	}
	public String getAircraft() {
		return aircraft;
	}
	public void setAircraft(String aircraft) {
		this.aircraft = aircraft;
	}
	public BookingInfoDTO getBooking_info() {
		return booking_info;
	}
	public void setBooking_info(BookingInfoDTO booking_info) {
		this.booking_info = booking_info;
	}
	
    
	
}
