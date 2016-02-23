    package dennischerchenko.com.bmicalculator;

    import android.support.v7.app.AppCompatActivity;
    import android.os.Bundle;
    import android.view.View;
    import android.widget.EditText;
    import android.widget.TextView;

    import org.w3c.dom.Text;


    public class MainActivity extends AppCompatActivity {

        public MainActivity() {}

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        }


        public void convertUS(View v) {
            TextView lblBMINumber = (TextView) findViewById(R.id.lblBMINumber);
            EditText txtInches = (EditText) findViewById(R.id.txtInches);
            EditText txtWeightPounds = (EditText) findViewById(R.id.txtWeightPounds);
            TextView lblBMICategory = (TextView) findViewById(R.id.lblBMICategory);

            Double inches = Double.parseDouble(txtInches.getText().toString() );
            Double pounds = Double.parseDouble(txtWeightPounds.getText().toString());

            Double BMI = (pounds * 703.0) / (inches * inches);
            Double BMIRounded = Math.round(BMI * 100) / 100.0;
            lblBMINumber.setText(Double.toString(BMIRounded));

            if(BMIRounded < 18.5){
                lblBMICategory.setText("You are: underweight");
            }else if(BMIRounded<=24.9){
                lblBMICategory.setText("You are: normal weight");
            }else if(BMIRounded<=29.9){
                lblBMICategory.setText("You are: overweight");
            }else{
                lblBMICategory.setText("You are: obese");
            }
        }

        public void convertMetric(View v) {
            TextView lblBMINumber = (TextView) findViewById(R.id.lblBMINumber);
            EditText txtMeters = (EditText) findViewById(R.id.txtMeters);
            EditText txtWeightKilograms = (EditText) findViewById(R.id.txtWeightKilograms);
            TextView lblBMICategory = (TextView) findViewById(R.id.lblBMICategory);

            Double meters = Double.parseDouble(txtMeters.getText().toString() );
            Double kilograms = Double.parseDouble(txtWeightKilograms.getText().toString());

            Double BMI = kilograms / (meters * meters);
            Double BMIRounded = Math.round(BMI * 100) / 100.0;
            lblBMINumber.setText(Double.toString(BMIRounded));


            if(BMIRounded < 18.5){
                lblBMICategory.setText("You are: underweight");
            }else if(BMIRounded<=24.9){
                lblBMICategory.setText("You are: normal weight");
            }else if(BMIRounded<=29.9){
                lblBMICategory.setText("You are: overweight");
            }else{
                lblBMICategory.setText("You are: obese");
            }
        }
    }
