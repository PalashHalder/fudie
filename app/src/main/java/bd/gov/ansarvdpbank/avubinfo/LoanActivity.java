package bd.gov.ansarvdpbank.avubinfo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;



import java.util.ArrayList;
import java.util.List;

public class LoanActivity extends AppCompatActivity {

    List<Loans> loansList;

    RecyclerView loansListRecyclerView;

    LoansAdapter loansAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loan);

        loansListRecyclerView = findViewById(R.id.loansRecycler);

        loansList = new ArrayList<>();

        loansList.add(new Loans("https://blogger.googleusercontent.com/img/a/AVvXsEhALGdWEySw9qoaEZDFLxvuVRukKTAHDg48TjYjhKzhsBfv4eJcGqvhiFpgBH3RhWviRqg9rWPT5wlaco1W36vpYseFLmVVMlKqQLraIFDiFr3fmGLe7de3exTfo2LE51hYpfBcHWUlZmdR0pKUK4CdLhC_qXjsbh-QgUhkCH9MrWgNIHzilj7c4sfqDQ=s320", "ক্ষুদ্রঋণ", "", "loan_template.pdf"));
        loansList.add(new Loans("https://blogger.googleusercontent.com/img/a/AVvXsEgGm7zn4S_o8dQXyE183iKcb2o-x-1_VPagrLBrQ4KsRsdlKT7IioW0EQr8RFY0JYGsctRuRtGgvUPhQjzT1rK0JrzBHJ_glu41ZQipFFZYuQbD7KesjPO8tzh7oCA40X2EHxbTIKnmFOFslxP54CAc1j56VD-umcuemquaGhkXQoE4tDHDMeK6YC7d6A", "এসএমই ঋণ", "", "rural_credit.pdf"));
        loansList.add(new Loans("https://blogger.googleusercontent.com/img/a/AVvXsEhk13LZuGDAQl0ahL4nzghaRC70MpZtdrFPYHWEo34ZFWAOu0Ds8UqlfwElFmoHyuhYaANw0zIMfNex2HZ9gbMzkEPkqph3YDyXAa3uuEkHn1Y1BL4MVkb3meWjtzJtppa9F5dQPql-o9W5RgkOWprnlBe-Zxs9ilO-MkjIyVxv5_STGUpR_zPX2Vu-bw", "গবাদি পশু পালন ঋণ", "", "loan_template.pdf"));
        loansList.add(new Loans("https://blogger.googleusercontent.com/img/a/AVvXsEgvJc-AjQFCL926DMv9_CFVtH2oEQWDVK8F4fZkrRx4oBMnOYFCqX2ZDP40kvp642sylBo2AH4RWRSp_0k5HdozAxdrLEyq3m74ym87rLeqjvC95rIfXuw9nJoZn6wy7uOiphSHLVtXJWxUi5Ied-b4gDQz4lEXHmgHqOf6IHmwB4AhzyJi8Nz9HkGQcA=s320", "পুকুরে মৎস্য চাষ ঋণ", "", "rural_credit.pdf"));
        loansList.add(new Loans("https://blogger.googleusercontent.com/img/a/AVvXsEh6tE2lbAD33x-wupAuiocIH8QibhyRB7XuEVhJWpgeiYZJbCllJDAvf_JDzAdtdf1b25LyisGGUtd9pd3gNDbmVd3qg4p3j8NgbsopgbCnDHhk8Rmfow3715h1NxAaojgOMuLVYFblub2GvxNfmjAJYiyH6_zr2EWKv5QW2ANUz34AaYVJIdFxdYmu5Q", "দুগ্ধবতী গাভীপালন ঋণ", "", "loan_template.pdf"));
        loansList.add(new Loans("https://blogger.googleusercontent.com/img/a/AVvXsEhoObJZK_MLIlqsZdXUmpfgQv-Ea1fETopYkwJw0V9dtN_aFJpf3wfyOrnnsYrGxdvNDubwef9ASljs0RI2wyaDncjSNPXlRdVh0w80B_z8gnUB8wTFEayOqK76KgDk8KRsueibQz1jqmc_zPYTch_jHSQ67w1LKwpXKyfo-FfPoEBLyZsgbGNeUiq0dw", "গরু মোটাতাজাকরণ ঋণ", "", "rural_credit.pdf"));
        loansList.add(new Loans("https://blogger.googleusercontent.com/img/a/AVvXsEhy35BZWo9Iet8rUlk3e42gyPEYf18is02vzgZnG0KNrnoL648VVVTP9tjSfcePupaZP7yxgoQQUzTLWAv03SGUp8DdImC7e5Ma3cc8J2_kYbKYeW0mk6s2TbjmLT6mq3DL7uCtPNaaVP5lRR1_764qrkjiifuC-XJRVK_4mdQOj8gCmhP-8vPrKIRvsg", "পোল্ট্রি মুরগি পালন ঋণ", "", "loan_template.pdf"));
        loansList.add(new Loans("https://blogger.googleusercontent.com/img/a/AVvXsEjxRxCYFMFDvY8jwXmUE63e3hvAFhIeO3VZK8yj6c9GUbXLdmVIg6NaJKaAa1Os_NyCFUQyq7ac3zUcoFoMrCe_ILPSLKX6SGO9dA2RUfN9qNQxfreMtGL8HEtGbnFhoODBTeVOf4ePB27Yzw9Mhc7m-jMK119TLFrR-I62DtKJM0SV9-Dco8yLLeqoEQ", "কৃত্রিম প্রজনন ঋণ", "", "rural_credit.pdf"));
        loansList.add(new Loans("https://blogger.googleusercontent.com/img/a/AVvXsEhco2Uv-EWyy9anRHPVa_fQ-WeC6rTqncFgLflyaNN8XQcU7FRda9k7oo5i1e1Mc1ZX9yiknndZiPqSfmcceafEgPwiM9BrOQYC2pER9lduiQhtZXop6xCkISirbdFww6vrE0ChNXVlQLLH-uE_VdJ2kgmlKn6NU53D3wuv8LEuGKL113z4eAN1JUKdyw=s320", "নারী কর্মসৃজন ঋণ", "", "loan_template.pdf"));
        loansList.add(new Loans("https://blogger.googleusercontent.com/img/a/AVvXsEglrtASkVUZS0aABFXTcDorb1Y3CHWptPxEGYrRTuTpSQ_h6DpCbzPW8uF1mzpKOF5g7sBTR5AvOaJBQwRvleNg0mo6HTFTbg7A9Tq8NGbdNlcsgWTq_v4mOvyoHe-nFq5ywIprS24KyTxJKAnyXq63phAkQgVDKGGsbjrQ_vUIrdG0hfSWqm0KHeklqA=s320", "আনসার হোম লোন", "", "rural_credit.pdf"));

        loansAdapter = new LoansAdapter(LoanActivity.this,loansList);


        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(LoanActivity.this);
        loansListRecyclerView.setLayoutManager(linearLayoutManager);
        loansListRecyclerView.setAdapter(loansAdapter);

    }
}