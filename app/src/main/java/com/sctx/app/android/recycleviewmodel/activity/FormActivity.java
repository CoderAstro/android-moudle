package com.sctx.app.android.recycleviewmodel.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.sctx.app.android.recycleviewmodel.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class FormActivity extends AppCompatActivity {

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

    @OnClick({R.id.tv_recycleview, R.id.tv_form})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tv_recycleview:
                break;
            case R.id.tv_form:
                break;
        }
    }
}
