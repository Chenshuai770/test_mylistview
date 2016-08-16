package com.cs.test_mylistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by chenshuai on 2016/8/16.
 */
public class ChatItemListViewAdapter extends BaseAdapter {


    private List<ChatItemListBeen> mData;
    private LayoutInflater mInflater;
    public ChatItemListViewAdapter(Context context,List<ChatItemListBeen> date){
        this.mData=date;
        mInflater=LayoutInflater.from(context);
    }





    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public Object getItem(int position) {
        return mData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getItemViewType(int position) {
        ChatItemListBeen been =mData.get(position);
        return been.getType();
    }

    @Override
    public int getViewTypeCount() {
        return 2;
    }
    public final class ViewHolder{
        public ImageView icon;
        public TextView text;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView==null){
            if (getItemViewType(position)==0){
                viewHolder=new ViewHolder();
                convertView = mInflater.inflate(
                        R.layout.item_chat, null);
                viewHolder.icon= (ImageView) convertView.findViewById(R.id.image);
                viewHolder.text= (TextView) convertView.findViewById(R.id.text_in);

            }else {
                viewHolder=new ViewHolder();
                convertView=mInflater.inflate(R.layout.item_out,null);
                viewHolder.icon= (ImageView) convertView.findViewById(R.id.image);
                viewHolder.text= (TextView) convertView.findViewById(R.id.text_in);

            }
            convertView.setTag(viewHolder);
        }else {
           viewHolder= (ViewHolder) convertView.getTag();

        }
        viewHolder.icon.setImageBitmap(mData.get(position).getIcon());
        viewHolder.text.setText(mData.get(position).getText());
        return convertView;
    }

}
