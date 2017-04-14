package ca.rfonseca85.triphack.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BookingInfoDTO {

    private String travel_class;
    private String booking_code;
    private String seats_remaining;

    public String getTravel_class() {
		return travel_class;
	}
	public void setTravel_class(String travel_class) {
		this.travel_class = travel_class;
	}
	public String getBooking_code() {
		return booking_code;
	}
	public void setBooking_code(String booking_code) {
		this.booking_code = booking_code;
	}
	public String getSeats_remaining() {
		return seats_remaining;
	}
	public void setSeats_remaining(String seats_remaining) {
		this.seats_remaining = seats_remaining;
	}
    
}
