package Ejercicio2;

public class DeprecatedMethods {

    @SuppressWarnings("deprecation")
    public static void obsoleteMethods(PersonalWorker personal, OnlineWorker online ){
        double personalSalary = personal.salary(165);
        double onlineSalary = online.salary(165);

        System.out.println("Salario obsoleto del " + personal.getWorkerType() + " " + personal.getWorker() + ": " + personalSalary + "€");
        System.out.println("Salario obsoleto del " + online.getWorkerType() + " " + online.getWorker() + ": " + onlineSalary + "€");

    }

}
