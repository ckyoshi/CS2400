/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolstuff.ibcsia;

/**
 *
 * @author bruhm
 */
public class client {
    private String fName;
    private String lName;
    private String address;
    private String contact;
    private String pest;
    private double cost;
    private String memo;

    public client(String fName, String lName, String address, String contact, String pest, double cost, String memo) {
        this.fName = fName;
        this.lName = lName;
        this.address = address;
        this.contact = contact;
        this.pest = pest;
        this.cost = cost;
        this.memo = memo;
    }
    public String toString(){
        return lName + ", " + fName + ": " + address + ", " + contact + ", " + pest + ", $" + cost + ", (" + memo + ")";
    }
}
