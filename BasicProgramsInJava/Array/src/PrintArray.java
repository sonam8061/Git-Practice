import java.sql.SQLOutput;
import java.util.Scanner;

public class PrintArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.println("Elements of a given array are:");
        for (int i = 0 ;i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
class ArrayReverseOrder{


    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5};
        System.out.println("Array in reverse order:");
        for(int i = arr.length - 1;i>=0;i--)
        {
            System.out.println(arr[i]);
        }
    }
}
class ArrayEvenPosition{
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        System.out.println("Array present on even positions");
        for(int i = 1;i<= arr.length;i=i+2){
            System.out.println(arr[i]);
        }
        System.out.println("Array present on odd positions");
        for(int i = 0;i<= arr.length-1;i=i+2){
            System.out.println(arr[i]);
        }
    }
}
class ArrayLargestAndSmallest{
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6,7};
        int largest = arr[0];
        int smallest = arr[0];
        System.out.println("No. of elements present in an array:"+arr.length);
        for(int i=0;i<=arr.length-1;i++)
        {
            if(arr[i] >= largest){
                largest = arr[i];
            }
            if(arr[i] <= smallest)
            {
                smallest = arr[i];
            }
        }
        System.out.println("The largest element is:"+largest);
        System.out.println("The smallest element is:"+smallest);
    }
}

class ArraySum{
    public static void main(String[] args) {
        int arr[] = {23,4,5,6,7};
        int sum = 0;
        for(int i = 0; i<=arr.length-1;i++)
        {
            sum += arr[i];
        }
        System.out.println("Sum of all the elements in an array is"+sum);
    }
}

class RotatingRightArray{
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int n = 3;
        System.out.println("Printing the original array:");
        for(int i =0;i<=arr.length-1;i++)
        {
            System.out.print(arr[i]+" ");
        }


        for(int i =0;i<n ;i++)
        {
            int j, last;
            last =arr[arr.length-1];

            for(j = arr.length-1; j>0;j--)
            {
                arr[j]= arr[j-1];
            }
           arr[0] = last;
        }
        System.out.println();
        System.out.println("Printing the rotated array:");
        for(int i = 0;i <= arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

class SortAscendingArray{
    public static void main(String[] args) {
        int arr[] = {5,3,4,1,2};
        int temp;
        System.out.println("Printing the original array");

        for(int i = 0 ;i<= arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();
        for(int i =0 ; i<= arr.length-1;i++)
        {
            for(int j =i+1;j<=arr.length-1;j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Printing the sorted array in ascending order");
        for(int  i =0 ;i<= arr.length-1;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}

class SortDescending{
    public static void main(String[] args) {
        int arr[] = {5,4,3,1,2};
        int temp;

        System.out.println("Printing the original array");
        for(int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }

        for(int i =0 ;i < arr.length-1;i++){
            for(int j=i+1;j<= arr.length-1;j++){
              if(arr[i]<arr[j]){
                  temp = arr[i];
                  arr[i] = arr[j];
                  arr[j] = temp;
              }
            }
        }
        System.out.println();
        System.out.println("Printing the sorted array in descending order");
        for(int i=0 ; i<=arr.length-1 ;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
class ThirdLargest{                                               //you can find largest, second largest with the same method
    public  static void thirdLargest(int arr[],int total){
        int temp;
        for(int i=0;i<=total-1;i++)
        {
            for(int j=i+1;j<=total-1;j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Third largest element of an array is:"+arr[total-3]);
        System.out.println("Second largest element of an array is:"+arr[total-2]);
    }

    public static void main(String[] args) {
        int a[]={2,5,4,6,7,8};
        thirdLargest(a,6);
    }
}

class RemoveDuplicates{

    public static int RemoveDuplicate(int arr[], int n)
    {
        if(n==0 || n==1)
            return n;
        int[] temp = new int[n];
        int j=0;
        for(int i = 0;i<n-1;i++)
        {
            if(arr[i]!= arr[i+1])
            {
                temp[j] = arr[i];
                j++;
            }
        }
        temp[j] = arr[n-1];

        for( int i=0 ; i<=j-1;i++)
        {
            arr[i] = temp[j];
        }
        return j;
    }

    public static void main(String[] args) {

        System.out.println("Enter the size of an array");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter the elements of an array");
        for(int i=0;i<size;i++) {
            arr[i]=scanner.nextInt();
        }
       int length = RemoveDuplicate(arr,size);

        System.out.println("Printing the array after removing duplicates");
        for(int i=0;i<=length-1;i++)
        {
            System.out.print(arr[i]+ " ");
        }

    }

}

class CopyElementsOfArray{

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int length = arr.length;
        int arr1[] = new int[length];

        for(int i=0; i<length ;i++)
        {
            arr1[i] = arr[i];
        }
        System.out.println("Printing new array");
        for(int i=0;i<length;i++){
            System.out.println(arr1[i]);
        }
    }

}