package np.com.manishtuladhar.uiconcepts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //tvs
        TextView colorAndFont = findViewById(R.id.colorAndFont);
        TextView style = findViewById(R.id.style);
        TextView responsiveLayout = findViewById(R.id.responsiveLayouts);
        TextView touchSelector = findViewById(R.id.touchSelector);

        assert colorAndFont !=null;
        colorAndFont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ColorAndFontActivity.class);
                startActivity(intent);
            }
        });

        assert style !=null;
        style.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,StyleActivity.class);
                startActivity(intent);
            }
        });

        assert responsiveLayout !=null;
        responsiveLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ResponsiveLayoutActivity.class);
                startActivity(intent);
            }
        });

        assert touchSelector !=null;
        touchSelector.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,SelectorsActivity.class);
                startActivity(intent);
            }
        });
    }
}