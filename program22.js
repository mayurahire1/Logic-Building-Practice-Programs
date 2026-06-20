// Write a javascript program to check whether a number is perfect or not.

function checkPerfect(iNo)
{
    let iCnt = 0;
    let iSum = 0;

    for(iCnt = 1; iCnt <= (iNo / 2); iCnt++)
    {
        if(iNo % iCnt == 0)
        {
            iSum = iSum + iCnt;
        }

        if(iSum > iNo)
        {
            break;
        }
    }

    if(iNo == iSum)
    {
        return true;
    }
    else
    {
        return false;
    }
}

let iValue = 28;
let bRet = false;

bRet = checkPerfect(iValue);

if(bRet == true)
{
    console.log("Number is Perfect");
}
else
{
    console.log("Number is not Perfect");
}

