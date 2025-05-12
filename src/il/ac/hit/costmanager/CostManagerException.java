package il.ac.hit.costmanager;

/**
 * New type of exceptions to wrap different exceptions
 */
public class CostManagerException extends Exception {
    /**
     * @param message
     */
    public CostManagerException(String message) {
        super(message);
    }

    public CostManagerException(String message, Throwable cause) {
        super(message, cause);
    }
}
