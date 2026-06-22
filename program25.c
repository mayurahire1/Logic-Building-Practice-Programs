// Write a C program to display digits of a number.


#include<stdio.h>

void Display(int iNo)
{
    int iDigit = 0;

    while(iNo != 0)
    {
        iDigit = iNo % 10;
        printf("%d\n", iDigit);
        iNo = iNo / 10;
    }
}

int main()
{
    int iValue = 0;
    
    printf("Enter a number : ");
    scanf("%d", &iValue);

    Display(iValue);

    return 0;
}