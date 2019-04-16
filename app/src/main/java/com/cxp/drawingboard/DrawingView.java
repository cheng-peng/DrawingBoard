package com.cxp.drawingboard;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * 文 件 名: DrawingView
 * 创 建 人: CXP
 * 创建日期: 2019-04-16 22:33
 * 描    述:
 * 修 改 人:
 * 修改时间：
 * 修改备注：
 */
public class DrawingView extends View {

    public DrawingView(Context context) {
        this(context,null);
    }

    public DrawingView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public DrawingView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
