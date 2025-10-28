class Solution {
    public boolean isPowerOfTwo(int n) {
        for(int i=0;i<=30;i++){
            double an=Math.pow(2,i);
            if(an==(double)n) return true;
        }
        return false;
    }
}
