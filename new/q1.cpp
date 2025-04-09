#include<bits/stdc++.h>
using namespace std;


int remove(vector<int> &arr){
    int n = arr.size();
    int i =0;
    for(int j = 1;j<n;j++){
        if(arr[i] != arr[j]){
            i++;
            arr[i] = arr[j];
        }
    }
return i+1;
}
int main(){
    vector<int> arr = { 1,1,2,2,2,3,4,4,5}  ;
    int n = arr.size();
    int k = remove(arr);
    cout<<"the number of unique elements is : "<<k<<endl;
    cout<<"the array after removing duplicates is : ";
    for(int i =0;i<n;i++){
        cout<<arr[i]<<" ";           
    }
  
  
 
 return 0;
}