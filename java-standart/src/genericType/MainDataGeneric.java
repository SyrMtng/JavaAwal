package genericType;

public class MainDataGeneric {
    public static void main(String[] args) {
        DataGeneric<String> data1 = new DataGeneric<String>();
        data1.setData("Andi Dwi Angga Prastya");
        System.out.println("data1 Value "+ data1.getData());

        //data1.setData(1234567); => error

        DataGeneric<Integer> data2 = new DataGeneric<Integer>();
        data2.setData(1234567);
        System.out.println("data2 Value "+ data2.getData());

        DataGeneric<Boolean> data3 = new DataGeneric<Boolean>();
        data3.setData(true);
        System.out.println("data2 Value "+ data3.getData());

        DataGeneric<Product> data4 = new DataGeneric<Product>();
        //data4.setData(new Product("Ajinomoto",2500.00));
        Product product = new Product("Seblak",150000.0);
        data4.setData(product);
        System.out.println("data4 Value "+ data4.getData());
        DataGeneric<Animal> data6 = new DataGeneric<>(new Animal("Kucing",4));
        System.out.println("Data6 Value : "+ data6.getData());

        DataGeneric<String> data5 = new DataGeneric<>("Data 5");
        System.out.println("Data5 Value : "+ data5.getData());
    }
}
