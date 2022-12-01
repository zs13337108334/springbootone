package com.alibaba.service.script;

import javax.swing.*;
import java.awt.event.*;

public class Main extends JPanel {

    public void action() {
        MouseAdapter m = new MouseAdapter() {//鼠标事件监听
            /** 重写mouseMoved()鼠标移动事件 */
            @Override
            public void mouseMoved(MouseEvent e) { //在窗口中移动鼠标时自动发生

            }
            /** 重写mouseClicked()鼠标点击事件 */
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("点击"+e.getX()+"    "+e.getY());//getX获取当前横坐标
                switch(e.getModifiers()) {
                    case InputEvent.BUTTON1_MASK: {
                        System.out.println("鼠标左键");
                        break;
                    }
                    case InputEvent.BUTTON2_MASK: {
                        System.out.println("鼠标滚轮点击");
                        break;
                    }
                    case InputEvent.BUTTON3_MASK: {
                        System.out.println("鼠标右键");
                        break;
                    }
                }
            }
            /** 重写mouseExited()鼠标移出事件 */
            @Override
            public void mouseExited(MouseEvent e) {
                System.out.println("移出"+e.getX()+"    "+e.getY());

            }
            /** 重写mouseEntered()鼠标移入事件 */
            @Override
            public void mouseEntered(MouseEvent e) {
                System.out.println("移入"+e.getX()+"    "+e.getY());

            }
            /** 鼠标刚按下时发生*/
            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("按下"+e.getX()+"    "+e.getY());

            }
            /** 鼠标松开时发生，与 mousePressed实现长按*/
            @Override
            public void mouseReleased(MouseEvent e) {
                System.out.println("松开"+e.getX()+"    "+e.getY());
            }
            /** 鼠标按下后进行移动时发生，该事件发生后 mouseClicked不再发生*/
            @Override
            public void mouseDragged(MouseEvent e){

                System.out.println("按下移动"+e.getX()+"    "+e.getY());

            }
        };
        this.addMouseListener(m);
        this.addMouseMotionListener(m);
    }

    public static void main(String[] args) {
        JFrame jf=new JFrame("鼠标事件监听测试");              //新建一个窗体，标题为括号中字符串
        jf.setBounds(0,0,1000,600);    //设置窗体的初始位置和大小(初始横坐标，初始纵坐标，长，宽)
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置后点击x后直接关闭程序
        jf.setVisible(true);                              //设置窗口可见，默认为FALSE
        Main main=new Main();                             //一个继承JPanel的类
        jf.add(main);                                     //把JPanel添加到窗口中
        main.action();
    }
}
