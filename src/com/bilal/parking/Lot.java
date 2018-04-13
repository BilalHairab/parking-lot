package com.bilal.parking;

import java.util.ArrayList;
import java.util.List;

public class Lot {

	List<Spot> availableRegularSpots = new ArrayList<>();
	List<Spot> availableCompactSpots = new ArrayList<>();
	boolean isRedLight = false;

	public Lot() {
		int counter = 1; // we should start indexing from 1 as not all people
							// are developers :D
		for (int i = 0; i < 10; i++)
			availableRegularSpots.add(new Spot(counter++, Size.REGULAR));
		for (int i = 0; i < 10; i++)
			availableCompactSpots.add(new Spot(counter++, Size.COMPACT));
	}

	public Ticket parkVehicle(Vehicle v) {
		Ticket ticket = null;
		if (v.getSize() == Size.REGULAR) {
			if (availableRegularSpots.size() > 0)
				ticket = new Ticket(v.getId(), availableRegularSpots.remove(0).getId());

		} else {
			if (availableCompactSpots.size() > 0)
				ticket = new Ticket(v.getId(), availableCompactSpots.remove(0).getId());
			else if (availableRegularSpots.size() > 0)
				ticket = new Ticket(v.getId(), availableRegularSpots.remove(0).getId());
		}
		if (ticket != null && isFull())
			isRedLight = true;
		return ticket;
	}

	public void releaseSpotByTicket(Ticket ticket) {
		int spotId = ticket.getSpotId();
		if (spotId <= 10)
			availableRegularSpots.add(new Spot(spotId, Size.REGULAR));
		else
			availableCompactSpots.add(new Spot(spotId, Size.COMPACT));
		isRedLight = false;

	}

	public boolean isFull() {
		return (availableRegularSpots.size() == 0) && (availableCompactSpots.size() == 0);
	}
}
