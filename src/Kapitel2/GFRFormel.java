package Kapitel2;

public class GFRFormel implements Runnable {

	// Instanzvariablen für die Berechnung
	private final int age;
	private final double weight;
	private final char gender;
	private final char MAN = 'm'; // for testing a condition
	private final double scr;
	private final double ccr;

	// Konstruktor
	public GFRFormel(int anAge, double aWeight, char aGender, double aScr,
			double aCcr) {
		age = anAge;
		weight = aWeight;
		gender = aGender;
		scr = aScr;
		ccr = aCcr;
	}

	// Methode; Formel für die Berechnung des GFR
	public double getCcr() {
		if (gender == 'm')
			return (((140 - age) * weight) / (72 * scr));
		else {
			return ((((140 - age) * weight) / (72 * scr)) * 0.85);
		}
	}

	


/**
 * Gets the time of the timer as String.
 * 
 * @return the time (in seconds) converted to a String.
 */
public final String getCcrString() {
	return String.valueOf(this.getCcr());
}

/**
 * Returns true if timer is running.
 * 
 * @return true if the timer is running, otherwise false.
 */
public final boolean isRunning() {
	return thread != null;
}

/**
 * Starts the timer.
 */
public final void start() {
	if (thread == null) {
		thread = new Thread(this);
		thread.setDaemon(true);
		thread.setPriority(Thread.MAX_PRIORITY);
		thread.start();
		gui.update();
	}
}

/**
 * Stops the timer.
 */
public final void stop() {
	if (thread != null) {
		thread = null;
	}
	gui.update();
}

/**
 * Resets the time of the timer.
 */
public final void reset() {
	ticks = 0;
	gui.update();
}

/**
 * Increments ticks at the expiration of the time interval.
 */
@Override
public final void run() {
	while (thread != null) {
		try {
			Thread.sleep(interval);
		} catch (InterruptedException e) {
			// do nothing
		}
		if (thread != null) {
			ticks++;
			gui.update();
		}
	}
}
}