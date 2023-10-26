package interfaceCalculator;

public class vinacalFx implements calculatorInterface {

	@Override
	public double sum(double a, double b) {
		return a+b;
	}

	@Override
	public double sub(double a, double b) {
		return a-b;
	}

	@Override
	public double multi(double a, double b) {
		return a*b;
	}

	@Override
	public double div(double a, double b) {
		return a/b;
	}
	
}
