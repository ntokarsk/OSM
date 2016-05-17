package org.openstreetmap.gui.jmapviewer;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by Nikodem on 17.05.2016.
 */
public class Spot {
    private String lat;
    private String lon;

    private static ArrayList<Spot> allSpots = new ArrayList<>();

    public Spot(String lat, String lon) {
        this.lat = lat;
        this.lon = lon;
        allSpots.add(this);
    }

    public double getLat(){
        Scanner s = new Scanner(this.lat);
        s.useLocale(Locale.US);
        double result = 0.0;
        if(s.hasNext())
            result = s.nextDouble();
        return result;
    }

    public double getLon(){
        Scanner s = new Scanner(this.lon);
        s.useLocale(Locale.US);
        double result = 0.0;
        if(s.hasNext())
            result = s.nextDouble();
        return result;
    }

    public static ArrayList getAllSpots(){
        return allSpots;
    }
}
