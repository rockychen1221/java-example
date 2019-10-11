package com.littlefox.design_patterns.structure.composite;

import java.util.ArrayList;

/**
 * @author rockychen
 * @version 1.0
 * @date 2019-10-10 17:56
 */
public class Folder extends Doc {

    private ArrayList<Doc> docArrayList = new ArrayList<Doc>();

    public Folder(String _name, String _size, String _url) {
        super(_name, _size, _url);
    }

    //增加一个文件，可能是文件夹，也可能是单个文件
    public void addDoc(Doc doc) {
        this.docArrayList.add(doc);
    }

    public ArrayList<Doc> getDoc() {
        return this.docArrayList;
    }

}
