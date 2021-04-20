package functional;

import java.util.StringJoiner;

public class StringJoinerTest {
    public static void main(String[] args) {
        StringJoiner stringJoiner = new StringJoiner(",");

        stringJoiner.add("Imtiaz");
        stringJoiner.add("Imtiaz");
        stringJoiner.add("");
        stringJoiner.add("Imtiaz");
        stringJoiner.add("Imtiaz");

        System.out.println(stringJoiner);

        stringJoiner.setEmptyValue("Imtiaz");
        System.out.println(stringJoiner);
    }
}
