#include <iostream>
using namespace std;

int f(int i,int *y){
    delete y;
    if(i == 0) return 0;
    cout<<"i = "<<i<<endl;
    int *x = new int[1024*5000];
    f(i-1,x);
}

int main(){
    int i = 998;
    int *x = new int[1024*5000];
    f(i,x);
    return 0;
}