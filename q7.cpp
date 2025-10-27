class Solution {
public:
    int reverse(int x) {
        int d=0;
        while(x!=0){
            int r=x%10;
            if(d>INT_MAX/10 || d<INT_MIN/10) return 0;
            d=d*10+r;
            x=x/10;
        }
        return d;
    }
};
