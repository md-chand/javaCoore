package com.orgname.javacore.example;

/**
 * @author MyPC
 * Synchronized keyword can be used with a method only. Even one can create a synchronized block as well
 * By making a block/method synchronized, one can restrict a single thread access that method/block at a time
 * 
 */
public class Synchronization {

	// synchronized method
	public synchronized void shoWSeats(int showId, int showTime) {
		// get movie details, 10
		// descriptions and other details 10
		// get Seat Grid 10
	}

	// synchronized block

	public void shoWSeats1(int showId, int showTime) {
		// get movie details,
		// descriptions and other details
		synchronized (this) {
			// get Seat Grid
		}
	}

}
