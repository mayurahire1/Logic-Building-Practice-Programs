// Write a cpp program to find the sum of factors of a given number.

#include<iostream>
using namespace std;

class NumberX
{
    public:
        int SumFactors(int iNo)
        {
            int iCnt = 0;
            int iSum = 0;

            for(iCnt = 1; iCnt < iNo; iCnt++)
            {
                if(iNo % iCnt == 0)
                {
                    iSum = iSum + iCnt;
                }
            }
            return iSum;
        }
};

int main()
{
    int iValue = 0;
    int iRet = 0;

    cout << "Enter a number: ";
    cin >> iValue;

    NumberX nobj;
    
    iRet = nobj.SumFactors(iValue);

    cout << "Sum of factors is: " << iRet;

    return 0;
}