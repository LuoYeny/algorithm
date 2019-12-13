package com.ch1.sort;

import static java.lang.Math.min;

/**
 * @author 罗叶妮
 * @version 1.0
 * @date 2019/12/10 10:56
 */
public class MergeSort {
    public static void sort(int[] arry ,int right ,int mid , int left){
        int [] tmp=new int[arry.length] ;
        int p1=right;
        int p2 = mid+1;
        int k =left;

        while(p1<=mid&&p2<=right){
            if(arry[p1]<arry[p2]){
                tmp[k++]=arry[p1++];

            }else {
                tmp[k++]=arry[p2++];
            }
            while (p1<=mid){tmp[k++]=arry[p1++];}
            while (p2<=right){tmp[k++]=arry[p2++];}
        }
        for (int i = 0; i <arry.length ; i++) {
            arry[i++]=tmp[i++];
        }
    }

    public static int[] merge(int[] arry,int start ,int end){
       if(start<end){ //递归边界  子序列中只有一个元素
           int mid = (start+end)/2;
           merge(arry,start,mid);
           merge(arry,mid+1,end);
           sort(arry,start,mid,end);

       }

        return arry;
    }
    
    public static  int[] merge1 (int[] arry  ,int n){
        for (int sz = 0; sz < n; sz+=sz) { //呈倍数递增
            for (int i = 0; i +sz<n ; i+=sz+sz) {
                sort(arry,i, i+sz-1,min(i+sz+sz-1,n-1));//min函数防止越界
            }
        }
        
        return arry;
    }
}
