package exceptions.model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private Integer roomNumber;
    private Date checkIn;
    private Date checkOut;
    
    public Reservation(Integer roomNumber, Date checkIn, Date checkOut) {
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer getNumber() {
        return roomNumber;
    }

    public void setNumber(Integer number) {
        this.roomNumber = number;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public long duration(){
        long dif = checkOut.getTime() - checkIn.getTime();
        return TimeUnit.DAYS.convert(dif, TimeUnit.MILLISECONDS);
    }

    public String updateDates(Date checkIn, Date checkOut){

        Date now = new Date();
        if (checkIn.before(now) || checkOut.before(now)){
            return "Error in reservation: Reservation dates for update must be future dates";
        }
        if(!checkOut.after(checkIn)){
            return "Error in reservation: Check-out date must be after check-in date";
        }
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        return null;
    }

    @Override
    public String toString() {
        return "Quarto "
                + roomNumber
                + ", Check-In: "
                + sdf.format(checkIn)
                + ", Check-Out: "
                + sdf.format(checkOut)
                + ", "
                + duration()
                + " Noites";
    }

}
