package com.firstapp.task_real_time_example;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

//import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;

public class PlaceAdapter extends RecyclerView.Adapter<PlaceAdapter.PlaceHolder> {
    Context context;
    List<PlaceModel> placeModelList = new ArrayList<>();

    double latitude;
    double longitude;
    
    public PlaceAdapter(Context context, List<PlaceModel> placeModelList) {
        this.context = context;
        this.placeModelList = placeModelList;
    }

    @NonNull
    @Override
    public PlaceHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View root = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_design, parent, false);
        return new PlaceHolder(root);
    }

    @Override
    public void onBindViewHolder(@NonNull PlaceHolder holder, @SuppressLint("RecyclerView") int position) {

        PlaceModel placeModel = placeModelList.get(position);
        holder.placeImage.setImageResource(placeModelList.get(position).getPlaceimage());
        holder.placename.setText(placeModelList.get(position).getPlacename());
        holder.downarrow.setImageResource(placeModelList.get(position).getDownarrow());
        holder.callimage.setImageResource(placeModelList.get(position).getCallimage());
        holder.linkimage.setImageResource(placeModelList.get(position).getLinkimage());
        holder.mapimage.setImageResource(placeModelList.get(position).getMapimage());

        boolean isExpanded = placeModelList.get(position).isExpand();
        holder.expandablelayout.setVisibility(isExpanded ? View.GONE : View.VISIBLE);

//        holder. mapimage.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String label=placeModelList.get();
//                String uriBegin = "geo:" +latitude + " ," +longitude;
//
//                String query = latitude + "," + longitude + "(" + label + ")";
//
//                String encodeQuery = Uri.encode(query);
//
//                String uriString = uriBegin + "?q=" + encodeQuery + "&z=16";
//
//                Uri uri = Uri.parse(uriString);
//
//                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
//                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
////                intent.setAction(String.valueOf(intent.setAction(Intent.ACTION_VIEW)));
//
//                context.startActivity(intent);
//
//            }
//        });
        holder.linkimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                PlaceModel placeModel = placeModelList.get(position);
//                placeModel.setLinkimage(placeModel.linkimage);

//                Intent intent=new Intent();
//                intent.setAction(intent.ACTION_VIEW);
//                intent.setData(Uri.parse("http://www.google.com"));
//                startActivity(Intent.createChooser(intent,"Title"));

                try {
                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(placeModelList.get(holder.getAdapterPosition()).getLink()));
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);

//                    intent.setData(Uri.parse(""));
                    context.startActivity(intent);
                }
                catch (Exception e)
                {
                    e.printStackTrace();

                    Toast.makeText(context, ""+e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                }


            }
        });






//        holder.linkimage.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                Intent intent=new Intent();
//                intent.setAction(intent.ACTION_VIEW);
//                intent.setData(Uri.parse("http://www.google.com"));
//                context.startActivity(Intent.createChooser(intent,"Title"));
//
//                Toast.makeText(context, "Browser selected", Toast.LENGTH_SHORT).show();
////                PlaceModel placeModel = placeModelList.get(getItemCount());
////                placeModel.setLinkimage(placeModel.linkimage);
////                Intent intent = new Intent();
////                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
////                intent.setAction(String.valueOf(intent.setAction(Intent.ACTION_VIEW)));
////                intent.setData(Uri.parse("https://www.google.com"));
////                context.startActivity(intent);
//
////                Toast.makeText(context, "link is selected", Toast.LENGTH_SHORT).show();
//
//            }
//        });
        holder.callimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                        try {
                            Intent intent=new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+placeModelList.get(holder.getAdapterPosition()).getMobilenumber()));
                            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);

                            context.startActivity(intent);

//                            BreakIterator mobilenumber = null;
//                            String str1=mobilenumber.getText().toString();
//                            if(str1.trim().equals("10")){
//                                Toast.makeText(context.getApplicationContext(), "pls enter your name ", Toast.LENGTH_SHORT).show();
//                                return;
//                            }
//
//                            context.startActivity(intent);
//
//                            Toast.makeText(context.getApplicationContext(),"Calling", Toast.LENGTH_SHORT).show();

                        }catch (Exception e)
                        {
                            e.printStackTrace();
                            Toast.makeText(context.getApplicationContext(), "Failed", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }



    @Override
    public int getItemCount() {
        return placeModelList.size();
    }

    public class PlaceHolder extends RecyclerView.ViewHolder {

        TextView placename;
        ImageView placeImage, downarrow, linkimage, mapimage, callimage;
        LinearLayout expandablelayout;

        public PlaceHolder(@NonNull View itemView) {
            super(itemView);
            placename = itemView.findViewById(R.id.place_name);
            placeImage = itemView.findViewById(R.id.placeimage);
            downarrow = itemView.findViewById(R.id.downarrow_id);
            linkimage = itemView.findViewById(R.id.link_id);
            mapimage = itemView.findViewById(R.id.location_id);
            callimage = itemView.findViewById(R.id.call_id);


            expandablelayout = itemView.findViewById(R.id.expandable_id);

            downarrow.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    PlaceModel placeModel = placeModelList.get(getAdapterPosition());
                    placeModel.setExpand(!placeModel.isExpand());
                    notifyDataSetChanged();
                }
            });
            mapimage.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String label=placeModelList.get(getAdapterPosition()).getPlacename();
                    String uriBegin = "geo:" +placeModelList.get(getAdapterPosition()).getLatitude() + " ," +placeModelList.get(getAdapterPosition()).getLongitude();

                    String query = placeModelList.get(getAdapterPosition()).getLatitude() + "," + placeModelList.get(getAdapterPosition()).getLongitude() + "(" + label + ")";

                    String encodeQuery = Uri.encode(query);

                    String uriString = uriBegin + "?q=" + encodeQuery + "&z=16";

                    Uri uri = Uri.parse(uriString);

                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
//                intent.setAction(String.valueOf(intent.setAction(Intent.ACTION_VIEW)));

                    context.startActivity(intent);

                }
            });







//            mapimage.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    String label = "Hyderabad";
//                    String uriBegin = "geo:" + latitude + "," + longitude;
//
//                    String query = latitude + "," + longitude + "(" + label + ")";
//
//                    String encodeQuery = Uri.encode(query);
//
//                    String uriString = uriBegin + "?q=" + encodeQuery + "&z=16";
//
//                    Uri uri = Uri.parse(uriString);
//
//                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
//
//                    context.startActivity(intent);
//                }
//            });


        }
    }
}

