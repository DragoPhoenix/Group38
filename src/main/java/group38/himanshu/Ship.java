package group38.himanshu;

public abstract class Ship
{
	protected int shipID;
	protected String from;
	protected String to;
	protected Long departureTime;
	protected Long arrivalTime;

	public Ship() {
		shipID = -1;
		from = "";
		to = "";
		departureTime = -1L;
		arrivalTime = -1L;
	}

	public Ship(int shipID, String from, String to, Long departureTime, Long arrivalTime) {
		this.shipID = shipID;
		this.from = from;
		this.to = to;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
	}

	public abstract void addShip();
	public abstract void removeShip();
	public abstract void updateShip();
	// public abstract void searchShipsByDepartureTime();
	// public abstract void searchShipsByArrivalTime();
	// public abstract void searchShipsBySource();
	// public abstract void searchShipsByDestination();

	public int getShipID() {
		return shipID;
	}

	public String getFrom() {
		return from;
	}

	public String getTo() {
		return to;
	}

	public Long getDepartureTime() {
		return departureTime;
	}

	public Long getArrivalTime() {
		return arrivalTime;
	}
}
