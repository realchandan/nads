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
        // load small sized native ad
        TemplateView small_template = findViewById(R.id.small_template);
        AdLoader adLoader1 = new AdLoader.Builder(this, "ca-app-pub-3940256099942544/2247696110")
                .forUnifiedNativeAd(unifiedNativeAd -> {
                    NativeTemplateStyle styles = new
                            NativeTemplateStyle.Builder()
                            .withMainBackgroundColor(new ColorDrawable(0xFFFF6666))
                            .build();

                    small_template.setStyles(styles);
                    small_template.setNativeAd(unifiedNativeAd);
                })
                .build();
        adLoader1.loadAd(new AdRequest.Builder().build());
        // load medium sized native ad
        TemplateView medium_template = findViewById(R.id.medium_template);
        AdLoader adLoader2 = new AdLoader.Builder(this, "ca-app-pub-3940256099942544/2247696110")
                .forUnifiedNativeAd(unifiedNativeAd -> {
                    NativeTemplateStyle styles = new
                            NativeTemplateStyle.Builder()
                            .withMainBackgroundColor(new ColorDrawable(0xFFFF6666))
                            .build();

                    medium_template.setStyles(styles);
                    medium_template.setNativeAd(unifiedNativeAd);
                })
                .build();
        adLoader2.loadAd(new AdRequest.Builder().build());
    }
}
