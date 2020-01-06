package javaprogs;
	
public class TemperatureClass implements Temperature{

	double tempk;
	
	
	
	public TemperatureClass(double tempk) {
		this.tempk = tempk;
	}

	public TemperatureClass() {
		
	}

	public void toCelcius() {
		System.out.println(+this.tempk+" in Celcius is :: "+(this.tempk+273.17));
	}
	
	
}


