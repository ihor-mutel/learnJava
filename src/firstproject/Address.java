/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstproject;

/**
 *
 * @author The Revenant
 */
public class Address {
    private String streeAndHouseNumber;
    private String city;
    private String postcode;

    public String getStreeAndHouseNumber() {
        return streeAndHouseNumber;
    }

    @Override
    public String toString() {
        return "Address{" + "streeAndHouseNumber=" + streeAndHouseNumber + ", city=" + city + ", postcode=" + postcode + '}';
    }

    public void setStreeAndHouseNumber(String streeAndHouseNumber) {
        this.streeAndHouseNumber = streeAndHouseNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }
}
