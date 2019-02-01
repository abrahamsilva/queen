package android.itesm.edu.queen;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

// Abraham Armando Silva Apanco A01651490
// Yoali Sotomayor Baqueiro A01650536

public class RandomActivity extends AppCompatActivity {

    private final static String[] SONG_LIST = {
            "I Want To Break Free",
            "A Kind Of Magic",
            "Play The Game",
            "The Show Must Go On",
            "Love Of My Life",
            "Killer Queen"
    };

    private String song = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random);
        int random = ((int)(Math.random()* SONG_LIST.length));
        song = SONG_LIST[random];
        ((TextView)findViewById(R.id.textView)).setText(song);

    }
    public void done(View view){
        Intent intent = new Intent();
        intent.putExtra("random", song);
        setResult(Activity.RESULT_OK, intent);
        finish();
    }

}
