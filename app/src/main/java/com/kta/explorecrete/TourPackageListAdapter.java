package com.kta.explorecrete;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.LinkedList;

public class TourPackageListAdapter  extends RecyclerView.Adapter<TourPackageListAdapter.TourPackageViewHolder> {

    private final LinkedList<String> mWordList;
    private LayoutInflater mInflater;

    class TourPackageViewHolder extends RecyclerView.ViewHolder{
        public final TextView tourPackageItemView;
        final TourPackageListAdapter mAdapter;

        public TourPackageViewHolder(@NonNull View itemView, TourPackageListAdapter adapter) {
            super(itemView);
            tourPackageItemView = itemView.findViewById(R.id.tourPackageTitle);
            this.mAdapter = adapter;
        }
    }

    public TourPackageListAdapter(Context context, LinkedList<String> mWordList) {
        mInflater = LayoutInflater.from(context);
        this.mWordList = mWordList;
    }


    @NonNull
    @Override
    public TourPackageListAdapter.TourPackageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(R.layout.tourpackage_item, parent, false);
        return new TourPackageViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(@NonNull TourPackageListAdapter.TourPackageViewHolder holder, int position) {
        String mCurrent = mWordList.get(position);
        holder.tourPackageItemView.setText(mCurrent);

    }

    @Override
    public int getItemCount() {
        return mWordList.size();
    }


}


