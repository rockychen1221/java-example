package com.littlefox.binary;

/**
 * 二分搜索
 */
public class BinarySearch {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7,8,9};
        System.out.println(binary(array,0,array.length,5));
    }

    private static int binary(int [] data , int left ,int right ,int key) {
        // 获取中间位置， 一分为二
        int middle = (left + right) / 2;
        // 比较是否相等，相等返回当前位置，否则根据key的大小重新确立新的查找空间
        if (data[middle] == key) {
            return middle;
        }else if (data[middle] > key) {
            return binary(data , left, middle-1 ,key);
        }else {
            return binary(data , middle+1, right ,key);
        }
    }
}
