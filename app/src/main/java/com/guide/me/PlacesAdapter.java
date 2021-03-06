package com.guide.me;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class PlacesAdapter extends ArrayAdapter<Place> {

    public PlacesAdapter(Context context, ArrayList<Place> Places) {

        super(context, 0, Places);
    }


    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Place country = getItem(position);

        TextView place = (TextView) listItemView.findViewById(R.id.place_text_view);

        place.setText(country.getmPlaceNameId());

        TextView address = (TextView) listItemView.findViewById(R.id.adress_text_view);

        address.setText(country.getmPlaceAdressId());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        imageView.setImageResource(country.getmImageResourceId());


        return listItemView;
    }

}
