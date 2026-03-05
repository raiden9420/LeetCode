class Solution {
    public int minimumSum(int num) {
        String temp = Integer.toString(num);
        int[] arr = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++)
        {
            arr[i] = temp.charAt(i) - '0';
        }

        Arrays.sort(arr);
        
        int num1 = arr[0] * 10 + arr[2];
        int num2 = arr[1] * 10 + arr[3];

        return num1 + num2;
        

                                      
    }
}