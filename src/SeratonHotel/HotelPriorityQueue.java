/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package SeratonHotel;

import java.util.*;



/**
 *
 * @author cmuntean
 */
public class HotelPriorityQueue implements PQInterface
{
    private ArrayList<PQElement> HotelPQ;
    
    public HotelPriorityQueue() {
        HotelPQ = new ArrayList<PQElement>();    
    } 
    
    public boolean isEmpty() { 
        return HotelPQ.isEmpty(); 
    }
  
    public int size(){
	  return HotelPQ.size();
    }

    private int findInsertPosition(int newkey)
      {
          boolean found;
          PQElement elem;
          int position;
          found = false;
          position =0;
          while (position<HotelPQ.size() && !found)
          {
            elem = HotelPQ.get(position);
            if(elem.getKey()>newkey)  
                position = position +1;
            else
            {
                found = true;
            }
          }
         return position;
        }
    
    // new element with a given key and element information will be added 
    public void enqueue(int priorkey, Object item)
    {
        int index;
        PQElement elem = new PQElement(priorkey,(Customer)item);
        
        index = findInsertPosition(priorkey);

        if (index ==size())
            HotelPQ.add(elem);
        else
            HotelPQ.add(index, elem);
    }



    //the first element has the highest priority
    public Object dequeue()
    {
       return HotelPQ.remove(0);
    }
    
    
    public String printPQueue()
    {
        String msg = "";
        PQElement elem;
        for (int i = 0; i<HotelPQ.size();i++)
        {
        ///    elem = HotelPQ.get(i);
               elem = HotelPQ.get(i);
            msg = msg+elem.printPatient()+" "+"Priority ="+elem.getKey()+"\n";
        }
        return msg;
    }
 }







