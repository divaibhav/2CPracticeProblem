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
            arr[i] = employee;


        }
        System.out.println(Arrays.toString(arr));


    }
    

}
