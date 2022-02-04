public class SkillDemocse12{
    public static int factorial(int n){
        //res is 1 such that the factorial
        // never results in 0 and that it results 
        //in 1 if we find the factorial of 0
        int res = 1, i;
        for (i=2; i<=n; i++)
            res *= i;
        return res;
    }
}
