package util.math.xirr;

/**
 * Indicates that the numerical method employed encountered a zero-valued
 * derivative, terminating the algorithm unsuccessfully.
 * <p>
 * The state of the algorithm is available via the getters, to allow the caller
 * to adjust the guess and try again.
 * @author ray
 */
public class ZeroValuedDerivativeException extends ArithmeticException {

    private final double initialGuess;
    private final long iteration;
    private final double candidate;
    private final double value;

    public ZeroValuedDerivativeException(
        double initialGuess, long iteration, double candidate, double value) {

        super("Newton-Raphson failed due to zero-valued derivative.");
        this.initialGuess = initialGuess;
        this.iteration = iteration;
        this.candidate = candidate;
        this.value = value;
    }

    /**
     * Get the initial guess used by the algorithm.
     * @return the initial guess
     */
    public double getInitialGuess() {
        return initialGuess;
    }

    /**
     * Get the number of iterations passed when encountering the zero-valued
     * derivative.
     * @return the number of iterations passed when encountering the zero-valued
     * derivative
     */
    public long getIteration() {
        return iteration;
    }

    /**
     * Get the candidate input which resulted in the zero-valued derivative.
     * @return the input which resulted in the zero-valued derivative
     */
    public double getCandidate() {
        return candidate;
    }

    /**
     * The value of the function at the candidate input which resulted in the
     * zero-valued derivative.
     * @return value of the function at the candidate input which resulted in
     * the zero-valued derivative
     */
    public double getValue() {
        return value;
    }

}
