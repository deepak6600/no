package com.my.spy.app.utils.hiddenCameraServiceUtils;

import android.hardware.Camera;
import java.util.Comparator;


@SuppressWarnings("ALL")
class PictureSizeComparator implements Comparator<Camera.Size> {

    public int compare(Camera.Size a, Camera.Size b) {
        return (b.height * b.width) - (a.height * a.width);
    }
}
