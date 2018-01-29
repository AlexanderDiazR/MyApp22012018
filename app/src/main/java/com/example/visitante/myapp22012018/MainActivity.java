package com.example.visitante.myapp22012018;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private String log = "Log";
    TextView textView2;
    TextView textView3;
    public int numb = 0;
    public int n1 = 0;
    public int op = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView2 = (TextView) findViewById(R.id.textView2);
        textView3 = (TextView) findViewById(R.id.textView3);
        textView2.setText(String.valueOf(0));
        textView3.setText(String.valueOf(0));
    }

    public void clickBoton1(View view) {
        numb = numb*10 + 1;
        textView2.setText((String.valueOf(numb)));
    }

    public void clickBoton2(View view) {
        numb = numb*10 + 2;
        textView2.setText(String.valueOf(numb));
    }

    public void clickBoton3(View view) {
        numb = numb*10 + 3;
        textView2.setText(String.valueOf(numb));
    }

    public void clickBoton4(View view) {
        numb = numb*10 + 4;
        textView2.setText(String.valueOf(numb));
    }

    public void clickBoton5(View view) {
        numb = numb*10 + 5;
        textView2.setText(String.valueOf(numb));
    }

    public void clickBoton6(View view) {
        numb = numb*10 + 6;
        textView2.setText(String.valueOf(numb));
    }

    public void clickBoton7(View view) {
        numb = numb*10 + 7;
        textView2.setText(String.valueOf(numb));
    }

    public void clickBoton8(View view) {
        numb = numb*10 + 8;
        textView2.setText(String.valueOf(numb));
    }

    public void clickBoton9(View view) {
        numb = numb*10 + 9;
        textView2.setText(String.valueOf(numb));
    }

    public void clickBoton0(View view) {
        numb = numb*10;
        textView2.setText(String.valueOf(numb));
    }

    public void clickBotonMas(View view) {
        n1 += numb;
        numb = 0;
        op = 1;
        textView3.setText(String.valueOf(n1));
    }

    public void clickBotonMenos(View view) {
        if (n1 == 0) {
            n1=numb;
        }else{
            n1 -= numb;
        }
        numb = 0;
        op = 2;
        textView3.setText(String.valueOf(n1));
    }

    public void clickBotonDiv(View view) {
        if (n1 == 0) {
            n1=numb;
        }else{
            n1 = numb/n1;
        }
        numb = 0;
        op = 3;
        textView3.setText(String.valueOf(n1));
    }

    public void clickBotonPor(View view) {
        if (n1 == 0) {
            n1=numb;
        }else{
            n1 = n1*numb;
        }
        op = 4;
        numb = 0;
        textView3.setText(String.valueOf(n1));
    }

    public void clickBotonIgual(View view) {
        if (op == 0) {
            n1=numb;
        }
        if (op==1){
            n1+=numb;
        }
        if (op==2){
            n1-=numb;
        }
        if (op==3){
            n1=n1/numb;
        }
        if (op==4) {
            n1 = n1 * numb;
        }
        textView2.setText(String.valueOf(0));
        textView3.setText(String.valueOf(n1));
        n1=0;
        numb=0;
    }

    public void clickBotonDel(View view) {
        n1 = 0;
        numb=0;
        op=0;
        textView2.setText(String.valueOf(0));
        textView3.setText(String.valueOf(0));
    }
}
