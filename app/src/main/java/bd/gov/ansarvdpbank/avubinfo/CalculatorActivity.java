package bd.gov.ansarvdpbank.avubinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import android.view.inputmethod.InputMethodManager;

public class CalculatorActivity extends AppCompatActivity {

    private EditText loanAmount;
    private EditText interest;
    private EditText year;
    private EditText month;

    private TextView lEmi;
    private TextView lTenure;
    private TextView lLoanAmount;
    private TextView lInterestPayable;
    private TextView lTotalPayment;

    private Button btnClear;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        loanAmount = findViewById(R.id.loanAmount);
        loanAmount.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL);

        interest = findViewById(R.id.interest);
        interest.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL);

        year = findViewById(R.id.year);
        year.setInputType(InputType.TYPE_CLASS_NUMBER);

        month = findViewById(R.id.month);
        month.setInputType(InputType.TYPE_CLASS_NUMBER);

        btnClear = findViewById(R.id.btnClear);

        lEmi = findViewById(R.id.lEmi);
        lTenure = findViewById(R.id.lTenure);
        lLoanAmount = findViewById(R.id.lLoanAmount);
        lInterestPayable = findViewById(R.id.lInterestPayable);
        lTotalPayment = findViewById(R.id.lTotalPayment);
    }

    public void btnSum(View view){
        try {
            double loanAmount1 = Double.parseDouble(loanAmount.getText().toString());
            //double interest1 = Integer.parseInt(interest.getText().toString());
            double interest1 = Double.parseDouble(interest.getText().toString());
            int month1 = Integer.parseInt(month.getText().toString());
            int year2 = Integer.parseInt(year.getText().toString());

            int yearExchange = (year2*12)+month1; // Total years converted to month and month given

            //EMI Calculation
            double principle = loanAmount1;
            double rateOfInterest = (interest1 / 12)/100;
            double power = Math.pow(rateOfInterest+1, yearExchange);
            double sum = (principle * rateOfInterest * power) / (power-1);
            // (loanAmount * monthlyInterest * Math.pow(1 + monthlyInterest, loanDurationMonths)) /
            //                     (Math.pow(1 + monthlyInterest, loanDurationMonths) - 1);

            // EMI Payment Summary
            double TotalInterest = sum * yearExchange - loanAmount1;
            double totalPayment2 = loanAmount1 + TotalInterest;

//          // Previous Code:
            /**
             * lEmi.setText(String.valueOf(sum));
             * lTenure.setText(String.valueOf(yearExchange)+" Month");
             * lLoanAmount.setText(String.valueOf(loanAmount1));
             * lInterestPayable.setText(String.valueOf(TotalInterest));
             * lTotalPayment.setText(String.valueOf(totalPayment2));
             */

            // Coding Edited for two digit decimal Points
            lEmi.setText(String.format("%.2f", sum));
            lTenure.setText(String.valueOf(yearExchange)+" Month");
            lLoanAmount.setText(String.format("%.2f", loanAmount1));
            lInterestPayable.setText(String.format("%.2f", TotalInterest));
            lTotalPayment.setText(String.format("%.2f", totalPayment2));
        }catch (NumberFormatException exception){
            //lLoanAmount.setText("অনুগ্রহপূর্বক সকল ফিল্ডে সঠিক সংখ্যা প্রদান করুন।");
            Toast.makeText(this, "অনুগ্রহপূর্বক সকল ফিল্ডে সঠিক সংখ্যা প্রদান করুন।", Toast.LENGTH_LONG).show();
        }


        // Input Keyboard Hide
        InputMethodManager inm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
        inm.hideSoftInputFromWindow(view.getWindowToken(), 0);

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearFields();
            }
        });
    }

    private void clearFields() {
        loanAmount.setText("");
        interest.setText("");
        year.setText("");
        month.setText("");

        lEmi.setText("");
        lTenure.setText("");
        lLoanAmount.setText("");
        lInterestPayable.setText("");
        lTotalPayment.setText("");

    }


}