#include <iostream>
using namespace std;

class Point{
    int i;
    public:
        Point(int a=5){
            i=a;
        }
        int  getI(){
            return i;
        }
        Point f2(Point &a){
            a.i=50;
            return a.getI();
}
};

int f(Point &a){
    int x= a.getI() + 50;
    return  x;
}


int main(){
    Point A,B;
    
    Point C(B.f2(A));
    cout<<C.getI()<<endl;


    // B.f2(A);
    // cout<<B.getI()<<endl;

    return 0;
}