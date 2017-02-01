package cn.jx.fashionarchitecture.images;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.List;

import cn.jx.fashionarchitecture.R;

/**
 *
 */

class ImagesAdapter extends RecyclerView.Adapter<ImagesAdapter.ViewHolder> {

    List<ImagesViewModel> mDataSet;


    ImagesAdapter(List<ImagesViewModel> data){
        mDataSet = data;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_image, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        ImagesViewModel image = mDataSet.get(position);
        Glide.with(holder.itemView.getContext()).load("http://www.bing.com" + image.url).into(holder.mImageView);
    }

    @Override
    public int getItemCount() {
        return mDataSet.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        ImageView mImageView;
        ViewHolder(View itemView) {
            super(itemView);
            mImageView = (ImageView) itemView.findViewById(R.id.image_cover);
        }
    }
}
