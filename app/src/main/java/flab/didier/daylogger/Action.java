package flab.didier.daylogger;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import java.util.Calendar;

import flab.didier.daylogger.activities.ActionDetailActivity;
import flab.didier.daylogger.views.ActionView;

/**
 * Created by Didier on 2/2/2015.
 */
public class Action implements View.OnClickListener {
    private int id;
    private String name;
    private Calendar date;
    private String note;
    private boolean shown;
    private ActionView view;
    private Context context;
    public Action(final int id, String name, String note, Context context){
        this.id = id;
        view = new ActionView(context);
        setName(name);
        setDate(Calendar.getInstance());
        setNote(note);
        this.shown = false;
        this.context = context;
        view.setOnClickListener(this);
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public void setName(String newName){
        name = newName;
        view.setActionName(newName);
    }

    public Calendar getDate(){
        return date;
    }

    public void setDate(Calendar newDate){
        date = newDate;
        view.setActionTime(date);
    }

    public String getNote(){
        return note;
    }

    public void setNote(String newNote){
        note = newNote;
    }

    public void setShown(boolean shown){
        this.shown = shown;
    }

    public boolean isShown(){
        return shown;
    }

    public ActionView getView(Context context){
        return view;
    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {
        ActionManager.getInstance().setCaller(this);
        Intent intent = new Intent(context, ActionDetailActivity.class);
        context.startActivity(intent);
    }
}
