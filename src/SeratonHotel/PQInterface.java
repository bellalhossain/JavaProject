/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package SeratonHotel;

/**
 *
 * @author cmuntean
 */
public interface PQInterface {
    public void enqueue(int key, Object element);
    public int size();
    public boolean isEmpty();
    public Object dequeue();
    public String printPQueue();

}
