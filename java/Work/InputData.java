package Work;

import java.util.Scanner;

public class InputData {
    public String[] enterData() {
        Scanner iScanner = new Scanner(System.in);
        while (true){
            System.out.println(" Введите Ф.И.О, дату рождения (dd.mm.yyyy), номер телефона (цифры), пол (f/m) ) : ");
            String data = iScanner.nextLine();
            String[] arrayData = data.split(" ");
            if (arrayData.length == 6) {
                return arrayData;
            } else if (arrayData.length < 6){
                System.out.println("Вы ввели не все данные");
            } else System.out.println("Вы ввели много данных");
        }

    }
}