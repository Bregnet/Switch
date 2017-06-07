package Swicth.Show.Hide;

import android.app.*;
import android.os.*;
import android.widget.*;

public class MainActivity extends Activity 
{
	//Membuat Private Variabel
	private Switch MySwitch;
	private TextView status;
	private ImageView img;
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		//memanggil Id yg ada di main.xml
		MySwitch =(Switch)findViewById(R.id.MySwicth);
		status =(TextView)findViewById(R.id.StatusSwicth);
		img = (ImageView)findViewById(R.id.img1);
		
		//mengeset Swicth posisi default ON
		MySwitch.setChecked(true);
		//mengeset perpindahan Swicth posisi ON dan OFF
		MySwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
			{

				@Override
				public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
				{
					if(isChecked)
					{
						img.setVisibility(0);
						status.setText("Status: ON");
					}
					else
				    {
						img.setVisibility(4);
						status.setText("Status: OFF");
					}
					
					
				}
				
			
			});
			
	

		
    }
}
