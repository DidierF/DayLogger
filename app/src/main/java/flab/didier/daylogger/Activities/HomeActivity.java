package flab.didier.daylogger.Activities;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import flab.didier.daylogger.Action;
import flab.didier.daylogger.ActionManager;
import flab.didier.daylogger.R;


public class HomeActivity extends Activity{

    private ActionManager manager = ActionManager.getInstance();
    private LinearLayout layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        layout = (LinearLayout) findViewById(R.id.homeActivity);

        showActions();

        Button addBtn = (Button) findViewById(R.id.addButton);
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                manager.addNewAction("Action added by button!", "");
                showNewActions();
            }
        });

    }

    public void showActions(){
        for(Action a: manager){
            layout.addView(a.getView(this.getApplicationContext()));
        }
    }

    public void showNewActions(){
        for(Action a: manager){
            if(!a.isShown()) {
                layout.addView(a.getView(this.getApplicationContext()));
                a.setShown(true);
            }
        }
    }
}
