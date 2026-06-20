#include<iostream>

class NumberX
{
    public:
        bool isPrime(int iNo)
        {
            int iCnt = 0;
            bool bFlag = true;

            if(iNo <= 1)
            {
                return false;
            }

            for(iCnt = 2; iCnt <= (iNo / 2); iCnt++)
            {
                if(iNo % iCnt == 0)
                {
                    bFlag = false;
                }
            }

            return bFlag;
        }
};

int main()
{
    int iValue = 0;
    bool bRet = false;

    std::cout << "Enter a number : ";
    std::cin >> iValue;

    NumberX nobj;

    bRet = nobj.isPrime(iValue);

    if(bRet == true)
    {
        std::cout << "Number is Prime";
    }
    else
    {
        std::cout << "Number is not prime";
    }

    return 0;
}