package leetcode.easy;

/**
 * @author xiaoq
 * @date 18-6-12
 */
public class ReverseBits {
    public int reverseBits(int n) {
        int res = 0;
        for (int i = 0; i < 32; i++, n >>= 1) {
            res = (res << 1) | (n & 1);
        }
        return res;
    }
}
