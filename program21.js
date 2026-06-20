// Write a Javascipt Program to find sum of the factors of the given number.

function sumFactors(iNo)
{
    let iCnt = 0;
    let iSum = 0;

    for(iCnt = 1; iCnt <= (iNo / 2); iCnt++)
    {
        if(iNo % iCnt == 0)
        {
            iSum = iSum + iCnt;
        }
    }

    return iSum;
}

let iValue = 12;
let iRet = 0;

iRet = sumFactors(iValue);
console.log("Sum of factors are : " + iRet);