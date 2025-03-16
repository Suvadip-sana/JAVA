public class arrayElementAvg {

    public static void average(int arr[], int n){
        double sum = 0;

        for(int i = 0; i < n; i++){
            sum += (double)arr[i];
        }

        double average = sum/n;

        System.out.println("The average is: " + average);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,1,1,5,1};
        // int arr[] = {1,2,3,4,5};
        int n = arr.length;
        average(arr, n);
    }
    
}
