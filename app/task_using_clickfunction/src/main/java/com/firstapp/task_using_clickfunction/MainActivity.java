package com.firstapp.task_using_clickfunction;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ImageView call,location,link,placeimage,downarrow;
    PlaceAdapter placeAdapter;
    PlaceModel placeModel;
    RecyclerView recyclerView;
    List<PlaceModel> placeModelList=new ArrayList<>();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        link=findViewById(R.id.link_id);

        recyclerView=findViewById(R.id.recycelr_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        placeAdapter=new PlaceAdapter(getApplicationContext(),placeModelList);
        recyclerView.setAdapter(placeAdapter);


        loadData();





    }


    private void loadData() {

        placeModel=new PlaceModel("Hyderabad",R.drawable.img,R.drawable.ic_baseline_call_24,
                R.drawable.ic_baseline_location_on_24,R.drawable.ic_baseline_link_24,
                R.drawable.ic_baseline_keyboard_arrow_down_24,true,78.427026,17.518216);
        placeModelList.add(placeModel);


        placeModel=new PlaceModel("Vijayawada",R.drawable.viyawada,R.drawable.ic_baseline_call_24,
                R.drawable.ic_baseline_location_on_24,R.drawable.ic_baseline_link_24,
                R.drawable.ic_baseline_keyboard_arrow_down_24,true,78.427026,17.518216);
        placeModelList.add(placeModel);


        placeModel=new PlaceModel("Vizag",R.drawable.vizag,R.drawable.ic_baseline_call_24,
                R.drawable.ic_baseline_location_on_24,R.drawable.ic_baseline_link_24,
                R.drawable.ic_baseline_keyboard_arrow_down_24,true,78.427026,17.518216);
        placeModelList.add(placeModel);


        placeModel=new PlaceModel("Anakapalli",R.drawable.anakapalli,R.drawable.ic_baseline_call_24,
                R.drawable.ic_baseline_location_on_24,R.drawable.ic_baseline_link_24,
                R.drawable.ic_baseline_keyboard_arrow_down_24,true,78.427026,17.518216);
        placeModelList.add(placeModel);


        placeModel=new PlaceModel("Annavaram",R.drawable.annavaram,R.drawable.ic_baseline_call_24,
                R.drawable.ic_baseline_location_on_24,R.drawable.ic_baseline_link_24,
                R.drawable.ic_baseline_keyboard_arrow_down_24,true,78.427026,17.518216);
        placeModelList.add(placeModel);


        placeModel=new PlaceModel("Rajamundry",R.drawable.rajamundry,R.drawable.ic_baseline_call_24,
                R.drawable.ic_baseline_location_on_24,R.drawable.ic_baseline_link_24,
                R.drawable.ic_baseline_keyboard_arrow_down_24,true,78.427026,17.518216);
        placeModelList.add(placeModel);


        placeModel=new PlaceModel("Vijayawada",R.drawable.viyawada,R.drawable.ic_baseline_call_24,
                R.drawable.ic_baseline_location_on_24,R.drawable.ic_baseline_link_24,
                R.drawable.ic_baseline_keyboard_arrow_down_24,true,78.427026,17.518216);
        placeModelList.add(placeModel);


        placeModel=new PlaceModel("ongole",R.drawable.ongole,R.drawable.ic_baseline_call_24,
                R.drawable.ic_baseline_location_on_24,R.drawable.ic_baseline_link_24,
                R.drawable.ic_baseline_keyboard_arrow_down_24,true,78.427026,17.518216);
        placeModelList.add(placeModel);


        placeModel=new PlaceModel("kurnool",R.drawable.kurnool,R.drawable.ic_baseline_call_24,
                R.drawable.ic_baseline_location_on_24,R.drawable.ic_baseline_link_24,
                R.drawable.ic_baseline_keyboard_arrow_down_24,true,78.427026,17.518216);
        placeModelList.add(placeModel);


        placeModel=new PlaceModel("warangal",R.drawable.img_1,R.drawable.ic_baseline_call_24,
                R.drawable.ic_baseline_location_on_24,R.drawable.ic_baseline_link_24,
                R.drawable.ic_baseline_keyboard_arrow_down_24,true,78.427026,17.518216);
        placeModelList.add(placeModel);


        placeModel=new PlaceModel("chittoor",R.drawable.img-2,R.drawable.ic_baseline_call_24,
                R.drawable.ic_baseline_location_on_24,R.drawable.ic_baseline_link_24,
                R.drawable.ic_baseline_keyboard_arrow_down_24,true,78.427026,17.518216);
        placeModelList.add(placeModel);


        placeModel=new PlaceModel("vizag",R.drawable.vizag,R.drawable.ic_baseline_call_24,
                R.drawable.ic_baseline_location_on_24,R.drawable.ic_baseline_link_24,
                R.drawable.ic_baseline_keyboard_arrow_down_24,true,78.427026,17.518216);
        placeModelList.add(placeModel);


        placeModel=new PlaceModel("annavaram",R.drawable.annavaram,R.drawable.ic_baseline_call_24,
                R.drawable.ic_baseline_location_on_24,R.drawable.ic_baseline_link_24,
                R.drawable.ic_baseline_keyboard_arrow_down_24,true,78.427026,17.518216);
        placeModelList.add(placeModel);


        placeModel=new PlaceModel("Tuni",R.drawable.img,R.drawable.ic_baseline_call_24,
                R.drawable.ic_baseline_location_on_24,R.drawable.ic_baseline_link_24,
                R.drawable.ic_baseline_keyboard_arrow_down_24,true,78.427026,17.518216);
        placeModelList.add(placeModel);


        placeModel=new PlaceModel("vijayawada",R.drawable.viyawada,R.drawable.ic_baseline_call_24,
                R.drawable.ic_baseline_location_on_24,R.drawable.ic_baseline_link_24,
                R.drawable.ic_baseline_keyboard_arrow_down_24,true,78.427026,17.518216);
        placeModelList.add(placeModel);


        placeModel=new PlaceModel("Kurnool",R.drawable.kurnool,R.drawable.ic_baseline_call_24,
                R.drawable.ic_baseline_location_on_24,R.drawable.ic_baseline_link_24,
                R.drawable.ic_baseline_keyboard_arrow_down_24,true,78.427026,17.518216);
        placeModelList.add(placeModel);


        placeModel=new PlaceModel("anakapalli",R.drawable.anakapalli,R.drawable.ic_baseline_call_24,
                R.drawable.ic_baseline_location_on_24,R.drawable.ic_baseline_link_24,
                R.drawable.ic_baseline_keyboard_arrow_down_24,true,78.427026,17.518216);
        placeModelList.add(placeModel);


        placeModel=new PlaceModel("khammam",R.drawable.img_2,R.drawable.ic_baseline_call_24,
                R.drawable.ic_baseline_location_on_24,R.drawable.ic_baseline_link_24,
                R.drawable.ic_baseline_keyboard_arrow_down_24,true,78.427026,17.518216);
        placeModelList.add(placeModel);


        placeModel=new PlaceModel("Rajamundry",R.drawable.rajamundry,R.drawable.ic_baseline_call_24,
                R.drawable.ic_baseline_location_on_24,R.drawable.ic_baseline_link_24,
                R.drawable.ic_baseline_keyboard_arrow_down_24,true,78.427026,17.518216);
        placeModelList.add(placeModel);


        placeModel=new PlaceModel("vizag",R.drawable.vizag,R.drawable.ic_baseline_call_24,
                R.drawable.ic_baseline_location_on_24,R.drawable.ic_baseline_link_24,
                R.drawable.ic_baseline_keyboard_arrow_down_24,true,78.427026,17.518216);
        placeModelList.add(placeModel);


        placeModel=new PlaceModel("Hyderabad",R.drawable.img,R.drawable.ic_baseline_call_24,
                R.drawable.ic_baseline_location_on_24,R.drawable.ic_baseline_link_24,
                R.drawable.ic_baseline_keyboard_arrow_down_24,true,78.427026,17.518216);
        placeModelList.add(placeModel);


        placeModel=new PlaceModel("Rajamundry",R.drawable.rajamundry,R.drawable.ic_baseline_call_24,
                R.drawable.ic_baseline_location_on_24,R.drawable.ic_baseline_link_24,
                R.drawable.ic_baseline_keyboard_arrow_down_24,true,78.427026,17.518216);
        placeModelList.add(placeModel);


        placeModel=new PlaceModel("ankaapalli",R.drawable.anakapalli,R.drawable.ic_baseline_call_24,
                R.drawable.ic_baseline_location_on_24,R.drawable.ic_baseline_link_24,
                R.drawable.ic_baseline_keyboard_arrow_down_24,true,78.427026,17.518216);
        placeModelList.add(placeModel);


        placeModel=new PlaceModel("Kurnul",R.drawable.kurnool,R.drawable.ic_baseline_call_24,
                R.drawable.ic_baseline_location_on_24,R.drawable.ic_baseline_link_24,
                R.drawable.ic_baseline_keyboard_arrow_down_24,true,78.427026,17.518216);
        placeModelList.add(placeModel);


        placeModel=new PlaceModel("annavaram",R.drawable.annavaram,R.drawable.ic_baseline_call_24,
                R.drawable.ic_baseline_location_on_24,R.drawable.ic_baseline_link_24,
                R.drawable.ic_baseline_keyboard_arrow_down_24,true,78.427026,17.518216);
        placeModelList.add(placeModel);


        placeModel=new PlaceModel("vizag",R.drawable.vizag,R.drawable.ic_baseline_call_24,
                R.drawable.ic_baseline_location_on_24,R.drawable.ic_baseline_link_24,
                R.drawable.ic_baseline_keyboard_arrow_down_24,true,78.427026,17.518216);
        placeModelList.add(placeModel);

        placeAdapter.notifyDataSetChanged();



    }
    }

//        placeModel=new PlaceModel("Hyderabad", R.drawable.img,R.drawable.ic_baseline_call_24,R.drawable.ic_baseline_location_on_24,R.drawable.ic_baseline_link_24,R.drawable.ic_baseline_keyboard_arrow_down_24);
//        placeModelList.add(placeModel);
//
//        placeModel=new PlaceModel("Vizayawada",R.drawable.viyawada ,R.drawable.ic_baseline_call_24,R.drawable.ic_baseline_location_on_24,R.drawable.ic_baseline_link_24,R.drawable.ic_baseline_keyboard_arrow_down_24);
//        placeModelList.add(placeModel);
//
//        placeModel=new PlaceModel("Rajamundry",R.drawable.rajamundry,R.drawable.ic_baseline_call_24,R.drawable.ic_baseline_location_on_24,R.drawable.ic_baseline_link_24,R.drawable.ic_baseline_keyboard_arrow_down_24);
//        placeModelList.add(placeModel);
//
//        placeModel=new PlaceModel("vizag",R.drawable.vizag,R.drawable.ic_baseline_call_24,R.drawable.ic_baseline_location_on_24,R.drawable.ic_baseline_link_24,R.drawable.ic_baseline_keyboard_arrow_down_24);
//        placeModelList.add(placeModel);
//
//        placeModel=new PlaceModel("Anakapalli",R.drawable.anakapalli,R.drawable.ic_baseline_call_24,R.drawable.ic_baseline_location_on_24,R.drawable.ic_baseline_link_24,R.drawable.ic_baseline_keyboard_arrow_down_24);
//        placeModelList.add(placeModel);
//
//        placeModel=new PlaceModel("Annavaram",R.drawable.annavaram,R.drawable.ic_baseline_call_24,R.drawable.ic_baseline_location_on_24,R.drawable.ic_baseline_link_24,R.drawable.ic_baseline_keyboard_arrow_down_24);
//        placeModelList.add(placeModel);
//
//        placeModel=new PlaceModel("Guntur",R.drawable.guntur,R.drawable.ic_baseline_call_24,R.drawable.ic_baseline_location_on_24,R.drawable.ic_baseline_link_24,R.drawable.ic_baseline_keyboard_arrow_down_24);
//        placeModelList.add(placeModel);
//
//        placeModel=new PlaceModel("Ongole",R.drawable.ongole,R.drawable.ic_baseline_call_24,R.drawable.ic_baseline_location_on_24,R.drawable.ic_baseline_link_24,R.drawable.ic_baseline_keyboard_arrow_down_24);
//        placeModelList.add(placeModel);
//
//        placeModel=new PlaceModel("Kurnool",R.drawable.kurnool,R.drawable.ic_baseline_call_24,R.drawable.ic_baseline_location_on_24,R.drawable.ic_baseline_link_24,R.drawable.ic_baseline_keyboard_arrow_down_24);
//        placeModelList.add(placeModel);
//
//        placeModel=new PlaceModel("Kammam",R.drawable.img_2,R.drawable.ic_baseline_call_24,R.drawable.ic_baseline_location_on_24,R.drawable.ic_baseline_link_24,R.drawable.ic_baseline_keyboard_arrow_down_24);
//        placeModelList.add(placeModel);
//
//        placeModel=new PlaceModel("Warangal",R.drawable.img_1,R.drawable.ic_baseline_call_24,R.drawable.ic_baseline_location_on_24,R.drawable.ic_baseline_link_24,R.drawable.ic_baseline_keyboard_arrow_down_24);
//        placeModelList.add(placeModel);
//
//
//
//
//        placeAdapter.notifyDataSetChanged();
//
//    }


