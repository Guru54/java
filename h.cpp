#include<bits/stdc++.h>
using namespace std;


bool ispos(vector<int> &arr, int k , int d){
    int pages = arr[0];
    int st = 1;
    for(int i = 1; i<arr.size();i++){
        if(pages + arr[i] <=d){
              pages+=arr[i];
        }else{
            
            st++;
            pages=arr[i];
        }
    }
    return st<=k;

}
int findPages(vector<int> &arr, int k)  {
    int n = arr.size();
    int s = *max_element(arr.begin(),arr.end());
    int e = accumulate(arr.begin(),arr.end(),0);
    int ans = 0;
    while(s<=e){
        int mid = s+(e-s)/2;
        if(ispos(arr,k,mid)){
          ans = mid;
            e=mid-1;
        }else {
         s= mid+1;
        }
    }
    return ans; 
        
}
int main(){
         vector<int> arr = {12, 34, 67, 90};  
         int k = 2;
         cout<<" the minimum pages is : "<<findPages(arr,k);
        cout<<(7%4);
 return 0;
}