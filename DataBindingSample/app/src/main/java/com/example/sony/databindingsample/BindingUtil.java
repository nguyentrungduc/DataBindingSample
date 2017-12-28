package com.example.sony.databindingsample;

import android.databinding.BindingAdapter;
import android.graphics.drawable.Drawable;
import android.support.annotation.DrawableRes;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.ListView;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by Sony on 12/28/2017.
 */

public class BindingUtil {
    @BindingAdapter({ "bind:setAdapter"})
    public static void setAdapter(RecyclerView view, Adapter adapter) {
        view.setAdapter(adapter);
    }

    @BindingAdapter({ "src" })
    public static void setImageSrc(ImageView view, @DrawableRes int src) {
        if (src != -1) view.setImageResource(src);
    }

    @BindingAdapter("viewPagerAdapter")
    public static void setPagerAdapter(ViewPager viewPager, PagerAdapter adapter) {
        viewPager.setAdapter(adapter);
    }

    @BindingAdapter("currentItem")
    public static void setCurrentItem(ViewPager viewPager, int position) {
        viewPager.setCurrentItem(position);
    }

    @BindingAdapter({ "loadUrl" })
    public static void loadWebUrl(WebView webView, String url) {
        webView.loadUrl(url);
    }

    @BindingAdapter("checked")
    public static void setChecked(ListView listView, List<Integer> list) {
        for (Integer i : list) {
            listView.setItemChecked(i, true);
        }
    }

    @BindingAdapter({"bind:imageUrl"})
    public static void loadImage(ImageView view, String url) {
        Picasso.with(view.getContext())
                .load(url)
                .into(view);
    }


}
