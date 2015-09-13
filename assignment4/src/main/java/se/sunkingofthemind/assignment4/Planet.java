package se.sunkingofthemind.assignment4;

import android.graphics.drawable.Drawable;

import java.util.ArrayList;

/**
 * Created by Alrik on 2015-04-23.
 */
public class Planet {
    String title;
    int radie;
    int temp;
    Drawable image;
    int orderIndex;

    public Planet(String title, int radie, int temp, Drawable image, int orderIndex ) {
        this.title = title;
        this.radie = radie;
        this.temp= temp;
        this.image = image;
        this.orderIndex = orderIndex;
    }

    public int getRadie() {
        return radie;
    }

    public void setRadie(int radie) {
        this.radie = radie;
    }
    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public Drawable getImage() {
        return image;
    }

    public void setImage(Drawable image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }





}
