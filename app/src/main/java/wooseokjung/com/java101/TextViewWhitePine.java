package wooseokjung.com.java101;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by Woo Seok Jung on 7/4/2015.
 */
public class TextViewWhitePine extends TextView {

    public TextViewWhitePine(Context context, AttributeSet attributeSet) {
        super(context,attributeSet);
        this.setTypeface(Typeface.createFromAsset(context.getAssets(),"Fonts/WhitePine-Regular" +
                ".ttf"));
    }
}
