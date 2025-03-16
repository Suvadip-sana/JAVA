public class arrayFrequesncy {

    public static void fequency(int arr[], int n){
        boolean visited[] = new boolean[n];
        
        for(int i = 0; i < n; i++){
            if(visited[i] == true)
                continue;
            
            int count = 1;
            visited[i] = true;

            for(int j = i + 1; j < n; j++){
                if(arr[i] == arr[j]){
                    visited[j] = true;
                    count++;
                }
            }

            System.out.println("The frequency: " + arr[i] + " " + count);
        }
    }

    public static void main(String[] args) {
        int arr[] = {10,5,10,15,10,5, 2};
        int n = arr.length;

        fequency(arr, n);
    }
    
}
