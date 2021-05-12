package study.EPI.arrays;

import java.util.List;

public class RemoveDuplicates {

    public static int deleteDuplicates(List<Integer> A) {
        if (A.isEmpty()) return 0;

        int writeIndex=1;
        for (int index=1; index < A.size(); index++) {
            if (!A.get(writeIndex-1).equals(A.get(index))) {
                A.set(writeIndex++, A.get(index));
            }
        }

        return writeIndex;
    }
}
