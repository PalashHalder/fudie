package bd.gov.ansarvdpbank.avubinfo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;



import java.util.ArrayList;
import java.util.List;

public class DepositActivity extends AppCompatActivity {

    List<Deposit> depositList;
    RecyclerView depositListRecyclerView;
    DepositAdapter depositAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deposit);

        depositListRecyclerView = findViewById(R.id.userRecycler);

        depositList = new ArrayList<>();

        depositList.add(new Deposit("https://blogger.googleusercontent.com/img/a/AVvXsEincNvf3WeLkKEA064Dr7Sf1VZbBypz0V4AhorH7gtsKXxX7RsgNnXffnELsz8wcD0tpijDvUiql_oPFfVdcf0YudY_MfQiwe5wj-kVsw6sGdd9y-5lOQfs0v1vYGL7gCjIowjRmIHJuQfh1gfejw8Dqm-_1Af9yMvUV_MdT7dE58jE-r7zYLTOvYoRpw", "বঙ্গবন্ধু সঞ্চয়ী আমানত","","bangobondhu_savings.pdf"));
        depositList.add(new Deposit("https://blogger.googleusercontent.com/img/a/AVvXsEiyAhb2Yn9oOwhqPIAPCWDJ4dHpSyEtnMeWoj8-9fqTDMrgbdLoe7WKlpqgx8EjVgWZ7nwMRUCpBkWOxThwZzEEoOQBLexXtPKM7X5j9Yd1tTkRs0Q9KeHR-YkCuLjTtNQhyCx2pvd-QWRZwWWnhJoycSWk7hk3eFu31xLIMxop_w--YP0UeTCOGNfL0Q", "সঞ্চয়ী আমানত","","saving_account.pdf"));
        depositList.add(new Deposit("https://blogger.googleusercontent.com/img/a/AVvXsEgVYkw-HjHAxAh4c1Nq6jAyBItS-dBJ76hItaU-7OpuREFRoCIXliKoY-Dx2F-QPZogqhz6c0p0ebJxrHRKG-fM3ccE9N-q-XsdCLhGabt8Pm1fMRj2QTaV9pnlngSYModeKkBWYPyyKHKWRXGSDzgY5ZqZP8sfqJAEJ-5RaFxG2B2z-FUhLJTUSHwNeQ", "নারী আমানত","","nari_amanot.pdf"));
        depositList.add(new Deposit("https://blogger.googleusercontent.com/img/a/AVvXsEhUlU3AMGerGsyN33M2r2vhwZp8ueN2IhT5ZEz2BdtLBSH7eWFlln1EJKez2sZQwW9J2BAT7QwdoFJUWJ5azpR1299VdWlEU8R1MafrGoYzZpHfxtVyG8Zrz_LkiHUB1tV0K8SMEqhEEB7_iGb0HHFwwhY9EdnqwJbjH9mLZReiINCS_q-X2IdEOqh1RA", "প্রবাস আমানত","","probash_amanot.pdf"));
        depositList.add(new Deposit("https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEip0T3mQxwNLUr9ymdUlh5pHUjmCtLgFxKSyf5SfKex_O6vD9JZVnKtvkbq-ZNeKlz7f-SjfkJyAdt8LL6042YfG4VYDajKsZAu_HfTN6uTxQLLp38LwcAA5i_5nPhC3DrfvW8mKrJzzW8VMT_D-Oa61V_3_Y1GjheWd-c-CQF3utFRrd19riYEd5N_8g/s1600/groupdeposit.png", "গ্রুপ সঞ্চয়ী আমানত","","group_savings.pdf"));
        depositList.add(new Deposit("https://blogger.googleusercontent.com/img/a/AVvXsEjjCQyxu_PtoJ9KHuqvZNlSLLvwZEvqVtP5Woi5hW_-3Jnc2Ebg6GorTNxy57gZg-sNyJt6u2OqNCVabhMUlzFXxvUclBXD0Jbrln3PUyA-ra6i0EoxgUPtmpnftyWWB_jbKhB9yOu-lNljpX0DNwD79t0riNmINLqlGET-F3Cn8KgT_WP-JVfRcf7Ygw", "ক্ষুদ্র/বিশেষ সঞ্চয়ী আমানত","","special_savings.pdf"));
        depositList.add(new Deposit("https://blogger.googleusercontent.com/img/a/AVvXsEgegPAsResnkFIv0M9jN4Icmmj07N8yKDZ6UQgG4CZVc5Hvw5gwLFGsqZ_sHzpBe3BWcYI9W1z4aG234Ov2WFYClY55zeFINMFzEoKw2OMuzOFAG4ib_GKl5wJgDkAMJVlNzhNkjqb5u1iV2Os_gQt5J5sKLh5oe9orhU80bh6MrafwSObit5rD1owEvA", "চলতি আমানত","","current_savings.pdf"));
        depositList.add(new Deposit("https://blogger.googleusercontent.com/img/a/AVvXsEgzZc3fSKQXlSGn4vR7NpJeexQ_cYyiH5QTJeW8wxapaHa6bIhejEeM1f-E1tun8gdZQgFUGsTpR_65tz1Vgzv8vYr-76f3to4JwJgv4pH1WHA0TDU_gt_JjSRlNrY2jE6rNi2FfNDtEgo3auoR3AHmx5SftGY0mvqHcp0BL3sqVY1ga4ZypriV_yMn9A", "স্বল্প মেয়াদী আমানত","","short_time_deposit.pdf"));
        depositList.add(new Deposit("https://blogger.googleusercontent.com/img/a/AVvXsEhtm0trG-N4JkFSfix9HEn01YOhTxBFLHhFG-ZS2UYlsPFrUiAIZ7YS5oPwpsmuegmaBvr3D3iTLnC5fkwV_7E34wCWKXpy6xFuqgZ8bAQXB3J8iYZpcjNNj2hHw_0zC6BlCwWNpgHjlTseyJaOe86vnhLzTS1a4eeJay1hTXsbdCRIAzl4ekEK0pFZPg", "স্পেশাল ডিপোজিট পেনশন স্কীম","","sdps_amanot.pdf"));
        depositList.add(new Deposit("https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEgxSzdWrIi6ou8GWVV3uPqH2G6ZKQorK6n5L8KiJENwjFBgih0mjiY_1KPTTQ28NQBSkH-Tk4YfX6YoonNjlrALHkxe2nMLah_Nl_hq72ujfr5calgOcmSQQqHwOJw8Mt1v_DxB44ZRiaTUfWr0DPQUxqhW8e1hfMmUFOC03jZmSc0atNUaUQo0ve2dqg/s1600/Group%201.png", "হজ্জ সহায়ক ডিপোজিট স্কীম","","hajj_deposit.pdf"));
        depositList.add(new Deposit("https://blogger.googleusercontent.com/img/a/AVvXsEgyN6RVxSNDEptj6tmyjWVEcdRT5-aH_YQHPOD70HTB7PjrUjvqAok-15JGI66-ZJF7FcHVbIwt9ai_rxMKDtyrT8Yi0pZc9nay-iESk-InU6275yov33hJKezyF2crzk60eRvhV-hATSAhGrZV4yfG_R227fOPufM0hwPMs0M86_WznYpjI8O0bHzWNg", "আমানত দ্বিগুন বৃদ্ধি প্রকল্প","","double_scheme.pdf"));
        depositList.add(new Deposit("https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEgn3N0PWiBorwDwWD4ytSNsCloD_EJpnSrMiawOyMLFnjK0o2Pr9hUTHPMUwW4u8cjba9jMji66GxWMWch8lGtAZPu9k-0ubZuoNisKkgxuZbsi21t_eXzFC0VnznNGbPEoY-Qzxb6iFnGa55v5E3WN4gkQpNNgL3jOFg5FTDX0o7wMfnwamKduSCYFwA/s1600/fixeddeposit.png", " স্থায়ী আমানত","","fixed_deposit.pdf"));
        depositList.add(new Deposit("https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEh4Lm9SsUfjQ_zgRLgiK3yw09tKxFUFQa4eYXDmjwxZ8vHbc_Uj-DEQCr6EXWe4FuRmEhkDqOSE4d1Mj1LSetmU8kzJKz4qmvtPduC5G1QglMU--Pd7eDEBiHnhJqrQheAkbJxOiMsX8Id924OS3T0PZOhQcnghtbqL6dA9ZQpojwG2h6WlrQBDI1MNjQ/s1600/lakkpoti.png", " লাখপতি ডিপোজিট আমানত","","lakhpoti_deposit.pdf"));

        depositAdapter = new DepositAdapter(DepositActivity.this,depositList);

        // For GridLayout
        int spanCount = 2;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, spanCount);
        depositListRecyclerView.setLayoutManager(gridLayoutManager);

        // For LinearLayout
        /*
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(DepositActivity.this);
        depositListRecyclerView.setLayoutManager(linearLayoutManager);
         */
        depositListRecyclerView.setAdapter(depositAdapter);

    }
}