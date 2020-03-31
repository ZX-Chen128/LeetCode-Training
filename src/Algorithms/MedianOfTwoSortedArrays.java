package Algorithms;

import java.util.Arrays;

/**
 *     public double findMedianSortedArrays(int[] nums1, int[] nums2) {
 *         int n = nums1.length+nums2.length;
 *         int[] list = new int[nums1.length+nums2.length];
 *         for(int i = 0 ; i < nums1.length ; i++){
 *             list[i] = nums1[i];
 *         }
 *         for(int j = 0 ; j < nums2.length ; j++){
 *             list[nums1.length + j] = nums2[j];
 *         }
 *         Arrays.sort(list);
 *         if(n%2!=0){
 *             return (double)list[(n-1)/2];
 *         }
 *         else {
 *             return (double)(list[n/2]+list[n/2-1]);
 *         }
 *     }
 */

public class MedianOfTwoSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2){
        int sum = nums1.length + nums2.length;
        if(sum % 2 == 0){
            return ((double)findKth(nums1, 0, nums2, 0,sum/2) + (double)findKth(nums1, 0, nums2, 0, sum / 2 + 1))/2;
        } return findKth(nums1, 0, nums2, 0, (sum + 1) / 2);
    }

    public int findKth(int[] nums1,int left1,int[] nums2,int left2,int k){
        if(left1 >= nums1.length) return nums2[left2 + k - 1];
        if(left2 >= nums2.length) return nums1[left1 + k - 1];
        if(k == 1) return Math.min(nums1[left1],nums2[left2]);
        int mid1 = left1 + k / 2 - 1 < nums1.length ? nums1[left1 + k / 2 - 1] : Integer.MIN_VALUE;
        int mid2 = left2 + k / 2 - 1 < nums2.length ? nums2[left2 + k / 2 - 1] : Integer.MIN_VALUE;
        if(mid1 <= mid2){
            return findKth(nums1, left1 + k / 2, nums2, left2, k - k / 2);
        }
        return findKth(nums1, left1, nums2, left2 + k / 2, k - k / 2);
    }

}

