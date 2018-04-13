package com.bilal.parking;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class Ticket {
	String startDate;
	String ticketId;
	int spotId;
	String vehicleId;
	
	public Ticket(String vehicleId,int spotId){
		this.vehicleId = vehicleId;
		this.spotId = spotId;
        UUID uuid = UUID.randomUUID();
        this.ticketId = uuid.toString();
    	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    	Date date = new Date();
    	this.startDate = dateFormat.format(date);
	}
	
	public int getSpotId(){
		return this.spotId;
	}
}
