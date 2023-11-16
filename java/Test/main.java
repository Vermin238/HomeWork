/**
 * Напишите приложение, которое будет запрашивать у пользователя следующие данные в произвольном порядке, разделенные пробелом:
 * <p>
 * Фамилия Имя Отчество дата рождения номер телефона пол
 * Форматы данных:
 * фамилия, имя, отчество - строки
 * дата рождения - строка формата dd.mm.yyyy
 * номер телефона - целое беззнаковое число без форматирования
 * пол - символ латиницей f или m.
 * <p>
 * Приложение должно проверить введенные данные по количеству.
 * Если количество не совпадает с требуемым, вернуть код ошибки, обработать его и показать пользователю сообщение,
 * что он ввел меньше и больше данных, чем требуется.
 * Приложение должно попытаться распарсить полученные значения и
 * выделить из них требуемые параметры.
 * Если форматы данных не совпадают, нужно бросить исключение,
 * соответствующее типу проблемы. Можно использовать встроенные типы java и создать свои. Исключение
 * должно быть корректно обработано, пользователю выведено сообщение с информацией, что именно неверно.
 * Если всё введено и обработано верно, должен создаться файл с названием, равным фамилии, в него в
 * одну строку должны записаться полученные данные, вида
 * <Фамилия><Имя><Отчество><дата рождения> <номер телефона><пол>
 * Однофамильцы должны записаться в один и тот же файл, в отдельные строки.
 * Не забудьте закрыть соединение с файлом.
 * При возникновении проблемы с чтением-записью в файл,
 * исключение должно быть корректно обработано, пользователь должен увидеть стектрейс ошибки.
 */
package Test;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;


public class main {
    public static void main(String[] args) throws RuntimeException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные в формате: ФИО, Дата рождения, Номер телефона, Пол");
        try {
            String input = scanner.nextLine();
            String[] userData = input.split(" ");
            String lastName = userData[0];
            String firstName = userData[1];
            String middleName = userData[2];
            String dataOfBirth = userData[3];
            String phoneNumber = userData[4];
            String gender = userData[5];
            System.out.println(Arrays.toString(userData));
            Personal p = new Personal(lastName, firstName, middleName, dataOfBirth, phoneNumber, gender);
            String fileName = p.lastName + ".txt";
            File file = new File(fileName);
            try {
                FileWriter writer = new FileWriter(file, true);
                writer.write(p.toString());
                writer.write("\n");
                writer.flush();
                System.out.println("Данные успешно записаны в файл!");
            } catch (IOException e) {
                e.printStackTrace();//throw new RuntimeException(e);
            }
            try {
                throw new Exception();
            } catch (Exception e) {
            }
        } finally {
        }
    }
}