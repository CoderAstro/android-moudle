package com.sctx.app.android.recycleviewmodel;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.google.gson.Gson;
import com.sctx.app.android.recycleviewmodel.adapter.RecycleViewAdapter;
import com.sctx.app.android.recycleviewmodel.model.ItemModel;


import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;


public class RecycleViewActivity extends AppCompatActivity implements BaseQuickAdapter.RequestLoadMoreListener {


    @BindView(R.id.recycleview)
    RecyclerView recycleview;
    ArrayList<ItemModel.DataBean> lst = new ArrayList<>();
    RecycleViewAdapter recycleViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycleview);
        ButterKnife.bind(this);


        lst.addAll(getData());
        //用适配器渲染界面
        recycleViewAdapter = new RecycleViewAdapter(R.layout.item_recycle, lst);
        recycleViewAdapter.setOnLoadMoreListener(this, recycleview);
        recycleview.setLayoutManager(new LinearLayoutManager(this));
        recycleview.setAdapter(recycleViewAdapter);

    }


    @Override
    public void onLoadMoreRequested() {
        lst.addAll(getData());
        recycleViewAdapter.setNewData(lst);
        if (lst.size() > 60) {
            recycleViewAdapter.loadMoreEnd();
        }

    }

    private List<ItemModel.DataBean> getData() {
        //获取数据  json
        String json = DataProcess.getJsonData();
        //数据序列化
        Gson gson = new Gson();
        ItemModel itemModel = gson.fromJson(json, ItemModel.class);
        return itemModel.getData();
    }
}
