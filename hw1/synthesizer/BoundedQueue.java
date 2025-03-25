package synthesizer;

public interface BoundedQueue<T>{
    /**In an interface ,All methods that you declare or define are
     *automatically public and abstract (even if you omit the public keyword).*/

    /**In this fixed sized BoundedQueue,items can only be enqueued at the
     * back of the queue,and can only be dequeued from the front of the queue.*/

    int capacity();     // return size of the buffer
    int fillCount();    // return number of items currently in the buffer
    void enqueue(T x);  // add item x to the end
    T dequeue();        // delete and return item from the front
    T peek();           // return (but do not delete) item from the front

    default boolean isEmpty(){
        return fillCount() == 0;
    }// is the buffer empty (fillCount equals zero)?

    default boolean isFull(){
        return fillCount()==capacity();
    }// is the buffer full (fillCount is same as capacity)?
}
