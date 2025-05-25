#include<bits/stdc++.h>
using namespace std;

string reverseWords(string s) {
    vector<string> st;

    for(int i =0;i<s.length();i++){
        while(s[i]!=' '){
        string temp = "";
        temp+=s[i];
        st.push_back(temp);
        i++;
       }

    }
    cout<<st.size();
    for(int i = 0;i<st.size();i++){
        cout<<st[i]<<" ";
    }
    cout<<endl;
}
int main(){
  string s = "the sky is blue ";
   reverseWords(s);
 return 0;
}