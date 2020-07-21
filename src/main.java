public class main {
    public static void main(String[] args) {
        try {
        PDFConverter.local_convert("C:\\Users\\Alex\\Desktop\\NetBeansProjects\\JavaApplication6\\Пример.pdf","C:\\Users\\Alex\\Documents\\тест\\");
        } catch (Throwable cause) {
            cause.printStackTrace();
        }
    }
}
