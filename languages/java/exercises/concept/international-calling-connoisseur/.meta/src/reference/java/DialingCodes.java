import java.util.Map;
import java.util.HashMap;

public class DialingCodes {
    public static Map<Integer, String> getEmptyMap() {
        return new HashMap<Integer, String>();
    }

    public static Map<Integer, String> getExistingMap() {
        var map = new HashMap<Integer, String>();
        map.put(1, "United States of America");
        map.put(55, "Brazil");
        map.put(91, "India");
        return map;
    }

    public static Map<Integer, String> addCountryToEmptyMap(int countryCode, String countryName) {
        var map = new HashMap<Integer, String>();
        map.put(countryCode, countryName);
        return map;
    }

    public static Map<Integer, String> addCountryToExistingMap(Map<Integer, String> existingMap, int countryCode, String countryName) {
        existingMap.put(countryCode, countryName);
        return existingMap;
    }

    public static String getCountryNameFromMap(Map<Integer, String> existingMap, int countryCode) {
        if (existingMap.containsKey(countryCode)) {
            return existingMap.get(countryCode);
        } else {
            return "";
        }
    }

    public static Map<Integer, String> updateMap(Map<Integer, String> existingMap, int countryCode, String countryName) {
        if (existingMap.containsKey(countryCode)) {
            existingMap.put(countryCode, countryName);
        }

        return existingMap;
    }

    public static Map<Integer, String> removeCountryFromMap(Map<Integer, String> existingMap, int countryCode) {
        existingMap.remove(countryCode);
        return existingMap;
    }

    public static boolean checkCodeExists(Map<Integer, String> existingMap, int countryCode) {
        return existingMap.containsKey(countryCode);
    }

    public static String findLongestCountryName(Map<Integer, String> existingMap) {
        var longestCountryName = "";
        for (String countryName : existingMap.values()) {
            if (countryName.length() > longestCountryName.length()) {
                longestCountryName = countryName;
            }
        }

        return longestCountryName;
    }
}
