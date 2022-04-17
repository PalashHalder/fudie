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

        depositList.add(new Deposit("https://blogger.googleusercontent.com/img/a/AVvXsEincNvf3WeLkKEA064Dr7Sf1VZbBypz0V4AhorH7gtsKXxX7RsgNnXffnELsz8wcD0tpijDvUiql_oPFfVdcf0YudY_MfQiwe5wj-kVsw6sGdd9y-5lOQfs0v1vYGL7gCjIowjRmIHJuQfh1gfejw8Dqm-_1Af9yMvUV_MdT7dE58jE-r7zYLTOvYoRpw", "বঙ্গবন্ধু সঞ্চয়ী আমানত","","deposit_template.pdf"));
        depositList.add(new Deposit("https://blogger.googleusercontent.com/img/a/AVvXsEiyAhb2Yn9oOwhqPIAPCWDJ4dHpSyEtnMeWoj8-9fqTDMrgbdLoe7WKlpqgx8EjVgWZ7nwMRUCpBkWOxThwZzEEoOQBLexXtPKM7X5j9Yd1tTkRs0Q9KeHR-YkCuLjTtNQhyCx2pvd-QWRZwWWnhJoycSWk7hk3eFu31xLIMxop_w--YP0UeTCOGNfL0Q", "সঞ্চয়ী আমানত","","deposit_template.pdf"));
        depositList.add(new Deposit("https://blogger.googleusercontent.com/img/a/AVvXsEjjCQyxu_PtoJ9KHuqvZNlSLLvwZEvqVtP5Woi5hW_-3Jnc2Ebg6GorTNxy57gZg-sNyJt6u2OqNCVabhMUlzFXxvUclBXD0Jbrln3PUyA-ra6i0EoxgUPtmpnftyWWB_jbKhB9yOu-lNljpX0DNwD79t0riNmINLqlGET-F3Cn8KgT_WP-JVfRcf7Ygw", "নারী আমানত","","savings_template,pdf"));
        depositList.add(new Deposit("https://blogger.googleusercontent.com/img/a/AVvXsEgegPAsResnkFIv0M9jN4Icmmj07N8yKDZ6UQgG4CZVc5Hvw5gwLFGsqZ_sHzpBe3BWcYI9W1z4aG234Ov2WFYClY55zeFINMFzEoKw2OMuzOFAG4ib_GKl5wJgDkAMJVlNzhNkjqb5u1iV2Os_gQt5J5sKLh5oe9orhU80bh6MrafwSObit5rD1owEvA", "প্রবাস আমানত","","deposit_template.pdf"));
        depositList.add(new Deposit("https://blogger.googleusercontent.com/img/a/AVvXsEgegPAsResnkFIv0M9jN4Icmmj07N8yKDZ6UQgG4CZVc5Hvw5gwLFGsqZ_sHzpBe3BWcYI9W1z4aG234Ov2WFYClY55zeFINMFzEoKw2OMuzOFAG4ib_GKl5wJgDkAMJVlNzhNkjqb5u1iV2Os_gQt5J5sKLh5oe9orhU80bh6MrafwSObit5rD1owEvA", "গ্রুপ সঞ্চয়ী আমানত","","deposit_template.pdf"));
        depositList.add(new Deposit("https://blogger.googleusercontent.com/img/a/AVvXsEgVYkw-HjHAxAh4c1Nq6jAyBItS-dBJ76hItaU-7OpuREFRoCIXliKoY-Dx2F-QPZogqhz6c0p0ebJxrHRKG-fM3ccE9N-q-XsdCLhGabt8Pm1fMRj2QTaV9pnlngSYModeKkBWYPyyKHKWRXGSDzgY5ZqZP8sfqJAEJ-5RaFxG2B2z-FUhLJTUSHwNeQ", "ক্ষুদ্র/বিশেষ সঞ্চয়ী আমানত","","deposit_template.pdf"));
        depositList.add(new Deposit("https://blogger.googleusercontent.com/img/a/AVvXsEhUlU3AMGerGsyN33M2r2vhwZp8ueN2IhT5ZEz2BdtLBSH7eWFlln1EJKez2sZQwW9J2BAT7QwdoFJUWJ5azpR1299VdWlEU8R1MafrGoYzZpHfxtVyG8Zrz_LkiHUB1tV0K8SMEqhEEB7_iGb0HHFwwhY9EdnqwJbjH9mLZReiINCS_q-X2IdEOqh1RA", "চলতি আমানত","","deposit_template.pdf"));
        depositList.add(new Deposit("https://blogger.googleusercontent.com/img/a/AVvXsEgyL_mz6ZmlEoa7RunCu_gvA9Kc66GACrmkia43QQQI3rFtwkoJfWBP30-GCv2ayTZqPrB0gpRCIyNLEEK__cIY5K-VDdtd_9MYOCxUpqBauf9N1-bxOxaBZiioR4b0tLWsMl6q4Pi2YMFNiVYZMFUzVPdue07NMbtDhCmoFDMjVNkM7yFkB5wYwIg-HQ", "স্বল্প মেয়াদী আমানত","","deposit_template.pdf"));
        depositList.add(new Deposit("https://blogger.googleusercontent.com/img/a/AVvXsEhtm0trG-N4JkFSfix9HEn01YOhTxBFLHhFG-ZS2UYlsPFrUiAIZ7YS5oPwpsmuegmaBvr3D3iTLnC5fkwV_7E34wCWKXpy6xFuqgZ8bAQXB3J8iYZpcjNNj2hHw_0zC6BlCwWNpgHjlTseyJaOe86vnhLzTS1a4eeJay1hTXsbdCRIAzl4ekEK0pFZPg", "স্পেশাল ডিপোজিট পেনশন স্কীম","","deposit_template.pdf"));
        depositList.add(new Deposit("https://blogger.googleusercontent.com/img/a/AVvXsEhtm0trG-N4JkFSfix9HEn01YOhTxBFLHhFG-ZS2UYlsPFrUiAIZ7YS5oPwpsmuegmaBvr3D3iTLnC5fkwV_7E34wCWKXpy6xFuqgZ8bAQXB3J8iYZpcjNNj2hHw_0zC6BlCwWNpgHjlTseyJaOe86vnhLzTS1a4eeJay1hTXsbdCRIAzl4ekEK0pFZPg", "হজ্জ সহায়ক ডিপোজিট স্কীম","","deposit_template.pdf"));
        depositList.add(new Deposit("https://blogger.googleusercontent.com/img/a/AVvXsEgyN6RVxSNDEptj6tmyjWVEcdRT5-aH_YQHPOD70HTB7PjrUjvqAok-15JGI66-ZJF7FcHVbIwt9ai_rxMKDtyrT8Yi0pZc9nay-iESk-InU6275yov33hJKezyF2crzk60eRvhV-hATSAhGrZV4yfG_R227fOPufM0hwPMs0M86_WznYpjI8O0bHzWNg", "আমানত দ্বিগুন বৃদ্ধি প্রকল্প","","deposit_template.pdf"));
        depositList.add(new Deposit("https://blogger.googleusercontent.com/img/a/AVvXsEgzZc3fSKQXlSGn4vR7NpJeexQ_cYyiH5QTJeW8wxapaHa6bIhejEeM1f-E1tun8gdZQgFUGsTpR_65tz1Vgzv8vYr-76f3to4JwJgv4pH1WHA0TDU_gt_JjSRlNrY2jE6rNi2FfNDtEgo3auoR3AHmx5SftGY0mvqHcp0BL3sqVY1ga4ZypriV_yMn9A", " স্থায়ী আমানত","","deposit_template.pdf"));
        depositList.add(new Deposit("https://blogger.googleusercontent.com/img/a/AVvXsEgzZc3fSKQXlSGn4vR7NpJeexQ_cYyiH5QTJeW8wxapaHa6bIhejEeM1f-E1tun8gdZQgFUGsTpR_65tz1Vgzv8vYr-76f3to4JwJgv4pH1WHA0TDU_gt_JjSRlNrY2jE6rNi2FfNDtEgo3auoR3AHmx5SftGY0mvqHcp0BL3sqVY1ga4ZypriV_yMn9A", " লাখপতি ডিপোজিট আমানত","","deposit_template.pdf"));

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