package java;

public class Main{
    public static void main(String args[]){ 
    int arr[]={001110};
    int count =0;
    int n= arr.length;
    for (int i=0;i<n;i++){
        if(arr[i]==1){
            count++;
        }
        if(count%2!=0){
          System.out.println("even\n");
        }
        else{
            System.out.println("odd\n");
        }
    }
    
}
        
    }

-------------------------------------------------------------

/* convert binary no as string to decimal no */
public class Main {
    public static void main(String[] args) {
        int binary = 1011;
        int decimal = 0, power = 0;

        while (binary > 0) {
            int digit = binary % 10;
            decimal += digit * Math.pow(2, power);
            binary /= 10;
            power++;
        }

        System.out.println(decimal);
    }
}
/* fibonacci series */
