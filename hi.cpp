#include <bits/stdc++.h>
using namespace std;
vector<int> getFloorAndCeil(vector<int> arr, int x) {
    int s = 0;
    int e = arr.size()-1;
    vector<int> ans;
    int f=-1;
    int c=-1;


     while (s <= e) {
        int mid = s + (e - s) / 2;
        if (arr[mid] <= x  ) {
            f = arr[mid];
            s = mid +1;
        } else {
            e = mid - 1;
        }
    }
    s = 0;
    e = arr.size()-1;
     while (s <= e) {
        int mid = s + (e - s) / 2;
        if (arr[mid] >= x) {
            
            c = arr[mid];
            e = mid - 1;
        } else {
            s = mid +1;
        }
    }
    return {f,c};
}
int main() {
  vector<int> arr = {1, 2, 8, 10, 10, 12, 19};
  int x = 5;
    vector<int> result = getFloorAndCeil(arr, x);
    cout << "Floor: " << result[0] << ", Ceil: " << result[1] << endl;

    return 0;
}

 