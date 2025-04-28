#include <bits/stdc++.h>
using namespace std;

vector<int> searchRange(vector<int> &arr, int x)
{
    int n = arr.size();
    int ans = -1;  // First occurrence
    int ans1 = -1; // Last occurrence
    int s = 0;
    int e = n - 1;

    // Find the first occurrence
    while (s <= e)
    {
        int mid = s + (e - s) / 2;
        if (arr[mid] == x)
        {
            ans = mid;   // Update first occurrence
            e = mid - 1; // Continue searching in the left half
        }
        else if (arr[mid] < x)
        {
            s = mid + 1;
        }
        else
        {
            e = mid - 1;
        }
    }

    s = 0;
    e = n - 1;

    // Find the last occurrence
    while (s <= e)
    {
        int mid = s + (e - s) / 2;
        if (arr[mid] == x)
        {
            ans1 = mid;  // Update last occurrence
            s = mid + 1; // Continue searching in the right half
        }
        else if (arr[mid] < x)
        {
            s = mid + 1;
        }
        else
        {
            e = mid - 1;
        }
    }

    return {ans, ans1};
}
int searchInsert(vector<int> &arr, int x)  {
    int s =0;
    int e = arr.size();
    int ans = arr.size();
    while(s<=e){
      int mid = s+(e-s)/2;
       if(arr[mid] >= x){
        ans = mid;
        e = mid - 1; // Search in the left half
       }else{
        s = mid + 1; // Search in the right half
       }
      
    }
      return ans;
  }
int main()
{
    // vector<int> arr = {5, 7, 7, 8, 8, 10};
    // int target = 8;
    // vector<int> result = searchRange(arr, target);
    // cout << "First and last position of target: " << result[0] << ", " << result[1] << endl;
    vector<int> arr = {1, 3, 5, 6};
    int target = 2;
    int result = searchInsert(arr, target);
    cout << "Insert position: " << result << endl;
    return 0;
}