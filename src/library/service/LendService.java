package library.service;

import library.model.Lend;

import java.util.ArrayList;
import java.util.List;

public class LendService {

    private List<Lend> lends = new ArrayList<>();

    public void printAllLends() {

        for (Lend lend : lends) {

            System.out.println(
                    lend.getBook().getTitle()
                            + " - "
                            + lend.getClient().getName()
                            + " - "
                            + lend.getStatus()
            );
        }
    }


}
