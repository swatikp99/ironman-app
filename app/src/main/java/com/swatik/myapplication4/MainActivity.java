package com.swatik.myapplication4;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public int count=0;
    public int[] markSuit = new int[]{R.drawable.cave,R.drawable.tony, R.drawable.mark1, R.drawable.mark2, R.drawable.mark3, R.drawable.mark4, R.drawable.mark5, R.drawable.mark6, R.drawable.mark7, R.drawable.markxvi, R.drawable.mark17, R.drawable.markxx, R.drawable.markxxiv,
                                      R.drawable.markxxv, R.drawable.markxxxvi, R.drawable.mark38, R.drawable.markxxxix, R.drawable.markxli, R.drawable.markxlii, R.drawable.markxliv, R.drawable.markxlv, R.drawable.markxlvi, R.drawable.markxlvii, R.drawable.markxlviii, R.drawable.markl,R.drawable.marklxxxv, R.drawable.warmarkvi, R.drawable.markxlix, R.drawable.spider, R.drawable.last};

    public String[] filmname = new String[]{" "," ","Iron Man","Iron Man","Iron Man","Iron Man 2","Iron Man 2","Iron Man 2","The Avengers","Iron Man 3","Iron Man 3","Iron Man 3","Iron Man 3","Iron man 3","Iron Man 3",
                                            "Iron Man 3","Iron Man 3","Iron Man 3","Iron Man 3","Avengers:Age of Ultron","Avengers:Age of Ultron", "Captain America: Civil War", "Spiderman: Homecoming", "Avengers: Infinity War", "Avengers: Infinity War", "Avengers: End Game", "Avengers: End Game", "Avengers: End Game", "Avengers: Infinity War"," "};

    public String[] suitname = new String[]{"Tony Stark","Tony Stark","Mark I","Mark II","Mark III","Mark IV","MARK V","Mark VI","Mark VII","Mark XVI(Nightclub)","Mark XVII(Heartbreaker)","Mark XX(Python)","Mark XXIV(Tank)","Mark XXV(Striker)","Mark XXXVI(Peacemaker)",
                                            "Mark XXXVIII(Igor)", "Mark XXXIX(Starboost)", "Mark XLI(Bones)", "Mark XLII", "Mark XLIV(Hulkbuster)", "Mark XLV", "Mark XLVI", "Mark XLVII", "Mark XLVIII(Hulkbuster 2.0)", "Mark L", "Mark LXXXV", "War Machine:Mark VI", "Mark XLIX","Iron Spider Suit","Tony Stark"};
    public void upgradeClick(View view) {
        count++;
        if (count > markSuit.length-1) {
            Toast.makeText(MainActivity.this, "I am Iron Man. **SNAP**", Toast.LENGTH_SHORT).show();
            count = markSuit.length - 1;
        }
        ImageView img= findViewById(R.id.mark);
        img.setImageResource(markSuit[count]);
        TextView name= findViewById(R.id.name);
        TextView feature= findViewById(R.id.feature);
        name.setText(suitname[count]);
        feature.setText(filmname[count]);


    }
    public void downgradeClick(View view)
    {
        count--;
        if(count<0) {
            Toast.makeText(MainActivity.this, "Where it all began.", Toast.LENGTH_SHORT).show();
            count = 0;
        }
        ImageView img= findViewById(R.id.mark);
        img.setImageResource(markSuit[count]);
        TextView name= findViewById(R.id.name);
        TextView feature= findViewById(R.id.feature);
        name.setText(suitname[count]);
        feature.setText(filmname[count]);


    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
