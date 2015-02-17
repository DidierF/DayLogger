package flab.didier.daylogger.views;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Calendar;

import flab.didier.daylogger.R;

/**
 * Created by Didier on 2/3/2015.
 */
public class ActionView extends LinearLayout {

    public ActionView(Context context){
        super(context);

        LayoutInflater.from(context).inflate(R.layout.action_view, this, true);
    }

    public String getHourLbl(){
     return ((TextView)this.findViewById(R.id.hourLbl)).getText().toString();
    }

    public String getMinuteLbl(){
        return ((TextView)this.findViewById(R.id.minuteLbl)).getText().toString();
    }

    public String getActionName(){
        return ((TextView)this.findViewById(R.id.actionName)).getText().toString();
    }

    public void setActionName(String newActionName){
        ((TextView)this.findViewById(R.id.actionName)).setText(newActionName);
        invalidate();
        requestLayout();
    }

    public void setActionTime(Calendar date){
        ((TextView) findViewById(R.id.hourLbl)).setText(String.valueOf(date.get(Calendar.HOUR_OF_DAY)));
        ((TextView) findViewById(R.id.minuteLbl)).setText(String.valueOf(date.get(Calendar.MINUTE)));
    }
}
