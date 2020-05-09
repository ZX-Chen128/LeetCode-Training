package Algorithms.BasicAlgorithms;

public class MergeSort {

    public static void merge(int[] a, int start, int mid, int end) {
        int[] temp = new int[a.length];
        int p1 = start, p2 = mid + 1, k = start;

        while (p1 <= mid && p2 <= end) {
            if (a[p1] < a[p2]) {
                temp[k++] = a[p1++];
            } else {
                temp[k++] = a[p2++];
            }
        }

        while (p1 <= mid) {
            temp[k++] = a[p1++];
        }
        while (p2 <= end) {
            temp[k++] = a[p2++];
        }

        for (int i = start; i <= end; i++) {
            a[i] = temp[i];
        }

    }

    public static void mergeSort(int[] a, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(a, start, mid);
            mergeSort(a, mid + 1, end);
            merge(a, start, mid, end);
        }
    }


    public static void main(String[] args) {
        int[] a = {49, 38, 65, 97, 76, 13, 27, 50};
        mergeSort(a, 0, a.length - 1);
        System.out.println("排好序的数组：");
        for (int e : a)
            System.out.print(e + " ");
    }
}

