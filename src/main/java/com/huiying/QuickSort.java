package com.huiying;

/**
 * 快速排序
 */
public class QuickSort {

    public static void main(){
        int[] array={47,29,71,99,78,19,24,47};
    }

    public static void sort(int array[],int low,int high){

        if(low<high){
            int k=partiton(array,low,high);//TODO
        }

    }

    public static int partiton(int array[],int low,int high){
        int point=array[0];
        while(low<high){
            if(low<high&&array[high]>=point){

            }
        }
        return 0;
    }
}
