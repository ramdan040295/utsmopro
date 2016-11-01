package com.byethost31.mobpro.uwautsmobpro;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class PesananJadi extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pesanan_jadi);


        //intent dari activity sebelumnya
        Bundle b = getIntent().getExtras();
        //membuat obyek dari widget textview

        TextView TVnamakue = (TextView) findViewById(R.id.TVnamakue);
        ImageView IVnamagambar = (ImageView) findViewById(R.id.gambarkue);
        TextView TVkepada = (TextView) findViewById(R.id.TVkepada);
        TextView TVpengirim = (TextView) findViewById(R.id.TVpengirim);
        TextView TVpesanpengirim = (TextView) findViewById(R.id.TVpesanpengirim);


        TVnamakue.setText(b.getCharSequence("namakue"));
        TVkepada.setText(b.getCharSequence("pesanpengirim"));
        TVpengirim.setText(b.getCharSequence("kepada"));
        TVpesanpengirim.setText(b.getCharSequence("pengirim"));

        String mDrawableName = (String) b.getCharSequence("gambarkue");
        int resID = getResources().getIdentifier(mDrawableName , "drawable", getPackageName());
        IVnamagambar.setImageResource(resID);

        //selesai intent dari activity sebelumnya






    };












}
