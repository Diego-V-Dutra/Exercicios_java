package application;

import entities.Employee;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;




public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        List<Employee> list = new ArrayList<>();
        System.out.println("How many employees will be registered?");
        int quantity = sc.nextInt();
        
        for(int i=0; i<quantity; i++){
            System.out.println("Employee #" + (i + 1) + ":");
            
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            
            System.out.print("Salary: ");
            Integer salary = sc.nextInt();
            
            Employee emp = new Employee(id,name,salary);
            
            list.add(emp);
        }
        
        System.out.print("Enter the employee id that will have salary increase : ");
        int idsalary = sc.nextInt();
        Integer pos = position(list, idsalary);
        if(pos == null){
            System.out.println("This id does not exist!");
        }else{
            System.out.print("Enter the percentage: ");
            double percent = sc.nextDouble();
            list.get(pos).increaseSalary(percent);
        }
                
        sc.close();
    }
    
    public static Integer position(List<Employee> list, int id){
        for(int i=0; i<list.size();i++){
            if(list.get(i).getId() == id){
                return i;
            }
        }
        return null;
    }
}
