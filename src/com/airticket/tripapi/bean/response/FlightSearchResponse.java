package com.airticket.tripapi.bean.response;

import java.io.Serializable;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 国内机票返回体
 * @author jujian
 *
 */
@XStreamAlias("FlightSearchResponse")
public class FlightSearchResponse implements Serializable {
	//航程列表
	@XStreamAlias("FlightRoutes")
	private List<DomesticFlightRoute> flightRoutes;

	/**
	 * 航程列表
	 * @return
	 */
	public List<DomesticFlightRoute> getFlightRoutes() {
		return flightRoutes;
	}

	/**
	 * 航程列表
	 * @param flightRoutes
	 */
	public void setFlightRoutes(List<DomesticFlightRoute> flightRoutes) {
		this.flightRoutes = flightRoutes;
	}
}
