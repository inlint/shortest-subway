package subway;

public class Station {
	int stationId;
	String stationName;
	int pre=-1;
	int isVisted=0;
	Station(String stationName,int stationId){
		this.stationName=stationName;
		this.stationId=stationId;
	}
	public String toString(){
	        return stationName;
	}
	public boolean equals(Object obj) {
		Station station=(Station) obj;
		return (this.stationId == station.stationId && this.stationName.equals(station.stationName));
	}
}
