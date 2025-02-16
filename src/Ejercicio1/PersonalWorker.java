package Ejercicio1;

public class PersonalWorker extends Worker {

    private static double gasoline = 150.00;

    public PersonalWorker(String name, String lastName, double priceHour) {
        super(name, lastName, priceHour);
    }

    @Override
    public double calculateSalary(double workedHours) {
        return (workedHours * priceHour) + gasoline;
    }

}
