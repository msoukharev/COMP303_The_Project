/**
 * Interface PlayOrder specifies the order of traversing the element in a collection
 */
public interface PlayOrder {
    /**
     * Return the index of the next element in the collection
     * based on the specific traversing method.
     * @return the index of the next element in the collection
     */
    int getNext() throws IndexOutOfBoundsException;
    /**
     * Check if all element in the collection has been traversed.
     * @return true if the collection has more element to traverse
     */
    boolean hasNext();

    /**
     * Callback function to indicate change in the queue
     */
    void update() throws NullPointerException;
}
