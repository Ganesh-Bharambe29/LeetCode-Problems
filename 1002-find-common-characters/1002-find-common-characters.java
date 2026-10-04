class Solution {
    public List<String> commonChars(String[] words) {
        List<String> str = new ArrayList<>();
        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : words[0].toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (int i = 1; i < words.length; i++) {
            HashMap<Character, Integer> currMap = new HashMap<>();

            for (char ch : words[i].toCharArray()) {
                currMap.put(ch, currMap.getOrDefault(ch, 0) + 1);
            }

            for (char ch : map.keySet()) {
                int oldCount = map.get(ch);
                int currentCount = currMap.getOrDefault(ch, 0);
                map.put(ch, Math.min(oldCount, currentCount));
            }
        }

        for (char ch : map.keySet()) {
            int count = map.get(ch);

            while (count > 0) {
                str.add(String.valueOf(ch));
                count--;
            }
        }

        return str;
    }
}