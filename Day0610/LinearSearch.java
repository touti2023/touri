package Day0610;
@SuppressWarnings({"all"})
class LinearSearch
{
    public static int linearSearch(int[] arr, int target)
    {
        for (int i=0 ; i<arr.length ; i++) {
            if (arr[i] == target) {
                System.out.println("Element is present at index _");
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[])
    {
        int arr[] = { 2, 3, 4, 10, 40 };
        int target = 10;
        linearSearch(arr, target);
    }
}

