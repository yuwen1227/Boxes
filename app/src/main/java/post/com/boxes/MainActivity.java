package post.com.boxes;
/*                             題目: http://litotom.com/a2018mid/                  */
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText length;
    EditText width;
    EditText height;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
    }

    private void findViews() {
        length = findViewById(R.id.length);
        width = findViewById(R.id.width);
        height = findViewById(R.id.height);

    }
    public  void check(View view){
        String l = length.getText().toString();
        String w = width.getText().toString();
        String h = height.getText().toString();
        float length = Float.parseFloat(l);
        float width = Float.parseFloat(w);
        float height = Float.parseFloat(h);
        if(length <= 39.5 && width <= 27.5 && height <= 23){
            Intent intent = new Intent(this,ResultActivity.class);
            startActivity(intent);

        }
        if(length <= 23 && width <= 14 && height <= 13){
            Intent intent = new Intent(this,Result2Activity.class);
            startActivity(intent);

        }

    }
}





