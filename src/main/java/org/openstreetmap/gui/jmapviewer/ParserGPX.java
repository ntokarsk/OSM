package org.openstreetmap.gui.jmapviewer;

/**
 * Created by Nikodem on 12.04.2016.
 */
import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class ParserGPX {
    public void start(){
        try {
            File inputFile = new File("C:\\Users\\Nikodem\\OneDrive\\workspace\\OSM_draw_from_gpx\\src\\main\\resources\\gpx_files\\20160311_114412.gpx");
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
            //System.out.println("                    suma = " + suma);
            //System.out.println( " ilosc punktow w tablicy = " + Spot.getAllSpots().size());






           /* NodeList allNodes = root.getChildNodes();
            for(int i = 0; i < allNodes.getLength(); i++) {
                System.out.println("Node " + i + " name = " + allNodes.item(i).getNodeName());
            }

            Element trk = (Element)allNodes.item(3);
            System.out.println(trk.getNodeName());
            NodeList trkNodes = trk.getChildNodes();

            for(int i = 0; i < allNodes.getLength(); i++) {
                System.out.println("Node " + i + " name = " + allNodes.item(i).getNodeName());
            } */


            //System.out.println(allNodes.getLength());
/*          NodeList nList = doc.getElementsByTagName("student");
            System.out.println("----------------------------");
            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);
                System.out.println("\nCurrent Element :"
                        + nNode.getNodeName());
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    System.out.println("Student roll no : "
                            + eElement.getAttribute("rollno"));
                    System.out.println("First Name : "
                            + eElement
                            .getElementsByTagName("firstname")
                            .item(0)
                            .getTextContent());
                    System.out.println("Last Name : "
                            + eElement
                            .getElementsByTagName("lastname")
                            .item(0)
                            .getTextContent());
                    System.out.println("Nick Name : "
                            + eElement
                            .getElementsByTagName("nickname")
                            .item(0)
                            .getTextContent());
                    System.out.println("Marks : "
                            + eElement
                            .getElementsByTagName("marks")
                            .item(0)
                            .getTextContent());
                }
            }*/
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}