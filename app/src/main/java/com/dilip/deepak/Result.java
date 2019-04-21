package com.dilip.deepak;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;

public class Result extends AppCompatActivity {

    /** ButterKnife Code **/
    @BindView(R.id.TV_Name)
    TextView TVName;

    @BindView(R.id.TV_Name1)
    TextView TVName1;

    @BindView(R.id.TV_Company)
    TextView TVCompany;

    @BindView(R.id.TV_Company1)
    TextView TVCompany1;

    @BindView(R.id.TV_Quiz)
    TextView TVQuiz;

    @BindView(R.id.TV_Quiz1)
    TextView TVQuiz1;

    @BindView(R.id.TV_TotalQ)
    TextView TVTotalQ;

    @BindView(R.id.TV_TotalQ1)
    TextView TVTotalQ1;

    @BindView(R.id.TV_RightA)
    TextView TVRightA;

    @BindView(R.id.TV_RightA1)
    TextView TVRightA1;

    @BindView(R.id.TV_WrongA)
    TextView TVWrongA;

    @BindView(R.id.TV_WrongA1)
    TextView TVWrongA1;

    @BindView(R.id.TV_Skip)
    TextView TVSkip;

    @BindView(R.id.TV_Skip1)
    TextView TVSkip1;

    @BindView(R.id.TV_Result)
    TextView TVResult;

    @BindView(R.id.TV_Result1)
    TextView TVResult1;

    @BindView(R.id.Bt_Result_Ok)
    Button BtResultOk;
    /** ButterKnife Code **/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
    }
}
