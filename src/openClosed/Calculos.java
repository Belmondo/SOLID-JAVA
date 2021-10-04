package openClosed;

public class Calculos {
	
	public double calculateValue(Veiculo v) {
        if (v instanceof Carro) {
            return v.getValue() * 0.8;
        }
        if (v instanceof Bike) {
            return v.getValue() * 0.5;
        }
		return 0;

	}
}
