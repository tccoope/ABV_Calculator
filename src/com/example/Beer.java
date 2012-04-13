package com.example;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created with IntelliJ IDEA.
 * User: siu920113039
 * Date: 4/13/12
 * Time: 11:22 AM
 * To change this template use File | Settings | File Templates.
 */
public class Beer {
    private double og;
    private double fg;

    public double getOG(){
        return(og);
    }

    public void setOG(double og){
        this.og=og;
    }

    public double getFG(){
        return(fg);
    }

    public void setFG(double fg){
        this.fg=fg;
    }

    public double calcABV(){
        this.og=og;
        this.fg=fg;
        Double abv;

        abv=(((1.05*(og-fg))/fg)/0.79);

        return abv;
    }
}
