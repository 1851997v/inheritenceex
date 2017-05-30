package com.teja;

/**
 * Created by TEJA on 5/30/2017.
 */
public class car extends  vehicle {


    private  int wheel;
    private int doors;
    private int gears;
    private  boolean ismanual;
    private int currentgear;

    public car(String name, String size, int wheel, int doors, int gears, boolean ismanual) {
        super(name, size);
        this.wheel = wheel;
        this.doors = doors;
        this.gears = gears;
        this.ismanual = ismanual;
        this.currentgear = 1;

    }

    public void setCurrentgear(int currentgear) {
        this.currentgear = currentgear;
        System.out.println("set current gear method" + this.currentgear + "gear");
    }
    public  void changevelocity(int speed,int direction)
    {
        move(speed,direction);
        System.out.println("change velocity method in car class velocity" + speed + "direction" + direction);

    }
}
