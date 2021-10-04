package com.codeshare.photomotion.callback;

public interface onVideoSaveListener {
        void onError(String str);

        void onSaved(String filePath);

        void onSaving(int i);

        void onStartSave(int i);
    }