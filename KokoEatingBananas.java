class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=0,len=piles.length;
        for(int i=0;i<len;i++)
        {
            if(max<piles[i])
            max=piles[i];
        }
        int low=1,high=max,mid,ans=0;
        while(low<=high)
        {
            mid=(low+high)/2;
            int x=calhours(mid,piles);
            if(x<=h)
            {
                high=mid-1;
            ans=mid;
            }
            else
            low=mid+1;
        }
        return ans;
    }
        int calhours(int x,int piles[])
        {
            int l=piles.length,hours=0;
            for(int i=0;i<l;i++)
            {
                hours+=((Math.ceil((double)piles[i]/x)));
            }
            return hours;
        }
    }
