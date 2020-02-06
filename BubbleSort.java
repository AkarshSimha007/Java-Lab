import java.util.Scanner;

public class BubbleSort {

    void Bs(int arr[],int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++) {
                if (arr[j] > arr[j+ 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,i;
        System.out.println("Enter the size of the array");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter "+ n +" elements of the array");
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        BubbleSort ob=new BubbleSort();
        ob.Bs(arr,n);
     System.out.println("The array is sorted");
        for(i=0;i<n;i++){
            System.out.print(arr[i]+"\t");
        }
    }
}
