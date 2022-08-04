package com.firstapp.task_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Camera;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText mobilenumber;
    Button call,contatcs,gallery,browser,map;
    double latitude=16.5428;
    double longitude=81.5256;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mobilenumber=findViewById(R.id.edit_phone);
      call=findViewById(R.id.Call);
      contatcs=findViewById(R.id.contacts);
      gallery=findViewById(R.id.gallery);
      browser=findViewById(R.id.browser);
      map=findViewById(R.id.map);


      call.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              try {
                  String str1=mobilenumber.getText().toString();
                  if(str1.trim().equals("10")){
                      Toast.makeText(getApplicationContext(), "pls enter your name ", Toast.LENGTH_SHORT).show();
                      return;
                  }
                  Intent intent=new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+str1));
                  startActivity(intent);

                  Toast.makeText(getApplicationContext(), "Calling", Toast.LENGTH_SHORT).show();


              }catch (Exception e)
              {
                  Toast.makeText(getApplicationContext(), "Failed", Toast.LENGTH_SHORT).show();
              }
          }
      });
        contatcs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.setData(Uri.parse("content://contacts/people/"));
                startActivity(i);

            }


        });
        gallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setAction(intent.ACTION_VIEW);
                intent.setData(Uri.parse("content://media/external/images/media"));
                startActivity(intent);

            }


        });
        browser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setAction(intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.google.com"));
                startActivity(Intent.createChooser(intent,"Title"));

            }


        });

        map.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String label="Hyderabad";
                    String uriBegin="geo:"+ latitude + "," + longitude;

                    String query= latitude + "," + longitude + "(" + label + ")";

                    String encodeQuery=Uri.encode(query);

                    String uriString=uriBegin + "?q=" + encodeQuery + "&z=16";

                    Uri uri=Uri.parse(uriString);

                    Intent intent=new Intent(Intent.ACTION_VIEW,uri);

                    startActivity(intent);
                }
            });

//        map.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                try {
//                    String str1=mobilenumber.getText().toString();
//                    if(str1.trim().equals("10")){
//                        Toast.makeText(getApplicationContext(), "pls enter your name ", Toast.LENGTH_SHORT).show();
//                        return;
//                    }
//                    Intent intent=new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+str1));
//                    startActivity(intent);
//
//                    Toast.makeText(getApplicationContext(), "Calling", Toast.LENGTH_SHORT).show();
//
//
//                }catch (Exception e)
//                {
//                    Toast.makeText(getApplicationContext(), "Failed", Toast.LENGTH_SHORT).show();
//                }
//            }
//        });

    }
}