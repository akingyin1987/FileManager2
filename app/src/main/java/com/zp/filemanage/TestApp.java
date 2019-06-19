package com.zp.filemanage;

import android.app.Application;
import com.zp.file.common.FileManageHelp;
import com.zp.file.content.ContentKt;
import com.zp.file.listener.FileInfoListener;
import com.zp.file.listener.FileZipListener;
import com.zp.filemanage.custom.MyFileTypeListener;
import com.zp.filemanage.custom.MyJumpListener;
import java.util.Arrays;

/**
 * @author king
 * @version V1.0
 * @ Description:
 * @ Date 2019/6/19 17:12
 */
public class TestApp  extends Application {

  @Override public void onCreate() {
    super.onCreate();
    FileManageHelp.Companion.getInstance().setFileTypeListener(new MyFileTypeListener())
        .setImgeLoad(new MyFileImageListener())
        .setJumpListener(new MyJumpListener())
        .setFileZipListener(new FileZipListener())
        .setFileInfoListener(new FileInfoListener())
        .setMaxLength(9,"最大选取数量：9")
        .setCanRightTouch(true)
        .setShowHiddenFile(false)
        .setFileFilterArray(Arrays.asList(ContentKt.PNG,ContentKt.MP3,ContentKt.JPG).toArray(new String[3]))
        .setSortordByWhat(FileManageHelp.BY_DEFAULT)
        .setSortord(FileManageHelp.ASC);
  }
}
