package bd.gov.ansarvdpbank.avubinfo;

public class Loans {

    private String product_img_url;
    private String product_name;
    private String product_status;
    private String product_pdf_url;

    public Loans(String product_img_url, String product_name, String product_status, String product_pdf_url) {
        this.product_img_url = product_img_url;
        this.product_name = product_name;
        this.product_status = product_status;
        this.product_pdf_url = product_pdf_url;
    }

    public Loans() {
    }

    public String getProduct_img_url() {
        return product_img_url;
    }

    public void setProduct_img_url(String product_img_url) {
        this.product_img_url = product_img_url;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getProduct_status() {
        return product_status;
    }

    public void setProduct_status(String product_status) {
        this.product_status = product_status;
    }

    public String getProduct_pdf_url() {
        return product_pdf_url;
    }

    public void setProduct_pdf_url(String product_pdf_url) {
        this.product_pdf_url = product_pdf_url;
    }
}

