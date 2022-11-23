package template.drucken;

// Interfaces können durch beliebig viele andere Interfaces erweitert werden. Das Sub-Interface erbt dann die Methoden vom Super-Interface.
public interface PDFDruckbar extends Druckbar
{
    void pdfDrucken();
}
