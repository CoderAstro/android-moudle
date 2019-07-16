package com.sctx.app.android.recycleviewmodel.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.sctx.app.android.recycleviewmodel.R;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class FormActivity extends AppCompatActivity {


    @BindView(R.id.spinner)
    Spinner spinner;
    @BindView(R.id.tv_selected)
    TextView tvSelected;
    @BindView(R.id.ed_name)
    EditText edName;
    @BindView(R.id.ed_num)
    EditText edNum;
    @BindView(R.id.ed_pwd)
    EditText edPwd;
    @BindView(R.id.radioman)
    RadioButton radioman;
    @BindView(R.id.radiowomen)
    RadioButton radiowomen;
    @BindView(R.id.btn_commit)
    Button btnCommit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        ButterKnife.bind(this);


        //下拉列表数据源
        ArrayList<String> spinners = new ArrayList<>();
        spinners.add("今日");
        spinners.add("昨日");
        spinners.add("本周");
        spinners.add("上周");
        spinners.add("本月");
        spinners.add("上月");
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, spinners);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spinner.setAdapter(adapter);


    }

    @OnClick(R.id.btn_commit)
    public void onViewClicked() {
        String content = edName.getText().toString() + "--" + edNum.getText().toString() + "--" + edPwd.getText().toString() + "--" + spinner.getSelectedItem().toString();
        Toast.makeText(this, content, Toast.LENGTH_LONG).show();


    }
}
