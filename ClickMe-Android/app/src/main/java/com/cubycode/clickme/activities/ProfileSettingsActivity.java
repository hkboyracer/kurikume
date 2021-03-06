package com.cubycode.clickme.activities;

import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.cubycode.clickme.R;
import com.cubycode.clickme.adapter.CustomAdapterGender;
import com.cubycode.clickme.adapter.RecyclerViewAdapterProfileSettings;
import com.cubycode.clickme.model.ProfileSettingsModel;

import java.util.ArrayList;

public class ProfileSettingsActivity extends AppCompatActivity implements View.OnClickListener , RecyclerViewAdapterProfileSettings.ProfileSettingsPositionListener {

    //    private NotificationsViewModel notificationsViewModel;
    private RecyclerView rvProfileSettings;
    RecyclerViewAdapterProfileSettings recyclerViewAdapterProfileSettings;
    ArrayList<ProfileSettingsModel> profileSettingsList;
    Context applicationContext = ProfileSettingsActivity.this;
    public TextView tvHeaderHome;
//    public View onCreateView(@NonNull LayoutInflater inflater,
//                             ViewGroup container, Bundle savedInstanceState) {
////        notificationsViewModel =
////                ViewModelProviders.of(this).get(NotificationsViewModel.class);
//        View root = inflater.inflate(R.layout.fragment_profile_settings, container, false);
////        final TextView textView = root.findViewById(R.id.text_notifications);
////        notificationsViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
////            @Override
////            public void onChanged(@Nullable String s) {
////                textView.setText(s);
////            }
////        });
//        init(root);
//        setList();
//        setProfileSettingsAdapter(applicationContext, profileSettingsList);
//        return root;
//    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getSupportActionBar() != null){ getSupportActionBar().hide(); }
        setContentView(R.layout.fragment_profile_settings);
        init();
        setList();
        setProfileSettingsAdapter(applicationContext, profileSettingsList);
    }

    private void init(){
        rvProfileSettings = findViewById(R.id.rv_profile_setings);
        tvHeaderHome = findViewById(R.id.tv_header_page_name);
        tvHeaderHome.setText("??????");
    }

    void setList(){
        profileSettingsList = new ArrayList<>();
        profileSettingsList.add(new ProfileSettingsModel("????????????",""));
        profileSettingsList.add(new ProfileSettingsModel("???????????????","kurikumetest"));
        profileSettingsList.add(new ProfileSettingsModel("?????????????????????","username@sample.com"));
        profileSettingsList.add(new ProfileSettingsModel("??????????????????URL","https://kurikume.com/kurikumetest"));
        profileSettingsList.add(new ProfileSettingsModel("?????????????????????","????????????????????????????????????????????????"));
        profileSettingsList.add(new ProfileSettingsModel("??????","??????"));
        profileSettingsList.add(new ProfileSettingsModel("???????????????",""));
        profileSettingsList.add(new ProfileSettingsModel("????????????????????????","???????????????????????????"));
        profileSettingsList.add(new ProfileSettingsModel("???????????????",""));
        profileSettingsList.add(new ProfileSettingsModel("?????????????????????????????????","????????? (Japanese)"));
        profileSettingsList.add(new ProfileSettingsModel("???????????????????????????","??????"));
        profileSettingsList.add(new ProfileSettingsModel("?????????????????????",""));
        profileSettingsList.add(new ProfileSettingsModel("??????????????????????????????","??????????????????????????????????????????????????????????????????"));
        profileSettingsList.add(new ProfileSettingsModel("SNS?????????????????????","https://kurikume.com/kurikumetest"));
        profileSettingsList.add(new ProfileSettingsModel("?????????SNS?????????????????????????????????","????????????SNS??????????????????????????????????????????????????????"));
        profileSettingsList.add(new ProfileSettingsModel("??????????????????",""));
        profileSettingsList.add(new ProfileSettingsModel("???????????????????????????????????????","???????????????????????????????????????????????????????????????????????????"));
        profileSettingsList.add(new ProfileSettingsModel("????????????????????????",""));
        profileSettingsList.add(new ProfileSettingsModel("????????????????????????????????????","?????????????????????????????????????????????????????????????????????"));
        profileSettingsList.add(new ProfileSettingsModel("????????????????????????",""));
        profileSettingsList.add(new ProfileSettingsModel("????????????????????????","??????????????????????????????????????????????????????????????????????????????"));
    }

    void setProfileSettingsAdapter(Context context, ArrayList<ProfileSettingsModel> notificationsList){
        recyclerViewAdapterProfileSettings = new RecyclerViewAdapterProfileSettings(context,notificationsList,this);
        rvProfileSettings.setHasFixedSize(true);
        rvProfileSettings.setLayoutManager(new LinearLayoutManager(applicationContext));
        rvProfileSettings.setAdapter(recyclerViewAdapterProfileSettings);
    }

    @Override
    public void onClick(View v) {

    }

    public void dialogProfileSettingsGeneral(Context context){
        final AlertDialog.Builder builder = new AlertDialog.Builder(context);
        View view = LayoutInflater.from(context).inflate(R.layout.layout_profile_settings_general_dialog,null);
        builder.setView(view);
        final AlertDialog dialog = builder.create();
        dialog.show();
    }

    public void dialogProfileSettingsAddEmail(Context context){
        final AlertDialog.Builder builder = new AlertDialog.Builder(context);
        View view = LayoutInflater.from(context).inflate(R.layout.layout_profile_settings_add_email_dialog,null);
        builder.setView(view);
        final AlertDialog dialog = builder.create();
        dialog.show();
    }

    public void dialogProfileSettingsAddUrl(Context context){
        final AlertDialog.Builder builder = new AlertDialog.Builder(context);
        View view = LayoutInflater.from(context).inflate(R.layout.layout_profile_settings_add_url_dialog,null);
        builder.setView(view);
        final AlertDialog dialog = builder.create();
        dialog.show();
    }

    public void dialogProfileSettingsAboutYourself(Context context){
        final AlertDialog.Builder builder = new AlertDialog.Builder(context);
        View view = LayoutInflater.from(context).inflate(R.layout.layout_profile_settings_about_yourself_dialog,null);
        builder.setView(view);
        final AlertDialog dialog = builder.create();
        dialog.show();
    }

    public void dialogProfileSettingsAccountIntegration(Context context){
        final AlertDialog.Builder builder = new AlertDialog.Builder(context);
        View view = LayoutInflater.from(context).inflate(R.layout.layout_profile_settings_account_integration_dialog,null);
        builder.setView(view);
        final AlertDialog dialog = builder.create();
        dialog.show();
    }

    public void dialogProfileSettingsPaymentSetting(Context context){
        final AlertDialog.Builder builder = new AlertDialog.Builder(context);
        View view = LayoutInflater.from(context).inflate(R.layout.layout_profile_settings_payment_dialog,null);
        builder.setView(view);
        final AlertDialog dialog = builder.create();
        dialog.show();
    }

    public void dialogProfileSettingsPasswordSetting(Context context){
        final AlertDialog.Builder builder = new AlertDialog.Builder(context);
        View view = LayoutInflater.from(context).inflate(R.layout.layout_profile_settings_password_setting_dialog,null);
        builder.setView(view);
        final AlertDialog dialog = builder.create();
        dialog.show();
    }

    public void dialogProfileSettingsLanguageSetting(Context context){
        final AlertDialog.Builder builder = new AlertDialog.Builder(context);
        View view = LayoutInflater.from(context).inflate(R.layout.layout_profile_settings_language_setting_dialog,null);
        builder.setView(view);
        final AlertDialog dialog = builder.create();
        dialog.show();
        ArrayList<String> genderList = new ArrayList<>();
        genderList.add("????????? (Japanese)");
        genderList.add("English");
        genderList.add("French");
        genderList.add("German");
        genderList.add("Italian");
        genderList.add("Russian");
        genderList.add("Portuguese");
        genderList.add("Spanish");
        genderList.add("Turkish");
        genderList.add("Dutch");
        genderList.add("Ukraine");
        Spinner spinnerGender = view.findViewById(R.id.spinner_language);
        CustomAdapterGender customAdapterGender = new CustomAdapterGender(getApplicationContext(), genderList);
        spinnerGender.setAdapter(customAdapterGender);
        customAdapterGender.notifyDataSetChanged();


    }

    public void dialogProfileSettingsAccountVerification(Context context){
        final AlertDialog.Builder builder = new AlertDialog.Builder(context);
        View view = LayoutInflater.from(context).inflate(R.layout.layout_profile_settings_account_verification_dialog,null);
        builder.setView(view);
        final AlertDialog dialog = builder.create();
        dialog.show();
    }

    public void dialogProfileSettingsDeleteAccount(Context context){
        final AlertDialog.Builder builder = new AlertDialog.Builder(context);
        View view = LayoutInflater.from(context).inflate(R.layout.layout_profile_settings_delete_account_dialog,null);
        builder.setView(view);
        final AlertDialog dialog = builder.create();
        dialog.show();
    }

    public void dialogProfileSettingsGender(Context context){
        final AlertDialog.Builder builder = new AlertDialog.Builder(context);
        View view = LayoutInflater.from(context).inflate(R.layout.layout_profile_settings_edit_gender_dialog,null);
        builder.setView(view);
        final AlertDialog dialog = builder.create();
        dialog.show();
        ArrayList<String> genderList = new ArrayList<>();
        genderList.add("??????");
        genderList.add("??????");
        genderList.add("?????????");
        Spinner spinnerGender = view.findViewById(R.id.spinner_gender);
        CustomAdapterGender customAdapterGender = new CustomAdapterGender(getApplicationContext(), genderList);
        spinnerGender.setAdapter(customAdapterGender);
        customAdapterGender.notifyDataSetChanged();
    }

    public void dialogProfileSettingsPrivacySetting(Context context){
        final AlertDialog.Builder builder = new AlertDialog.Builder(context);
        View view = LayoutInflater.from(context).inflate(R.layout.layout_profile_settings_privacy_setting_dialog,null);
        builder.setView(view);
        final AlertDialog dialog = builder.create();
        dialog.show();
        ArrayList<String> whoCanViewProfileList = new ArrayList<>();
        whoCanViewProfileList.add("??????");
        whoCanViewProfileList.add("??????????????????????????????");
        whoCanViewProfileList.add("????????????");
        ArrayList<String> whoCanSendDirectMessageList = new ArrayList<>();
        whoCanSendDirectMessageList.add("??????");
        whoCanSendDirectMessageList.add("??????????????????????????????");
        ArrayList<String> showProfileInSearchEngineList = new ArrayList<>();
        showProfileInSearchEngineList.add("???????????????");
        showProfileInSearchEngineList.add("??????????????????");
        Spinner spinnerOne = view.findViewById(R.id.spinner_one);
        Spinner spinnerTwo = view.findViewById(R.id.spinner_two);
        Spinner spinnerThree = view.findViewById(R.id.spinner_three);
        CustomAdapterGender adapterOne = new CustomAdapterGender(getApplicationContext(), whoCanViewProfileList);
        spinnerOne.setAdapter(adapterOne);
        adapterOne.notifyDataSetChanged();
        CustomAdapterGender adapterTwo = new CustomAdapterGender(getApplicationContext(), whoCanSendDirectMessageList);
        spinnerTwo.setAdapter(adapterTwo);
        adapterTwo.notifyDataSetChanged();
        CustomAdapterGender adapterThree = new CustomAdapterGender(getApplicationContext(), showProfileInSearchEngineList);
        spinnerThree.setAdapter(adapterThree);
        adapterThree.notifyDataSetChanged();
    }

    @Override
    public void onSettingItemClick(int position) {
        switch (position){
            case 1:
                dialogProfileSettingsGeneral(ProfileSettingsActivity.this);
                break;
            case 2:
                dialogProfileSettingsAddEmail(ProfileSettingsActivity.this);
                break;
            case 3:
                dialogProfileSettingsAddUrl(ProfileSettingsActivity.this);
                break;
            case 4:
                dialogProfileSettingsAboutYourself(ProfileSettingsActivity.this);
                break;
            case 5:
                dialogProfileSettingsGender(ProfileSettingsActivity.this);
                break;
            case 12:
                dialogProfileSettingsAccountVerification(ProfileSettingsActivity.this);
                break;
            case 13:
                dialogProfileSettingsAccountIntegration(ProfileSettingsActivity.this);
                break;
            case 14:
                dialogProfileSettingsPaymentSetting(ProfileSettingsActivity.this);
                break;
            case 8:
                dialogProfileSettingsPasswordSetting(ProfileSettingsActivity.this);
                break;
            case 9:
                dialogProfileSettingsLanguageSetting(ProfileSettingsActivity.this);
                break;
            case 19:
                dialogProfileSettingsDeleteAccount(ProfileSettingsActivity.this);
                break;
            case 20:
                dialogProfileSettingsDeleteAccount(ProfileSettingsActivity.this);
                break;
            case 17:
                dialogProfileSettingsPrivacySetting(ProfileSettingsActivity.this);
                break;
        }
    }
}