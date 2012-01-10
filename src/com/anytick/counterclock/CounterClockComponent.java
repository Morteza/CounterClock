package com.anytick.counterclock;

import java.util.Calendar;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Widget;

public class CounterClockComponent{
	private static final double TWO_PI   = 2.0 * Math.PI;
	private static final int UPDATE_INTERVALL = 100; //milliseconds
	
	private int _diameter;
	private int _centerX;
	private int _centerY;
	private Calendar _calendar = Calendar.getInstance();
	private Composite _parent;
	
	public CounterClockComponent(final Widget parent) {
		// TODO Auto-generated constructor stub
	}
	
	public void start() {
		
	}
	public void stop() {
		
	}
	public void updateCalendar() {
		_calendar.setTimeInMillis(System.currentTimeMillis());
	}
}
