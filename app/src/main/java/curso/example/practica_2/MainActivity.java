package curso.example.practica_2;

        import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;
        import android.graphics.Typeface;
        import android.widget.Button;
        import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView ambleBold, ambleLight, ambleRegular, openSansItalic, openSansRegular;
    Button btn;

    private String A_BOLD= "Amble-Bold.ttf";
    private String A_LIGHT="Amble-Light.ttf";
    private String A_REGULAR= "Amble-Regular.ttf";
    private String O_ITALIC= "OpenSans-Italic.ttf";
    private String O_REGULAR="OpenSans-Regular.ttf";
    private String P_REGULAR="Pacifico.ttf";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        setContentView(R.layout.activity_custom_fonts);

        ambleBold=(TextView)findViewById(R.id.tv_ambleBold);
        ambleLight=(TextView)findViewById(R.id.tv_ambleLight);
        ambleRegular=(TextView)findViewById(R.id.tv_ambleRegular);
        openSansRegular=(TextView)findViewById(R.id.tv_opRegular);
        openSansItalic=(TextView)findViewById(R.id.tv_opRegular);
        btn= (Button)findViewById(R.id.bt_pacifico);

        ambleBold.setTypeface(Typeface.createFromAsset(getAssets(), A_BOLD));
        ambleLight.setTypeface(Typeface.createFromAsset(getAssets(), A_LIGHT));
        ambleRegular.setTypeface(Typeface.createFromAsset(getAssets(), A_REGULAR));
        openSansRegular.setTypeface(Typeface.createFromAsset(getAssets(), O_REGULAR));
        openSansItalic.setTypeface(Typeface.createFromAsset(getAssets(), O_ITALIC));
        btn.setTypeface(Typeface.createFromAsset(getAssets(), P_REGULAR));

    }
}