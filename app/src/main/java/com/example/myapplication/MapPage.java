package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MapPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void recyclingMainPage(View v) {
        Intent intent = new Intent(this, RecyclingCategories.class);
        startActivity(intent);
    }

    public void toHomePage(View v) {
        Intent toHome = new Intent(this, MainActivity.class);
        startActivity(toHome);
    }

    public void cameraPage(View v) {
        Intent toCamera = new Intent(this, CameraPage.class);
        startActivity(toCamera);
    }

    public void settingsPage(View v) {
        Intent toSettings = new Intent(this, SettingsPage.class);
        startActivity(toSettings);
    }

    public void mapPage (View v) {
        Intent toMap = new Intent(this, MapPage.class);
        startActivity(toMap);
    }

    public void plasticMap(View v) {
        Intent toPlastic = new Intent(this, PlasticMap.class);
        startActivity(toPlastic);
    }

    public void paperMap(View v) {
        Intent toPaper = new Intent(this, PaperMap.class);
        startActivity(toPaper);
    }

    public void metalMap(View v) {
        Intent toMetal = new Intent(this, MetalMap.class);
        startActivity(toMetal);
    }

    public void glassMap(View v) {
        Intent toGlass = new Intent(this, GlassMap.class);
        startActivity(toGlass);
    }
}

