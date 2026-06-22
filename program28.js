// Write a javascript program to print the digits of a number.

function Display(iNo)
{
    let iDigit = 0;

    while(iNo != 0)
    {
        iDigit = iNo % 10;
        console.log(iDigit);
        iNo = Math.floor(iNo / 10);
    }
}

// ====== Main  =====

let iValue = 4321;
Display(iValue);
