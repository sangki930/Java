package java10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main1 {
    public static void main(String[] args) {
        List<String> list = Collections.unmodifiableList(new ArrayList<String>());
        String text = """
                ABDC
                """;
    }
}
