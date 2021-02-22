package study.random;

import java.util.*;

public class LogSystem {
    private TreeMap<Long, Integer> logMap;
    public LogSystem() {
        this.logMap = new TreeMap<>();
    }

    public void put(int id, String timestamp) {
        logMap.put(convert(timestamp), id);
    }

    public List<Integer> retrieve(String start, String end, String granularity) {
        Long startKey = convert(start, granularity, false);
        Long endKey = convert(end, granularity, true);
        List<Integer> results = new ArrayList<>();

        for (Long key: logMap.tailMap(startKey).keySet()) {
            if (key >= startKey && key <= endKey) results.add(logMap.get(key));
        }

        return results;
    }

    private Long convert(String timestamp) {
        return convert(timestamp, "Second", false);
    }

    //"2017:01:01:23:59:59"
    private Long convert(String timestamp, String granularity, boolean upper) {
        Map<String, Integer> granMap = new HashMap<>();
        granMap.put("Year", 0);
        granMap.put("Month", 1);
        granMap.put("Day", 2);
        granMap.put("Hour", 3);
        granMap.put("Minute", 4);
        granMap.put("Second", 5);

        String[] preConvert = new String[] {"1970", "00", "00", "00", "00", "00"};
        String[] split = timestamp.split(":");
        for (int index=0; index< granMap.get(granularity)+1; index++) {
            preConvert[index] = split[index];
        }

        //edge case
        if (upper && !granularity.equals("Second")) {
            preConvert[granMap.get(granularity)+1] = "99";
        }

        StringBuilder preLong = new StringBuilder();
        for (String precon: preConvert) {
            preLong.append(precon);
        }

        return Long.valueOf(preLong.toString());
    }
}
}
