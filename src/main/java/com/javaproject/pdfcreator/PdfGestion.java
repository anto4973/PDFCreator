/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaproject.pdfcreator;

import com.itextpdf.kernel.pdf.PdfWriter;
import java.io.File;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author antonin
 */
@Named
@RequestScoped
public class PdfGestion {
    File file;

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }
    
}
