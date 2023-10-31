public class DataException extends Throwable {
    public DataException() {
    }

    public void dataException(String i) {
        System.out.println("Exception: DataNotCorrectFormat");
        System.out.printf("It`s not correct format: %s", i);
        System.out.println();
    }
}
