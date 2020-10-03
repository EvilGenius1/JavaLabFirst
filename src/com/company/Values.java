package com.company;

public class Values {

    private String carMark, color, adress;
    private String name, secondName, thirdName;
    private int yearOfRegistrartion;

    public void setCarAttributes(String carMark, String color, String adress) {
        this.carMark = carMark;
        this.color = color;
        this.adress = adress;
    }
    public String getCarMark(){
        return carMark;
    }
    public String getCarColor(){
        return color;
    }
    public String getCarAdress() {
        return adress;
    }

    public void setYearOfRegistration( int yearOfRegistrartion){
        this.yearOfRegistrartion = yearOfRegistrartion;
    }
    public int getYearOfRegistrartion(){
        if(yearOfRegistrartion > 1900)
            return yearOfRegistrartion;
        else
            return 2020;
    }

    public void setNames(String name, String secondName, String thirdName){
        this.name = name;
        this.secondName = secondName;
        this.thirdName = thirdName;
    }

    public String getName(){
        return name;
    }
    public String getSecondName(){
        return secondName;
    }
    public String getThirdName(){
        return thirdName;
    }

}
