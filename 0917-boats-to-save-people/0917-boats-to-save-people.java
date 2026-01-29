class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int l = 0;
        int r = people.length-1;
        int boats = 0;

        if(people[r]==limit) {
            boats++ ;
            r--;
        }
        while(l<=r){
            if((people[l]+people[r])<=limit){
                r--;
                l++;
            }
            else{
                r--;
            }
            boats++;
        }
        return boats;

    }
}