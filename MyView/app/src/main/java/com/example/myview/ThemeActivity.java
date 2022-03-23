package com.example.myview;

import androidx.appcompat.app.AppCompatActivity;

import android.app.WallpaperManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.io.IOException;

public class ThemeActivity extends AppCompatActivity {
    LinearLayout theme;
    Button btn_back, btn_save;
    String newString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theme);

        btn_back=(Button)findViewById(R.id.btn_back);
        btn_save=(Button)findViewById(R.id.btn_save);
        theme=(LinearLayout)findViewById(R.id.theme);


        if(savedInstanceState==null){
            Bundle extras=getIntent().getExtras();
            if(extras==null){
                newString=null;
            }else {
                newString=extras.getString("PATH_PICTURE");
                if(newString.equals("btn_1")){
                    theme.setBackgroundResource(R.drawable.bg_1);

                    btn_save.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            WallpaperManager wlp= WallpaperManager.getInstance(getApplicationContext());
                            Toast.makeText(getApplicationContext(),"Berhasil dipasang",Toast.LENGTH_SHORT).show();
                            try{
                                wlp.setResource(+ R.drawable.bg_1);
                            }catch  (IOException e){
                                e.printStackTrace();
                            }
                        }
                    });
                }else if (newString.equals("btn_2")) {
                    theme.setBackgroundResource(R.drawable.bg_2);
                    btn_save.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            WallpaperManager wlp=WallpaperManager.getInstance(getApplicationContext());
                            Toast.makeText(getApplicationContext(),"Berhasil dipasang",Toast.LENGTH_SHORT).show();
                            try{
                                wlp.setResource(+ R.drawable.bg_2);
                            }catch (IOException e){
                                e.printStackTrace();
                            }
                        }
                    });

                }else {
                    //write the statement
                }
            }
        }

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }
}