
package com.mycompany.practical1_6;

import java.util.Scanner;



public class Practical1_6 {

    
    
    
    public static void main(String[] args) {
        System.out.println("Practical task 1.6, Student Ivan Saulin, RIBO-01-22, Variant 4");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название растения: ");
        String title = scanner.nextLine();
        
        
        Plant plant = new Plant(title);
        
        
        String modifiedTitle = Gardener.filterPlantParams(plant);
        
        System.out.println("Название: " + modifiedTitle);
    }
}