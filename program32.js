// Write a javascript program to count the digits of a number.

function CountDigits(iNo)
{
    let iCount = 0;

    while(iNo != 0)
    {
        iCount++;
        iNo = Math.floor(iNo / 10);
    }
    return iCount;
}

////////Main/////////

let iValue = 765438;

let iRet = CountDigits(iValue);

console.log("Number of digits are : " + iRet);