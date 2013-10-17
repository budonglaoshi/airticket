package com.airticket.tripapi.bean.response;

import java.io.Serializable;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("StopInfos")
public class StopInfos implements Serializable {

	@XStreamImplicit(itemFieldName="FlightStopInfo")
	private List<FlightStopInfo> infos;

	public List<FlightStopInfo> getInfos() {
		return infos;
	}

	public void setInfos(List<FlightStopInfo> infos) {
		this.infos = infos;
	}
	
}
