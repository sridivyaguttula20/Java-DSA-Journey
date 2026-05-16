import java.util.*;
public class Arrays {
    static void main() {

//        int arr[] = new int[5];
//        Scanner sc = new Scanner(System.in);
//        int n = arr.length;
//        //input
//        for(int i=0;i<=n-1;i++){
//            System.out.println("Provide input for index " + i);
//            arr[i]=sc.nextInt();
//        }
//        //print
//        System.out.println("Your array contains:");
//        for(int val:arr){
//            System.out.println(val);
//        }

//        //declaration
//        int arr[];
//        //allocation
//        arr = new int[9];
//        //intialization
//        int brr[] = {10,20,30};
//        //length of an array
//        int n = brr.length;
//        //for each loop
//        for(int value:brr){
//            System.out.println(value);
//        }

//       // for(int index=0;index<=n-1;index++){
//            System.out.println(brr[index]);
//        }

//        System.out.println("Value at 0 index " + brr[0]);
//        System.out.println("Value at 1 index " + brr[1]);
//        System.out.println("Value at 2 index " + brr[2]);

        //sum of elements in an array
//        int arr[] = {10,20,20,22,28};
//        int sum=0;
//        int n = arr.length;
//        for(int i = 0;i<=n-1;i++){
//            int value = arr[i];
//            sum = sum + value;
//        }
//        System.out.println("The sum of elements: " + sum);
        //Multiply of elements
//        int arr[] = {2,3,10,10};
//        int ans = 1;
//        int n = arr.length;
//        for(int i = 0;i<=n-1;i++){
//            int value = arr[i];
//            ans = ans * value;
//        }
//        //print
//        System.out.println("Multiply of elements: " + ans);

        //maximum element in an array
//        int arr[] = {3,2,-5,21,10};
//        int maxVal = arr[0];
//        int n = arr.length;
//        //compare maxVal in an array with each element
//        for(int i = 0;i<=n-1;i++){
//            if(arr[i] > maxVal){
//                //update maxValue
//                maxVal = arr[i];
//            }
//        }
//        System.out.println("Maximum value: " + maxVal);

        //Minimum element in an array
        int arr[] = {3,2,-5,21,10};
        int n = arr.length;
        int minVal = arr[0];
        for(int i = 0;i<=n-1;i++){
            if(arr[i]<minVal){
                //update minVal
                minVal =  arr[i];
            }
        }
        System.out.println("Minimum element: " + minVal);



    }
}
