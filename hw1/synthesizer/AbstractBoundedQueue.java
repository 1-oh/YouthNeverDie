package synthesizer;

/**Methods and classes can be declared as abstract using the abstract keyword.
 * Abstract classes cannot be instantiated, but they can be subclassed using the extends keyword.
 * Unlike interfaces, abstract classes can provide implementation inheritance for features other
 * than public methods, including instance variables.*/

/**Classes that implement interfaces will inherit all of the methods and variables from that
 * interface. If an implementing class fails to implement any abstract methods inherited from
 * an interface, then that class must be declared abstract*/

public abstract class AbstractBoundedQueue<T> implements BoundedQueue<T>{
    protected int fillCount;
    protected int capacity;
    /**Protected  means that only subclasses of AbstractBoundedQueue and classes in the same
     *  package as AbstractBoundedQueue can access this variable.
     */
    public int capacity(){
        return capacity;
    }
    public int fillCount(){
        return fillCount;
    }
    public abstract T peek();
    public abstract T dequeue();
    public abstract void enqueue(T x);
}
