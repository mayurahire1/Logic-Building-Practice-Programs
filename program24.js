// Write a javascript program to check whether a number prime or not.


function isPrime(iNo)
{
    let iCnt = 0;
    let bFlag = true;

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

// ==== Main =========

let iValue = 7;
let bRet = false;

bRet = isPrime(iValue);

if(bRet == true)
{
    console.log("Number is prime");
}
else
{
    console.log("Number is not prime");
}