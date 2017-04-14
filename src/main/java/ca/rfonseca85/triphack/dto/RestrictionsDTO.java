package ca.rfonseca85.triphack.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RestrictionsDTO {

	private String refundable;
	private String change_penalties;

	public String getRefundable() {
		return refundable;
	}

	public void setRefundable(String refundable) {
		this.refundable = refundable;
	}

	public String getChange_penalties() {
		return change_penalties;
	}

	public void setChange_penalties(String change_penalties) {
		this.change_penalties = change_penalties;
	}

}
