package net.alhazmy13.wordcloud;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;

import androidx.core.content.ContextCompat;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alhazmy13 on 11/5/16.
 * AndroidWordClouds
 */
public class ColorTemplate {

    /**
     * THE COLOR THEMES ARE PREDEFINED (predefined color integer arrays), FEEL
     * FREE TO CREATE YOUR OWN WITH AS MANY DIFFERENT COLORS AS YOU WANT
     */
    public static final int[] LIBERTY_COLORS = {
            Color.rgb(207, 248, 246), Color.rgb(148, 212, 212), Color.rgb(136, 180, 187),
            Color.rgb(118, 174, 175), Color.rgb(42, 109, 130)
    };
    public static final int[] JOYFUL_COLORS = {
            Color.rgb(217, 80, 138), Color.rgb(254, 149, 7), Color.rgb(254, 247, 120),
            Color.rgb(106, 167, 134), Color.rgb(53, 194, 209)
    };
    public static final int[] PASTEL_COLORS = {
            Color.rgb(64, 89, 128), Color.rgb(149, 165, 124), Color.rgb(217, 184, 162),
            Color.rgb(191, 134, 134), Color.rgb(179, 48, 80)
    };
    public static final int[] COLORFUL_COLORS = {
            Color.rgb(193, 37, 82), Color.rgb(255, 102, 0), Color.rgb(245, 199, 0),
            Color.rgb(106, 150, 31), Color.rgb(179, 100, 53)
    };
    public static final int[] VORDIPLOM_COLORS = {
            Color.rgb(192, 255, 140), Color.rgb(255, 247, 140), Color.rgb(255, 208, 140),
            Color.rgb(140, 234, 255), Color.rgb(255, 140, 157)
    };
    public static final int[] MATERIAL_COLORS = {
            rgb("#2ecc71"), rgb("#f1c40f"), rgb("#e74c3c"), rgb("#3498db")
    };

    /**
     * Converts the given hex-color-string to rgb.
     *
     * @param hex The RBG hex code
     * @return An integer representing the number
     */
    public static int rgb(String hex) {
        int color = (int) Long.parseLong(hex.replace("#", ""), 16);
        int r = (color >> 16) & 0xFF;
        int g = (color >> 8) & 0xFF;
        int b = color & 0xFF;
        return Color.rgb(r, g, b);
    }

    /**
     * Returns the Android ICS holo blue light color.
     *
     * @return The holo blue color
     */
    public static int getHoloBlue() {
        return Color.rgb(51, 181, 229);
    }

    /**
     * Sets the alpha component of the given color.
     *
     * @param color The color
     * @param alpha 0 - 255
     * @return The color with alpha
     */
    public static int colorWithAlpha(int color, int alpha) {
        return (color & 0xffffff) | ((alpha & 0xff) << 24);
    }

    /**
     * turn an array of resource-colors (contains resource-id integers) into an
     * array list of actual color integers
     *
     * @param c The context
     * @param colors an integer array of resource id's of colors
     * @return The colors
     */
    public static List<Integer> createColors(Context c, int[] colors) {

        List<Integer> result = new ArrayList<>();

        for (int i : colors) {
            result.add(ContextCompat.getColor(c, i));
        }

        return result;
    }

}
