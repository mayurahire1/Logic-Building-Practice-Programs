// Write a java progarm to count the digits of a number.

#include<stdio.h>

int CountDigits(int iNo)
{
    int iCount = 0;

    while(iNo != 0)
    {
        iCount++;
        iNo = iNo / 10;
    }

    return iCount;
}

int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter a number : ");
    scanf("%d", &iValue);

    iRet = CountDigits(iValue);

    printf("Number of digits in the number is : %d ", iRet);

    return 0;
}