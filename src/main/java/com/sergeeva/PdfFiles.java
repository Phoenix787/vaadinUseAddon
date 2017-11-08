package com.sergeeva;

public class PdfFiles {
    private String[] files = new String[] { "15-10-2017.pdf", "15-10-2017.pdf", "15-10-2017.pdf" };
    private int filesIndx = files.length;

    public String getNextFile() {
        filesIndx++;
        if (filesIndx >= files.length || filesIndx < 0)
            filesIndx = 0;

        return files[filesIndx];
    }
}
