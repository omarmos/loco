package aftutorial.connectfirebase;

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText;

public class datainsert extends AppCompatActivity{
EditText txtname, txtphone;
Button btnsave;
Button phosave;
DatabaseReference reff;
Member member;


    
	@override
	protect void onCreate(Bundle savedInstanceState) {
		super.Oncreate(savedInstanceState);
		setContentView(R.layout.activity_datainsert);
		txtname = (EditText) findViewById(R.id.txtname);
		txtphone = (EditText) findViewById(R.id.txtphone);
		btnsave = (Button) findViewById(R.id.btnsave);
		phosave = (Button) findViewById(R.id.phosave);
		member = new Member();
		reff = FirebaseDatabase.getInstance().getReference().child("Member");
		btnsave.setOnClickListener(new View.OnClickListener())

		    @override
		    public void onClick (View view){
			    int phone = Intger.parseInt(txtphone.getText().toString().trim());
			    float text = float.parseFloat(txtname.getText().toString().trim());
			    member.setName(txtname.getText. ().toString().trim());
			    member.setphone(phone);
			    reff.push().setValue(member);
			    Toast.makeText(context datainsert.this, text"data inserted sucessfully", Toast.LENGTH_LONG).show();


	     	}

	    });
	}
	
}
