package study.lc.binary_search;

public class FirstBadNumber {

    boolean isBadVersion(int version) {
        return true;
    }


    public int firstBadVersion(int n) {
        int start = 1, end = n;
        while (start < end) {
            int middle = start + (end-start)/2;

            if (isBadVersion(middle)) {
                end = middle;
            } else {
                start = middle+1;
            }
        }

        return start;
    }
}
