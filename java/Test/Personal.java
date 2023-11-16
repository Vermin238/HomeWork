package Test;

public class Personal {

    String lastName;
    String firstName;
    String middleName;
    String dataOfBirth;
    String phoneNumber;
    String gender;

    public Personal (String lastName,String firstName,String middleName,String dataOfBirth,String phoneNumber,String gender) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.dataOfBirth = dataOfBirth;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        }
    @Override
    public String toString() {
        return String.format("<%s><%s><%s><%s><%s><%s>",lastName,firstName,middleName,dataOfBirth,phoneNumber,gender);
    }
}
