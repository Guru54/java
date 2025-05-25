#include<bits/stdc++.h>
using namespace std;
   
bool ispossible(vector<int> & arr, int h , int mid) {
    int totalhour = 0, piles = 0;
    for(int i = 0; i < arr.size(); i++) {
        totalhour += arr[i]/mid;
        int hours = arr[i] % mid;
        if(hours) totalhour++;
    }
    return totalhour <= h;
}

int minEatingSpeed(vector<int> & arr, int h) {
    int s = 1 , e = 0;
    for(auto i : arr) {
        // s = min(s,i);
        e = max(e,i);
    }
    while(s<=e) {
        int mid = s + (e-s)/2;
        if(ispossible(arr,h,mid)){
            e = mid - 1;
        }
        else {
            s = mid + 1;
        }
    }
    return s;
}

int main(){
  vector<int> arr =  {30,11,23,4,20};
  int h = 6;
 cout<< minEatingSpeed(arr,h);

 return 0;
}