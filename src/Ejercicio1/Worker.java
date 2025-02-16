package Ejercicio1;

public class Worker {

    protected String name;
    protected String lastName;
    protected double priceHour;

    public Worker(String name, String lastName, double priceHour) {
        this.name = name;
        this.lastName = lastName;
        this.priceHour = priceHour;
    }

    public double calculateSalary(double workedHours) {
        return workedHours * priceHour;
    }

    public String getWorker() {
        return name + " " + lastName;
    }

}
