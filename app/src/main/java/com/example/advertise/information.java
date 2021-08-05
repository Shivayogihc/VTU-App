package com.example.advertise;

public class information {
    private String m1;
    private String physics;
    private String electrical;

    public  information(){

    }
    public  information(String m1,String physics,String electrical){
        this.m1=m1;
        this.electrical=electrical;
        this.physics=physics;

    }
    public String getM1(){
        return m1;
    }
    public String setM1(){
        return this.m1=m1;
    }
    //*********

    public String getPhysics(){
        return physics;
    }
    public String setPhysics(){
        return this.physics=physics;
    }
    //*************
    public String getElectrical(){
        return electrical;

    }
    public String setElectrical(){
        return this.electrical=electrical;

    }






}
