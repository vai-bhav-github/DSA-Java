public class smallestLetter {
    public static void main(String[] args) {
        char[] letters ={'a','g','l','o'};
        System.out.println(smallestLetter(letters, 'w'));
    }
    static char smallestLetter(char[] letters, char target){
        int start =0;
        int end = letters.length-1;
        while(start<=end){
            
            int mid = start + (end-start)/2;
            if(letters[mid]>target){
                end = mid-1;
            } else {
                start = mid+1;
            } 
        }
        return letters[start%letters.length];
    }
}
