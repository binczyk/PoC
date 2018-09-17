package stream;

import org.apache.commons.lang.RandomStringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class ExampleList {
    private static final List<String> test = new ArrayList<>();

    private ExampleList() {
    }

    public static List<String> getList() {
        for (int i = 0; i < 50; i++) {
            test.add(RandomStringUtils.randomAlphanumeric(new Random().nextInt(100)));
        }
        return test;
    }

    public static void modify(String string) {
        System.out.println(string + " DUPA");
    }

    public static String getLast() {
        int lastIndex = test.size() - 1;
        return test.get(lastIndex);
    }

}
