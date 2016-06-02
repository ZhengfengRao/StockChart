package com.example.yanjiang.stockchart.mychart;

import android.util.SparseArray;

import com.github.mikephil.charting.components.XAxis;

/**
 * author：ajiang
 * mail：1025065158@qq.com
 * blog：http://blog.csdn.net/qqyanjiang
 */
public class MyXAxis extends XAxis {
    private SparseArray<String> labels;
    public SparseArray<String> getShowLabels() {
        return labels;
    }
    public void setShowLabels(SparseArray<String> labels) {
        this.labels = labels;
    }
}
