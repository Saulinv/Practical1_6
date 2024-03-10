
package com.mycompany.practical1_6;

public class Gardener {
    private String name;
    public Gardener(String name){
        this.name = name;
    }
    
    
    public static String filterPlantParams(Plant plant){
        String filteredTitle = plant.title.replaceAll("[аеёиоуыэюя]", "");
        String modifiedTitle = filteredTitle + "VGTBL";
        return modifiedTitle;    
    }
}