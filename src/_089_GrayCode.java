import java.util.ArrayList;
import java.util.List;

public class _089_GrayCode {

    public List<Integer> grayCode(int n) {
        List<Integer> res = new ArrayList<>();
        res.add(0);
        for (int i = 0; i < n; i++) {
            for (int j = res.size() - 1; j >= 0; j--) {
                res.add(res.get(j) + (1 << i));
            }
        }
        return res;
    }

    public List<Integer> grayCode2(int n) {
        List<Integer> res = new ArrayList<>();
        if (n == 0) {
            res.add(0);
        } else {
            res = grayCode2(n - 1);
            for (int i = res.size() - 1; i >= 0; i--) {
                res.add(res.get(i) + (1 << (n - 1)));
            }
        }
        return res;
    }

    public static void main(String[] args) {
        List<Integer> res = new _089_GrayCode().grayCode2(3);
        System.out.println(res);
    }
}
