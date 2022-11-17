package lesson5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Task609 {
    public static void main(String[] args) {
        System.out.println("Решение задачи: ");
        String[] paths = {"root/a 1.txt(abcd) 2.txt(efgh)","root/c 3.txt(abcd)","root/c/d 4.txt(efgh)","root 4.txt(efgh)"};
        System.out.println(findDuplicate(paths));
    }
    public static List<List<String>> findDuplicate(String[] paths) {
        Map<String, List<String>> map = new HashMap<>();
        for(String path : paths) {
            String[] pathArr = path.split(" ");
            String dir = pathArr[0] + '/';
            for (int i = 1; i < pathArr.length; i++) {
                int start = pathArr[i].indexOf('(');
                String fileName = dir + pathArr[i].substring(0, start);
                String content = pathArr[i].substring(start + 1, pathArr[i].length() - 1);
                map.putIfAbsent(content, new ArrayList<>());
                map.get(content).add(fileName);
            }
        }
        List<List<String>> res = new ArrayList<>();
        for (String key : map.keySet()) {
            if (map.get(key).size() > 1) {
                res.add(map.get(key));
            }
        }
        return res;
    }
}
