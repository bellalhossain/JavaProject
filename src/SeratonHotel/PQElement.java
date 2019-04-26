/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package SeratonHotel;

/**
 *
 * @author cmuntean
 */
public class PQElement {
      private int key;
      private Customer element;
     
      public PQElement(int priority, Customer e){
                key = priority;
                element = e;
	}

      public int getKey() {
                return key;
	}

      public void setKey(int val) {
		key = val;
	}
	
    public Customer getElement() {
            return element;
      }

    public void setElement(Customer e) {
	element = e;
      }

      public String printPatient() {
          String msg ; 
          msg = " name = "+element.getName()+ " "+ "symptoms ="+element.getSymptom();
          return msg;
      }
}
       //end of class PQElement
