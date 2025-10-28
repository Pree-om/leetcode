class Solution {
public:
    bool isPowerOfTwo(int n) {
        for(int i=0;i<=30;i++){
            int ans = pow(2,i);
            if(ans==n) return true;
        }  // -2^32 -> 2^31-1, but here it's 0 -> 2^31-1
    return false;
    }
};
