package flab.didier.daylogger.activities;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import flab.didier.daylogger.Action;
import flab.didier.daylogger.ActionManager;
import flab.didier.daylogger.R;

public class ActionDetailActivity extends Activity {

    Action editingAction;
    EditText nameField;
    EditText noteField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action_detail);
        fillAction();
    }

    public void fillAction(){
        editingAction = ActionManager.getInstance().getCaller();

        ((TextView) findViewById(R.id.new_action_activity_title)).setText("Edit Action");

        nameField = (EditText) findViewById(R.id.newActionNameField);
        nameField.setText(editingAction.getName());
        noteField = ((EditText) findViewById(R.id.newActionNoteField));
        noteField.setText(editingAction.getNote());
    }

    public void saveAction(View view){
        editingAction.setName(nameField.getText().toString());
        editingAction.setNote(noteField.getText().toString());
        finish();
    }
}
