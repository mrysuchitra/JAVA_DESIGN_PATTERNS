package sample1;

public class App {

    public static void main(String args[]){

        var pdfUploader = new PdfDocumentUploader();
        var onlineApplication = new OnlineApplication(pdfUploader);
        onlineApplication.uploadDocument();

        var wordUploader = new WordDocumentAdapter();
        var onlineApplication2 = new OnlineApplication(wordUploader);
        onlineApplication2.uploadDocument();

    }

}
