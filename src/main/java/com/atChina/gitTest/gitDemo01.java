package com.atChina.gitTest;

public class gitDemo01 {

    public static void main(String[] args) {

        //在hot-fix阶段增加注释  第一次提交
        System.out.println("Frist Commit");
        System.out.println("git.test02222222");
        System.out.println("git.test02222222");
        System.out.println("git.test02222222");

        //在hot-fix阶段增加注释  这是第二次提交
        System.out.println("git.test03333333");
        System.out.println("git.test03333333");
        System.out.println("git.test03333333");

        //在hot-fix阶段增加注释   这是第三次提交  hot-fix提交
        System.out.println("hot-fix test011111");
        System.out.println("hot-fix test011111");
        System.out.println("hot-fix test011111");

        //和并冲突演练  master
        System.out.println("master,合并冲突演练");
        System.out.println("master,合并冲突演练");
        System.out.println("master,合并冲突演练");
        //合并冲突演练 hot-fix
        System.out.println("合并冲突  hot-fix");
        System.out.println("合并冲突  hot-fix");
        System.out.println("合并冲突  hot-fix");

        //IDEA创建远程库,和二为一,一般是两步,先在GitHub上创建远程库,然后再push
        System.out.println("IDEA,创建远程库");
        System.out.println("IDEA,创建远程库");
        System.out.println("IDEA,创建远程库");

        //测试push
        System.out.println("push_test");
        System.out.println("push_test,用的是ssh的方式");
        System.out.println("push_test");
        System.out.println("push_test,用的是ssh的方式");
        System.out.println("push_test");
        System.out.println("push_test,用的是ssh的方式");
        System.out.println("push_test");
        System.out.println("push_test,用的是ssh的方式");
        
        //测试pull
         System.out.println("测试:远程库到本地库 pull");
         System.out.println("测试:远程库到本地库 pull");
         System.out.println("测试:远程库到本地库 pull");



    }
}
