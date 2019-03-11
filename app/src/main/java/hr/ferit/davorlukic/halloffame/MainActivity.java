package hr.ferit.davorlukic.halloffame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;


public class MainActivity extends AppCompatActivity {
    TextView tvDescriptionNietzsche, tvDescriptionBruce, tvDescriptionMao;
    EditText etEditDescription;
    RadioButton rbFirst, rbSecond, rbThird;
    ImageView ivNietzsche, ivBruce, ivMao;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeUI();
    }

    private void initializeUI(){
        this.tvDescriptionNietzsche=(TextView)findViewById(R.id.tvDescriptionNietzsche);
        this.tvDescriptionBruce=(TextView)findViewById(R.id.tvDescriptionBruce);
        this.tvDescriptionMao=(TextView)findViewById(R.id.tvDescriptionMao);
        this.etEditDescription=(EditText)findViewById(R.id.etEditDescription);
        this.rbFirst=(RadioButton)findViewById(R.id.rbFirst);
        this.rbSecond=(RadioButton)findViewById((R.id.rbSecond));
        this.rbThird=(RadioButton)findViewById(R.id.rbThird);
        this.ivNietzsche=(ImageView)findViewById(R.id.ivNietzsche);
        this.ivBruce=(ImageView)findViewById(R.id.ivBruce);
        this.ivMao=(ImageView)findViewById(R.id.ivMao);
    }

    public void customClickOnEdit (View view) {
        String temp = etEditDescription.getText().toString();

        if(rbFirst.isChecked()) {
            tvDescriptionNietzsche.setText(temp);
        }
        else if (rbSecond.isChecked()) {
            tvDescriptionBruce.setText(temp);
        }
        else if(rbThird.isChecked()) {
            tvDescriptionMao.setText(temp);
        }
        else {
            displayToast(getText(R.string.rbCheck).toString());
        }

    }

    private void displayToast(String s) {
        Toast.makeText(this, s, Toast.LENGTH_LONG).show();
    }

    public void customClickOnImgNietzsche(View view){
        this.ivNietzsche.setVisibility(View.GONE);
    }

    public void customClickOnImgBruce(View view){
        this.ivBruce.setVisibility(View.GONE);
    }

    public void customClickOnImgMao(View view){
        this.ivMao.setVisibility(View.GONE);
    }

    public void customClickOnInsp(View view){
        String[] quotes={getText(R.string.quoteNietzsche).toString(), getText(R.string.quoteBruce).toString(), getText(R.string.quoteMao).toString()};
        Random random=new Random();
        int index=random.nextInt(3);
        displayToast(quotes[index]);
    }

    public void customClickOnReset(View view) {
        tvDescriptionNietzsche.setText(R.string.tv_descriptionNietzsche);
        tvDescriptionBruce.setText(R.string.tv_descriptionBruce);
        tvDescriptionMao.setText(R.string.tv_descriptionMao);
        ivNietzsche.setVisibility(View.VISIBLE);
        ivBruce.setVisibility(View.VISIBLE);
        ivMao.setVisibility(View.VISIBLE);
    }
}
