package test.Qpow;

/**
 * @Data 14:48 2021/12/16
 * @Author ZhangJR
 * @Description 快速幂
 */
public class qpow {

    /**
     * 递归快速幂 recursion
     * @param a
     * @param n
     * @return
     */
    static int qpowRec(int a,int n){
        if (n==0){
            return 1;
        }else if ((n>>1) == 1){
            return qpowRec(a,n-1);
        }else {
            int temp = qpowRec(a,n/2);
            return temp*temp;
        }
    }

    /**
     * 迭代快速幂 iteration
     * @param a
     * @param n
     * @return
     */
    static int qpowIte(int a,int n){
        int ans = 1;
        while (n != 0){
            if ((n&1) == 1) ans *= a;
            a *= a;
            n >>=1;
        }
        return ans;
    }

    /**
     * 取模快速幂 MOD = 1000000007
     * @param a
     * @param n
     * @return
     */
    static int MOD = 1000000007;
    static int qpowMOD(int a,int n){
        if(n==0) return 1;
        else if((n>>1)==1)
            return qpowMOD(a,n/2)*a%MOD;
        else {
            int temp = qpowMOD(a,n/2)%MOD;
            return temp*temp % MOD;
        }
    }

    public static void main(String[] args) {
        System.out.println(qpowIte(2,10));
    }
}
