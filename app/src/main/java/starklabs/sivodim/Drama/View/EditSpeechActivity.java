package starklabs.sivodim.Drama.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import starklabs.sivodim.R;

public class EditSpeechActivity extends AppCompatActivity implements EditSpeechInterface{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_speech);
    }
}