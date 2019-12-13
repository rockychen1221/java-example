package com.littlefox.utils;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

/**
 * @author rockychen
 * @version 1.0
 * @date 2019-11-19 15:31
 */
public class TextUtils {

    /**
     * 读取指定目录下的txt文件，并添加到set里面（即去掉重复元素）
     * 
     * @param path
     * @return setStr
     */
    public static Set<String> Reader(String path) {
        Set<String> setStr = new HashSet<String>();

        try {
            String encoding = "UTF-8";
            File file = new File(path);
            String[] fileList = file.list();

            for (String fl : fileList) {
                String newPath = path + File.separator + fl;
                InputStreamReader read = new InputStreamReader(
                        new FileInputStream(newPath), encoding);// 考虑到编码格式
                BufferedReader bufferedReader = new BufferedReader(read);
                String lineTxt = null;
                while ((lineTxt = bufferedReader.readLine()) != null) {
                    if (!lineTxt.trim().equals("")) {
                        setStr.add(lineTxt);
                    }
                }
                read.close();
            }
        } catch (Exception e) {
            System.out.println("读取文件内容出错");
            e.printStackTrace();
        }
        return setStr;
    }


    /**
     * 将set里面的数据写入到一个新的txt文件里面
     * 
     * @param str
     * @throws IOException
     */
    public static void Writer(Set<String> str) throws IOException {
        FileWriter fileWriter = new FileWriter("/Users/datadriver/Nutstore Files/我的坚果云/ik词库/Result.txt");
        int count = 0;
        for (String string : str) {
            if (!string.trim().equals("")) {
                count++;
                fileWriter.write(string.trim() + "\r\n");
            }
        }
        System.out.println(count);
        fileWriter.flush();
        fileWriter.close();
    }

    public static void main(String[] args) throws IOException {
        System.out.println("set>>>" + Reader("/Users/datadriver/Nutstore Files/我的坚果云/ik词库/txt"));
        Writer(Reader("/Users/datadriver/Nutstore Files/我的坚果云/ik词库/txt/"));
    }

}
