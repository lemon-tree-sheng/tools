package org.sheng.tools.file;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author shengxingyue on 2018/5/3 18:17
 */
public class FileUtil {

    public static Map<String, String> readFileToMap(String fileName) throws IOException {
        Map<String, String> map = new HashMap<>();
        Path path = Paths.get(fileName);
        BufferedReader reader = Files.newBufferedReader(path);
        String str;
        while ((str = reader.readLine()) != null) {
            String[] subStr = str.split(",");
            map.put(subStr[0], subStr[1]);
        }
        return map;
    }

    public static List<String> readFileToList(String fileName) throws IOException {
        List<String> result = new ArrayList<>();
        Path path = Paths.get(fileName);
        BufferedReader reader = Files.newBufferedReader(path);
        String str;
        while ((str = reader.readLine()) != null) {
            result.add(str.trim());
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        String fileName = "/Users/shengxingyue/Desktop/receipt_apply-results.txt";
        Map<String, String> map = readFileToMap(fileName);
        String fileName1 = "/Users/shengxingyue/Desktop/order_no.sql";
        List<String> list = readFileToList(fileName1);

        for (String s : list) {
            System.out.println(s + "=" + map.get(s));
        }
    }
}
