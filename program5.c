// Write a C program to find the factors of the given number.

#include <stdio.h>

void findFactors(int iNo)
{
    int iCnt = 0;

    for(iCnt = 1; iCnt < iNo; iCnt++)
    {
        if(iNo % iCnt == 0)
        {
            printf("%d\n",iCnt);
        }
    }
}

int main()
{
    int iValue = 0;

    printf("Enter a number: ");
    scanf("%d", &iValue);

    findFactors(iValue);

}