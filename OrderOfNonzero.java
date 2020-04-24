package ds;

public class OrderOfNonzero {
        static void pushZerosToEnd(int arr[], int n){
                    int count = 0;  
                    for (int i = 0; i < n; i++)
                       if (arr[i] != 0)
                          arr[count++] = arr[i]; 
                   while (count < n)
arr[count++] = 0;
}

public static void main (String[] args) 
 { 
     int arr[] = {6,0,-3,0,0,4}; 
     int n = arr.length; 
     pushZerosToEnd(arr, n); 
     System.out.println("Array after pushing zeros to the back: "); 
     for (int i=0; i<n; i++) 
         System.out.print(arr[i]+" "); 
 } 
}




