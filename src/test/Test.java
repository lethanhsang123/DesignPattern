package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {


        List<String> months = new ArrayList<>();
        months.add("11/2023");
        months.add("10/2023");
        months.add("09/2023");
        months.add("08/2023");

        List<String> trans = new ArrayList<>();
        trans.add("11/2023");
        trans.add("09/2023");

        Boolean isCk = Boolean.TRUE;

        if (trans.size() <= months.size()) {
            int i = 0;
            while (i < trans.size()) {
                if (months.get(i) != trans.get(i)) {
                    isCk = Boolean.FALSE;
                    break;
                }
                i++;
            }
        } else isCk = Boolean.FALSE;

        System.out.println("Have discount = " + isCk);

    }

}
