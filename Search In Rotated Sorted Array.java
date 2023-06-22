public class Solution {
    public static int search(int arr[], int key) {
        // Write your code here.
          int si =0;

       int ei =arr.length-1;

       int mid;

       while(si <=ei){

           mid=(si+ei)/2;

           if(arr[mid]==key){

               return mid;

           }

           if(arr[mid] >= arr[si]){

               if(arr[si]<= key && arr[mid] >key){

                   ei=mid-1;

               }else{

                   si =mid+1;

               }

           }else{

               if(arr[mid] < key && arr[ei]>=key){

                   si = mid+1;

               }else{

                   ei =mid-1;

               }

           }

       }

       return -1;
    }
}
