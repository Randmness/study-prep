package study.lc.hash;

import java.util.HashSet;

public class JewelsStones {

    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> jewelSet = new HashSet<>();
        for (Character jewel: jewels.toCharArray()) {
            jewelSet.add(jewel);
        }

        int count = 0;
        for (Character stone: stones.toCharArray()) {
            if (jewelSet.contains(stone)) count++;
        }

        return count;
    }
}
