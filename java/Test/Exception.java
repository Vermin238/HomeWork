package Test;

class Exception extends Throwable {
    public Exception() {
    }

    public Exception(String i) {
        System.out.println("Некорректный формат даты");
        System.out.println();
    }
}