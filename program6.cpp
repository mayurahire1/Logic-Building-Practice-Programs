// Write a C++ program to find the factors of the given number.

#include<iostream>
using namespace std;

class NumberX
{
    public:
        void findFactors(int iNo)
        {
            int iCnt = 0;

            for(iCnt = 1; iCnt < iNo; iCnt++)
            {
                if(iNo % iCnt == 0)
                {
                    cout << iCnt  <<endl;
                }
            }
        }
};

int main()
{
    int iValue = 0;

    cout << "Enter a Number: ";
    cin >> iValue;

    NumberX nobj;

    nobj.findFactors(iValue);
    
    return 0;
}