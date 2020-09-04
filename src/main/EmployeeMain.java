/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 29-Aug-20
 *  Time: 12:18 PM
 */
package main;

import databean.Employee;

import java.util.Arrays;
import java.util.Scanner;

//step 5
public class EmployeeMain {
    //step 6
    public static void main(String[] args) {
        //step 7
        //declaring an array of Employee to hold Employee objects
        Employee[] arr = new Employee[3];
        System.out.println(Arrays.toString(arr));
        //step 8
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length ; i++) {
            //creating Employee object
            //step 9
            Employee employee = new Employee();
            //step 10, getting values for object
            System.out.println("enter firstName");
            employee.setFirstName(sc.nextLine());
            System.out.println("enter last name");
            employee.setLastName(sc.nextLine());
            System.out.println("enter salary");
            employee.setSalary(sc.nextDouble());
            System.out.println("enter emp id");
            employee.setEmpId(sc.nextInt());
            System.out.println("enter experience");
            employee.setExperience(sc.nextDouble());
            System.out.println("enter mobile number");
            employee.setMobile(sc.nextLong());
            System.out.println("enter email");
            //there will be problem reading string, because after integer, we have
            // to deal with \n.
            sc.nextLine();
            employee.setEmail(sc.nextLine());
            //assigning object to array index
            arr[i] = employee;


        }
        System.out.println(Arrays.toString(arr));
        //for sorting we are going to define a method
        // we then call that method to perform sorting
        //calling sortSalaryOrder()
        Employee[] sorted = sortSalaryOrder(arr);
        System.out.println("sorted array");
        System.out.println(Arrays.toString(sorted));
        Employee[] sortedExp = sortExperienceOrder(arr);
        System.out.println("sorted array by exp");
        System.out.println(Arrays.toString(sortedExp));


    }

    //defining method to sort array on the basis of salary, in descending order
    public static Employee[] sortSalaryOrder(Employee[] arr) {
        //Employee[] response = arr;// still original will be affected, so we need a copy of this arr. for that we are using clone()
        Employee[] response = arr.clone();// now we have created clone of original array
        //to sort we are using bubble sort technique
        for (int i = 0; i < response.length; i++) { // if response os of size 5
            for (int j = 0; j < response.length - 1; j++) {
                //compare elements
                if (response[j].getSalary() < response[j + 1].getSalary()) {
                    //swap them
                    //declaring temporary variable of type employee, because type of array is employee
                    Employee temp = response[j];
                    response[j] = response[j + 1];
                    response[j + 1] = temp;
                }
            }

        }

        return response;
    }

    public static Employee[] sortExperienceOrder(Employee[] arr) {
        //Employee[] response = arr;// still original will be affected, so we need a copy of this arr. for that we are using clone()
        Employee[] response = arr.clone();// now we have created clone of original array
        //to sort we are using bubble sort technique
        for (int i = 0; i < response.length; i++) { // if response os of size 5
            for (int j = 0; j < response.length - 1; j++) {
                //compare elements
                if (response[j].getExperience() < response[j + 1].getExperience()) {
                    //swap them
                    //declaring temporary variable of type employee, because type of array is employee
                    Employee temp = response[j];
                    response[j] = response[j + 1];
                    response[j + 1] = temp;
                }
            }

        }

        return response;
    }

}
