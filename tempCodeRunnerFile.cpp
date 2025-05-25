#include <bits/stdc++.h>
using namespace std;

int searchelementinsortedarray(vector<int> & arr) {
    int s = 0 , e = arr.size() - 1;
    while(s<e) {
        int mid = s + (e-s)/2;
        if(mid % 3 == 1) mid -= 1;
        if(mid % 3 == 2) mid -= 2;
        if(mid + 2 < arr.size() && arr[mid] == arr[mid+1] && arr[mid] == arr[mid+2]) {
            s = mid + 3;
        }
        else e = mid;
    } 
    return arr[s];
}

int main() {
    vector<int> nums = {1,2,2,2,3,3,3,4,4,4};
    int ans = searchelementinsortedarray(nums);
    cout<<ans<<endl;
    return 0;

}