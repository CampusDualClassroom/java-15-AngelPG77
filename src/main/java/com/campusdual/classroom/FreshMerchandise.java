package com.campusdual.classroom;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FreshMerchandise extends Merchandise {


    private Date expirationDate;
    SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");

    public FreshMerchandise(String name, String uniqueId, String responsibleId, int zone, String area, String shelf, int quantity, Date expirationDate) {
        super(name, uniqueId, responsibleId, zone, area, shelf, quantity);
        this.expirationDate = expirationDate;
    }

    @Override
    public Object getSpecificData() {
        return "Nombre: " + super.name + " ID: " + super.uniqueId + " ResponsibleID: " + super.responsibleId
                + " Zona:" + super.zone + " Area:" + super.area + " Estante:" + super.shelf + " Cantidad:" + super.quantity + " Fecha de caducidad: " + getFormattedDate(getExpirationDate());
    }

    public void printSpecificData(){
        System.out.println(getSpecificData());
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public String getFormattedDate(Date expirationDate){
        return format.format(expirationDate);
    }
}
