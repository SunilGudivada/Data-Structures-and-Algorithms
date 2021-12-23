// https://leetcode.com/problems/median-of-two-sorted-arrays

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;

        int[] res = new int[n1 + n2];

        int i = 0, j = 0;

        while (i < n1 && j < n2) {
            res[i + j] = (nums1[i] < nums2[j]) ? nums1[i++] : nums2[j++];
        }

        while (i < n1) {
            res[i + j] = nums1[i++];
        }

        while (j < n2) {
            res[i + j] = nums2[j++];
        }

        int n = n1 + n2;

        if ((n & 1) == 0) {
            return (double) (res[n / 2] + res[(n - 1) / 2]) / 2;
        } else {
            return (double) res[n / 2];
        }
    }
}