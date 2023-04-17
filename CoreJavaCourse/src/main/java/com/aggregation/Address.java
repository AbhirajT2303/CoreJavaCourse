package com.aggregation;

public class Address {
    String City;
    String State;
    String Country;

    public Address(String city, String state, String country) {
        City = city;
        State = state;
        Country = country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "City='" + City + '\'' +
                ", State='" + State + '\'' +
                ", Country='" + Country + '\'' +
                '}';
    }
}
