package flab.didier.daylogger.Activities;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import flab.didier.daylogger.ActionManager;
import flab.didier.daylogger.R;

public class NewActionActivity extends Activity {

    ActionManager manager = ActionManager.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_action);



        final EditText actionName = (EditText) findViewById(R.id.newActionNameField);
        final EditText actionNote = (EditText) findViewById(R.id.newActionNoteField);

        Button saveBtn = (Button) findViewById(R.id.saveButton);

        saveBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String name = String.valueOf(actionName.getText());
                String note = String.valueOf(actionNote.getText());
                manager.addNewAction(name, note);
                finish();
            }
        });

    }
}
