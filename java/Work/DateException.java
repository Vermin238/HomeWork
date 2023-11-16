package Work;

public class DateException extends Exception {
    public DateException() {
    }
    public void dataException(String i) {
        System.out.println("Exception: Некорректный формат даты");
        System.out.println();
    }

    public void dataException() {
    }
}
