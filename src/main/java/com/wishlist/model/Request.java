package com.wishlist.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created with IntelliJ IDEA.
 * User: Pranav Sundriyal
 * Date: 10/22/15
 * Time: 1:34 PM
 * To change this template use File | Settings | File Templates.
 */

public class Request implements Cloneable {
    String arrivalDate;
    String departurteDate;
    String origin;
    String destination;
    int maxOffer = 2000;


    public Request(@JsonProperty("arrivalDate") String arrivalDate,
                   @JsonProperty("departurteDate") String departurteDate,
                   @JsonProperty("origin") String origin,
                   @JsonProperty("destination") String destination) {
        this.arrivalDate = arrivalDate;
        this.departurteDate = departurteDate;
        this.origin = origin;
        this.destination = destination;
    }

    public Request(String departurteDate, String origin, String destination) {
        this.departurteDate = departurteDate;
        this.origin = origin;
        this.destination = destination;
    }

    public static Request cloneRequest(Request request) {
        Request clone = new Request(request.getArrivalDate(),
                request.getDeparturteDate(),request.getOrigin(),request.getDestination());
        return clone;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public String getDeparturteDate() {
        return departurteDate;
    }

    public void setDeparturteDate(String departurteDate) {
        this.departurteDate = departurteDate;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getMaxOffer() {
        return maxOffer;
    }

    public void setMaxOffer(int maxOffer) {
        this.maxOffer = maxOffer;
    }

    @Override
    public String toString() {
        return "Request{" +
                "arrivalDate='" + arrivalDate + '\'' +
                ", departurteDate='" + departurteDate + '\'' +
                ", origin='" + origin + '\'' +
                ", destination='" + destination + '\'' +
                ", maxOffer=" + maxOffer +
                '}';
    }
}
