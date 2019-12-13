package com.littlefox.design_patterns.structure.composite;

import java.util.ArrayList;

public class CompositeTest {

    public static void main(String[] args) {
        Folder driver = data();
        System.out.println(driver.printInfo());
        System.out.println(getTreeInfo(driver));
    }

    public static Folder data(){
        //驱动器
        Folder driver= new Folder("littlefox","256GB","/home/littlefox");
        //文件夹
        Folder music= new Folder("music","6GB","/home/littlefox/music");
        Folder movie= new Folder("movie","156GB","/home/littlefox/movie");

        File md = new File("readme.md","10KB","/home/littlefox/readme.md");

        File movie1 = new File("当幸福来敲门.mp4","2.3GB","/home/littlefox/movie/当幸福来敲门.mp4");
        File movie2 = new File("看不见的客人.mp4","2.8GB","/home/littlefox/movie/看不见的客人.mp4");
        File movie3 = new File("肖申克的救赎.mp4","3.1GB","/home/littlefox/movie/肖申克的救赎.mp4");

        File music1 = new File("蜗牛.flac","15.1MB","/home/littlefox/music/蜗牛.flac");
        File music2 = new File("等你下课.flac","23.7MB","/home/littlefox/music/等你下课.flac");
        File music3 = new File("晴天.flac","26.3MB","/home/littlefox/music/晴天.flac");

        driver.addDoc(music);
        driver.addDoc(movie);
        driver.addDoc(md);

        music.addDoc(music1);
        music.addDoc(music2);
        music.addDoc(music3);

        movie.addDoc(movie1);
        movie.addDoc(movie2);
        movie.addDoc(movie3);

        return driver;

    }

    //遍历整棵树,只要给我根节点，我就能遍历出所有的节点
    public static String getTreeInfo(Folder root){
        ArrayList<Doc> docArrayList = root.getDoc();
        String info = "";
        for(Doc s :docArrayList){
            if(s instanceof File){ //是文件就直接获得信息
                info = info + s.printInfo()+"\n";
            }else{ //是个小头目
                info = info + s.printInfo() +"\n"+ getTreeInfo((Folder)s);
            }
        }
        return info;
    }
}
