package DivideAndConquer;

public class SortedRotatedArray {
    public static int rotatedArray(int arr[],int target){
        int low = 0;
        int high = arr.length-1;
        while(low<=high){

          int mid = (low+high)/2;
          if(target == arr[mid]){
              return mid;
            }

            //check if left half is sorted
            if(arr[low] <= arr[mid]){
                //check if element is in the left half
                if(target>=arr[low] && target<=arr[mid]){
                    high = mid-1;        //eliminate right
                }
                low = mid+1;        //eliminate left
            }

            //thus right half is sorted
            else{
                //check if element is in the right half
                if(target>=arr[mid] && target<=arr[high]){
                    low = mid+1;      //eliminate left
                }
                high = mid-1;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        int arr[] = {4,5,6,7,0,1,2};
        int target = 1;
        System.out.print(rotatedArray(arr,target) + " index");
    }
    
}
