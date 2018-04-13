# Parking Lot
Imagine you need to design a parking lot. The lot has multiple parking spots, each parking spot can fit compact (Toyota yaris) or regular(Toyota corola) car. When a car is parked, a ticket is issued  that indicates the start time. The parking lot should have a red sign turned on if the parking lot is full. A compact car can be parked in regular spot if all compact spots are occupied, the opposite is not valid.

Hint: You need to have the following functions implemented within one of the classes you write:

1. public boolean isFull()
2. public void releaseSpotByTicket(Ticket t)?
3. public Ticket parkVehicle(Vehicle vehicle)