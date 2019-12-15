package com.example.justtip;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class JustTipBarang extends AppCompatActivity {


    private Object String;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_just_tip_barang);
    }

    public void submitOrder(View view) {
        EditText namefield = (EditText) findViewById(R.id.field_name);
        EditText namabar = (EditText) findViewById(R.id.nabar);
        EditText banyakbar = (EditText) findViewById(R.id.bb);
        EditText tglnitip = (EditText) findViewById(R.id.tglntp);
        EditText tglambil = (EditText) findViewById(R.id.tglambil);
        EditText tglkembali = (EditText) findViewById(R.id.tgl);

        String nama = namefield.getText().toString();
        String namabarang = namabar.getText().toString();
        String banyakbarang = banyakbar.getText().toString();
        String tanggalnitip = tglnitip.getText().toString();
        String tanggalambil = tglambil.getText().toString();
        String tanggalkembali = tglkembali.getText().toString();


        String message = createOrderSummary(nama, namabarang, banyakbarang, tanggalnitip, tanggalambil, tanggalkembali);

        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); //only email apps should handle this
        intent.putExtra(Intent.EXTRA_SUBJECT, getString(R.string.order_summary_email_subject) + nama);
        intent.putExtra(Intent.EXTRA_TEXT, message);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }


    }

    private java.lang.String createOrderSummary(String nama, String namabarang,String banyakbarang,String tanggalnitip, String tanggalambil, String tanggalkembali) {
    return nama;
    }


}
