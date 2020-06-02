package com.javacore.app.sandbox;


import com.javacore.app.events.Event;
import com.javacore.app.layers.Layer;

public class Example extends Layer {
	
	public void onEvent(Event event) {
		System.out.println(event);
	}
}
