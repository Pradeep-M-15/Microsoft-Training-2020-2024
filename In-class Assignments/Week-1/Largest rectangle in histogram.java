class Solution {
    public int largestRectangleArea(int[] arr) {
        int n = arr.length;
        int[] r = new int[n];
        Stack <Integer> st = new Stack<>();
        st.push(arr.length - 1);
        r[arr.length - 1] = arr.length;
        for (int i = arr.length - 2; i >= 0; i--) {
            while (st.size() > 0 && arr[i] <= arr[st.peek()]) {
                st.pop();
            }
            if (st.size() == 0) {
                r[i] = arr.length;
            } else {
                r[i] = st.peek();
            }
            st.push(i);
        }

        int[] l = new int[n]; 
        st = new Stack<>();
        st.push(0);
        l[0] = -1;
        for (int i = 1; i < arr.length; i++) {
            while (st.size() > 0 && arr[i] <= arr[st.peek()]) {
                st.pop();
            }
            if (st.size() == 0) {
                l[i] = -1;
            } else {
                l[i] = st.peek();
            }
            st.push(i);
        }
        int maxArea = 0;
        for (int i = 0; i < arr.length; i++) {
            int width = r[i] - l[i] - 1;
            int area = arr[i] * width;
            if (area > maxArea) {
                maxArea = area;
            }
        }
        return maxArea;
     }
}
