package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
NotificationManager nm;
PendingIntent pendingIntent;
Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nm= (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        creaChannel();
        intent=new Intent(this, MainActivity.class);
        pendingIntent=PendingIntent.getActivity(this,2234,intent,PendingIntent.FLAG_UPDATE_CURRENT);

    }

    private void creaChannel() {
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            NotificationChannel notificationChannel=new NotificationChannel("MyId","muni",NotificationManager.IMPORTANCE_HIGH);
                notificationChannel.setLightColor(Color.GREEN);
                nm.createNotificationChannel(notificationChannel);

        }

    }

    public void showNotifi(View view) {
        NotificationCompat.Builder builder=new NotificationCompat.Builder(this,"MyId");
        builder.setContentText("Example");
        builder.setContentTitle("Test");
        builder.setContentIntent(pendingIntent);
        builder.setSmallIcon(R.drawable.ic_launcher_foreground);
        nm.notify(2333,builder.build());

    }
}