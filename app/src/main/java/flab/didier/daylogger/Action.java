package flab.didier.daylogger;

import android.content.Context;
import android.util.AttributeSet;

import java.util.Calendar;

import flab.didier.daylogger.Views.ActionView;

/**
 * Created by Didier on 2/2/2015.
 */
public class Action {

    private static int actionsCreated = 0;
    private int id;
    private String name;
    private Calendar date;
    private String note;

    public Action(String name, String note){
        actionsCreated = actionsCreated++;
        id = actionsCreated;
        this.name = name;
        this.date = Calendar.getInstance();
        this.note = note;
    }

    public int getActionsCreated(){
        return actionsCreated;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public void setName(String newName){
        name = newName;
    }

    public Calendar getDate(){
        return date;
    }

    public void setDate(Calendar newDate){
        date = newDate;
    }

    public String getNote(){
        return note;
    }

    public void setNote(String newNote){
        note = newNote;
    }

    public ActionView getView(Context context, AttributeSet attributes){
        ActionView view = new ActionView(context, attributes);
        view.setActionName(name);
        view.setActionTime(date);
        return view;
    }
}
