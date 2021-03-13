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
        tvHeaderHome.setText("設定");
    }

    void setList(){
        profileSettingsList = new ArrayList<>();
        profileSettingsList.add(new ProfileSettingsModel("一般設定",""));
        profileSettingsList.add(new ProfileSettingsModel("ユーザー名","kurikumetest"));
        profileSettingsList.add(new ProfileSettingsModel("メールアドレス","username@sample.com"));
        profileSettingsList.add(new ProfileSettingsModel("ホームページURL","https://kurikume.com/kurikumetest"));
        profileSettingsList.add(new ProfileSettingsModel("プロフィール文","ここにプロフィール文が入ります。"));
        profileSettingsList.add(new ProfileSettingsModel("性別","男性"));
        profileSettingsList.add(new ProfileSettingsModel("パスワード",""));
        profileSettingsList.add(new ProfileSettingsModel("現在のパスワード","＊＊＊＊＊＊＊＊＊"));
        profileSettingsList.add(new ProfileSettingsModel("言語と地域",""));
        profileSettingsList.add(new ProfileSettingsModel("表示する言語を選択する","日本語 (Japanese)"));
        profileSettingsList.add(new ProfileSettingsModel("お住まいの国と地域","日本"));
        profileSettingsList.add(new ProfileSettingsModel("アカウント認証",""));
        profileSettingsList.add(new ProfileSettingsModel("アカウントを認証する","クリックして認証リクエストを申請してください"));
        profileSettingsList.add(new ProfileSettingsModel("SNSアカウント連携","https://kurikume.com/kurikumetest"));
        profileSettingsList.add(new ProfileSettingsModel("既存のSNSアカウントを連携させる","お持ちのSNSアカウントと連携させることができます"));
        profileSettingsList.add(new ProfileSettingsModel("お支払い設定",""));
        profileSettingsList.add(new ProfileSettingsModel("お支払いの管理・登録をする","お支払い方法の設定に関する編集・登録などができます"));
        profileSettingsList.add(new ProfileSettingsModel("プライバシー設定",""));
        profileSettingsList.add(new ProfileSettingsModel("プライバシーの設定をする","クリックするとプライバシー設定の編集ができます"));
        profileSettingsList.add(new ProfileSettingsModel("アカウントの削除",""));
        profileSettingsList.add(new ProfileSettingsModel("アカウントの削除","クリックするとアカウントの削除・退会手続きへ進みます"));
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
        genderList.add("日本語 (Japanese)");
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
        genderList.add("男性");
        genderList.add("女性");
        genderList.add("その他");
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
        whoCanViewProfileList.add("全員");
        whoCanViewProfileList.add("自分のフォロワー限定");
        whoCanViewProfileList.add("自分のみ");
        ArrayList<String> whoCanSendDirectMessageList = new ArrayList<>();
        whoCanSendDirectMessageList.add("全員");
        whoCanSendDirectMessageList.add("自分のフォロワー限定");
        ArrayList<String> showProfileInSearchEngineList = new ArrayList<>();
        showProfileInSearchEngineList.add("表示させる");
        showProfileInSearchEngineList.add("表示させない");
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