package Entitaeten;
import java.util.Date;

public class Auto {
    private int autoId;
    private String marke;
    private String beschreibung;
    private String model;
    private String farbe;
    private Date datum;



    public int getautoId() {
        return autoId;
    }

    public void setautoId(int autoId) {
        this.autoId=autoId;
    }

    public String getmarke() {
        return marke;
    }

    public void setTitle(String marke) {
        this.marke = marke;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setText(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }
    
    public String getFarbe(){
	return farbe;
    }

    public void setFarbe(String farbe){
	this.farbe = farbe;
    }

    public String getmodel(){
	return model;
    }

    public void setmodel(String model){
	this.model = model;
    }

}
