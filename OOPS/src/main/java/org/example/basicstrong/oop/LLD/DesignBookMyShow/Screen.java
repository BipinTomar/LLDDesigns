package org.example.basicstrong.oop.LLD.DesignBookMyShow;

import java.util.ArrayList;
import java.util.List;


public class Screen {
    int screenId;
    List<Seat> seats = new ArrayList<Seat>();

    public int getScreenId() {
        return screenId;
    }

    public void setScreenId(int screenId) {
        this.screenId = screenId;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }


}
