package DivideAndConquer;

public class MergeSort {
    public static void mergesort(int arr[],int si,int ei){
           if(si>=ei){
            return;
           }
        int mid = (si+(ei-si)/2);
        mergesort(arr,si,mid);       //dividing left part again & again
        mergesort(arr,mid+1,ei);       //dividing right part again & again

         merge(arr,si,mid,ei);
        
    }

    //uppar ke func mei tukde tukde hogye, ab compare karke merge karte jana hai 
    public static void  merge(int arr[],int si,int mid ,int ei) {

            int temp[] = new int[ei-si+1];    //size of array given by user
            int i = si; //iterator for left side
            int j = mid+1;  //iterator for right side
            int k = 0;   //iterator for temp array

            while(i<=mid && j<=ei){    // i se lekar mid tak.....j se lekar end index tak

                if(arr[i] < arr[j]){     // jiski value kam hai usku 
                    temp[k] = arr[i];     //temp mei daal do 
                    i++; k++; 
                }
                else{
                    temp[k] = arr[j];    //arr[j] ki value temp mei daal do 
                    j++; k++;            
                }
            }
             
            //left
           while(i<=mid){          //agar rightarray khatam hogya comparisons karte karte then directly left array daaldo
              temp[k] = arr[i];
               i++;k++;
            }
        
            //right
            while(j<=ei){          //agar leftarray khatam hogya comparisons karte karte then directly right array daaldo
             temp[k] = arr[j];
             j++;k++;
            }

            //copy temp[] to original arr[]
            for(k=0,i=si; k<temp.length; i++, k++){
                arr[i] = temp[k];
            }
    }


    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String args[]){
        int arr[] = {6,3,9,5,2,8};
        mergesort(arr,0,arr.length-1);
        printArr(arr);
    }
    
}
