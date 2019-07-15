package com.sctx.app.android.recycleviewmodel;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * 首页入口页面
 */
public class MainActivity extends AppCompatActivity {

    @BindView(R.id.tv_recycleview)
    TextView tvRecycleview;
    @BindView(R.id.tv_form)
    TextView tvForm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    /**
     * 点击事件
     *
     * @param view
     */
    @OnClick({R.id.tv_recycleview, R.id.tv_form})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tv_recycleview://打开列表页面
                Intent intent = new Intent(this, RecycleViewActivity.class);
                startActivity(intent);
                break;
            case R.id.tv_form:
                break;
        }
    }
}
