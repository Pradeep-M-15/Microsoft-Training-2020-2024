class Solution {
     public int countStudents(int[] students, int[] sandwiches) {
        int n = students.length;
        
        int countOne = 0;
        int countZero = 0;
        
        for (int item : students) {
            if (item == 1) {
                countOne++;
            } else {
                countZero++;
            }
        }
        
        for (int sandwich : sandwiches) {
            if (sandwich == 1 && countOne > 0) {
                countOne--;
            } else if (sandwich == 0 && countZero > 0) {
                countZero--;
            } else {
                return countOne + countZero;
            }
        }

        return 0;
    }
}
