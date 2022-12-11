package com.ultralegends.hm11toastalertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button button, buttonAlert, buttonAlert1, buttonAlertList, buttonMC, buttonCustDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        buttonAlert = findViewById(R.id.button_alert_dialog);
        buttonAlert1 = findViewById(R.id.button_alert_dialog1);
        buttonAlertList = findViewById(R.id.button_alert_dialog_with_list);
        buttonMC = findViewById(R.id.button_alert_dialog_with_mc);
        buttonCustDialog = findViewById(R.id.button_customized_dialog);


        