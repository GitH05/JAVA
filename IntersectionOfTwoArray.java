import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class IntersectionOfTwoArray {
    public static void main(String[] args) {
        IntersectionOfTwoArray intersection = new IntersectionOfTwoArray();

        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 4, 5, 6, 7, 8 };

        intersection.findIntersection(arr1, arr2);
        intersection.IntersectionWithoutDuplicate();
    }

    // method to find the intersection of two arrays - 1 | duplicate may exist
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
     * if there multiple number of same type then it will print all of them and
     * their would be duplicate like
     * 
     * int[] arr1 = {1, 2, 2, 3};
     * int[] arr2 = {2, 2, 4};
     * 
     * code would print 2 2 2 2, because each 2 in arr1 matches each 2 in arr2.
     */

    // Here method to find the intersection of two arrays - 2 | avoid duplicates
    public void IntersectionWithoutDuplicate() {
        int[] arr1 = { 1, 2, 3, 3, 5, 7, 7 };
        int[] arr2 = { 4, 2, 3, 3, 6, 7, 5 };

        Set<Integer> set1 = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            set1.add(arr1[i]);
        }

        Set<Integer> set2 = new LinkedHashSet<>(); // maintains insertion order
        for (int num : arr2) {
            if (set1.contains(num)) {
                set2.add(num);
            }
        }
        System.out.println("\nIntersection without duplicates: " + set2);
    }
}