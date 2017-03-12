package com.ispring.gameplane.game;

import android.graphics.Bitmap;

/**
 * 中敌机类，体积中等，抗打击能力中等
 */
public class MiddleEnemyPlane extends EnemyPlane {

    public MiddleEnemyPlane(Bitmap bitmap){
        super(bitmap);
        setPower(10);//中敌机抗抵抗能力为10，即需要10颗子弹才能销毁中敌机
        setValue(6000);//销毁一个中敌机可以得6000分
    }

}