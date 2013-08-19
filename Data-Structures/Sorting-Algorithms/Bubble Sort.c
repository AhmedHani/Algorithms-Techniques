//============================================================================
// File        : Bubble Sort.c
// Author      : AHMED HANI IBRAHIM
// Copyright   : AHani
// Version     : 
// Created on March 6, 2012, 9:19 PM
//============================================================================

#include <stdio.h>
 
int Arr[] = {2, 3, 1, 6, 2, 0, 0, 1};
 
void BubbleSort(int Length, bool (*func_ptr) (int, int)) {
 
    for(int i = 0; i < Length - 1; i++) {
        for(int j = 0; j < Length - i - 1; j++) {
            if(func_ptr(Arr[j], Arr[j + 1]) == true) {
                int Tmp = Arr[j];
                Arr[j] = Arr[j + 1];
                Arr[j + 1] = Tmp;
            }
        }
    }
}
 
inline bool Increasing(int First, int Second) {
    return First > Second;
}
 
inline bool Decreasing(int First, int Second) {
    return First < Second;
}
 
int main() {
    BubbleSort(8, Increasing);
    for(int i = 0; i < 8; i++) {
        printf("%d\n", Arr[i]);
    }
    puts("----");
    BubbleSort(8, Decreasing);
    for(int i = 0; i < 8; i++) {
        printf("%d\n", Arr[i]);
  }
 
 return 0;
}
