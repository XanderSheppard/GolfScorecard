package com.xander.golfscorecard;

public class Hole {
    private String mLabel;
    private  int mStrokeCount;

    public Hole(String label, int strokeCount){
        mLabel = label;
        mStrokeCount = strokeCount;
    }

    public String getmLabel() {
        return mLabel;
    }

    public void setmLabel(final String mLabel) {
        this.mLabel = mLabel;
    }

    public int getmStrokeCount() {
        return mStrokeCount;
    }

    public void setmStrokeCount(final int mStrokeCount) {
        this.mStrokeCount = mStrokeCount;
    }
}
