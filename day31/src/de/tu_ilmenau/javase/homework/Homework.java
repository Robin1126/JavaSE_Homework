package de.tu_ilmenau.javase.homework;

import java.io.*;


/*
拷贝目录：

        将D:\course拷贝到C盘根下....

        需要使用到：
        FileInputStream
        FileOutputStream
        File

        思考：判断复制的是文件还是文件夹
        遍历源文件夹 --》 这里需要用到递归
        如果是文件夹，那么在目的文件夹创建子文件夹
        如果是文件，就复制过去

        listFiles()是遍历所有文件，归到一个数组中
*/
public class Homework {
    public static void main(String[] args) {
        String copy = "D:\\course";
        String paste = "C:\\course";

        //参数 （复制的源文件夹，目标文件夹）
        copyDir(copy,paste);
    }
    // 创建方法
    private static void copyDir(String copy, String paste) {
        try {
            // 创建一个File对象
            File file_copy = new File(copy);
            if (!file_copy.isDirectory()) {
                //不是目录，就不复制
                copy(copy, paste);
            }
            // 如果是一个目录
            File file_paste = new File(paste);
            if (!file_paste.exists()) {
                file_paste.mkdirs(); //在目标目录下创建一个目录
            }
            // 是文件夹就要遍历源文件夹里的东西
            File[] files = file_copy.listFiles();
            for (File file: files
                 ) {
                // 遍历对象
                // 拼接路径
                String strFrom = copy + File.separator + file.getName();
                String strTo = paste + File.separator + file.getName();

                // 判断目录还是文件
                if (file.isDirectory()) {
                    copyDir(strFrom,strTo); //如果是目录，就递归方法
                }
                if (file.isFile()) {
                    copy(strFrom,strTo); //调用复制方法
                }
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void copy(String sbr, String sbw) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(sbr));
        BufferedWriter bw = new BufferedWriter(new FileWriter(sbw));
        String a = null;
        while((a = br.readLine()) != null) {
            bw.write(a); // 输出，将a中的内容写道bw中
            bw.newLine(); //换行
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
