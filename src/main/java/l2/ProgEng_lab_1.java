package l2;

import java.lang.String;
import java.util.ArrayList;
import java.util.List;

//Anton Kachur TI-82
//Task: 7.Create a complex numbers using Java

public class ProgEng_lab_1 {
    ProgEng_lab_1 p;
    MainController m;

    ProgEng_lab_1(int choice) {
        m = new MainController(choice);
    }

    public static void main (String []args) {
        List<ProgEng_lab_1> mains = new ArrayList<>();

        for (int i=1; i<6; i++)
            mains.add(new ProgEng_lab_1(i));
    }
}

