package com.firstapp.task_real_time_example;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;

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

//        link=findViewById(R.id.link_id);

        recyclerView=findViewById(R.id.recycelr_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        placeAdapter=new PlaceAdapter(getApplicationContext(),placeModelList);
        recyclerView.setAdapter(placeAdapter);


        loadData();





    }


    private void loadData() {

        placeModel=new PlaceModel("966634293","Hyderabad",R.drawable.img,R.drawable.ic_baseline_call_24,R.drawable.ic_baseline_location_on_24,
                R.drawable.ic_baseline_link_24,R.drawable.ic_baseline_keyboard_arrow_down_24,true,78.474686,17.361543,"https://hyderabadtourism.in/charminar");

        placeModelList.add(placeModel);

        placeModel=new PlaceModel("9046738909","vizag",R.drawable.vizag,R.drawable.ic_baseline_call_24,R.drawable.ic_baseline_location_on_24,
                R.drawable.ic_baseline_link_24,R.drawable.ic_baseline_keyboard_arrow_down_24,true,78.474686,17.361543,"https://vizagport.com/");

        placeModelList.add(placeModel);


        placeModel=new PlaceModel("8184962856","Anakapalli",R.drawable.anakapalli,R.drawable.ic_baseline_call_24,R.drawable.ic_baseline_location_on_24,
                R.drawable.ic_baseline_link_24,R.drawable.ic_baseline_keyboard_arrow_down_24,true,83.237000,17.689418,"https://anakapalli.ap.gov.in/");

        placeModelList.add(placeModel);

        placeModel=new PlaceModel("9550154116","Annavaram",R.drawable.annavaram,R.drawable.ic_baseline_call_24,R.drawable.ic_baseline_location_on_24,
                R.drawable.ic_baseline_link_24,R.drawable.ic_baseline_keyboard_arrow_down_24,true,82.401429,17.282504,"https://www.annavaramdevasthanam.nic.in/Home/Index");

        placeModelList.add(placeModel);

        placeModel=new PlaceModel("8121331423","Rajamundry",R.drawable.rajamundry,R.drawable.ic_baseline_call_24,R.drawable.ic_baseline_location_on_24,
                R.drawable.ic_baseline_link_24,R.drawable.ic_baseline_keyboard_arrow_down_24,true,81.772892,17.006946,"https://hyderabadtourism.in/charminar");

        placeModelList.add(placeModel);

        placeModel=new PlaceModel("7095854832","Vijayawada",R.drawable.viyawada,R.drawable.ic_baseline_call_24,R.drawable.ic_baseline_location_on_24,
                R.drawable.ic_baseline_link_24,R.drawable.ic_baseline_keyboard_arrow_down_24,true,80.635353,16.514456,"https://kanakadurgamma.org/");

        placeModelList.add(placeModel);

        placeModel=new PlaceModel("8688143247","Guntur",R.drawable.guntur,R.drawable.ic_baseline_call_24,R.drawable.ic_baseline_location_on_24,
                R.drawable.ic_baseline_link_24,R.drawable.ic_baseline_keyboard_arrow_down_24,true,80.435202,16.296210,"https://guntur.ap.gov.in/");

        placeModelList.add(placeModel);

        placeModel=new PlaceModel("8309861261","ongole",R.drawable.ongole,R.drawable.ic_baseline_call_24,R.drawable.ic_baseline_location_on_24,
                R.drawable.ic_baseline_link_24,R.drawable.ic_baseline_keyboard_arrow_down_24,true,80.044841,15.500700,"https://en.wikipedia.org/wiki/Ongole");

        placeModelList.add(placeModel);

        placeModel=new PlaceModel("9666534293","kurnool",R.drawable.kurnool,R.drawable.ic_baseline_call_24,R.drawable.ic_baseline_location_on_24,
                R.drawable.ic_baseline_link_24,R.drawable.ic_baseline_keyboard_arrow_down_24,true,78.023322,15.814649,"https://buddymantra.com/10-things-to-do-in-kurnool/");

        placeModelList.add(placeModel);

        placeModel=new PlaceModel("9515185778","warngal",R.drawable.img_2,R.drawable.ic_baseline_call_24,R.drawable.ic_baseline_location_on_24,
                R.drawable.ic_baseline_link_24,R.drawable.ic_baseline_keyboard_arrow_down_24,true,79.613454,17.976098,"https://timesofindia.indiatimes.com/travel/warangal/travel-guide/places-to-visit-in-warangal-a-lesson-in-history/gs59593169.cms");

        placeModelList.add(placeModel);

        placeModel=new PlaceModel("9618904468","Khammam",R.drawable.img_1,R.drawable.ic_baseline_call_24,R.drawable.ic_baseline_location_on_24,
                R.drawable.ic_baseline_link_24,R.drawable.ic_baseline_keyboard_arrow_down_24,true,80.145392,17.239883,"https://khammam.telangana.gov.in/");

        placeModelList.add(placeModel);

        placeModel=new PlaceModel("9000780736","Hyderabad",R.drawable.img,R.drawable.ic_baseline_call_24,R.drawable.ic_baseline_location_on_24,
                R.drawable.ic_baseline_link_24,R.drawable.ic_baseline_keyboard_arrow_down_24,true,78.44693,17.42416,"https://hyderabadtourism.in/charminar");

        placeModelList.add(placeModel);

        placeModel=new PlaceModel("9046738909","vizag",R.drawable.vizag,R.drawable.ic_baseline_call_24,R.drawable.ic_baseline_location_on_24,
                R.drawable.ic_baseline_link_24,R.drawable.ic_baseline_keyboard_arrow_down_24,true,83.237000,17.689418,"https://vizagport.com/");

        placeModelList.add(placeModel);


        placeModel=new PlaceModel("8184962856","Anakapalli",R.drawable.anakapalli,R.drawable.ic_baseline_call_24,R.drawable.ic_baseline_location_on_24,
                R.drawable.ic_baseline_link_24,R.drawable.ic_baseline_keyboard_arrow_down_24,true,83.237000,17.689418,"https://anakapalli.ap.gov.in/");

        placeModelList.add(placeModel);

        placeModel=new PlaceModel("9550154116","Annavaram",R.drawable.annavaram,R.drawable.ic_baseline_call_24,R.drawable.ic_baseline_location_on_24,
                R.drawable.ic_baseline_link_24,R.drawable.ic_baseline_keyboard_arrow_down_24,true,82.401429,17.282504,"https://www.annavaramdevasthanam.nic.in/Home/Index");

        placeModelList.add(placeModel);

        placeModel=new PlaceModel("8121331423","Rajamundry",R.drawable.rajamundry,R.drawable.ic_baseline_call_24,R.drawable.ic_baseline_location_on_24,
                R.drawable.ic_baseline_link_24,R.drawable.ic_baseline_keyboard_arrow_down_24,true,81.772892,17.006946,"https://www.india.com/travel/articles/hyderabad-rajahmundry-reach-rajahmundry-hyderabad-road/");

        placeModelList.add(placeModel);

        placeModel=new PlaceModel("7095854832","Vijayawada",R.drawable.viyawada,R.drawable.ic_baseline_call_24,R.drawable.ic_baseline_location_on_24,
                R.drawable.ic_baseline_link_24,R.drawable.ic_baseline_keyboard_arrow_down_24,true,80.635353,16.514456,"https://kanakadurgamma.org/");

        placeModelList.add(placeModel);

        placeModel=new PlaceModel("8688143247","Guntur",R.drawable.guntur,R.drawable.ic_baseline_call_24,R.drawable.ic_baseline_location_on_24,
                R.drawable.ic_baseline_link_24,R.drawable.ic_baseline_keyboard_arrow_down_24,true,80.435202,16.296210,"https://guntur.ap.gov.in/");

        placeModelList.add(placeModel);

        placeModel=new PlaceModel("8309861261","ongole",R.drawable.ongole,R.drawable.ic_baseline_call_24,R.drawable.ic_baseline_location_on_24,
                R.drawable.ic_baseline_link_24,R.drawable.ic_baseline_keyboard_arrow_down_24,true,80.044841,15.500700,"https://en.wikipedia.org/wiki/Ongole");

        placeModelList.add(placeModel);

        placeModel=new PlaceModel("9666534293","kurnool",R.drawable.kurnool,R.drawable.ic_baseline_call_24,R.drawable.ic_baseline_location_on_24,
                R.drawable.ic_baseline_link_24,R.drawable.ic_baseline_keyboard_arrow_down_24,true,78.023322,15.814649,"https://buddymantra.com/10-things-to-do-in-kurnool/");

        placeModelList.add(placeModel);

        placeModel=new PlaceModel("9515185778","warngal",R.drawable.img_2,R.drawable.ic_baseline_call_24,R.drawable.ic_baseline_location_on_24,
                R.drawable.ic_baseline_link_24,R.drawable.ic_baseline_keyboard_arrow_down_24,true,79.613454,17.976098,"https://timesofindia.indiatimes.com/travel/warangal/travel-guide/places-to-visit-in-warangal-a-lesson-in-history/gs59593169.cms");

        placeModelList.add(placeModel);

        placeModel=new PlaceModel("9618904468","Khammam",R.drawable.img_1,R.drawable.ic_baseline_call_24,R.drawable.ic_baseline_location_on_24,
                R.drawable.ic_baseline_link_24,R.drawable.ic_baseline_keyboard_arrow_down_24,true,80.145392,17.239883,"https://khammam.telangana.gov.in/");

        placeModelList.add(placeModel);

        placeModel=new PlaceModel("9000780736","Hyderabad",R.drawable.img,R.drawable.ic_baseline_call_24,R.drawable.ic_baseline_location_on_24,
                R.drawable.ic_baseline_link_24,R.drawable.ic_baseline_keyboard_arrow_down_24,true,78.44693,17.42416,"https://hyderabadtourism.in/charminar");

        placeModelList.add(placeModel);

        placeModel=new PlaceModel("9046738909","vizag",R.drawable.vizag,R.drawable.ic_baseline_call_24,R.drawable.ic_baseline_location_on_24,
                R.drawable.ic_baseline_link_24,R.drawable.ic_baseline_keyboard_arrow_down_24,true,83.237000,17.689418,"https://vizagport.com/");

        placeModelList.add(placeModel);


        placeModel=new PlaceModel("8184962856","Anakapalli",R.drawable.anakapalli,R.drawable.ic_baseline_call_24,R.drawable.ic_baseline_location_on_24,
                R.drawable.ic_baseline_link_24,R.drawable.ic_baseline_keyboard_arrow_down_24,true,83.237000,17.689418,"https://anakapalli.ap.gov.in/");

        placeModelList.add(placeModel);

        placeModel=new PlaceModel("9550154116","Annavaram",R.drawable.annavaram,R.drawable.ic_baseline_call_24,R.drawable.ic_baseline_location_on_24,
                R.drawable.ic_baseline_link_24,R.drawable.ic_baseline_keyboard_arrow_down_24,true,82.401429,17.282504,"https://www.annavaramdevasthanam.nic.in/Home/Index");

        placeModelList.add(placeModel);









        placeAdapter.notifyDataSetChanged();



    }
}
