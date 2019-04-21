package com.dilip.deepak;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Profil extends AppCompatActivity {


    /** ButterKnife Code **/
    @BindView(R.id.IV_UserImg)
    ImageView IVUserImg;

    @BindView(R.id.TV_UserName)
    TextView TVUserName;

    @BindView(R.id.TV_PUserName)
    TextView TVPUserName;

    @BindView(R.id.TV_PUserName1)
    TextView TVPUserName1;

    @BindView(R.id.TV_PRollNo)
    TextView TVPRollNo;

    @BindView(R.id.TV_PRollNo1)
    TextView TVPRollNo1;

    @BindView(R.id.TV_Dob)
    TextView TVDob;

    @BindView(R.id.TV_PDob)
    TextView TVPDob;


    @BindView(R.id.TV_PAddress)
    TextView TVPAddress;

    @BindView(R.id.TV_PAddress1)
    TextView TVPAddress1;
    /** ButterKnife Code **/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);

        ButterKnife.bind(this);


    }
}
