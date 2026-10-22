class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);

        int maxSalary = salary[salary.length - 1];
        int minSalary = salary[0];
        int totalSalary = 0;
        
        for (int i = 0; i < salary.length; i++) {
            totalSalary += salary[i];
        }

        return (double) (totalSalary - maxSalary - minSalary) / (salary.length - 2);
    }
}