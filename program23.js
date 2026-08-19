// Write a javascript program to check whether a number prime or not.

function isPrime(iNo)
{
    let iCnt = 0;

    if(iNo <= 1)
    {
        return false;   
    }

    for(iCnt = 2; iCnt <= (iNo / 2); iCnt++)
    {
        if(iNo % iCnt == 0)
        {
            break;
        }
    }

    if(iCnt <= (iNo/2))
    {
        return false;
    }
    else
    {
        return true;
    }

}


// ============ Main ===========

let iValue = 13;
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


