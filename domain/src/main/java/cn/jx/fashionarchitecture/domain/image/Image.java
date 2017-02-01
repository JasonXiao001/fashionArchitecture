package cn.jx.fashionarchitecture.domain.image;

import java.util.Calendar;

/**
 * Class that represents a Image in the domain layer.
 */

public class Image {

    private Calendar startTime;
    private String url;
    private String copyright;

    public Calendar getStartTime() {
        return startTime;
    }

    public void setStartTime(Calendar startTime) {
        this.startTime = startTime;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }
}
