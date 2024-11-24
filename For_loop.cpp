#include <bits/stdc++.h>
using namespace std;

int main()
{
    string a[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    int x, y;
    cin >> x >> y;
    while (x++ <= y)
    {
        if ((x - 1) <= 9)
            cout << a[x - 1] << endl;
        else if ((x - 1) % 2 == 0)
            cout << "even" << endl;
        else
            cout << "odd" << endl;
    }
}