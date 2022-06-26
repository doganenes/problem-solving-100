process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', inputStdin => {
    inputString += inputStdin;
});

process.stdin.on('end', _ => {
    inputString = inputString.trim().split('\n').map(string => {
        return string.trim();
    });

    main();
});

function readLine() {
    return inputString[currentLine++];
}

/**
*   Return the second largest number in the array.
*   @param {Number[]} nums - An array of numbers.
*   @return {Number} The second largest number in the array.
**/
function getSecondLargest(nums) {

    var largestNum = nums[0];
    var secondLargestNum = nums[0];
    for (var i = 0; i < nums.length; i++) {

        if (nums[i] > largestNum) {
            largestNum = nums[i];
        }

        for (var j = 0; j < nums.length; j++) {

            if (nums[j] > secondLargestNum && nums[j] < largestNum) {
                secondLargestNum = nums[j];
            }

        }
    }

    return secondLargestNum;
}


function main() {
    const n = +(readLine());
    const nums = readLine().split(' ').map(Number);

    console.log(getSecondLargest(nums));
}