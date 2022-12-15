package numberClass;

public class ConvertMain {
    public static void main(String[] args) {
        String angkaStr = "12345";
        Integer angka = Integer.parseInt(angkaStr);
        System.out.println(angka);

        angkaStr = "abc";
        try {
            angka = Integer.parseInt(angkaStr);
        }catch (Exception e){
            System.out.println("Terjadi Sebuah Kesalahan Saat Convert, Error!!! "+ e.getMessage());
        }
        System.out.println(angka);
    }
}
