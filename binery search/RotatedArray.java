

public class RotatedArray {
    public static void main(String[] args)
    {
        int[] arr={4,5,6,7,8,0,1,2};
        int target=7;
        int ans = rotatedarray(arr,target);
        System.out.println(ans);
    }
    static int rotatedarray(int[] arr,int target)
    {
        int pivot = findpivot(arr);
        int start=0;
        int end=arr.length-1;
        if(pivot == -1)
        {
            return binerysearch(arr, target,start,arr.length-1);
        }
        if( arr[pivot] == target)
        {
            return pivot;
        }
        else if( arr[pivot] > arr[start])
        {
            return binerysearch(arr, target, start, pivot-1);
        }
        else{
            return binerysearch(arr, target, pivot+1, arr.length-1);
        }
    }
    static int findpivot(int[] arr)
    {
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
            int mid = (start+end)/2;
            if(mid<end && arr[mid] >= arr[mid+1])
            {
                return mid;
            }
            if(mid<end && arr[mid] <= arr[mid-1])
            {
                return mid-1;
            }
            if(arr[mid] > arr[start])
            {
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }
        return -1;
    }
    static int binerysearch(int[] arr,int target,int start,int end)
    {
        while(start<=end)
        {
            int mid = (start+end)/2;
            if(target>arr[mid])
            { 
                start=mid+1;

            }
            else if(target < arr[mid])
            {
                end=mid-1;
            } 
            else{
                return mid;
            }
        }
        return -1;
    }
}
