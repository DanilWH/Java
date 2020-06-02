package com.javacore.app.events;

public class Event {
	public enum Type {
		MOUSE_MOVED,
		MOUSE_PRESSED,
		MOUSE_REALEASED,
	}
	
	private Type type;
	public boolean handled;
	
	protected Event(Type type) {
		this.type = type;
	}
	
	public Type getType() {
		return type;
	}
}





















