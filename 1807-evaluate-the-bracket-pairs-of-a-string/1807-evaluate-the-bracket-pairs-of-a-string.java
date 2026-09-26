class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String, String> map = new HashMap<>();

        for (int i = 0; i < knowledge.size(); i++) {
            map.put(knowledge.get(i).get(0), knowledge.get(i).get(1));
        }

        char ch[] = s.toCharArray();

        StringBuilder str1 = new StringBuilder("");
        StringBuilder str2 = new StringBuilder("");

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '(') {
                int j = i + 1;
                while (ch[j] != ')') {
                    str1.append(ch[j]);
                    j++;
                }

                String s1 = map.get(str1.toString());
                str1.setLength(0);

                if (s1 != null) {
                    str2.append(s1);
                } else {
                    str2.append('?');
                }
                i = j;
            } else {
                str2.append(ch[i]);
            }
        }

        return str2.toString();
    }
}