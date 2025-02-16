package Ejercicio1;

public class Main {
    public static void main(String[] args) {
        double workedHours = 160;

        personalWorker worker1 = new personalWorker("Sergio", "Serrano", 12.00);
        System.out.println("El salario del " + worker1.getClass().getSimpleName() + " " + worker1.getWorker() + " es: " + worker1.calculateSalary(workedHours));

        onlineWorker worker2 = new onlineWorker("Alejandra", "Guierrez", 12.00);
        System.out.println("El salario del " + worker2.getClass().getSimpleName() + " " + worker2.getWorker() + " es: " + worker2.calculateSalary(workedHours));

    }
}