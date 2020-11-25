package app.chandan.demo;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;

import app.chandan.nads.NativeTemplateStyle;
import app.chandan.nads.TemplateView;

public class Hello extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hello);
        TemplateView template = findViewById(R.id.template);
        AdLoader adLoader = new AdLoader.Builder(this, "ca-app-pub-3940256099942544/2247696110")
                .forUnifiedNativeAd(unifiedNativeAd -> {
                    NativeTemplateStyle styles = new
                            NativeTemplateStyle.Builder()
                            .withMainBackgroundColor(new ColorDrawable(0xFFFF6666))
                            .build();

                    template.setStyles(styles);
                    template.setNativeAd(unifiedNativeAd);
                })
                .build();
        adLoader.loadAd(new AdRequest.Builder().build());
    }
}
