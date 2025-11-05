class Solution {
public:
    long long int bs(int x){
        long long int s=0;
        long long int e=x;
        long long int ans=-1;
        while(s<=e){
            long long int m = s+(e-s)/2;
            long long int square=m*m;
            if(square==x) return m;
            else if(square<x){
                ans=m;
                s=m+1;
            }else{
                e=m-1;
            }
        }
        return ans;
    }
    int mySqrt(int x) {
        return (bs(x));
    }
};
