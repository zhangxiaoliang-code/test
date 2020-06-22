package com.zxl.test.main;

public class StringTest {

    public static void main(String[] args) {
        String a = "ab";
        String b = "a" + "b";
        System.out.println(a==b);

        //重写了 Objcet 的 equals
        String s1 = new String("张三");
        String s2 = new String("张三");
        System.out.println(s1.equals(s2));

        //通过 equals 比较时，实际用的时 Object 的 equals，而 Object 的 equals 用的==，所以是 false
        Cat cat = new Cat("咪咪");
        Cat cat1 = new Cat("咪咪");
        System.out.println(cat.equals(cat1));

        /**
         * 总结：== 这个对于基本数据类型来说是值比较，对于引用类型来说比较的是引用
         */

    }
}

class Cat {

    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
