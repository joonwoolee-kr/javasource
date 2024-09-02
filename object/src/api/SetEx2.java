package api;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetEx2 {
    public static void main(String[] args) {
        // 1~46 임의의 숫자를 6개 추출 후 Set에 담기
        Set<Integer> set = new HashSet<>();

        while (set.size() < 6) {
            int num = (int) (Math.random() * 46 + 1);
            set.add(num);
        }

        System.out.println(set); // [16, 23, 11, 45, 14, 46]

        // 정렬 구현되어 있지 않음
        // set.sort() X
        // Collections.sort() X

        // Set => List 변환
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        System.out.println(list);
    }
}
