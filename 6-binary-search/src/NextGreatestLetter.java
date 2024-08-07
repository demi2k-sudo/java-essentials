public class NextGreatestLetter {
    public static char nextGreatestLetter(char[] letters, char key) {
        int start = 0;
        int end = letters.length - 1;
        int mid;
        while(start<=end){
            // mid = (start+end)/2;
            mid = start + (end-start)/2;

            if(letters[mid]>key) end = mid -1;
            else start = mid+1;
        }
        
        return letters[start%letters.length];//end+1;
    }

    public static void main(String[] args) {
        char letters[] = {'a','b','s','x'};
        System.out.println(nextGreatestLetter(letters, 'z'));
    }
}