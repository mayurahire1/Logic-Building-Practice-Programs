// Write a c++ program to count the digits of a number.

#include<iostream>

class DigitX
{
    public:
        int CountDigit(int iNo)
        {
            int iCount = 0;

            while(iNo != 0)
            {
                iCount++;
                iNo = iNo / 10;
            }

            return iCount;
        }
};

int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter a number : ");
    scanf("%d", &iValue);

    DigitX dobj;

    iRet = dobj.CountDigit(iValue);

    printf("The number of digits are : %d", iRet);

    return 0;
}