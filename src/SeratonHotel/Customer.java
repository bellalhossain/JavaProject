/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package SeratonHotel;

/**
 *
 * @author olahart
 */
public class Customer {
    private String name;
    private String symptom;
    public Customer(){
        name = new String();
        symptom = new String();
    }

    public void setName(String n){
        name = n;
    }

    public void setSymptom(String s){
        symptom = s;
    }

    public String getName(){
        return name;
    }

    public String getSymptom(){
        return symptom;
    }
}