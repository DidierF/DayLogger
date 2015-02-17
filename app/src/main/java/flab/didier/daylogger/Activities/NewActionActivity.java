package flab.didier.daylogger.activities;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import flab.didier.daylogger.ActionManager;
import flab.didier.daylogger.R;

public class NewActionActivity extends Activity {

    ActionManager manager = ActionManager.getInstance();
    EditText actionName;
    EditText actionNote;
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_action);
        context = this;


        actionName = (EditText) findViewById(R.id.newActionNameField);
        actionNote = (EditText) findViewById(R.id.newActionNoteField);

        Button saveBtn = (Button) findViewById(R.id.saveButton);

        saveBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String name = String.valueOf(actionName.getText());
                String note = String.valueOf(actionNote.getText());
                manager.addNewAction(name, note, context);
                finish();
            }
        });

    }
}
