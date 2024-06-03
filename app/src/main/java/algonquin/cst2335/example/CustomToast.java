package algonquin.cst2335.example;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CustomToast extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_custom_toast);
    }

    public void openCustomToast(View view){
       LayoutInflater li=getLayoutInflater(); // for showing (inflate means to show)
       View layout= li.inflate(R.layout.custom_toast_design,(ViewGroup) findViewById(R.id.ct_id)); // shows which layout to open

        // For showing the toast on the screen which contains button
       Toast t=new Toast(getApplicationContext()); // created object to show the layout
       t.setView(layout);
       t.show();
    }

}