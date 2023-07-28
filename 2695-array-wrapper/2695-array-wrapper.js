/**
 * @param {number[]} nums
 */
var ArrayWrapper = function(nums) {
    this.array = nums;
};

ArrayWrapper.prototype.valueOf = function() {
    // Calculate and return the sum of all elements in the array
    return this.array.reduce((acc, num) => acc + num, 0);
};

ArrayWrapper.prototype.toString = function() {
    // Generate a comma-separated string representation of the array surrounded by brackets
    return '[' + this.array.join(',') + ']';
};

/**
 * const obj1 = new ArrayWrapper([1,2]);
 * const obj2 = new ArrayWrapper([3,4]);
 * obj1 + obj2; // 10
 * String(obj1); // "[1,2]"
 * String(obj2); // "[3,4]"
 */