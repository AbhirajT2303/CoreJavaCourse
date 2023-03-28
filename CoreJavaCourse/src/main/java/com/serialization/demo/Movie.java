package com.serialization.demo;

import java.io.Serializable;

public class Movie implements Serializable {
    private String movieName;
    private String movieTiming;
    private int noOfTickets;

    @Override
    public String toString() {
        return "Movie{" +"movieName= " + movieName+", movieTiming= " + movieTiming+", noOfTickets= " + noOfTickets +"}";
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieTiming() {
        return movieTiming;
    }

    public void setMovieTiming(String movieTiming) {
        this.movieTiming = movieTiming;
    }

    public int getNoOfTickets() {
        return noOfTickets;
    }

    public void setNoOfTickets(int noOfTickets) {
        this.noOfTickets = noOfTickets;
    }
}
