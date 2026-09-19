class Solution {
    public int calPoints(String[] operations) {
       Stack<Integer> s=new Stack<>();

        for (int i = 0; i < operations.length; i++) {

            if (!operations[i].equals("C") &&
                !operations[i].equals("D") &&
                !operations[i].equals("+")) {

                s.push(Integer.parseInt(operations[i]));
            }

            if (operations[i].equals("C")) {
                if (!s.isEmpty()) {
                    s.pop();
                }
            }

            if (operations[i].equals("D")) {
                if (!s.isEmpty()) {
                    int val = s.peek();
                    s.push(2 * val);
                }
            }

            if (operations[i].equals("+")) {
                if (s.size() >= 2) {
                    int val1 = s.peek();
                    int val2 = s.get(s.size() - 2);
                    s.push(val1 + val2);
                }
            }
        }

        int sum=0;
        while(!s.isEmpty()){
            sum += s.pop();
        }

        return sum;

    }
}