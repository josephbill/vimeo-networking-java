/*
 * Copyright (c) 2015 Vimeo (https://vimeo.com)
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.vimeo.networking.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by hanssena on 4/23/15.
 */
public class PictureCollection implements Serializable {

    private static final long serialVersionUID = -4495146309328278574L;
    public String uri;
    public boolean active;
    @SerializedName("default")
    public boolean isDefault;
    public ArrayList<Picture> sizes;

    public Picture pictureForWidth(int width) {
        if (sizes != null && !sizes.isEmpty()) {
            Picture selectedPicture = sizes.get(sizes.size() - 1);
            for (Picture picture : sizes) {
                if ((picture.width >= width) && ((picture.width - width) < (selectedPicture.width - width))) {
                    selectedPicture = picture;
                }
            }
            return selectedPicture;
        }

        return null;
    }
}