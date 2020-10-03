package com.company;

import com.company.Values;
import com.company.Main;

public class PreShow {

    Values value = new Values();

    public void showCarOne(){
        value.setCarAttributes("Subaru","red", "French Bulvar");

        System.out.print(value.getCarMark() + " - " + value.getCarColor() + ".");
        System.out.println(value.getCarAdress());
    }

    public void showCarTwo(){
        value.setCarAttributes("Mersedess","black", "Poselock");

        System.out.print(value.getCarMark() + " - " + value.getCarColor() + ".");
        System.out.println(value.getCarAdress());
    }

    public void showYearOfRegistration(){
        value.setYearOfRegistration(1900);
        System.out.println(value.getYearOfRegistrartion());
    }

    public void showNamesFirst(){
        value.setNames("Dan", "Ivanov", "Andreevich");
        System.out.print(value.getName() + " " + value.getSecondName() + " " + value.getThirdName());
    }

    public void showNamesSecond(){
        value.setNames("Vlad", "Kurpol", "Sergeevich");
        System.out.print(value.getName() + " " + value.getSecondName() + " " + value.getThirdName());
    }

}