package algonquin.cst2335.example;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CustomToast extends AppCompatActivity {
  EditText editText;
  Button button;
  TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_custom_toast);
        editText=(EditText) findViewById(R.id.editText);
        button=(Button) findViewById(R.id.button);


    }

    public void openCustomToast(View view){
       LayoutInflater li=getLayoutInflater(); // for showing (inflate means to show)
        /* For custom_toast_design
     View layout= li.inflate(R.layout.custom_toast_design,(ViewGroup) findViewById(R.id.ct_id)); // shows which layout to open
         */

        //For custom_toast_values
        View layout=li.inflate(R.layout.activity_custom_toast_values,(ViewGroup) findViewById(R.id.ct_layoutid));
        textView=(TextView) layout.findViewById(R.id.textView);
        String name=editText.getText().toString();
        textView.setText(name);
        // For showing the toast on the screen which contains button
       Toast t=new Toast(getApplicationContext()); // created object to show the layout
       t.setView(layout);
       t.show();
    }

}