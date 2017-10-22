package com.me.obo.customgrideview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;

/**
 * Created by obo on 2017/10/22.
 * Email:obo1993@gmail.com
 */

public class CustomGrideView extends ViewGroup {

    private static final String TAG = "CustomGrideView";

    private int mColumns = 4;

    private int mRows = 3;

    public CustomGrideView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).layout(left + (i % mColumns) * (right / mColumns),
                    top + (i / mColumns) * (bottom / mRows),
                    (i % mColumns + 1) * (right / mColumns),
                    top + (i/ mColumns + 1
                    ) * (bottom / mRows));
        }
    }
}
