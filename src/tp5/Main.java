package tp5;

public class Main {
	public static void main(String[] args) {
		//IWeatherView view = new ConsoleWeatherView(System.in, System.out, System.err);
		IWeatherView view = new SwingWeatherView();
		WeatherModel model = new WeatherModel();
		IWeatherLoader loader = new OpenWeatherMapWeatherLoader();
		IWeatherController ctrl = new WeatherController(model, view, loader);
		view.run();
	}
}
