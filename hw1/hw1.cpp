#include <iostream>
using namespace std;

void f(int i){
    int x[1024*2];
    // int size=sizeof(x);
    // cout<<"sizeof x = "<<size<<endl;
    cout<<"i = "<<i<<endl;
    f(i+1);
}

int main(){
    f(0);
    return 0;
}