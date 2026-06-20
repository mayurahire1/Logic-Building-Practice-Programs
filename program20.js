// Write a Javascript program to find the factors of the given number.



function findFactors(iNo)
{
    let iCnt = 0;

    for(iCnt = 1; iCnt <= (iNo / 2); iCnt++)
    {
        if(iNo % iCnt == 0)
        {
            console.log(iCnt);
        }
    }
}

let iValue = 50;

findFactors(iValue);
