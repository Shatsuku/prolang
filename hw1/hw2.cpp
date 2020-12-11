#include <iostream>
using namespace std;

int f(int i){
    int *x = new int[1024*500];
    if(x == NULL){
        return 0;
    }
    // int a;
    // a = sizeof(x);
    // int a2 = sizeof(f);
    // cout<<"size of f = "<<a2<<endl;
    // cout<<"size of *x = "<<a<<endl;
    cout<<"i = "<<i<<endl;
    f(i+1);
}

int main(){
    f(0);
    return 0;
}