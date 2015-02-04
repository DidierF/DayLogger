package flab.didier.daylogger;

import java.sql.Time;
import java.util.Date;

/**
 * Created by Didier on 2/2/2015.
 */
public class Action {

    private String name;
    private Date date;
    private Time time;
    private String note;

    public Action(String name, Date date, Time time, String note){
        this.name = name;
        this.date = date;
        this.time = time;
        this.note = note;
    }

    public String getName(){
        return name;
    }

    public void setName(String newName){
        name = newName;
    }

    public Date getDate(){
        return date;
    }

    public void setDate(Date newDate){
        date = newDate;
    }

    public Time getTime(){
        return time;
    }

    public void setTime(Time newTime){
        time = newTime;
    }

    public String getNote(){
        return note;
    }

    public void setNote(String newNote){
        note = newNote;
    }
}
