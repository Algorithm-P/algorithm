//baekjoon 1924
#include <iostream>

using namespace std;
//int main(int argc, char* argv[]) {}
int main(void) {
	const int day[12] = {31,28,31,30,31,30,31,31,30,31,30,31};
	const string day_of_week[7] = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
	int x,y,z;
	cin >> x;
	cin >> y;
	
	z = y;
	for(int i=1; i<x; i++){
		z += day[i-1];
	}
	cout << day_of_week[z%7];
	
	return 0;
}

