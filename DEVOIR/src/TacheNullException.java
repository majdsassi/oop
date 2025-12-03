public class TacheNullException extends Exception {
    private String Message ;
  public TacheNullException(String Message ) {
      this.Message = Message ;
    }
    public String getMessage() {
        return this.Message ;
    }
}
