package org.openstreetmap.gui.jmapviewer;

/**
 * Created by Nikodem on 12.04.2016.
 */

import java.util.ArrayList;

public class ParserGPX {
    public void start(){
        try {
/*            File inputFile = new File("C:\\Users\\Nikodem\\OneDrive\\workspace\\OSM_draw_from_gpx\\src\\main\\resources\\gpx_files\\example.gpx");
            DocumentBuilderFactory dbFactory
                    = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();

            Element root = doc.getDocumentElement();
           // System.out.println("Root element: " + root.getNodeName());

            NodeList nList = doc.getElementsByTagName("trkseg");
            System.out.println("Ilosc sekcji trkseg = " + nList.getLength());
            int suma = 0;
            for (int i = 0; i < nList.getLength(); i++) {
                Element trkseg = (Element)nList.item(i);
                NodeList n2List = trkseg.getElementsByTagName("trkpt");
                suma += n2List.getLength();
                System.out.println("    Ilosc sekcji trk = " + n2List.getLength());
                for(int j = 0; j < n2List.getLength(); j++) {
                    Element element = (Element)n2List.item(j);
                    new Spot(element.getAttribute("lat"), element.getAttribute("lon"));
                }
            }

            for (int i = 0; i < Spot.allSpots.size(); i++) {
                System.out.println("lat = " + Spot.allSpots.get(i).getLat() + "# lon = " + Spot.allSpots.get(i).getLon());
            }*/

            ArrayList<Double> tmp_cord_list = token_parser.GPXProcessor.geCoordinatesList();

/*            System.err.println("ALBERT:");
            for (int i = 0; i < tmp_cord_list.size(); i++) {
                System.out.println(tmp_cord_list.get(i));
            }*/

            for (int i = 0; i < tmp_cord_list.size()-1; i=i+2) {
                    new Spot(String.valueOf(tmp_cord_list.get(i)), String.valueOf(tmp_cord_list.get(i+1)));
            }

            //System.out.println("lista dwa:");
            for (int i = 0; i < Spot.allSpots.size(); i++) {
               //System.out.println("lat = " + Spot.allSpots.get(i).getLat() + "# lon = " + Spot.allSpots.get(i).getLon());
            }

            //System.out.println("                    suma = " + suma);
            //System.out.println( " ilosc punktow w tablicy = " + Spot.getAllSpots().size());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}