package stringClass;

import java.util.StringJoiner;

public class MainStringJoiner {
    public static void main(String[] args) {
        String[] names = {"Andi", "Dwi", "Angga"};
        StringJoiner joiner = new StringJoiner(" - ", "{","}");

        System.out.println("Sebelum Ditambahkan : ");
        System.out.println(joiner.toString());

        for(String name: names){
            joiner.add(name);
        }
        System.out.println("Sesudah Ditambahkan : ");
        System.out.println(joiner.toString());
    }
}
