package com.teja;

/**
 * Created by TEJA on 5/30/2017.
 */
public class outlsnder extends car {

    private  int service;

    public outlsnder(int service) {
        super("outlander", "5", 5, 4, 8, false);
        this.service = service;
    }
    public void accelerate(int rate)
    {

        int newvelocity= getCurrentvelocity()+rate;
        if(newvelocity==0){
            stop(0);
            setCurrentgear(0);
        }
        else if(newvelocity>0 && newvelocity<=10)
        {
            setCurrentgear(1);

        }
        else if(newvelocity>10 && newvelocity<=20)
        {
            setCurrentgear(2);
        }
        else if(newvelocity>20 && newvelocity<=30)
        {

            setCurrentgear(3);
        }
        else
        {

            setCurrentgear(4);
        }

    }


}
