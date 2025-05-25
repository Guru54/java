#include <bits/stdc++.h>
using namespace std;
vector<int> getFloorAndCeil(vector<int> arr, int x)
{
    int s = 0;
    int e = arr.size() - 1;
    vector<int> ans;
    int f = -1;
    int c = -1;

    while (s <= e)
    {
        int mid = s + (e - s) / 2;
        if (arr[mid] <= x)
        {
            f = arr[mid];
            s = mid + 1;
        }
        else
        {
            e = mid - 1;
        }
    }
    s = 0;
    e = arr.size() - 1;
    while (s <= e)
    {
        int mid = s + (e - s) / 2;
        if (arr[mid] >= x)
        {

            c = arr[mid];
            e = mid - 1;
        }
        else
        {
            s = mid + 1;
        }
    }
    return {f, c};
}
int singe(vector<int> &arr)
{
    int s = 2;
    int e = arr.size() - 3;

    while (s < e)
    {
        int mid = s + (e - s) / 2;
        
        if (mid % 3 == 2)
        {
            if (arr[mid] == arr[mid - 1] && arr[mid - 1] == arr[mid - 2])
                s = mid+1;
                else
                e = mid - 1;
        }
        if (mid % 3 == 1)
        {
            if (arr[mid] == arr[mid - 1] && arr[mid] == arr[mid + 1])
                s=mid+ 2;
                else
                e = mid - 2;
        }
        if (mid % 3 == 0)
        {
            if (arr[mid] == arr[mid + 1] && arr[mid + 1] == arr[mid + 2])
                s = mid + 3;
                else 
                e = mid - 1;

        }

        
        
        
    }
    return arr[s];
}
int main()
{
    vector<int> arr = {1, 1, 1, 2, 2, 2, 3, 4, 4, 4, 5, 5, 5};
    cout << "single element is " << singe(arr);
    // cout << "Floor: " << result[0] << ", Ceil: " << result[1] << endl;

    return 0;
}
