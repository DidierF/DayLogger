package flab.didier.daylogger;

import android.content.Context;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

/**
 * Created by Didier on 2/3/2015.
 */
public class ActionManager extends ArrayList<Action> {
    private static ActionManager manager = new ActionManager();
    private Action[] mostUsed = new Action[5];
    private Hashtable<Action, Integer> actionInstances = new Hashtable<>();
    private int actionsCreated = 0;
    private Action caller;

    private ActionManager(){
        actionsCreated = 0;
    }

    public static ActionManager getInstance(){
        return manager;
    }

    public boolean addNewAction(String actionName, String actionNote, Context context){


        return super.add(new Action(actionsCreated++, actionName, actionNote, context));
    }

    public List<Action> search(String keyword){
        ArrayList<Action> searchResult = new ArrayList<Action>();
        //TODO
        return searchResult;
    }


    public Action getCaller() {
        return caller;
    }

    public void setCaller(Action caller) {
        this.caller = caller;
    }
}
