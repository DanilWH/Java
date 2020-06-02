package com.javacore.app;

import com.javacore.app.core.Window;
import com.javacore.app.sandbox.Example;

public class Main {

	public static void main(String[] args) {
		Window window = new Window("Window", 960, 640);
		window.addLayer(new Example());
	}

}
