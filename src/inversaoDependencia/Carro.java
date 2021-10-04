package inversaoDependencia;

public class Carro {
	
	private Motor motor;
    public void Car(Motor e) {
        motor = e;
    }
    public void start() {
        motor.start();
    }

}
