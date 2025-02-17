package Ejercicio2;

public class OnlineWorker extends Worker {

    private static final double INTERNET_PRICE = 55.00;

    public OnlineWorker(String name, String lastName, double priceHour) {

        super(name, lastName, priceHour);
    }

    @Override
    public double calculateSalary(double workedHours) {

        return (workedHours * priceHour) + INTERNET_PRICE;
    }

    @Override
    public String getWorkerType(){
        return "Trabajador Online";
    }

    @Deprecated
    public double salary(double workedHours){
        return workedHours * priceHour;
    }

}
