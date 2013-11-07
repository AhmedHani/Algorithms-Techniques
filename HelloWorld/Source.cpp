//============================================================================
// File        : main.cpp
// Author      : AHMED HANI IBRAHIM
// Copyright   : AHani
// Version     : UVa - Accepted - 0.400
// Created on October 13, 2013, 09:34 PM
//============================================================================


#include <cstdlib>
#include <stdio.h>
#include <string.h>
#include <string>
#include <iostream>
#include <vector>
#include <algorithm>
#include <functional>
#include <queue>
#define Max 500000 + 5
#define MOD 1000000007
#define INF 1000000000
#define P pair<int, int>
#define LL long long
//#define INT_MAX 2147483647
#define FOR(i, N) for( int i = 0 ; i < N ; i++ )
#define FOR1e(i, N) for( int i = 1 ; i <= N ; i++ )
#define FORe(i, N) for(int i = 0 ; i <= N ; i++ )
#define FOR1(i, N) for(int i = 1 ; i < N ; i++ )

using namespace std;

//typedef struct All {
//    int First;
//    int Second;
//    int Third;
//}A;

//A Arr[Max];
pair<int, pair<int, int> > Arr[Max];

int Tree[Max];
int TestCases;
int NumberOfComp;

int rd(int idx) {
    int res = INF;
    while(idx) {
        res = min(res, Tree[idx]);
        idx -= (idx & -idx);
    }
    return res;
}

void updt(int idx, int val) {
    while(idx <= NumberOfComp) {
        Tree[idx] = min(Tree[idx], val);
        idx += (idx & -idx);
    }
}

int main(int argc, char** argv) {
    //freopen("Trojan.txt", "r", stdin);
	scanf("%d", &TestCases);
    while(TestCases-- > 0) {
        scanf("%d",  &NumberOfComp);
        FOR(i, NumberOfComp) scanf("%d %d %d", &Arr[i].first, &Arr[i].second.first , &Arr[i].second.second);
        
        sort(Arr, Arr + NumberOfComp);
        int Maxi = INF;
        FOR(i, NumberOfComp + 3) Tree[i] = Maxi;
        int Count = 0;
        FOR(i, NumberOfComp) {
			int Tmp = rd(Arr[i].second.first);
			if(Tmp > Arr[i].second.second) Count++;
			updt(Arr[i].second.first, Arr[i].second.second);
        }
        cout << Count << endl;
    }

    return 0;
}

