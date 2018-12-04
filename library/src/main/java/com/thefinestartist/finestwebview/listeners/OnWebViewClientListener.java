package com.thefinestartist.finestwebview.listeners;

import android.graphics.Bitmap;
import android.webkit.WebView;

public interface OnWebViewClientListener {
    void onPageStarted(WebView view, String url, Bitmap favicon);
    void onPageFinished(WebView view, String url);
    void shouldOverrideUrlLoading(WebView view, String url);
}
