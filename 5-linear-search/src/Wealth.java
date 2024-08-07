public class Wealth {
    public static int maximumWealth(int[][] accounts) {
        int max = 0;
        for(int[]i:accounts){
            int tot=0;
            for(int j:i){
                tot+=j;
            }
            if(tot>max) max = tot;
        }
        return max;
    }

    public static void main(String[] args) {
        int accounts[][] = {{2,8,7},{7,1,3},{1,9,5}};
        System.out.println(maximumWealth(accounts));
    }
}