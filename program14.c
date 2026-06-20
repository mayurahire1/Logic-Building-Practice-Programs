// Write a java program to check whether a number prime or not.


#include <stdio.h>
typedef int BOOL;
#define TRUE 1
#define FALSE 0

BOOL CheckPrime(int iNo)
{
    int iCnt = 0;

    if (iNo <= 1)
    {
        return FALSE;
    }

    for (iCnt = 2; iCnt <= (iNo / 2); iCnt++)
    {
        if (iNo % iCnt == 0)
        {
            break;
        }
    }

    if (iCnt <= (iNo / 2))
    {
        return FALSE;
    }
    else
    {
        return TRUE;
    }
}

int main()
{
    int iValue = 0;
    BOOL bRet = FALSE;

    printf("Enter a number: ");
    scanf("%d", &iValue);

    bRet = CheckPrime(iValue);

    if (bRet == TRUE)
    {
        printf("Number is Prime");
    }
    else
    {
        printf("Number is not Prime");
    }

    return 0;
}