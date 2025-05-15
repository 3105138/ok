package com.fongmi.android.tv.ui.custom;

import android.content.Context;
import android.util.AttributeSet;

import com.google.android.exoplayer2.ui.SubtitleView;

public class SubtitleView extends SubtitleView {

    private float bottomPadding = 0.08f; // 默认底部填充
    private float textSize = 0.05f;      // 默认字幕大小

    public SubtitleView(Context context) {
        super(context);
        init();
    }

    public SubtitleView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init() {
        setBottomPaddingFraction(bottomPadding);
        setFractionalTextSize(textSize);
    }

    // 增加底部间距
    public void addBottomPadding(float delta) {
        bottomPadding += delta;
        if (bottomPadding > 1f) bottomPadding = 1f;
        setBottomPaddingFraction(bottomPadding);
    }

    // 减少底部间距
    public void subBottomPadding(float delta) {
        bottomPadding -= delta;
        if (bottomPadding < 0f) bottomPadding = 0f;
        setBottomPaddingFraction(bottomPadding);
    }

    // 获取当前底部间距
    public float getBottomPadding() {
        return bottomPadding;
    }

    // 增加字体大小
    public void addTextSize(float delta) {
        textSize += delta;
        if (textSize > 1f) textSize = 1f;
        setFractionalTextSize(textSize);
    }

    // 减少字体大小
    public void subTextSize(float delta) {
        textSize -= delta;
        if (textSize < 0.01f) textSize = 0.01f;
        setFractionalTextSize(textSize);
    }

    // 获取当前字体大小
    public float getTextSize() {
        return textSize;
    }
}
