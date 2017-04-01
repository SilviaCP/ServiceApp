package com.example.usuarioupt.serviceapp;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.widget.Toast;

/**
 * Created by USUARIOUPT on 01/04/2017.
 */

public class ServicioMusica extends Service {

    MediaPlayer reproductor;

    @Override
    public void onCreate(){
        Toast.makeText(getApplicationContext()
                ,"Servicio creado"
                ,Toast.LENGTH_SHORT).show();
        reproductor = MediaPlayer.create(
                getApplicationContext(), R.raw.audio);
    }

    @Override
    public int onStartCommand(Intent intent, int flags,
                              int startId){
        Toast.makeText(getApplicationContext()
                    ,"Servicio Arrancado"+startId
                    ,Toast.LENGTH_SHORT).show();

        reproductor.start();

        return START_STICKY;
    }


    @Override
    public void onDestroy(){
        Toast.makeText(this
                    ,"Servicio Detenido"
                    ,Toast.LENGTH_SHORT).show();

        reproductor.stop();
    }


    @Nullable
    @Override
    public IBinder onBind(Intent intent){
        return null;
    }
}
