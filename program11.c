// Write a java program to check whether a number is perfect or not.

#include<stdio.h>
typedef int BOOL;
#define TRUE 1
#define FALSE 0

BOOL CheckPerfect(int iNo)
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
        return TRUE;
    }
    else
    {
        return FALSE;
    }
}

int main()
{
    int iValue = 0;
    BOOL iRet = FALSE;

    printf("Enter a Number :");
    scanf("%d", &iValue);

    iRet = CheckPerfect(iValue);

    if(iRet == TRUE)
    {
        printf("Number is Perfect");
    }
    else
    {
        printf("Number is not perfect");
    }

    return 0;
}