package ch.xumo.noisefx;

import java.util.Random;

import javafx.scene.image.ImageView;
import javafx.scene.image.PixelWriter;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;

/*
 * Noise created randomly and written to WritableImage.
 */
public class NoiseWritableImage extends Region {

	private static final int WIDTH = 400;
	private static final int HEIGHT = 400;

	public NoiseWritableImage() {
		final WritableImage image = new WritableImage(WIDTH, HEIGHT);
		final PixelWriter pixelWriter = image.getPixelWriter();

		for (int x = 0; x < image.getWidth(); x++) {
			for (int y = 0; y < image.getHeight(); y++) {
				pixelWriter.setColor(x, y, randomColor());
			}
		}

		final ImageView imageView = new ImageView(image);
		getChildren().add(imageView);
	}

	private static final double OPACITY = 0.4;

	private Color randomColor() {
		return new Color(rand(), rand(), rand(), OPACITY);
	}

	private final Random rand = new Random();

	private double rand() {
		return 1 - (rand.nextDouble() * 0.2);
	}
}
