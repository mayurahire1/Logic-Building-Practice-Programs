// Write a java program to check whether a number prime or not.


#include <iostream>
using namespace std;

class NumberX
{
public:
    bool isPrime(int iNo)
    {
        int iCnt = 0;

        if (iNo <= 1)
        {
            return false;
        }

        for (iCnt = 2; iCnt <= (iNo/2); iCnt++)
        {
            if (iNo % iCnt == 0)
            {
                break;
            }
        }

        if (iCnt <= (iNo / 2))
        {
            return false;
        }
        else
        {
            return true;
        }
    }
};

int main()
{
    int iValue = 0;
    bool bRet = false;

    cout << "Enter a number : ";
    cin >> iValue;

    NumberX nobj;
    bRet = nobj.isPrime(iValue);

    if(bRet == true)
    {
        cout << "Number is Prime\n";
    }
    else
    {
        cout << "Number is not Prime\n";
    }

    return 0;
}