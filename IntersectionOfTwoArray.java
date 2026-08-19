public class IntersectionOfTwoArray {
    public static void main(String[] args) {
        IntersectionOfTwoArray intersection = new IntersectionOfTwoArray();

        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 4, 5, 6, 7, 8 };

        intersection.findIntersection(arr1, arr2);
    }

    // method to find the intersection of two arrays - 1
    public void findIntersection(int[] arr1, int[] arr2) {
        System.out.print("Intersection: ");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                }
            }
        }
    }
    /*
     if there multiple number of same type then it will print all of them and
     their would be duplicate like 
     
     int[] arr1 = {1, 2, 2, 3};
     int[] arr2 = {2, 2, 4};
     
     code would print 2 2 2 2, because each 2 in arr1 matches each 2 in arr2.
     */



     // Here method to find the intersection of two arrays - 2 | avoid duplicates

}
