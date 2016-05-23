package ch.xumo.noisefx;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class NoiseMain extends Application {

	private Parent createNoise() {
		// return new NoiseWithCss();
		return new NoiseWritableImage();
	}

	@Override
	public void start(final Stage stage) throws Exception {
		final Circle circle = new Circle(100);
		circle.setCenterX(100);
		circle.setCenterY(100);

		final Parent root = createNoise();
		root.setClip(circle);

		final Scene scene = new Scene(root, 400, 400);

		stage.setScene(scene);
		stage.setAlwaysOnTop(true);
		stage.centerOnScreen();
		stage.show();
	}

	public static void main(final String[] args) {
		launch(args);
	}
}
