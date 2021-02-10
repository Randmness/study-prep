package study.lc.hash;

import java.util.HashMap;

class Logger {
    private HashMap<String, Integer> logMap;
    private final int PRINT_DELAY = 10;

    /** Initialize your data structure here. */
    public Logger() {
        logMap = new HashMap<>();
    }

    /** Returns true if the message should be printed in the given timestamp, otherwise returns false.
     If this method returns false, the message will not be printed.
     The timestamp is in seconds granularity. */
    public boolean shouldPrintMessage(int timestamp, String message) {
        if (logMap.containsKey(message)) {
            int previousTimestamp = logMap.get(message);
             if (timestamp >= previousTimestamp + PRINT_DELAY) {
                 logMap.put(message, timestamp);
                 return true;
             } else {
                 return false;
             }
        } else {
            logMap.put(message, timestamp);
            return true;
        }
    }
}