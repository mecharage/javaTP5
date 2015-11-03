package tp5;

import com.google.gson.annotations.SerializedName;

public class WeatherInfo {

	public static class Info {

		@SerializedName("temp")
		public double temp;

		@SerializedName("temp_min")
		public double minTemp;

		@SerializedName("temp_max")
		public double maxTemp;

		@SerializedName("humidity")
		public int humidity;
	}

	@SerializedName("main")
	public Info info = new WeatherInfo.Info();

	@SerializedName("name")
	public String name;

	@SerializedName("cod")
	public int code;

	@SerializedName("message")
	public String message;
}
