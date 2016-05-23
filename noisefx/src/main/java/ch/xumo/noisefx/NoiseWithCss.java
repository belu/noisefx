package ch.xumo.noisefx;

import javafx.scene.layout.Region;

/*
 * Noise coming from image that is applied with CSS.
 */
public class NoiseWithCss extends Region {

	public NoiseWithCss() {
		getStylesheets().add("noise.css");
	}
}
