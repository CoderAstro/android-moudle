package com.sctx.app.android.recycleviewmodel.adapter;

import android.support.annotation.Nullable;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.sctx.app.android.recycleviewmodel.R;
import com.sctx.app.android.recycleviewmodel.model.ItemModel;

import java.util.List;

public class RecycleViewAdapter extends BaseQuickAdapter<ItemModel.DataBean, BaseViewHolder> {
    public RecycleViewAdapter(int layoutResId, @Nullable List<ItemModel.DataBean> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, ItemModel.DataBean item) {
        Glide.with(mContext).load(item.getUrl()).into((ImageView) helper.getView(R.id.iv_image));
        helper.setText(R.id.tv_content, item.getContent())
                .setText(R.id.tv_title, item.getTitle());
    }
}
