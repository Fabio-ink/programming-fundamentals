package oop.composition.worker.entities;

import java.util.Date;

public class HourContract {

    private Date date;
    private Double valuePerHour;
    private Double hour;

    public HourContract(){
    }
    
    public HourContract(Date date, Double valuePerHour, Double hour) {
        this.date = date;
        this.valuePerHour = valuePerHour;
        this.hour = hour;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public Double getHour() {
        return hour;
    }

    public void setHour(Double hour) {
        this.hour = hour;
    }

    public Double totalValue(){
        return valuePerHour * hour;
    }
    

}
