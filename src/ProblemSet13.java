public class ProblemSet13 {

    /////////////// EXERCISE 1  ///////////////

    public boolean groupSum(int start, int[] numbers, int target) {

            if(target == 0){
                return true;
            }
            if(start >= numbers.length){
                return false;
            }
            if(start < 0 ){
                return false;
            }
            if(groupSum(start+1, numbers, target-numbers[start])){
                return true;
            }
            return groupSum(start+1, numbers, target);
         } //DONE

    /////////////// EXERCISE 2  ///////////////

    public boolean groupSum6(int start, int[] numbers, int target) {
        if(target == 0){
            return true;
        }
        if(start >= numbers.length){
            return false;
        }
        if(start < 0 ){
            return false;
        }
        if(numbers[start] == 6) {
            return groupSum6(start + 1, numbers, target - numbers[start]);
        }
        if(groupSum6(start + 1, numbers, target - numbers[start])) {
            return true;
        }
        return groupSum6(start + 1, numbers, target);
    } //DONE

    /////////////// EXERCISE 3  ///////////////

    public boolean groupNoAdj(int start, int[] numbers, int target) {
        if(target == 0){
            return true;
        }
        if(start >= numbers.length){
            return false;
        }
        if(start < 0 ){
            return false;
        }
        if(groupNoAdj(start + 2, numbers, target - numbers[start])) {
            return true;
        }
        return groupNoAdj(start + 1, numbers, target);
    } //DONE

    /////////////// EXERCISE 4  ///////////////

    public boolean groupSum5(int start, int[] numbers, int target) {
        if(target == 0){
            return true;
        }
        if(start >= numbers.length){
            return false;
        }
        if(start < 0 ){
            return false;
        }
        if(numbers[start] % 5 == 0)
        {
            if(start < numbers.length - 1 && numbers[start+1] == 1) {
                return groupSum5(start + 2, numbers, target - numbers[start]);
            }
            return groupSum5(start + 1, numbers, target - numbers[start]);
        }
        if(groupSum5(start + 1, numbers, target - numbers[start])) {
            return true;
        }
        return groupSum5(start + 1, numbers, target);
    } //DONE

    /////////////// EXERCISE 5  ///////////////

    public boolean groupSumClump(int start, int[] numbers, int target) {
       if(target == 0){
            return true;
        }
        if(start >= numbers.length){
            return false;
        }
        if(start < 0 ){
            return false;
        }
        int i = start + 1;

        for(;  i < numbers.length && numbers[start] == numbers[i]; i++);
        if(groupSumClump(i, numbers, target - ((i - start) * numbers[start]))) {
            return true;
        }
        return groupSumClump(i, numbers, target);
    }//DONE

    /////////////// EXERCISE 6  ///////////////

    public boolean splitArray(int[] numbers) {
        return ifEqual(numbers, 0, 0);
    }//DONE

    /////////////// EXERCISE 7  ///////////////

    public boolean splitOdd10(int[] numbers) {
        return split(0, numbers, 0, 0);
    }//DONE

    /////////////// RECURSIVE HELPERS  ///////////////

    public  boolean ifEqual(int[] numbers, int i, int equal) { //use for splitArray
        if(i == numbers.length)
            return (equal == 0);
        if(ifEqual(numbers, i + 1, equal + numbers[i]))
            return true;
        return ifEqual(numbers, i + 1, equal - numbers[i]);
    }

    public boolean split(int start, int[] numbers, int multiple, int odd) { //use for splitOdd10
        if(start >= numbers.length) {
            return multiple % 10 == 0 && odd % 2 == 1;
        }
        if(split(start+1, numbers, multiple + numbers[start], odd)) {
            return true;
        }
        if(split(start+1, numbers, multiple, odd + numbers[start])) {
            return true;
        }
        return false;
    }
}
