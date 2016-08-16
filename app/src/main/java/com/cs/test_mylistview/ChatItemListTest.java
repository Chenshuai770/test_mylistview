package com.cs.test_mylistview;

import android.app.Activity;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ListView;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by chenshuai on 2016/8/16.
 */
public class ChatItemListTest extends Activity {
    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chartitem);

        mListView = (ListView) findViewById(R.id.listview);


        ChatItemListBeen been1=new ChatItemListBeen();
        been1.setType(0);
        been1.setIcon(BitmapFactory.decodeResource(getResources(),R.mipmap.chatitem_in_bg));
        been1.setText("Hello how are you");


        ChatItemListBeen been2=new ChatItemListBeen();
        been2.setType(1);
        been2.setIcon(BitmapFactory.decodeResource(getResources(),
                R.mipmap.chatitem_out_bg));
        been2.setText("Fine thank you, and you?");

        ChatItemListBeen been3=new ChatItemListBeen();
        been3.setType(0);
        been3.setIcon(BitmapFactory.decodeResource(getResources(),
                R.mipmap.chatitem_in_bg));
        been3.setText("I am fine too");

        ChatItemListBeen been4=new ChatItemListBeen();
        been4.setType(1);
        been4.setIcon(BitmapFactory.decodeResource(getResources(),
                R.mipmap.chatitem_out_bg));
        been4.setText("再见");

        ChatItemListBeen been5=new ChatItemListBeen();
        been5.setType(0);
        been5.setIcon(BitmapFactory.decodeResource(getResources(),
                R.mipmap.chatitem_in_bg));
        been5.setText("See you");

        List<ChatItemListBeen> data;
        data=new LinkedList<ChatItemListBeen>();
        data.add(been1);
        data.add(been2);
        data.add(been3);
        data.add(been4);
        data.add(been5);
        ChatItemListViewAdapter myAdapte=new ChatItemListViewAdapter(this,data);
        mListView.setAdapter(myAdapte);







    }
}
