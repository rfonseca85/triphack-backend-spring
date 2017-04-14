package ca.rfonseca85.triphack.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ItinerariesDTO {

	private OutboundDTO outbound;

	public OutboundDTO getOutbound() {
		return outbound;
	}

	public void setOutbound(OutboundDTO outbound) {
		this.outbound = outbound;
	}
	
	
}
