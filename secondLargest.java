import java.util.Scanner;

public class secondLargest {

    public static int findLargest(int arr[]) {
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];

            }
        }
        int secondLargest =-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>secondLargest && arr[i]!=largest){
                secondLargest=arr[i];
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of element in array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        // int arr[] = {12,23,45,5,6};

        int largestNumber = findLargest(arr);
        System.out.println(" second Largest number is " + largestNumber);

        sc.close();
    }

}

