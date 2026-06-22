// write a cpp program to display the digits of a number

#include<iostream>
using namespace std;

class DigitX
{
    public : 
        void Display(int iNo)
        {
            int iDigit = 0;

            while(iNo != 0)
            {
                iDigit = iNo % 10;
                cout << iDigit << endl;
                iNo = iNo / 10;
            }
        }
};

int main()
{
    int iValue = 0;

    printf("Enter a number : ");
    scanf("%d", &iValue);

    DigitX dobj;

    dobj.Display(iValue);

    return 0;
}