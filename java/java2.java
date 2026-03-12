package java;

public class main{
    public static void main(String args[]){
        int a[]={1,2,3,1,1,1,1,4,2,3};
        int left=0;
        int right =0;
        int n = a.length;
        int lenmax =0;
        int sum =0;
        int target =3;
        while (right <n){
             sum +=a[right];
            while (left<=right && sum>target){
                 sum -=a[left];
                left++;
            }
            lenmax=Math.max(lenmax,right-left +1);
            right++;
        }
            System.out.println(lenmax);
            }
        }
/*
 * time complexity O(n)
 * space complexity O(1)
 */
-------------------------------------------------------------------------------------------------------

/* two sum problem */
public class main {
    public static void main(String args[]){
        int a[]={2,5,6,8,11};

        int n = a.length;
        int left=0;
        int right = n-1;
        int target=14;
        while (left<right ){
            int sum=a[left]+a[right];
            if (sum==target){
                System.out.println("[" + left + "," + right + "]");
                return ;
                 } else if(sum<target){
                    left++;
                 }
                    else{
                      right--;
                }
            
               System.out.println("");
            }
        }}
    /*
     * time complexity O(n)
     * space complexity O(1)
     */
    --------------------------------------------------------------

    /* dutch national flag algo */
int high=a.length -1;
    int low = 0;mid=0;while(mid<=high){
    if(mid==0)
    {
        swap(arr[low],arr[mid])/*swap codee */
        low++;
        mid++;
    }
        else if(mid==1)
        {
            mid++;

        }
        else{ 
            swap(arr[mid],arr[high])/*code here */
            high --;
        }

    }
    /*
     * time complexity = O(n)
     * space compleity=o(1)
     */
    -++-----------------------------------------------------------------------------
    /* mores voting algo */
int cnt =0;
    int el;for(
    int i = 0;i<n;i++)
    {
        if (cnt == 0) {
            cnt = 1;
            ;
            el = a[i];
        } else if (el == a[i]) {
            cnt++;
        } else {
            cnt--;

        }
        /* for check */
        if (cnt + 1 > n / 2) {
            if (el == a[i]) {
                System.out.println(el);
                return;
            }
        }
    }

    /*
     * time complexity O(n)
     * space complexity O(1)
     */
    -------------------------------------------------------------------------------------------------
    /* dp on stocks */
    mini=arr[0];profit=0;for(
    int i = 0;i<n;i++)
    {
        if (arr[i] < mini) {
            cost = arr[i] - mini;
            profit = Math.max(profit, cost);
            mini = Math.min(mini, arr[i]);
        }
        return profit;
}-----------------------------------------------------------------------------------------------------------
/* kadne algo */
