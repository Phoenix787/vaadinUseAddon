package com.sergeeva;

import com.vaadin.server.StreamResource;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.VerticalLayout;
import com.whitestein.vaadin.widgets.wtpdfviewer.WTPdfViewer;

import java.io.InputStream;

public class PDFViewer extends VerticalLayout {
    public PDFViewer() {

        final WTPdfViewer firstViewer = new WTPdfViewer();
        firstViewer.setWidth("50%");
        firstViewer.setHeight("80%");
//        String filename = pdfFiles.getNextFile();
        String filename = "book-of-vaadin-pocket.pdf";
        InputStream dataStream = getClass().getClassLoader().getResourceAsStream(filename);
        firstViewer.setResource(new StreamResource(new InputStreamSource(dataStream), filename));
        firstViewer.setPage(1);

        VerticalLayout viewersLayout = new VerticalLayout(firstViewer);
        viewersLayout.setSizeFull();

        HorizontalLayout totalLayout = new HorizontalLayout(viewersLayout);
        totalLayout.setSizeFull();
        addComponent(totalLayout);
//        setContent(totalLayout);
    }
}
