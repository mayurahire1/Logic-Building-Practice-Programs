// Write a cpp program to check whether a number is perfect or not.

#include<iostream>
using namespace std;

class NumberX
{
    public:
        bool CheckPerfect(int iNo)
        {
            int iCnt = 0;
            int iSum = 0;

            for(iCnt = 1; iCnt <= (iNo / 2); iCnt++)
            {
                if(iNo % iCnt == 0)
                {
                    iSum = iSum + iCnt;
                }
            }
            if(iNo == iSum)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
};

int main()
{
    int iValue = 0;
    bool iRet = false;

    cout << "Enter Number :";
    cin >> iValue;

    NumberX nobj;

    iRet = nobj.CheckPerfect(iValue);

    if(iRet == true)
    {
        cout << "Number is Perfect";
    }
    else
    {
        cout << "Number is Not Perfect";
    }
    return 0;
}