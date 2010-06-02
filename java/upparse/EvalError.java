package upparse;

/**
 * Exception to be thrown if there is a problem with experiment eval
 * @author ponvert@mail.utexas.edu (Elias Ponvert)
 */
public class EvalError extends Exception {
  private static final long serialVersionUID = 1L;

  public EvalError(String errorStr) {
    super(errorStr);
  }
}