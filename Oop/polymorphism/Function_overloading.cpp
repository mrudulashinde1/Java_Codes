//function overloading
#include <iostream>
using namespace std;
class funover
{
  public:
  void func(int x)
  {
  	cout<<"\nvalue of x="<<x;
  }
  void func(double x)
  {
  	cout<<"\nthe value of x="<<x;
  }
  void func(int x,int y)
  {
  	cout<<"\nvalue of x="<<x<<"\nvalue of y="<<y;
  }
};
  
  int main()
  {
  	funover obj1;
  	obj1.func(86);
  	obj1.func(9.8845);
  	obj1.func(8,9);
  	return 0;
  	
  }

