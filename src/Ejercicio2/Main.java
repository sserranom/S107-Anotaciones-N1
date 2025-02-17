package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        double workedHours = 160;

        PersonalWorker worker1 = new PersonalWorker("Sergio", "Serrano", 12.00);
        System.out.println("El salario del " + worker1.getWorkerType()+ " " + worker1.getWorker() + " es: " + worker1.calculateSalary(workedHours) + "€");

        OnlineWorker worker2 = new OnlineWorker("Alejandra", "Guierrez", 12.00);
        System.out.println("El salario del " + worker2.getWorkerType() + " " + worker2.getWorker() + " es: " + worker2.calculateSalary(workedHours) + "€");

        System.out.println(" \n******* Llamamos a los metodos Obsoletos: *******\n");

        System.out.println("El salario del " + worker1.getWorkerType() + " " + worker1.getWorker() + " es: " + worker1.salary(workedHours) );
        System.out.println("El salario del " + worker2.getWorkerType() + " " + worker2.getWorker() + " es: " + worker2.salary(workedHours) +"\n");

        DeprecatedMethods.obsoleteMethods(worker1, worker2);




    }
}