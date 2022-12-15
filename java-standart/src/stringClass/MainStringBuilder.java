package stringClass;

public class MainStringBuilder {
    public static void main(String[] args) {
        String firstName = "Andi Dwi";
        System.out.println("First Name " + firstName);
        String lastName = "Angga Prastya";
        System.out.println("Last Name " + firstName);

        String namaLengkap = firstName + " " + lastName;
        System.out.println("Nama Lengkap " + namaLengkap);

        StringBuilder builder = new StringBuilder(firstName)
                .append(" ").append(lastName);
        System.out.println("Builder " + builder);
    }
}
