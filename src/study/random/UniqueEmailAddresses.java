package study.random;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddresses {


    //https://leetcode.com/explore/featured/card/google/67/sql-2/3044/
    public int numUniqueEmails(String[] emails) {

        Set<String> uniqueEmails = new HashSet<>();

        for (String email: emails) {
            uniqueEmails.add(getActualEmail(email));
        }

        return uniqueEmails.size();
    }

    private String getActualEmail(String rawEmail) {
        String[] parts = rawEmail.split("@");
        String localName = parts[0];

        StringBuilder result = new StringBuilder();
        int position = 0;
        while(position != localName.length() && localName.charAt(position) != '+') {
            if (Character.isLetter(localName.charAt(position))) {
                result.append(localName.charAt(position));
            }
            position++;
        }

        result.append("@");
        result.append(parts[1]);
        return result.toString();
    }
}
