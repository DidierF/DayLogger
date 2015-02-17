package flab.didier.daylogger.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import flab.didier.daylogger.Action;
import flab.didier.daylogger.ActionManager;
import flab.didier.daylogger.R;


public class HomeActivity extends Activity{

    //TODO: Action details activity
    //TODO: Action edit activity

    private ActionManager manager = ActionManager.getInstance();
    private LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        layout = (LinearLayout) findViewById(R.id.homeActivity);

        final Intent intent = new Intent(this, NewActionActivity.class);

        Button addBtn = (Button) findViewById(R.id.newActionButton);
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);

            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        showNewActions();
    }

    public void showNewActions(){
        final Intent intent = new Intent(this, ActionDetailActivity.class);
        for(Action a: manager){
//            setClickListener(a);
            if(!a.isShown()) {
                layout.addView(a.getView(this));
                a.setShown(true);
            }
        }
    }

//    private void setClickListener(final Action action){
//        final Intent intent = new Intent(this, ActionDetailActivity.class);
//        action.getView(this).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                manager.setCaller(action);
//                startActivity(intent);
//            }
//        });
//    }
}
