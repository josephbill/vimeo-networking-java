package com.vimeo.networking.model.uploadquota;

import com.google.gson.annotations.SerializedName;

import org.jetbrains.annotations.Nullable;

import java.io.Serializable;

/**
 * Represents the lifetime quota limits imposed on the user. If there are no lifetime limits imposed on the user, then
 * the fields will all be {@code null}.
 */
public class Lifetime implements Serializable {

    private static final long serialVersionUID = 5169142182182319211L;

    @Nullable
    @SerializedName("free")
    private Long mFree;

    @Nullable
    @SerializedName("max")
    private Long mMax;

    @Nullable
    @SerializedName("used")
    private Long mUsed;

    @Nullable
    public Long getFree() {
        return mFree;
    }

    void setFree(@Nullable Long free) {
        mFree = free;
    }

    @Nullable
    public Long getMax() {
        return mMax;
    }

    void setMax(@Nullable Long max) {
        mMax = max;
    }

    @Nullable
    public Long getUsed() {
        return mUsed;
    }

    void setUsed(@Nullable Long used) {
        mUsed = used;
    }
}
