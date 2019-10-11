package com.littlefox.design_patterns.structure.composite;

/**
 * @author rockychen
 * @version 1.0
 * @date 2019-10-10 17:48
 */
public abstract class Doc {

    private String name;
    private String size;
    private String url;

    public Doc(String _name, String _size, String  _url){
        this.name = _name;
        this.size = _size;
        this.url = _url;
    }

    public String printInfo(){
        return ("名称是："+this.name+"\t大小是：" +this.size+"\t地址是："+this.url);
    }

}
