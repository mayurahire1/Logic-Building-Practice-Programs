#include<stdio.h>
#include<stdbool.h>

bool isPrime(int iNo)
{
    int iCnt = 0;
    bool bFlag = true;

    if(iNo <= 1)
    {
        return false;
    }

    for(iCnt = 2; iCnt <= (iNo/2); iCnt++)
    {
        if(iNo % iCnt == 0)
        {
            bFlag = false;
            break;
        }
    }

    return bFlag;
}
int main()
{
    int iValue = 0;
    bool bRet = false;

    printf("Enter a number : ");
    scanf("%d", &iValue);

    bRet = isPrime(iValue);

    if(bRet == false)
    {
        printf("Number is Not Prime");
    }
    else
    {
        printf("Number is Prime");
    }

    return 0;
}