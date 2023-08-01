package s22032.suntech.jp.bmicalculators032;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButtonClickListener listener = new ButtonClickListener();

        Button btClear=findViewById(R.id.btClear);
        btClear.setOnClickListener(listener);

        Button btCalculate =findViewById(R.id.btCalculate);
        btCalculate.setOnClickListener(listener);
    }
    private class ButtonClickListener implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            EditText old = findViewById(R.id.edOld);
            EditText height = findViewById(R.id.edHeight);
            EditText weight = findViewById(R.id.edWeight);

            String oldStr = old.getText().toString();
            String heightStr = height.getText().toString();
            String weightStr = weight.getText().toString();

            TextView inputyouhmn = findViewById(R.id.tvYouhmn);
            TextView inputhans = findViewById(R.id.tvHans);
            TextView inputideal = findViewById(R.id.tvIdeal);
            TextView inputians = findViewById(R.id.tvIans);
            TextView inputw = findViewById(R.id.tvw);

            int int_old = Integer.parseInt(oldStr);
            double int_height = Double.parseDouble(heightStr);
            double int_weight = Double.parseDouble(weightStr);


            String inputStr_youhmn = inputyouhmn.getText().toString();
            String inputStr_h_ans = inputhans.getText().toString();
            String inputStr_ideal = inputideal.getText().toString();
            String inputStr_i_ans = inputians.getText().toString();
            String inputStr_w = inputw.getText().toString();

            int id = view.getId();
            if (id == R.id.btCalculate) {
                if (int_old < 6) {
                    double cup = int_weight / (int_height * int_height);
                    if (int_old < 1) {
                        if (cup < 18) {
                            inputyouhmn.setText("あなたの肥満度は");
                            inputhans.setText("正常です");
                            inputideal.setText("");
                            inputians.setText("");
                            inputw.setText("");
                        } else {
                            inputyouhmn.setText("あなたの肥満度は");
                            inputhans.setText("異常です");
                            inputideal.setText("");
                            inputians.setText("");
                            inputw.setText("");
                        }
                    }
                    if (int_old < 3) {
                        if (cup < 17) {
                            inputyouhmn.setText("あなたの肥満度は");
                            inputhans.setText("正常です");
                            inputideal.setText("");
                            inputians.setText("");
                            inputw.setText("");
                        } else {
                            inputyouhmn.setText("あなたの肥満度は");
                            inputhans.setText("異常です");
                            inputideal.setText("");
                            inputians.setText("");
                            inputw.setText("");
                        }
                    }
                    if (int_old < 6) {
                        if (cup < 16.5) {
                            inputyouhmn.setText("あなたの肥満度は");
                            inputhans.setText("正常です");
                            inputideal.setText("");
                            inputians.setText("");
                            inputw.setText("");
                        } else {
                            inputyouhmn.setText("あなたの肥満度は");
                            inputhans.setText("異常です");
                            inputideal.setText("");
                            inputians.setText("");
                            inputw.setText("");
                        }
                    }
                    //dialogFragment.show(getSupportFragmentManager(), "DialogActivity");
                } else if (int_old < 16) {
                    double lrl = int_weight / (int_height * int_height * int_height) * 10;
                    if (lrl < 100) {
                        inputyouhmn.setText("あなたの肥満度は");
                        inputhans.setText("やせすぎ");
                        inputideal.setText("");
                        inputians.setText("");
                        inputw.setText("");
                    } else if (lrl < 115) {
                        inputyouhmn.setText("あなたの肥満度は");
                        inputhans.setText("やせてる");
                        inputideal.setText("");
                        inputians.setText("");
                        inputw.setText("");
                    } else if (lrl < 145) {
                        inputyouhmn.setText("あなたの肥満度は");
                        inputhans.setText("ふつう");
                        inputideal.setText("");
                        inputians.setText("");
                        inputw.setText("");
                    } else if (lrl < 160) {
                        inputyouhmn.setText("あなたの肥満度は");
                        inputhans.setText("ふとっている");
                        inputideal.setText("");
                        inputians.setText("");
                        inputw.setText("");
                    } else {
                        inputyouhmn.setText("あなたの肥満度は");
                        inputhans.setText("ふとりすぎ");
                        inputideal.setText("");
                        inputians.setText("");
                        inputw.setText("");
                    }

                } else if (int_old >= 16) {
                    double BMI = int_weight / ((int_height / 100) * (int_height / 100));
                    double IDL = ((int_height / 100) * (int_height / 100)) * 22;
                    String IDLStr = String.format("%.1f", IDL);
                    if (BMI <= 18.5) {
                        inputyouhmn.setText("あなたの肥満度は");
                        inputhans.setText("低体重（瘦せ型）");
                        inputideal.setText("あなたの適正体重は");
                        inputians.setText(IDLStr);
                        inputw.setText("kg");
                    } else if (BMI <= 25) {
                        inputyouhmn.setText("あなたの肥満度は");
                        inputhans.setText("普通体重");
                        inputideal.setText("あなたの適正体重は");
                        inputians.setText(IDLStr);
                        inputw.setText("kg");
                    } else if (BMI <= 30) {
                        inputyouhmn.setText("あなたの肥満度は");
                        inputhans.setText("肥満（1度）");
                        inputideal.setText("あなたの適正体重は");
                        inputians.setText(IDLStr);
                        inputw.setText("kg");
                    } else if (BMI <= 35) {
                        inputyouhmn.setText("あなたの肥満度は");
                        inputhans.setText("肥満（2度）");
                        inputideal.setText("あなたの適正体重は");
                        inputians.setText(IDLStr);
                        inputw.setText("kg");
                    } else if (BMI <= 40) {
                        inputyouhmn.setText("あなたの肥満度は");
                        inputhans.setText("肥満（3度）");
                        inputideal.setText("あなたの適正体重は");
                        inputians.setText(IDLStr);
                        inputw.setText("kg");
                    } else {
                        inputyouhmn.setText("あなたの肥満度は");
                        inputhans.setText("肥満（4度）");
                        inputideal.setText("あなたの適正体重は");
                        inputians.setText(IDLStr);
                        inputw.setText("kg");
                    }
                }
            } else if (id == R.id.btClear) {
                ((EditText) findViewById(R.id.edOld)).getText().clear();
                ((EditText) findViewById(R.id.edHeight)).getText().clear();
                ((EditText) findViewById(R.id.edWeight)).getText().clear();
                inputyouhmn.setText("");
                inputhans.setText("");
                inputideal.setText("");
                inputians.setText("");
                inputw.setText("");
            }
        }
    }
}