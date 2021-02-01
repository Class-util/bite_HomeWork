package HomeWork_2021._2021_2;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:吴博
 * Date:2021 02 01
 * Time:17:52
 */
public class Test01 {
    public static void main(String[] args) {
        int i = compareVersion("1.0.1", "1");
        System.out.println(i);
    }
    public static int compareVersion(String version1, String version2) {
        String[] nums1 = version1.split("\\.");
        String[] nums2 = version2.split("\\.");
        int n1 = nums1.length, n2 = nums2.length;


        int i1, i2;
        for (int i = 0; i < Math.max(n1, n2); ++i) {
            i1 = i < n1 ? Integer.parseInt(nums1[i]) : 0;
            i2 = i < n2 ? Integer.parseInt(nums2[i]) : 0;
            if (i1 != i2) {
                return i1 > i2 ? 1 : -1;
            }
        }
        return 0;
    }
}
