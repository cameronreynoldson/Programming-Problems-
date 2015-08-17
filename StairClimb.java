public class StairClimb {
    public int climbStairs(int n) {
        int[] steps = new int[n+1];
        steps[0] = 1; 
        steps[1] = 1;
        for(int i = 2; i <= n; ++i)
        {
            steps[i] = steps[i-1];
            if(i > 1)
            {
                steps[i] += steps[i-2];
            }
        }
        
        return steps[n];
    }
}