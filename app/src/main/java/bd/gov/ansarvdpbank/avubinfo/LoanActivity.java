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

        loansList.add(new Loans("https://blogger.googleusercontent.com/img/a/AVvXsEhALGdWEySw9qoaEZDFLxvuVRukKTAHDg48TjYjhKzhsBfv4eJcGqvhiFpgBH3RhWviRqg9rWPT5wlaco1W36vpYseFLmVVMlKqQLraIFDiFr3fmGLe7de3exTfo2LE51hYpfBcHWUlZmdR0pKUK4CdLhC_qXjsbh-QgUhkCH9MrWgNIHzilj7c4sfqDQ=s320", "ক্ষুদ্রঋণ", "", "microcredit.pdf"));
        loansList.add(new Loans("https://blogger.googleusercontent.com/img/a/AVvXsEgGm7zn4S_o8dQXyE183iKcb2o-x-1_VPagrLBrQ4KsRsdlKT7IioW0EQr8RFY0JYGsctRuRtGgvUPhQjzT1rK0JrzBHJ_glu41ZQipFFZYuQbD7KesjPO8tzh7oCA40X2EHxbTIKnmFOFslxP54CAc1j56VD-umcuemquaGhkXQoE4tDHDMeK6YC7d6A", "গবাদি পশু পালন ঋণ", "", "cattle_rearing.pdf"));
        loansList.add(new Loans("https://blogger.googleusercontent.com/img/a/AVvXsEhk13LZuGDAQl0ahL4nzghaRC70MpZtdrFPYHWEo34ZFWAOu0Ds8UqlfwElFmoHyuhYaANw0zIMfNex2HZ9gbMzkEPkqph3YDyXAa3uuEkHn1Y1BL4MVkb3meWjtzJtppa9F5dQPql-o9W5RgkOWprnlBe-Zxs9ilO-MkjIyVxv5_STGUpR_zPX2Vu-bw", "বাংলাদেশ ব্যাংকের তহবিলে কৃষি ঋণ- ৩০০ কোটি টাকা", "", "bbf_agri.pdf"));
        loansList.add(new Loans("https://blogger.googleusercontent.com/img/a/AVvXsEgvJc-AjQFCL926DMv9_CFVtH2oEQWDVK8F4fZkrRx4oBMnOYFCqX2ZDP40kvp642sylBo2AH4RWRSp_0k5HdozAxdrLEyq3m74ym87rLeqjvC95rIfXuw9nJoZn6wy7uOiphSHLVtXJWxUi5Ied-b4gDQz4lEXHmgHqOf6IHmwB4AhzyJi8Nz9HkGQcA=s320", "বাংলাদেশ ব্যাংকের তহবিলে আমার বাড়ি আমার খামার", "", "amar_bari_amar_khamar.pdf"));
        loansList.add(new Loans("https://blogger.googleusercontent.com/img/a/AVvXsEh6tE2lbAD33x-wupAuiocIH8QibhyRB7XuEVhJWpgeiYZJbCllJDAvf_JDzAdtdf1b25LyisGGUtd9pd3gNDbmVd3qg4p3j8NgbsopgbCnDHhk8Rmfow3715h1NxAaojgOMuLVYFblub2GvxNfmjAJYiyH6_zr2EWKv5QW2ANUz34AaYVJIdFxdYmu5Q", "বাংলাদেশ ব্যাংকের তহবিলে ক্ষুদ্রঋণ(Microcredit)-২০০ কোটি টাকা", "", "bbf_micro.pdf"));
        loansList.add(new Loans("https://blogger.googleusercontent.com/img/a/AVvXsEhoObJZK_MLIlqsZdXUmpfgQv-Ea1fETopYkwJw0V9dtN_aFJpf3wfyOrnnsYrGxdvNDubwef9ASljs0RI2wyaDncjSNPXlRdVh0w80B_z8gnUB8wTFEayOqK76KgDk8KRsueibQz1jqmc_zPYTch_jHSQ67w1LKwpXKyfo-FfPoEBLyZsgbGNeUiq0dw", "নারী কর্মসৃজন ঋণ", "", "nari_kormo.pdf"));
        loansList.add(new Loans("https://blogger.googleusercontent.com/img/a/AVvXsEhy35BZWo9Iet8rUlk3e42gyPEYf18is02vzgZnG0KNrnoL648VVVTP9tjSfcePupaZP7yxgoQQUzTLWAv03SGUp8DdImC7e5Ma3cc8J2_kYbKYeW0mk6s2TbjmLT6mq3DL7uCtPNaaVP5lRR1_764qrkjiifuC-XJRVK_4mdQOj8gCmhP-8vPrKIRvsg", "এসএমই খাতে চলতি মূলধন/ব্যবসায় নগদ ঋণ", "", "sme_loan.pdf"));
        loansList.add(new Loans("https://blogger.googleusercontent.com/img/a/AVvXsEjxRxCYFMFDvY8jwXmUE63e3hvAFhIeO3VZK8yj6c9GUbXLdmVIg6NaJKaAa1Os_NyCFUQyq7ac3zUcoFoMrCe_ILPSLKX6SGO9dA2RUfN9qNQxfreMtGL8HEtGbnFhoODBTeVOf4ePB27Yzw9Mhc7m-jMK119TLFrR-I62DtKJM0SV9-Dco8yLLeqoEQ", "হালকা যানবাহন ক্রয় ঋণ", "", "light_vehicle.pdf"));
        loansList.add(new Loans("https://blogger.googleusercontent.com/img/a/AVvXsEhco2Uv-EWyy9anRHPVa_fQ-WeC6rTqncFgLflyaNN8XQcU7FRda9k7oo5i1e1Mc1ZX9yiknndZiPqSfmcceafEgPwiM9BrOQYC2pER9lduiQhtZXop6xCkISirbdFww6vrE0ChNXVlQLLH-uE_VdJ2kgmlKn6NU53D3wuv8LEuGKL113z4eAN1JUKdyw=s320", "একটি বাড়ি একটি খামার সমন্বিত কৃষি ঋণ", "", "akti_bari_akti_khamar.pdf"));
        loansList.add(new Loans("https://blogger.googleusercontent.com/img/a/AVvXsEglrtASkVUZS0aABFXTcDorb1Y3CHWptPxEGYrRTuTpSQ_h6DpCbzPW8uF1mzpKOF5g7sBTR5AvOaJBQwRvleNg0mo6HTFTbg7A9Tq8NGbdNlcsgWTq_v4mOvyoHe-nFq5ywIprS24KyTxJKAnyXq63phAkQgVDKGGsbjrQ_vUIrdG0hfSWqm0KHeklqA=s320", "কম্পিউটার ঋণ", "", "computer_loan.pdf"));
        loansList.add(new Loans("https://blogger.googleusercontent.com/img/a/AVvXsEglrtASkVUZS0aABFXTcDorb1Y3CHWptPxEGYrRTuTpSQ_h6DpCbzPW8uF1mzpKOF5g7sBTR5AvOaJBQwRvleNg0mo6HTFTbg7A9Tq8NGbdNlcsgWTq_v4mOvyoHe-nFq5ywIprS24KyTxJKAnyXq63phAkQgVDKGGsbjrQ_vUIrdG0hfSWqm0KHeklqA=s320", "পার্সোনাল লোন", "", "personal_loan.pdf"));
        loansList.add(new Loans("https://blogger.googleusercontent.com/img/a/AVvXsEglrtASkVUZS0aABFXTcDorb1Y3CHWptPxEGYrRTuTpSQ_h6DpCbzPW8uF1mzpKOF5g7sBTR5AvOaJBQwRvleNg0mo6HTFTbg7A9Tq8NGbdNlcsgWTq_v4mOvyoHe-nFq5ywIprS24KyTxJKAnyXq63phAkQgVDKGGsbjrQ_vUIrdG0hfSWqm0KHeklqA=s320", "নগদ ঋণ(ক্যাশ ক্রেডিট)", "", "cash_credit.pdf"));
        loansList.add(new Loans("https://blogger.googleusercontent.com/img/a/AVvXsEglrtASkVUZS0aABFXTcDorb1Y3CHWptPxEGYrRTuTpSQ_h6DpCbzPW8uF1mzpKOF5g7sBTR5AvOaJBQwRvleNg0mo6HTFTbg7A9Tq8NGbdNlcsgWTq_v4mOvyoHe-nFq5ywIprS24KyTxJKAnyXq63phAkQgVDKGGsbjrQ_vUIrdG0hfSWqm0KHeklqA=s320", "গ্রামীণ পরিবহন(অটোরিক্সা/থ্রি হুইলার) ঋণ", "", "grameen_vehicle.pdf"));
        loansList.add(new Loans("https://blogger.googleusercontent.com/img/a/AVvXsEglrtASkVUZS0aABFXTcDorb1Y3CHWptPxEGYrRTuTpSQ_h6DpCbzPW8uF1mzpKOF5g7sBTR5AvOaJBQwRvleNg0mo6HTFTbg7A9Tq8NGbdNlcsgWTq_v4mOvyoHe-nFq5ywIprS24KyTxJKAnyXq63phAkQgVDKGGsbjrQ_vUIrdG0hfSWqm0KHeklqA=s320", "গরু মোটাতাজাকরণ ঋণ", "", "beaf_fattening.pdf"));
        loansList.add(new Loans("https://blogger.googleusercontent.com/img/a/AVvXsEglrtASkVUZS0aABFXTcDorb1Y3CHWptPxEGYrRTuTpSQ_h6DpCbzPW8uF1mzpKOF5g7sBTR5AvOaJBQwRvleNg0mo6HTFTbg7A9Tq8NGbdNlcsgWTq_v4mOvyoHe-nFq5ywIprS24KyTxJKAnyXq63phAkQgVDKGGsbjrQ_vUIrdG0hfSWqm0KHeklqA=s320", "আনসার-ভিডিপি প্রনোদনা কৃষি ভিত্তিক প্রকল্প ঋণ", "", "ansar_vdp_pronodona.pdf"));
        loansList.add(new Loans("https://blogger.googleusercontent.com/img/a/AVvXsEglrtASkVUZS0aABFXTcDorb1Y3CHWptPxEGYrRTuTpSQ_h6DpCbzPW8uF1mzpKOF5g7sBTR5AvOaJBQwRvleNg0mo6HTFTbg7A9Tq8NGbdNlcsgWTq_v4mOvyoHe-nFq5ywIprS24KyTxJKAnyXq63phAkQgVDKGGsbjrQ_vUIrdG0hfSWqm0KHeklqA=s320", "পোল্ট্রি(ব্রয়লার/লেয়ার) ঋণ", "", "poultry_loan.pdf"));
        loansList.add(new Loans("https://blogger.googleusercontent.com/img/a/AVvXsEglrtASkVUZS0aABFXTcDorb1Y3CHWptPxEGYrRTuTpSQ_h6DpCbzPW8uF1mzpKOF5g7sBTR5AvOaJBQwRvleNg0mo6HTFTbg7A9Tq8NGbdNlcsgWTq_v4mOvyoHe-nFq5ywIprS24KyTxJKAnyXq63phAkQgVDKGGsbjrQ_vUIrdG0hfSWqm0KHeklqA=s320", "অংগীভূত আনসার ঋণ", "", "emboded_ansar_loan.pdf"));
        loansList.add(new Loans("https://blogger.googleusercontent.com/img/a/AVvXsEglrtASkVUZS0aABFXTcDorb1Y3CHWptPxEGYrRTuTpSQ_h6DpCbzPW8uF1mzpKOF5g7sBTR5AvOaJBQwRvleNg0mo6HTFTbg7A9Tq8NGbdNlcsgWTq_v4mOvyoHe-nFq5ywIprS24KyTxJKAnyXq63phAkQgVDKGGsbjrQ_vUIrdG0hfSWqm0KHeklqA=s320", "কৃষি যন্ত্রপাতি ক্রয় ঋণ", "", "agri_tools.pdf"));
        loansList.add(new Loans("https://blogger.googleusercontent.com/img/a/AVvXsEglrtASkVUZS0aABFXTcDorb1Y3CHWptPxEGYrRTuTpSQ_h6DpCbzPW8uF1mzpKOF5g7sBTR5AvOaJBQwRvleNg0mo6HTFTbg7A9Tq8NGbdNlcsgWTq_v4mOvyoHe-nFq5ywIprS24KyTxJKAnyXq63phAkQgVDKGGsbjrQ_vUIrdG0hfSWqm0KHeklqA=s320", "সৌর-বিদ্যুৎ স্থাপন ঋণ", "", "solar_loan.pdf"));
        loansList.add(new Loans("https://blogger.googleusercontent.com/img/a/AVvXsEglrtASkVUZS0aABFXTcDorb1Y3CHWptPxEGYrRTuTpSQ_h6DpCbzPW8uF1mzpKOF5g7sBTR5AvOaJBQwRvleNg0mo6HTFTbg7A9Tq8NGbdNlcsgWTq_v4mOvyoHe-nFq5ywIprS24KyTxJKAnyXq63phAkQgVDKGGsbjrQ_vUIrdG0hfSWqm0KHeklqA=s320", "আনসার সদস্য মোটর সাইকেল ক্রয় ঋণ", "", "ansar_motor_cycle.pdf"));
        loansList.add(new Loans("https://blogger.googleusercontent.com/img/a/AVvXsEglrtASkVUZS0aABFXTcDorb1Y3CHWptPxEGYrRTuTpSQ_h6DpCbzPW8uF1mzpKOF5g7sBTR5AvOaJBQwRvleNg0mo6HTFTbg7A9Tq8NGbdNlcsgWTq_v4mOvyoHe-nFq5ywIprS24KyTxJKAnyXq63phAkQgVDKGGsbjrQ_vUIrdG0hfSWqm0KHeklqA=s320", "বায়োগ্যাস প্লান্ট স্থাপন ঋণ", "", "biogasplant_loan.pdf"));
        loansList.add(new Loans("https://blogger.googleusercontent.com/img/a/AVvXsEglrtASkVUZS0aABFXTcDorb1Y3CHWptPxEGYrRTuTpSQ_h6DpCbzPW8uF1mzpKOF5g7sBTR5AvOaJBQwRvleNg0mo6HTFTbg7A9Tq8NGbdNlcsgWTq_v4mOvyoHe-nFq5ywIprS24KyTxJKAnyXq63phAkQgVDKGGsbjrQ_vUIrdG0hfSWqm0KHeklqA=s320", "আনসার/ভিডিপি সদস্য হোম লোন", "", "ansar_vdp_home_loan.pdf"));
        loansList.add(new Loans("https://blogger.googleusercontent.com/img/a/AVvXsEglrtASkVUZS0aABFXTcDorb1Y3CHWptPxEGYrRTuTpSQ_h6DpCbzPW8uF1mzpKOF5g7sBTR5AvOaJBQwRvleNg0mo6HTFTbg7A9Tq8NGbdNlcsgWTq_v4mOvyoHe-nFq5ywIprS24KyTxJKAnyXq63phAkQgVDKGGsbjrQ_vUIrdG0hfSWqm0KHeklqA=s320", "আনসার অফিসার হোম লোন", "", "ansar_officer_home_loan.pdf"));
        loansList.add(new Loans("https://blogger.googleusercontent.com/img/a/AVvXsEglrtASkVUZS0aABFXTcDorb1Y3CHWptPxEGYrRTuTpSQ_h6DpCbzPW8uF1mzpKOF5g7sBTR5AvOaJBQwRvleNg0mo6HTFTbg7A9Tq8NGbdNlcsgWTq_v4mOvyoHe-nFq5ywIprS24KyTxJKAnyXq63phAkQgVDKGGsbjrQ_vUIrdG0hfSWqm0KHeklqA=s320", "প্রবাস গমণ ঋণ", "", "probash_loan.pdf"));
        loansList.add(new Loans("https://blogger.googleusercontent.com/img/a/AVvXsEglrtASkVUZS0aABFXTcDorb1Y3CHWptPxEGYrRTuTpSQ_h6DpCbzPW8uF1mzpKOF5g7sBTR5AvOaJBQwRvleNg0mo6HTFTbg7A9Tq8NGbdNlcsgWTq_v4mOvyoHe-nFq5ywIprS24KyTxJKAnyXq63phAkQgVDKGGsbjrQ_vUIrdG0hfSWqm0KHeklqA=s320", "কৃষি ও পল্লী ঋন কর্মসূচী(বাংলাদেশ ব্যাংকের ২০০ কোটি টাকার তহবিলে", "", "agri_rural_loan.pdf"));
        loansList.add(new Loans("https://blogger.googleusercontent.com/img/a/AVvXsEglrtASkVUZS0aABFXTcDorb1Y3CHWptPxEGYrRTuTpSQ_h6DpCbzPW8uF1mzpKOF5g7sBTR5AvOaJBQwRvleNg0mo6HTFTbg7A9Tq8NGbdNlcsgWTq_v4mOvyoHe-nFq5ywIprS24KyTxJKAnyXq63phAkQgVDKGGsbjrQ_vUIrdG0hfSWqm0KHeklqA=s320", "Ansar-VDP Alo-by Solaric(AVAS)প্রকল্প-এর মাধ্যমে M-IPS স্থাপন ঋণ", "", "solaric_avas_loan.pdf"));
        loansList.add(new Loans("https://blogger.googleusercontent.com/img/a/AVvXsEglrtASkVUZS0aABFXTcDorb1Y3CHWptPxEGYrRTuTpSQ_h6DpCbzPW8uF1mzpKOF5g7sBTR5AvOaJBQwRvleNg0mo6HTFTbg7A9Tq8NGbdNlcsgWTq_v4mOvyoHe-nFq5ywIprS24KyTxJKAnyXq63phAkQgVDKGGsbjrQ_vUIrdG0hfSWqm0KHeklqA=s320", "মৎস্য চাষ(চিংড়ি ও অন্যান্য মাছ চাষ) ঋণ", "", "fisheries_loan.pdf"));
        loansList.add(new Loans("https://blogger.googleusercontent.com/img/a/AVvXsEglrtASkVUZS0aABFXTcDorb1Y3CHWptPxEGYrRTuTpSQ_h6DpCbzPW8uF1mzpKOF5g7sBTR5AvOaJBQwRvleNg0mo6HTFTbg7A9Tq8NGbdNlcsgWTq_v4mOvyoHe-nFq5ywIprS24KyTxJKAnyXq63phAkQgVDKGGsbjrQ_vUIrdG0hfSWqm0KHeklqA=s320", "দুগ্ধ উৎপাদন ও কৃত্রিম প্রজনন খাতে পুন:অর্থায়ন স্কীম ঋণ", "", "arificial_semen.pdf"));
        loansList.add(new Loans("https://blogger.googleusercontent.com/img/a/AVvXsEglrtASkVUZS0aABFXTcDorb1Y3CHWptPxEGYrRTuTpSQ_h6DpCbzPW8uF1mzpKOF5g7sBTR5AvOaJBQwRvleNg0mo6HTFTbg7A9Tq8NGbdNlcsgWTq_v4mOvyoHe-nFq5ywIprS24KyTxJKAnyXq63phAkQgVDKGGsbjrQ_vUIrdG0hfSWqm0KHeklqA=s320", "উত্তরণ ঋণ", "", "Uttoron_loan.pdf"));
        loansList.add(new Loans("https://blogger.googleusercontent.com/img/a/AVvXsEglrtASkVUZS0aABFXTcDorb1Y3CHWptPxEGYrRTuTpSQ_h6DpCbzPW8uF1mzpKOF5g7sBTR5AvOaJBQwRvleNg0mo6HTFTbg7A9Tq8NGbdNlcsgWTq_v4mOvyoHe-nFq5ywIprS24KyTxJKAnyXq63phAkQgVDKGGsbjrQ_vUIrdG0hfSWqm0KHeklqA=s320", "হিল আনসার একটি বাড়ি একটি খামার সমন্বিত কৃষি ঋণ", "", "hill_ansar_abak.pdf"));
        loansList.add(new Loans("https://blogger.googleusercontent.com/img/a/AVvXsEglrtASkVUZS0aABFXTcDorb1Y3CHWptPxEGYrRTuTpSQ_h6DpCbzPW8uF1mzpKOF5g7sBTR5AvOaJBQwRvleNg0mo6HTFTbg7A9Tq8NGbdNlcsgWTq_v4mOvyoHe-nFq5ywIprS24KyTxJKAnyXq63phAkQgVDKGGsbjrQ_vUIrdG0hfSWqm0KHeklqA=s320", "ভাষা শহীদ আব্দুল জব্বার আনসার ও ভিডিপি স্কুল এন্ড কলেজের শিক্ষক-কর্মচারীদের একটি বাড়ি একটি খামার সমন্বিত কৃষি ঋণ", "", "abdul_jabber.pdf"));
        loansList.add(new Loans("https://blogger.googleusercontent.com/img/a/AVvXsEglrtASkVUZS0aABFXTcDorb1Y3CHWptPxEGYrRTuTpSQ_h6DpCbzPW8uF1mzpKOF5g7sBTR5AvOaJBQwRvleNg0mo6HTFTbg7A9Tq8NGbdNlcsgWTq_v4mOvyoHe-nFq5ywIprS24KyTxJKAnyXq63phAkQgVDKGGsbjrQ_vUIrdG0hfSWqm0KHeklqA=s320", "অস্থায়ী ব্যাটালিয়ন আনসারদের একটি বাড়ি একটি খামার সমন্বিত কৃষি ঋণ", "", "temporay_bat.pdf"));
        loansList.add(new Loans("https://blogger.googleusercontent.com/img/a/AVvXsEglrtASkVUZS0aABFXTcDorb1Y3CHWptPxEGYrRTuTpSQ_h6DpCbzPW8uF1mzpKOF5g7sBTR5AvOaJBQwRvleNg0mo6HTFTbg7A9Tq8NGbdNlcsgWTq_v4mOvyoHe-nFq5ywIprS24KyTxJKAnyXq63phAkQgVDKGGsbjrQ_vUIrdG0hfSWqm0KHeklqA=s320", "স্থায়ী আমানতের বিপরীতে ঋণ", "", "against_fixed_deposit.pdf"));
        loansList.add(new Loans("https://blogger.googleusercontent.com/img/a/AVvXsEglrtASkVUZS0aABFXTcDorb1Y3CHWptPxEGYrRTuTpSQ_h6DpCbzPW8uF1mzpKOF5g7sBTR5AvOaJBQwRvleNg0mo6HTFTbg7A9Tq8NGbdNlcsgWTq_v4mOvyoHe-nFq5ywIprS24KyTxJKAnyXq63phAkQgVDKGGsbjrQ_vUIrdG0hfSWqm0KHeklqA=s320", "এসডিপিএস হিসাবের স্থিতির বিপরীতে ঋণ", "", "against_sdps.pdf"));
        loansList.add(new Loans("https://blogger.googleusercontent.com/img/a/AVvXsEglrtASkVUZS0aABFXTcDorb1Y3CHWptPxEGYrRTuTpSQ_h6DpCbzPW8uF1mzpKOF5g7sBTR5AvOaJBQwRvleNg0mo6HTFTbg7A9Tq8NGbdNlcsgWTq_v4mOvyoHe-nFq5ywIprS24KyTxJKAnyXq63phAkQgVDKGGsbjrQ_vUIrdG0hfSWqm0KHeklqA=s320", "লাখপতি ডিপোজিট স্কীমের বিপরীতে ঋণ", "", "against_lakhpoti.pdf"));
        loansList.add(new Loans("https://blogger.googleusercontent.com/img/a/AVvXsEglrtASkVUZS0aABFXTcDorb1Y3CHWptPxEGYrRTuTpSQ_h6DpCbzPW8uF1mzpKOF5g7sBTR5AvOaJBQwRvleNg0mo6HTFTbg7A9Tq8NGbdNlcsgWTq_v4mOvyoHe-nFq5ywIprS24KyTxJKAnyXq63phAkQgVDKGGsbjrQ_vUIrdG0hfSWqm0KHeklqA=s320", "আমানত দ্বিগুণ বৃদ্ধি প্রকল্পের বিপরীতে ঋণ", "", "against_double_scheme.pdf"));





        loansAdapter = new LoansAdapter(LoanActivity.this,loansList);


        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(LoanActivity.this);
        loansListRecyclerView.setLayoutManager(linearLayoutManager);
        loansListRecyclerView.setAdapter(loansAdapter);

    }
}