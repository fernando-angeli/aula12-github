package membrosEstaticos_exercicio;

public class CurrencyConverter {
	
	public static final double IOF = 1.06;
	
	public static double convert(double cDolar, double qDolar) {
		return cDolar*qDolar*IOF;
	}

}
