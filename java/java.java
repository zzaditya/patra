package java;

class Solution {
    public int countDigit(int n) {
        int cnt =0;
         int rev=0;
         int a;
        while(n>0){
        int a=n%10;
        cnt =cnt+1;
         n=n/10;

         /*reverse*/
         rev = rev * 10 + a;

         /*palindrome*/
         if(n==rev){
            System.out.println("palindrome");
         }
         else{
            system.out.println("not a palindrome");
         }
         /*armstrong*/
         int sum=0;
         while(n>0){
            int i=n%10;
            sum=sum+i*i*i;
            n=n/10;
            if(n==sum){
                system.out.println("yes armstron number ");            }

         }
         else{
            system.out.println("not a armstrong number");
         }
    }
    system.out.println("cnt="+cnt);
    system.out.println("rev="+rev);
    return rev; 


    /* 1to n using recurssion */
    public static void main(string args[]){
      int n=5;
      for ( int i=0;i<n;i++){
        system.out.println(i);
      }
        public void(f,i){
         if(i==n){
            return;
            else{
               f(i+1);
               system.out.println(i);
            }
         }
        }
    }
}----------------------------------------------------------------------------------------------------------

class Test {
    static int n = 5;

    public static void main(String args[]) {

        for (int i = 0; i < n; i++) {
            System.out.println(i);
        
}

        f(0);
    }

    public static void f(int i) {
        if (i == n) {
            return;
        } else {
            f(i + 1);
            System.out.println(i);
        }
    }
}--------------------------------------------------------------------------------------------------------------

/* selection sort */
public class main {
public  static void main(String args[]){
    int a[]={10,20,30,40,50};
    int temp;
    int i;
    int j;
    for (i=0;i<a.length;i++){
        for (j=i+1;j<a.length;j++){


            if (a[i]>a[j]){
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
    }
    /* i<=a.length   nahi hoga kyoki array ke last index se start hota hai */

             
    System.out.println("after sorting");
    for(i=0;i<=a.length;i++){
     System.out.println(a[i]);
    }
}

} /* time complexity O(n^2) */
/* space complexity O(1) */
-------------------------------------------------

/* bubble sort */
public class main {
    public static void main(String args[]){
     int a[]={50,40,10,20,30,80};
    int n=a.length,i,j;
    for(i=n;i>0;i--){
        for(j=0;j<i-1;j++){
            if (a[j]>a[j+1]){
                int temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;   

            }
        }

    } 
                System.out.println("after sorting");
                for(i=0;i<a.length;i++){
                    System.out.println(a[i]);
                }
            }}}

    /* time complexity O(n^2) worst and average case */
    /* best case O(n) */ the array
    is already sorted
    /* space complexity O(1) */
    -------------------------------------------------------------

    /* insertion sort */
    public class Main {
    public static void main(String args[]) {

        int a[] = {50, 40, 10, 20, 30, 80};
        int n = a.length;

        for (int i = 1; i < n; i++) {
            int temp = a[i];
            int j = i - 1;

            while (j >= 0 && a[j] > temp) {
                a[j + 1] = a[j];
                j--;
            }

            a[j + 1] = temp;
        }

        System.out.println("After sorting:");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
    }
    /* worst case O(n^2) */
    /* best case O(n) */
    /* space complexity O(1) */
    --------------------------------------------------------------------------

    /* merge sort merge sort is a divide and conquer algorithm */
    public class main {
    public static void main(String[] args)
    {
    int a[]={10,50,30,90,60,70,80,20};
    int n =a.length;
    int mid =n/2;
    int left[] = new int[mid];
    int right[] = new int[n-mid];
    for(int i=0;i<mid;i++)
    {
        left[i]=a[i];
    }
    for(int i=mid;i<n;i++)
    {
        right[i-mid]=a[i];
    }
    mergeSort(left);
    mergeSort(right);
    merge(left,right,a);
    System.out.println("after sorting");
    for(int i=0;i<a.length;i++)
    {
        System.out.println(a[i]);
    }
    
}
        /* worst case O(nlogn) */
        /* best case O(nlogn) */
        /* space complexity O(n) */
        --------------------------------------------------------------------------------

        /* quick sort quick sort is a divide and conquer algorithm */
        public class main {
    public staic void main(STring[] args){
            int a[]={10,50,30,90,60,70,80,20};
            int n =a.length;
            int low =0;
            int high =n-1;
            quicksort(a,low,high);
            if(low<high);
            {
                int pi= partition(a,low,high);
                quicksort(a,low,pi-1);
                quicksort(a,pi+1,high);
            }
             System.out.println("After sorting");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

            public static void quicksort(int a[], int low, int high) {
                if (low < high) {
                    int pi = partition(a, low, high);
                    quicksort(a, low, pi - 1);
                    quicksort(a, pi + 1, high);
                }
            }

            public static int partition(int a[], int low, int high) {

                int pivot = a[high];
                int i = low - 1;

                for (int j = low; j < high; j++) {
                    if (a[j] < pivot) {
                        i++;
                        int temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                    }
                }
                int temp = a[i + 1];
                a[i + 1] = a[high];
                a[high] = temp;
                return i + 1;
            }
        }System.out.println("after sorting");for(

        int i = 0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
        /* worst case O(n^2) */
        /* best case O(nlogn) */
        /* space complexity O(logn) */
        ------------------------------------------------------------------------------------------

        /* largest value from array */
        public class main {
    public static void main(string[] args ){
        int a[]={48,5,81,17,8,2571,7,1};
        int max=a[0];
        int n =a.length;
        for(int i =1;i<n;i++){
            if(a[i]>max){
                max=a[i];
                }
            }
                System.out.println(max);
            }
        }
        /*
         * worst case O(n)
         * best case O(1)
         * space complexity O(1)
         */
        --------------------------------------------------------------------------------------

        /* second largest value from array */
        public class main {
    public static void main(String[] args){
        int a[] ={ 48,5,81,17,8 ,2571,1,7};
        int max=a[0];
        int secondmax=int min_value;
        int n = a.length;
        for(int i=0;i<n;i++);{
            if(a[i]>max){
                secondmax=max;
                max=a[i];
            }
            else if (a[i]> secondmax && a[i]<max){
                secondmax=a[i];
            }
        }
        System.out.println(max);
        System.out.println(secondmax);
    

    }
        }
        /*
         * public class main {
         * public static void main(String[] args) {
         * int a[] = {48, 5, 81, 17, 8, 2571, 1, 7};
         * int max = a[0];
         * int secondmax = Integer.MIN_VALUE; // safer initialization
         * int n = a.length;
         * 
         * for (int i = 0; i < n; i++) { // must be i < n, not i <= n
         * if (a[i] > max) {
         * secondmax = max;
         * max = a[i];
         * } else if (a[i] > secondmax && a[i] < max) {
         * secondmax = a[i];
         * }
         * }
         * 
         * System.out.println("Largest: " + max);
         * System.out.println("Second Largest: " + secondmax);
         * }
         * }
         */
        /*
         * worst case O(n)
         * best case O(1)
         * space complexity O(1)
         */
        ---------------------------------------------------------------------------------------------

        /* check sorted array */
        public class main {
    public static void main(String[] args ){
        int a[]={10,20,30,80,50,80,70};
        int n = a.length;
        for (int i=0;i<n-1;i++){
            if(a[i+1]<a[i]||a[i]==a[i+1])
            {
                System.out.println("array is not sorted");
                return;
            }
            else{
                System.out.println("array is sorted");
                return;

            }
        }
    }
        }
        /*
         * worst case O(n)
         * best case O(1)
         * space complexity O(1)
         */
        --------------------------------------------------------------------------------------------

        /* remove duplicate from array */
        public class main {
    public static void main(String[] args) {
        int a[] = {10, 20, 30, 80, 50, 80, 70};
        int n = a.length;
        int i, j, k;

        for (i = 0; i < n; i++) {
            for (j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
                    System.out.println("duplicate found: " + a[j]);
                    // shift elements left
                    for (k = j; k < n - 1; k++) {
                        a[k] = a[k + 1];
                    }
                    n--;   // reduce size
                    j--;   // recheck new element at position j
                }
            }
        }

        System.out.println("Array after removing duplicates:");
        for (i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
        }
        /*
         * worst case nlogn+n
         * best case O(n)
         * space complexity O(1)
         */
        --------------------------------------------------------------------------------------------

        /* LEFT ROTATE ARRAY */
        public class main {
    public static void main(String[] args){
        int a[]={10,20,30,40,50};
        int n = a.length;
        int temp = a[0];
        for(int i=1;i<n;i++){
            a[i-1]=a[i];
        }
        a[n-1]=temp;
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
    }
        }
        /*
         * worst case O(n)
         * best case O(1)
         * space complexity O(n)
         */
        /* additional space used by program = o(1) */
        ----------------------------------------------------------------------------------------------

        /* left rotate array by d places */
        public class main {
    public static void main(String[] args){
        int a[]={10,20,30,40,50};
        int n = a.length;
        for(int i=0;i<d;i++){
            int temp = a[i];
        }
        
        int d =3;
        for(int i=0;i<d;i++){
            a[i]=a[i-d];

        }
        a[n-d]=temp;
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
    }
        }
        /*
         * worst case O(n)
         * best case O(1)
         * space complexity O(n)
         */
        /* additional space used by program = o(1) */
        ----------------------------------------------------------------------------------------------

        /* move all zeroes to the left of array */
        public class main {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,0,7,0,8,0};
        int n = a.length;
        int i, j = 0;  
        for (i = 0; i < n; i++) {
            if (a[i] != 0) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                j++;
            }
        }
        System.out.println("Array after moving zeros to end:");
        for (i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
        }/*
          * worst case O(n)
          * best case O(1)
          * space complexity O(n)
          * additional space used by program = o(1)
          */
        --------------------------------------------------------------------------------------------

        /* missing number from array */
        public class main {
    public static void main(strings[] args){
        int a[]={1,2,3,4,5,6,7,8,9,10};
        int n =a.length;
        int sum=n*(n+1)/2;
        for(int i=0;i<n;i++){
            sum -=a[i];
        }
        System.out.println(sum);
    }
        }
        /*
         * worst case O(n)
         * best case O(1)
         * space complexity O(n)
         * additional space used by program = o(1)
         */
        --------------------------------------------------------------------------------------------

        /* number that appears only once in array */
        public class main {
    public static void main(String[] args){
        int a[]={1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2};
        int xor;
        for(int i=0;i<a.length;i++){
            xor=xor^a[i];
        }
        System.out.println(xor);
    }
        }
        /*
         * worst case O(n)
         * best case O(1)
         * space complexity O(n)
         * additional space used by program = o(1)
         */
        --------------------------------------------------------------------------------------------

        /* maximum number of 1's consecutive in array */
        public class main {
    public static void main(String[] args){
        int a[]={1,1,1,1,1,1,1,1,1,1,1,1,1,1,12,3,4,5,6};
        int n=a.length;
        int count=0;
        int max=0;
        for(int i=0;i<n;i++){
            if(a[i]==1){
                count++;
            }
            else{
                count=0;
            }
            max=Math.max(count,max);

        }
        System.out.println(max);
    }

}
/*
 * worst case O(n)
 * best case O(1)
 * space complexity O(n)
 * additional space used by program = o(1)
 */
