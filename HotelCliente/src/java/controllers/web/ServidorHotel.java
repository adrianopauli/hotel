/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers.web;

import java.net.MalformedURLException;
import java.net.URL;
import models.HotelSeQueSabe;
import models.HotelSeQueSabe_Service;

/**
 *
 * @author Adriano
 */
public class ServidorHotel {
    private static ServidorHotel INSTANCE ;
    private HotelSeQueSabe_Service service;
    private HotelSeQueSabe hotel;
    
    private ServidorHotel() {
        service = new HotelSeQueSabe_Service();
        hotel = service.getHotelSeQueSabePort();
    }
     private ServidorHotel(String url) throws MalformedURLException {
        service = new HotelSeQueSabe_Service(new URL(url));
        hotel = service.getHotelSeQueSabePort();
    }
    
    public static ServidorHotel getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new  ServidorHotel();
        }
        return INSTANCE;
    }
    
     public static ServidorHotel getInstance(String url) throws MalformedURLException {
        if (INSTANCE == null) {
            INSTANCE = new  ServidorHotel(url);
        }
        return INSTANCE;
     }

    public HotelSeQueSabe getHotel() {
        return hotel;
    }
}
