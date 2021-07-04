package pan.bo.yu.bigandsmall;

import android.media.SoundPool;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import pl.droidsonroids.gif.GifImageView;


public class MainActivity extends AppCompatActivity {
    GifImageView gif ,gif2,gif3,gif4,gif5,gif6;
    int i ,i2,i3,i4,i5,i6,x;
    private RelativeLayout relative;
    TextView textView;
    SoundPool soundPool;
    int soundID;
    boolean flag =true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gif =findViewById(R.id.gif);
        gif2 =findViewById(R.id.gif2);
        gif3 =findViewById(R.id.gif3);
        gif4 =findViewById(R.id.gif4);
        gif5 =findViewById(R.id.gif5);
        gif6 =findViewById(R.id.gif6);
        relative= findViewById(R.id.relative);
        textView=findViewById(R.id.text);
        x=1;
       soundPool = new SoundPool.Builder().build();
        soundID =soundPool.load(this,R.raw.dice,1);
        Log.w("boobs","正式第五次部勾選 簽名 全部強制");

    }

    public void roll(View view) {

        if(flag) {
            flag=false;
            i = 0;
            i2 = 0;
            i3 = 0;
            i4 = 0;
            i5 = 0;
            i6 = 0;

            if (x == 1) {
                roll1();
                gif.setImageResource(R.drawable.down);
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (i == 1) {
                            gif.setImageResource(R.drawable.one);
                        }
                        if (i == 2) {
                            gif.setImageResource(R.drawable.two);
                        }
                        if (i == 3) {
                            gif.setImageResource(R.drawable.three);
                        }
                        if (i == 4) {
                            gif.setImageResource(R.drawable.four);
                        }
                        if (i == 5) {
                            gif.setImageResource(R.drawable.five);
                        }
                        if (i == 6) {
                            gif.setImageResource(R.drawable.six);
                        }

                        textView.setText("點數:" + i);
                        flag=true;
                    }
                }, 3000);
            }
            if (x == 2) {
                roll1();
                gif.setImageResource(R.drawable.down);
                gif2.setImageResource(R.drawable.down);
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (i == 1) {
                            gif.setImageResource(R.drawable.one);
                        }
                        if (i == 2) {
                            gif.setImageResource(R.drawable.two);
                        }
                        if (i == 3) {
                            gif.setImageResource(R.drawable.three);
                        }
                        if (i == 4) {
                            gif.setImageResource(R.drawable.four);
                        }
                        if (i == 5) {
                            gif.setImageResource(R.drawable.five);
                        }
                        if (i == 6) {
                            gif.setImageResource(R.drawable.six);
                        }

                        if (i2 == 1) {
                            gif2.setImageResource(R.drawable.one);
                        }
                        if (i2 == 2) {
                            gif2.setImageResource(R.drawable.two);
                        }
                        if (i2 == 3) {
                            gif2.setImageResource(R.drawable.three);
                        }
                        if (i2 == 4) {
                            gif2.setImageResource(R.drawable.four);
                        }
                        if (i2 == 5) {
                            gif2.setImageResource(R.drawable.five);
                        }
                        if (i2 == 6) {
                            gif2.setImageResource(R.drawable.six);
                        }
                        textView.setText("點數:" + (i + i2));
                        flag=true;
                    }
                }, 3000);

            }

            if (x == 3) {
                roll1();
                gif.setImageResource(R.drawable.down);
                gif2.setImageResource(R.drawable.down);
                gif3.setImageResource(R.drawable.down);
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (i == 1) {
                            gif.setImageResource(R.drawable.one);
                        }
                        if (i == 2) {
                            gif.setImageResource(R.drawable.two);
                        }
                        if (i == 3) {
                            gif.setImageResource(R.drawable.three);
                        }
                        if (i == 4) {
                            gif.setImageResource(R.drawable.four);
                        }
                        if (i == 5) {
                            gif.setImageResource(R.drawable.five);
                        }
                        if (i == 6) {
                            gif.setImageResource(R.drawable.six);
                        }

                        if (i2 == 1) {
                            gif2.setImageResource(R.drawable.one);
                        }
                        if (i2 == 2) {
                            gif2.setImageResource(R.drawable.two);
                        }
                        if (i2 == 3) {
                            gif2.setImageResource(R.drawable.three);
                        }
                        if (i2 == 4) {
                            gif2.setImageResource(R.drawable.four);
                        }
                        if (i2 == 5) {
                            gif2.setImageResource(R.drawable.five);
                        }
                        if (i2 == 6) {
                            gif2.setImageResource(R.drawable.six);
                        }

                        if (i3 == 1) {
                            gif3.setImageResource(R.drawable.one);
                        }
                        if (i3 == 2) {
                            gif3.setImageResource(R.drawable.two);
                        }
                        if (i3 == 3) {
                            gif3.setImageResource(R.drawable.three);
                        }
                        if (i3 == 4) {
                            gif3.setImageResource(R.drawable.four);
                        }
                        if (i3 == 5) {
                            gif3.setImageResource(R.drawable.five);
                        }
                        if (i3 == 6) {
                            gif3.setImageResource(R.drawable.six);
                        }
                        textView.setText("點數:" + (i + i2 + i3));
                        flag=true;
                    }
                }, 3000);

            }

            if (x == 4) {
                roll1();
                gif.setImageResource(R.drawable.down);
                gif2.setImageResource(R.drawable.down);
                gif3.setImageResource(R.drawable.down);
                gif4.setImageResource(R.drawable.down);
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (i == 1) {
                            gif.setImageResource(R.drawable.one);
                        }
                        if (i == 2) {
                            gif.setImageResource(R.drawable.two);
                        }
                        if (i == 3) {
                            gif.setImageResource(R.drawable.three);
                        }
                        if (i == 4) {
                            gif.setImageResource(R.drawable.four);
                        }
                        if (i == 5) {
                            gif.setImageResource(R.drawable.five);
                        }
                        if (i == 6) {
                            gif.setImageResource(R.drawable.six);
                        }

                        if (i2 == 1) {
                            gif2.setImageResource(R.drawable.one);
                        }
                        if (i2 == 2) {
                            gif2.setImageResource(R.drawable.two);
                        }
                        if (i2 == 3) {
                            gif2.setImageResource(R.drawable.three);
                        }
                        if (i2 == 4) {
                            gif2.setImageResource(R.drawable.four);
                        }
                        if (i2 == 5) {
                            gif2.setImageResource(R.drawable.five);
                        }
                        if (i2 == 6) {
                            gif2.setImageResource(R.drawable.six);
                        }

                        if (i3 == 1) {
                            gif3.setImageResource(R.drawable.one);
                        }
                        if (i3 == 2) {
                            gif3.setImageResource(R.drawable.two);
                        }
                        if (i3 == 3) {
                            gif3.setImageResource(R.drawable.three);
                        }
                        if (i3 == 4) {
                            gif3.setImageResource(R.drawable.four);
                        }
                        if (i3 == 5) {
                            gif3.setImageResource(R.drawable.five);
                        }
                        if (i3 == 6) {
                            gif3.setImageResource(R.drawable.six);
                        }

                        if (i4 == 1) {
                            gif4.setImageResource(R.drawable.one);
                        }
                        if (i4 == 2) {
                            gif4.setImageResource(R.drawable.two);
                        }
                        if (i4 == 3) {
                            gif4.setImageResource(R.drawable.three);
                        }
                        if (i4 == 4) {
                            gif4.setImageResource(R.drawable.four);
                        }
                        if (i4 == 5) {
                            gif4.setImageResource(R.drawable.five);
                        }
                        if (i4 == 6) {
                            gif4.setImageResource(R.drawable.six);
                        }
                        textView.setText("點數:" + (i + i2 + i3 + i4));
                        flag=true;
                    }
                }, 3000);

            }

            if (x == 5) {
                roll1();
                gif.setImageResource(R.drawable.down);
                gif2.setImageResource(R.drawable.down);
                gif3.setImageResource(R.drawable.down);
                gif4.setImageResource(R.drawable.down);
                gif5.setImageResource(R.drawable.down);
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (i == 1) {
                            gif.setImageResource(R.drawable.one);
                        }
                        if (i == 2) {
                            gif.setImageResource(R.drawable.two);
                        }
                        if (i == 3) {
                            gif.setImageResource(R.drawable.three);
                        }
                        if (i == 4) {
                            gif.setImageResource(R.drawable.four);
                        }
                        if (i == 5) {
                            gif.setImageResource(R.drawable.five);
                        }
                        if (i == 6) {
                            gif.setImageResource(R.drawable.six);
                        }

                        if (i2 == 1) {
                            gif2.setImageResource(R.drawable.one);
                        }
                        if (i2 == 2) {
                            gif2.setImageResource(R.drawable.two);
                        }
                        if (i2 == 3) {
                            gif2.setImageResource(R.drawable.three);
                        }
                        if (i2 == 4) {
                            gif2.setImageResource(R.drawable.four);
                        }
                        if (i2 == 5) {
                            gif2.setImageResource(R.drawable.five);
                        }
                        if (i2 == 6) {
                            gif2.setImageResource(R.drawable.six);
                        }

                        if (i3 == 1) {
                            gif3.setImageResource(R.drawable.one);
                        }
                        if (i3 == 2) {
                            gif3.setImageResource(R.drawable.two);
                        }
                        if (i3 == 3) {
                            gif3.setImageResource(R.drawable.three);
                        }
                        if (i3 == 4) {
                            gif3.setImageResource(R.drawable.four);
                        }
                        if (i3 == 5) {
                            gif3.setImageResource(R.drawable.five);
                        }
                        if (i3 == 6) {
                            gif3.setImageResource(R.drawable.six);
                        }

                        if (i4 == 1) {
                            gif4.setImageResource(R.drawable.one);
                        }
                        if (i4 == 2) {
                            gif4.setImageResource(R.drawable.two);
                        }
                        if (i4 == 3) {
                            gif4.setImageResource(R.drawable.three);
                        }
                        if (i4 == 4) {
                            gif4.setImageResource(R.drawable.four);
                        }
                        if (i4 == 5) {
                            gif4.setImageResource(R.drawable.five);
                        }
                        if (i4 == 6) {
                            gif4.setImageResource(R.drawable.six);
                        }

                        if (i5 == 1) {
                            gif5.setImageResource(R.drawable.one);
                        }
                        if (i5 == 2) {
                            gif5.setImageResource(R.drawable.two);
                        }
                        if (i5 == 3) {
                            gif5.setImageResource(R.drawable.three);
                        }
                        if (i5 == 4) {
                            gif5.setImageResource(R.drawable.four);
                        }
                        if (i5 == 5) {
                            gif5.setImageResource(R.drawable.five);
                        }
                        if (i5 == 6) {
                            gif5.setImageResource(R.drawable.six);
                        }

                        textView.setText("點數:" + (i + i2 + i3 + i4 + i5));
                        flag=true;
                    }
                }, 3000);

            }

            if (x == 6) {
                roll1();
                gif.setImageResource(R.drawable.down);
                gif2.setImageResource(R.drawable.down);
                gif3.setImageResource(R.drawable.down);
                gif4.setImageResource(R.drawable.down);
                gif5.setImageResource(R.drawable.down);
                gif6.setImageResource(R.drawable.down);
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (i == 1) {
                            gif.setImageResource(R.drawable.one);
                        }
                        if (i == 2) {
                            gif.setImageResource(R.drawable.two);
                        }
                        if (i == 3) {
                            gif.setImageResource(R.drawable.three);
                        }
                        if (i == 4) {
                            gif.setImageResource(R.drawable.four);
                        }
                        if (i == 5) {
                            gif.setImageResource(R.drawable.five);
                        }
                        if (i == 6) {
                            gif.setImageResource(R.drawable.six);
                        }

                        if (i2 == 1) {
                            gif2.setImageResource(R.drawable.one);
                        }
                        if (i2 == 2) {
                            gif2.setImageResource(R.drawable.two);
                        }
                        if (i2 == 3) {
                            gif2.setImageResource(R.drawable.three);
                        }
                        if (i2 == 4) {
                            gif2.setImageResource(R.drawable.four);
                        }
                        if (i2 == 5) {
                            gif2.setImageResource(R.drawable.five);
                        }
                        if (i2 == 6) {
                            gif2.setImageResource(R.drawable.six);
                        }

                        if (i3 == 1) {
                            gif3.setImageResource(R.drawable.one);
                        }
                        if (i3 == 2) {
                            gif3.setImageResource(R.drawable.two);
                        }
                        if (i3 == 3) {
                            gif3.setImageResource(R.drawable.three);
                        }
                        if (i3 == 4) {
                            gif3.setImageResource(R.drawable.four);
                        }
                        if (i3 == 5) {
                            gif3.setImageResource(R.drawable.five);
                        }
                        if (i3 == 6) {
                            gif3.setImageResource(R.drawable.six);
                        }

                        if (i4 == 1) {
                            gif4.setImageResource(R.drawable.one);
                        }
                        if (i4 == 2) {
                            gif4.setImageResource(R.drawable.two);
                        }
                        if (i4 == 3) {
                            gif4.setImageResource(R.drawable.three);
                        }
                        if (i4 == 4) {
                            gif4.setImageResource(R.drawable.four);
                        }
                        if (i4 == 5) {
                            gif4.setImageResource(R.drawable.five);
                        }
                        if (i4 == 6) {
                            gif4.setImageResource(R.drawable.six);
                        }

                        if (i5 == 1) {
                            gif5.setImageResource(R.drawable.one);
                        }
                        if (i5 == 2) {
                            gif5.setImageResource(R.drawable.two);
                        }
                        if (i5 == 3) {
                            gif5.setImageResource(R.drawable.three);
                        }
                        if (i5 == 4) {
                            gif5.setImageResource(R.drawable.four);
                        }
                        if (i5 == 5) {
                            gif5.setImageResource(R.drawable.five);
                        }
                        if (i5 == 6) {
                            gif5.setImageResource(R.drawable.six);
                        }

                        if (i6 == 1) {
                            gif6.setImageResource(R.drawable.one);
                        }
                        if (i6 == 2) {
                            gif6.setImageResource(R.drawable.two);
                        }
                        if (i6 == 3) {
                            gif6.setImageResource(R.drawable.three);
                        }
                        if (i6 == 4) {
                            gif6.setImageResource(R.drawable.four);
                        }
                        if (i6 == 5) {
                            gif6.setImageResource(R.drawable.five);
                        }
                        if (i6 == 6) {
                            gif6.setImageResource(R.drawable.six);
                        }

                        textView.setText("點數:" + (i + i2 + i3 + i4 + i5 + i6));
                        flag=true;
                    }
                }, 3000);

            }

        }

    }

    public void add(View view) {

        textView.setText("點數:");
        if(x<6) {
            x = x + 1;

            switch (x) {
                case 2:
                    gif2.setImageResource(R.drawable.one);
                    break;
                case 3:
                    gif3.setImageResource(R.drawable.one);
                    break;
                case 4:
                    gif4.setImageResource(R.drawable.one);
                    break;
                case 5:
                    gif5.setImageResource(R.drawable.one);
                    break;
                case 6:
                    gif6.setImageResource(R.drawable.one);
                    break;

            }
            Log.w("boobs", "" + x);

        }

    }

    public void reduce(View view) {
        textView.setText("點數:");
        if(x>1) {
            x = x - 1;

            switch (x) {
                case 1:
                    gif2.setImageResource(0);
                    break;
                case 2:
                    gif3.setImageResource(0);
                    break;
                case 3:
                    gif4.setImageResource(0);
                    break;
                case 4:
                    gif5.setImageResource(0);
                    break;
                case 5:
                    gif6.setImageResource(0);
                    break;

            }
            Log.w("boobs", "" + x);
        }
    }

    public void roll1(){
        soundPool.play(soundID,1,1,0,0,1);

        if(x==1){
           i = (int) (Math.random() * 6 + 1);
       }
      if(x==2){
          i = (int) (Math.random() * 6 + 1);
          i2 = (int) (Math.random() * 6 + 1);
      }
      if(x==3){
          i = (int) (Math.random() * 6 + 1);
          i2 = (int) (Math.random() * 6 + 1);
          i3 = (int) (Math.random() * 6 + 1);
      }
      if(x==4){
          i = (int) (Math.random() * 6 + 1);
          i2 = (int) (Math.random() * 6 + 1);
          i3 = (int) (Math.random() * 6 + 1);
          i4 = (int) (Math.random() * 6 + 1);
      }
      if(x==5){
          i = (int) (Math.random() * 6 + 1);
          i2 = (int) (Math.random() * 6 + 1);
          i3 = (int) (Math.random() * 6 + 1);
          i4 = (int) (Math.random() * 6 + 1);
          i5 = (int) (Math.random() * 6 + 1);
      }
      if(x==6){
          i = (int) (Math.random() * 6 + 1);
          i2 = (int) (Math.random() * 6 + 1);
          i3 = (int) (Math.random() * 6 + 1);
          i4 = (int) (Math.random() * 6 + 1);
          i5 = (int) (Math.random() * 6 + 1);
          i6 = (int) (Math.random() * 6 + 1);
      }

    }


}
