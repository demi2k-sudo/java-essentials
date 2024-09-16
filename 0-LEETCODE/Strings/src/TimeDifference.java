import java.util.*;

public class TimeDifference {

    public int timeToMinutes(String s){
        int hr = s.charAt(0) - '0';
        hr = (hr*10)+(s.charAt(1)-'0');

        int min = s.charAt(3) - '0';
        min = (min*10)+(s.charAt(4)-'0');

        return (hr*60)+min;
    }

    public int findMinDifference(List<String> timePoints) {
        List<Integer> mins = new ArrayList<Integer> ();
        for(int i=0; i<timePoints.size(); i++){
            mins.add(timeToMinutes(timePoints.get(i)));
        }

        Collections.sort(mins);

        int min = 1440-mins.get(mins.size()-1)+mins.get(0);

        for(int i=0; i<mins.size()-1; i++)
            if(mins.get(i+1)-mins.get(i)<min) min = mins.get(i+1)-mins.get(i); 

        return min;
    }

    public static void main(String[] args) {
        TimeDifference td = new TimeDifference();
        
        // Test case 1
        List<String> timePoints1 = Arrays.asList("23:59", "00:00");
        int result1 = td.findMinDifference(timePoints1);
        System.out.println("Test Case 1: " + result1);  // Expected output: 1
        
        // Test case 2
        List<String> timePoints2 = Arrays.asList("12:30", "01:15", "23:45");
        int result2 = td.findMinDifference(timePoints2);
        System.out.println("Test Case 2: " + result2);  // Expected output: 90
        
        // Test case 3
        List<String> timePoints3 = Arrays.asList("05:31", "22:08", "04:15", "19:45");
        int result3 = td.findMinDifference(timePoints3);
        System.out.println("Test Case 3: " + result3);  // Expected output: 76
        
        // Test case 4
        List<String> timePoints4 = Arrays.asList("00:00", "23:59", "12:34", "12:35");
        int result4 = td.findMinDifference(timePoints4);
        System.out.println("Test Case 4: " + result4);  // Expected output: 1
    }
}
