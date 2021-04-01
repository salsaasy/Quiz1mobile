package com.example.quiz1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void goToBiodata(View view) {
        Intent i = new Intent(MainActivity.this, Biodata.class);
        startActivity(i);
    }

    public void goToMaps(View view) {
        Uri uri =Uri.parse("geo:-5.142021,119.497826");
        Intent a = new Intent(Intent.ACTION_VIEW,uri);
        a.setPackage("com.google.android.apps.maps");
        startActivity(a);
    }

    public void goToCall(View view) {
        Uri uri2 = Uri.parse("tel:" + "081356253191");
        Intent b = new Intent(Intent.ACTION_VIEW,uri2);
        startActivity(b);
    }

    public void clickLogout(View view) {
        logout(this);
    }

    public static void logout(Activity activity) {
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setTitle("Keluar");
        builder.setMessage("Serius mau keluar?");
        builder.setPositiveButton("Iye", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                activity.finishAffinity();
                System.exit(0);
            }
        });
        builder.setNegativeButton("Ndaji", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        builder.show();
    }

}