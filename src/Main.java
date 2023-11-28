import model.Car;
import model.Patient;


public class Main {
    public static void main(String[] args) {
        Patient patient = new Patient("John", "Wick");
        //test//
        System.out.println(patient.getFirstName() + " " + patient.getLastName());
        Patient patient2 = new Patient(222, "Jeremie", "Laroche", "masculin", "1992 Avenue Trouduc", "066666666");
        System.out.println(patient2.getGender() +  " " + patient2.getId());
        patient2.setId(22222);
        System.out.println(patient2.getId());

    }
}


