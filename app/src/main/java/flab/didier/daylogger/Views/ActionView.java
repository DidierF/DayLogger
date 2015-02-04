package flab.didier.daylogger.Views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.sql.Time;

import flab.didier.daylogger.R;

/**
 * Created by Didier on 2/3/2015.
 */
public class ActionView extends LinearLayout {

    private String mHourLbl;
    private String mMinuteLbl;
    private String mActionName;


    public ActionView(Context context) {
        super(context);
    }

    public ActionView(Context context, AttributeSet attrs) {
        super(context, attrs);

        LayoutInflater.from(context).inflate(R.layout.action_view, this, true);

        TypedArray a = context.getTheme().obtainStyledAttributes(
                attrs,
                R.styleable.ActionView,
                0, 0);

    }

    public ActionView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public String getHourLbl(){
     return mHourLbl;
    }

    private void setHourLbl(String newHourLbl){
        mHourLbl = newHourLbl;
        ((TextView)this.findViewById(R.id.hourLbl)).setText("ActionView");
        invalidate();
        requestLayout();
    }

    public String getMinuteLbl(){
        return mMinuteLbl;
    }

    private void setMinuteLbl(String newMinuteLbl){
        mMinuteLbl = newMinuteLbl;
        invalidate();
        requestLayout();
    }

    public String getActionName(){
        return mActionName;
    }

    public void setActionName(String newActionName){
        mActionName = newActionName;
        invalidate();
        requestLayout();
    }

    public void setActionTime(Time t){

        String.format(mHourLbl = String.valueOf(t.toString()), "HH");
        String.format(mMinuteLbl = String.valueOf(t.toString()), "MM");

    }
}
