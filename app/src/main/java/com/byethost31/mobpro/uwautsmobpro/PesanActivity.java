package com.byethost31.mobpro.uwautsmobpro;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class PesanActivity extends AppCompatActivity {








    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pesan_activity);


        //intent dari activity sebelumnya
        Bundle b = getIntent().getExtras();
        //membuat obyek dari widget textview

        TextView TVnamakue = (TextView) findViewById(R.id.namakue);
        ImageView namagambar = (ImageView) findViewById(R.id.gambarkue);
        TVnamakue.setText(b.getCharSequence("namakue"));
        String mDrawableName = (String) b.getCharSequence("gambarkue");
        int resID = getResources().getIdentifier(mDrawableName , "drawable", getPackageName());
        namagambar.setImageResource(resID);

        //selesai intent dari activity sebelumnya




        final String namakue = (String) b.getCharSequence("namakue");
        final String gambarkue = (String) b.getCharSequence("gambarkue");
        final TextView pesanpengirim =(TextView) findViewById(R.id.pesanpengirim);
        final TextView kepada =(TextView) findViewById(R.id.kepada);
        final TextView pengirim =(TextView) findViewById(R.id.pengirim);

        Button pesan=(Button)findViewById(R.id.pesan);

        pesan.setOnClickListener(new View.OnClickListener() {



            public void onClick(View arg0) {

                Intent intent = new Intent(getApplicationContext(),PesananJadi.class);
                Bundle b = new Bundle();

                //Menyisipkan tipe data String ke dalam obyek bundle
                b.putString("namakue", namakue);
                b.putString("gambarkue",gambarkue);
                b.putString("pesanpengirim",pesanpengirim.getText().toString());
                b.putString("kepada", kepada.getText().toString());
                b.putString("pengirim",pengirim.getText().toString());



                //Menambahkan bundle intent
                intent.putExtras(b);

                //memulai Activity kedua
                startActivity(intent);


            }

        });









    }



}