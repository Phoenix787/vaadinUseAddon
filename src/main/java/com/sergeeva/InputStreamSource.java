package com.sergeeva;

import com.vaadin.server.StreamResource.StreamSource;

import java.io.InputStream;

public class InputStreamSource implements StreamSource {

    private static final long serialVersionUID = 7774585149770326086L;

    private final InputStream data;

    public InputStreamSource(InputStream data) {
        super();
        this.data = data;
    }

    @Override
    public InputStream getStream() {
        return data;
    }
}