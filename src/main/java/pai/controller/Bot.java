package pai.controller;

import eu.rekawek.coffeegb.gpu.Display;
import eu.rekawek.coffeegb.gui.SwingController;

public class Bot {
	
	private Display screen;
	private SwingController joypad;
	public Bot (Display screen, SwingController joypad){
		this.joypad=joypad;
		this.screen=screen;
	}
}
