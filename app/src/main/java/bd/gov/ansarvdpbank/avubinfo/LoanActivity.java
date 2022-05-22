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
        https://blogger.googleusercontent.com/img/a/AVvXsEgGm7zn4S_o8dQXyE183iKcb2o-x-1_VPagrLBrQ4KsRsdlKT7IioW0EQr8RFY0JYGsctRuRtGgvUPhQjzT1rK0JrzBHJ_glu41ZQipFFZYuQbD7KesjPO8tzh7oCA40X2EHxbTIKnmFOFslxP54CAc1j56VD-umcuemquaGhkXQoE4tDHDMeK6YC7d6A
        loansList = new ArrayList<>();

        loansList.add(new Loans("https://blogger.googleusercontent.com/img/a/AVvXsEhALGdWEySw9qoaEZDFLxvuVRukKTAHDg48TjYjhKzhsBfv4eJcGqvhiFpgBH3RhWviRqg9rWPT5wlaco1W36vpYseFLmVVMlKqQLraIFDiFr3fmGLe7de3exTfo2LE51hYpfBcHWUlZmdR0pKUK4CdLhC_qXjsbh-QgUhkCH9MrWgNIHzilj7c4sfqDQ=s320", "ক্ষুদ্রঋণ", "", "microcredit.pdf"));
        loansList.add(new Loans("https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEi7MgIYzh5pwrbqSoCufGATC2an-HYQa7y84SGeL685cAH9eaneAWROcmt_iQAytAmLmdJWm_eHTc7i4m5h1SAQemmYprihc6Nuyjt9T7W_YUQ-zf1V3DGkXZ3yaX81Ny77vSlyOirzAul5DdECXoZ9VJM0MQJf9_smvKMhxn6N9XkuBKSim47qcSNr7g/s320/cattle.jpg", "গবাদি পশু পালন ঋণ", "", "cattle_rearing.pdf"));
        loansList.add(new Loans("https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEi1PLPFOzBG6wWyq6imE36FJG4kelWJgzQLUWpE4U1VQGL4Slx09y6RoOVbkrhD5X8nNnvoyAkrIcMfuEma7T5kVNNqq5cFn7VR0NhHPRhGYSnHT2Plw8jTUz8T-XeUuqFNEuFNY09-dbmKeYy1e0ZOnwv7f_fquXGNXeITi17ullRGZ3rSRkNsg7nMbg/s320/bb_krishi.jpg", "বাংলাদেশ ব্যাংকের তহবিলে কৃষি ঋণ- ৩০০ কোটি টাকা", "", "bbf_agri.pdf"));
        loansList.add(new Loans("https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEhVih9ao4NNCooEY7NuH2EGBibnHdLJySAwkGPe3hrezWYzIug5oPejN2V8AROda4relcgCbyg9kBoiWbGGHyZOJ4BtQXlUxyiDoQq9huYPfWWWz5yl6MfQMn21JABQ6boZHFu35kaDDiazqD3X5Bg6tOU8e9ffe30HrdCK207ZJGh9Z_adP45Zj83JtA/s320/amar_bar_amar_khamar.jpg", "বাংলাদেশ ব্যাংকের তহবিলে আমার বাড়ি আমার খামার", "", "amar_bari_amar_khamar.pdf"));
        loansList.add(new Loans("https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEjlKmsIz0r0X6SV9jr1lJ5HcuxfIhawdmpNV8aF0bVp73HpUoQV0nc1GnsgBWzBg7UQzC8OH4HlXgB3BRNR2S7Qejsi_qdKuHU0Xx2DetCQEYa6CPGKrimT2uOEbSmsPna03ZyYk3LDTkrTPX_9FS3x23WVBIgRbWv-InVBqHrC6QhvqP4An40qqdCygA/s320/bb_duck.jpg", "বাংলাদেশ ব্যাংকের তহবিলে ক্ষুদ্রঋণ(Microcredit)-২০০ কোটি টাকা", "", "bbf_micro.pdf"));
        loansList.add(new Loans("https://blogger.googleusercontent.com/img/a/AVvXsEhco2Uv-EWyy9anRHPVa_fQ-WeC6rTqncFgLflyaNN8XQcU7FRda9k7oo5i1e1Mc1ZX9yiknndZiPqSfmcceafEgPwiM9BrOQYC2pER9lduiQhtZXop6xCkISirbdFww6vrE0ChNXVlQLLH-uE_VdJ2kgmlKn6NU53D3wuv8LEuGKL113z4eAN1JUKdyw=s320", "নারী কর্মসৃজন ঋণ", "", "nari_kormo.pdf"));
        loansList.add(new Loans("https://blogger.googleusercontent.com/img/a/AVvXsEgGm7zn4S_o8dQXyE183iKcb2o-x-1_VPagrLBrQ4KsRsdlKT7IioW0EQr8RFY0JYGsctRuRtGgvUPhQjzT1rK0JrzBHJ_glu41ZQipFFZYuQbD7KesjPO8tzh7oCA40X2EHxbTIKnmFOFslxP54CAc1j56VD-umcuemquaGhkXQoE4tDHDMeK6YC7d6A", "এসএমই খাতে চলতি মূলধন/ব্যবসায় নগদ ঋণ", "", "sme_loan.pdf"));
        loansList.add(new Loans("https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEh1TWxX5lAJ8HP9Ce79izEsMjQ0wUbz-1qO95REk_PqKSOCUUaY5jMXWU_KLHNoc87JciFiPanhCPRq4_ONecpk80PorPozIOF4HrYxoOHj6Ai3MScon33KCchG1336pMOj00crvGObdQKsmMREDQ-NHiaOWF2qF8VXHW-yQsI3mXtiW9MM-7LNA7LKHw/s320/grameen_vehicle.jpg", "হালকা যানবাহন ক্রয় ঋণ", "", "light_vehicle.pdf"));
        loansList.add(new Loans("https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEhm5XymgjQJ39PwPax2AsfTx-y3qB8SOMHOanUyrJHCf_j3YF1u66I8G8zZ7itWrd5FBftkPFqUUXFbSi_Zi6BmHmr3fjWDML9w6LzWHi3xw4LEHb5jq2f4L4KgysiLbTds9m0IHlnOG9-XHrANMW7rjEJoFYBxdeaSOzEAh0cPWVKCJBOAa3z5xYtAhA/s320/abak.jpg", "একটি বাড়ি একটি খামার সমন্বিত কৃষি ঋণ", "", "akti_bari_akti_khamar.pdf"));
        loansList.add(new Loans("https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEjAFLbaIEpqRmpx1uk5gVlHW_CGZp76cSO_y8lzpbNR50ZBZ4bJ0p9hI4Ouh70ovK0gyhJ0M2GEL-J5XghpEpFlTUnkG_6l1DfEeq1gmKZdRp9IWU5FNX8cenIKXth8lM3jCn2k6_ynJcmrc6kSgdBKBBdZc3Nv1B56zmdn3LuJC1hZwJfH-RJBA8tEsA/s320/computer.jpg", "কম্পিউটার ঋণ", "", "computer_loan.pdf"));
        loansList.add(new Loans("https://blogger.googleusercontent.com/img/a/AVvXsEglrtASkVUZS0aABFXTcDorb1Y3CHWptPxEGYrRTuTpSQ_h6DpCbzPW8uF1mzpKOF5g7sBTR5AvOaJBQwRvleNg0mo6HTFTbg7A9Tq8NGbdNlcsgWTq_v4mOvyoHe-nFq5ywIprS24KyTxJKAnyXq63phAkQgVDKGGsbjrQ_vUIrdG0hfSWqm0KHeklqA=s320", "পার্সোনাল লোন", "", "personal_loan.pdf"));
        loansList.add(new Loans("https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEj03I5fWt9vA33xe9iiZJ71optwJQN2kortyFXGxfV77wvrb2UJP9L9j417PTKevjgJQwDibJsiw4PnBqLnqT8fSl3aBsuF9rr_dzHBrYGynQx9Uo3tmu7aVrZwnYv6kWDwKxzAIAaamM6xEgJay6vBG-CELPnFTZYn1R5LzujTuyUSJhoacOR-DddPPA/s320/cash_credit.jpg", "নগদ ঋণ(ক্যাশ ক্রেডিট)", "", "cash_credit.pdf"));
        loansList.add(new Loans("https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEh1TWxX5lAJ8HP9Ce79izEsMjQ0wUbz-1qO95REk_PqKSOCUUaY5jMXWU_KLHNoc87JciFiPanhCPRq4_ONecpk80PorPozIOF4HrYxoOHj6Ai3MScon33KCchG1336pMOj00crvGObdQKsmMREDQ-NHiaOWF2qF8VXHW-yQsI3mXtiW9MM-7LNA7LKHw/s320/grameen_vehicle.jpg", "গ্রামীণ পরিবহন(অটোরিক্সা/থ্রি হুইলার) ঋণ", "", "grameen_vehicle.pdf"));
        loansList.add(new Loans("https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEhwGYJFUX2P4Kb4suxlH1p8oBCsKLx3z6z-GgeLdIpgn2jrF8Aab5DlmWAWd37uDyfvykPWelMDhtw200g3u5OJu62iIQXAA5RqftX0JRVYjK-hHiRKgF4JA0evUuf1apqJvH9z0cSfbmQSiFo-HSEBBRgudLshTPBjJoUum6W_GpQrEoMVLfkxeGkfBQ/s320/beaf_fattening.jpg", "গরু মোটাতাজাকরণ ঋণ", "", "beaf_fattening.pdf"));
        loansList.add(new Loans("https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEitRQRXymgA-pOMA2923hDOppOnjtgALtp264UD7fvVtrcwaELB81MFAaYBUaY3dDHHabFB3EGBU45HmnyEC164Z6lIem7eve_oPaosPT1xbDXk9iMsEbgPmLVvFJkuN5r3wolyyNzqm-SGFGiq_hRbzd5YWMYP3l0fPFc8Ig17KuhQA2CmEKG-S673hw/s320/agri_rural.jpg", "আনসার-ভিডিপি প্রনোদনা কৃষি ভিত্তিক প্রকল্প ঋণ", "", "ansar_vdp_pronodona.pdf"));
        loansList.add(new Loans("https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEipZBaxWjXkSk8FCj70Gn7yd5cvTtr8ETbgSeLRChDU7_uLA1EN4rLOgOpL21z23TTm8aaoGyd3vuVC4vFWYk3aGB-OQ1w2tbXwOO3eTL8aIdbUu_jjOSVU85GUDHY-k6fgYOorMdK6f0LLQ03LC9THifigKlxJ5ZZ05sciefEwYUc6Pqmgk8QynmGxyQ/s320/poultry.jpg", "পোল্ট্রি(ব্রয়লার/লেয়ার) ঋণ", "", "poultry_loan.pdf"));
        loansList.add(new Loans("https://blogger.googleusercontent.com/img/a/AVvXsEglrtASkVUZS0aABFXTcDorb1Y3CHWptPxEGYrRTuTpSQ_h6DpCbzPW8uF1mzpKOF5g7sBTR5AvOaJBQwRvleNg0mo6HTFTbg7A9Tq8NGbdNlcsgWTq_v4mOvyoHe-nFq5ywIprS24KyTxJKAnyXq63phAkQgVDKGGsbjrQ_vUIrdG0hfSWqm0KHeklqA=s320", "অংগীভূত আনসার ঋণ", "", "emboded_ansar_loan.pdf"));
        loansList.add(new Loans("https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiJuY3jheE1NWkZSJLVkE6EwaZXBK5n8lOmSLbI7mDxj_wgQOs0tmckmnjPSwTjV-ntf-oxwNVGTZrMKxU-0QWvoEgXACOWUR29ip-ejQ8wQghA03oAbFvJAyelbgaOSbwCGtvpjq6eqs4OchePrpUMUr4l5tBB2qfOWpVcDBJsARiXsFx5ajyc18O8lw/s320/tructor.jpg", "কৃষি যন্ত্রপাতি ক্রয় ঋণ", "", "agri_tools.pdf"));
        loansList.add(new Loans("https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEj1mn2EjPEy8KK9-deGdhBQg3PvQ-w7R7URYYCruB-FYjvuhENYeoU2A4MA1s7DUgakpfDS5mR6utAiqYc4pRdK_jgjjZBC1L4k2poxwFzf3QjsV8cGaqx972h0MFKUkwWhPZbI7tt1mi1Qd1jKu75k-e7xIl7qNLYvzIzK2LGsnQ9o6Y4b7OkcUDmpMg/s320/solar_edited.jpg", "সৌর-বিদ্যুৎ স্থাপন ঋণ", "", "solar_loan.pdf"));
        loansList.add(new Loans("https://blogger.googleusercontent.com/img/a/AVvXsEglrtASkVUZS0aABFXTcDorb1Y3CHWptPxEGYrRTuTpSQ_h6DpCbzPW8uF1mzpKOF5g7sBTR5AvOaJBQwRvleNg0mo6HTFTbg7A9Tq8NGbdNlcsgWTq_v4mOvyoHe-nFq5ywIprS24KyTxJKAnyXq63phAkQgVDKGGsbjrQ_vUIrdG0hfSWqm0KHeklqA=s320", "আনসার সদস্য মোটর সাইকেল ক্রয় ঋণ", "", "ansar_motor_cycle.pdf"));
        loansList.add(new Loans("https://blogger.googleusercontent.com/img/a/AVvXsEglrtASkVUZS0aABFXTcDorb1Y3CHWptPxEGYrRTuTpSQ_h6DpCbzPW8uF1mzpKOF5g7sBTR5AvOaJBQwRvleNg0mo6HTFTbg7A9Tq8NGbdNlcsgWTq_v4mOvyoHe-nFq5ywIprS24KyTxJKAnyXq63phAkQgVDKGGsbjrQ_vUIrdG0hfSWqm0KHeklqA=s320", "বায়োগ্যাস প্লান্ট স্থাপন ঋণ", "", "biogasplant_loan.pdf"));
        loansList.add(new Loans("https://blogger.googleusercontent.com/img/a/AVvXsEglrtASkVUZS0aABFXTcDorb1Y3CHWptPxEGYrRTuTpSQ_h6DpCbzPW8uF1mzpKOF5g7sBTR5AvOaJBQwRvleNg0mo6HTFTbg7A9Tq8NGbdNlcsgWTq_v4mOvyoHe-nFq5ywIprS24KyTxJKAnyXq63phAkQgVDKGGsbjrQ_vUIrdG0hfSWqm0KHeklqA=s320", "আনসার/ভিডিপি সদস্য হোম লোন", "", "ansar_vdp_home_loan.pdf"));
        loansList.add(new Loans("https://blogger.googleusercontent.com/img/a/AVvXsEglrtASkVUZS0aABFXTcDorb1Y3CHWptPxEGYrRTuTpSQ_h6DpCbzPW8uF1mzpKOF5g7sBTR5AvOaJBQwRvleNg0mo6HTFTbg7A9Tq8NGbdNlcsgWTq_v4mOvyoHe-nFq5ywIprS24KyTxJKAnyXq63phAkQgVDKGGsbjrQ_vUIrdG0hfSWqm0KHeklqA=s320", "আনসার অফিসার হোম লোন", "", "ansar_officer_home_loan.pdf"));
        loansList.add(new Loans("https://blogger.googleusercontent.com/img/a/AVvXsEglrtASkVUZS0aABFXTcDorb1Y3CHWptPxEGYrRTuTpSQ_h6DpCbzPW8uF1mzpKOF5g7sBTR5AvOaJBQwRvleNg0mo6HTFTbg7A9Tq8NGbdNlcsgWTq_v4mOvyoHe-nFq5ywIprS24KyTxJKAnyXq63phAkQgVDKGGsbjrQ_vUIrdG0hfSWqm0KHeklqA=s320", "প্রবাস গমণ ঋণ", "", "probash_loan.pdf"));
        loansList.add(new Loans("https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEhgyYXOMwHFRpuB0nbZkEst5W8ejtgNEzlTgatZhhtAE736UrZECeV4YgZUss70CLR0pwKmeOzzzT0wz0ONEP6P_ZxqmdiP9CqoDgv9F_SzYxGD8277jGcduET2Z18eOBkfu-4tjUvZ18mrbmSBEAQU6EcTATRkVx6e0CK98HMIhr_J7HpB38nZ8Icofw/s320/agri_bb.jpg", "কৃষি ও পল্লী ঋন কর্মসূচী(বাংলাদেশ ব্যাংকের ২০০ কোটি টাকার তহবিলে", "", "agri_rural_loan.pdf"));
        loansList.add(new Loans("https://blogger.googleusercontent.com/img/a/AVvXsEglrtASkVUZS0aABFXTcDorb1Y3CHWptPxEGYrRTuTpSQ_h6DpCbzPW8uF1mzpKOF5g7sBTR5AvOaJBQwRvleNg0mo6HTFTbg7A9Tq8NGbdNlcsgWTq_v4mOvyoHe-nFq5ywIprS24KyTxJKAnyXq63phAkQgVDKGGsbjrQ_vUIrdG0hfSWqm0KHeklqA=s320", "Ansar-VDP Alo-by Solaric(AVAS)প্রকল্প-এর মাধ্যমে M-IPS স্থাপন ঋণ", "", "solaric_avas_loan.pdf"));
        loansList.add(new Loans("https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEg0B2NaxVh_CngK9fgcJ7gftxrGNwPaDWoTK05L6CoG5NaKSSo7WMqV62-z9wYF29J34Kv6vjKsGYj-wILAIuj3_Pu0vzdoKJ69pfQE6xCVUzI29oydolJD01sAIQ0vFss21S0VUznoWwownExnM6UDnFKVB_9ENAGsD4rwJ8udQzKnZfqjp-dEtzsztQ/s320/fish.jpg", "মৎস্য চাষ(চিংড়ি ও অন্যান্য মাছ চাষ) ঋণ", "", "fisheries_loan.pdf"));
        loansList.add(new Loans("https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEgZuGlMX2eQoxmNiGnQDx6UgcbVCe2801S9zVylr6ynBwG9AEYLii_I-HQDQCwpuPbr0ws3ldpDJDj1pwmfA58wHuPhwKM-PV9UydXnfdeDzd3fNoxpGYkFa10wAShF3LeMB71HmpfJv-psCGVeW3mQb0hb8FSmlpg-ag8kV4Yka8n5a-iW_eYeCFK9Ug/s320/artificial_semen.jpg", "দুগ্ধ উৎপাদন ও কৃত্রিম প্রজনন খাতে পুন:অর্থায়ন স্কীম ঋণ", "", "arificial_semen.pdf"));
        loansList.add(new Loans("https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEgYEov9gUAdUn9YAM32iyrHP1Cgzi_wqD2wu7ims87Z61flSUHieOl2-OvIbSkWXxHsikBmE5GZXP6WQbYKlrTZymlKRLYYc7QGQu0DVnQ149akBkP8WkxYYOs26G146N8B6dNAzxQWl7PU9J8mUzOhUdj_l4nfEqV6tvARK3YAkDIuejfunQVMOxrHJg/s320/bb_caine.jpg", "উত্তরণ ঋণ", "", "Uttoron_loan.pdf"));
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