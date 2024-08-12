// C++
#include <iostream>
#include <string>
using namespace std;
int main(){
	int x=99;
	string b=" bottles of beer",o=" on the wall",t="Take one down and pass it around, ",f="no more bottles of beer on the wall.";
	while(x>0){
		cout<<x<<(x==1 ? " bottle of beer":b)<<o<<", "<<x--<<(x==0 ? " bottle of beer":b)<<".\n"
			<<t<<(x>0 ? to_string(x)+(x==1 ? " bottle of beer":b):"no more"+b)<<o<<".\n\n";}
	cout<<"No more"<<b<<o<<", no more"<<b<<".\nGo to the store and buy some more, 99"<<b<<o<<".\n";
	return 0;}