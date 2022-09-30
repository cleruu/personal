/*let curNum = 5000;
let total = 0;
for (let i = 0; i<15; i++){
    total += curNum;
    curNum += 200;
};
console.log(total);
console.log(curNum);*/

var twoSum = function(nums, target) {
    let answer = [];
    for (let i = 0; i<nums.length; i++) {
        for (let a = 0; a<nums.length; a++){
            if (i == a) {
                continue;
            }
            if (nums[i] + nums[a] === target) {
                answer.push(i);
                }
        }
    }
    return answer;
}

console.log(twoSum([3,3], 6))

