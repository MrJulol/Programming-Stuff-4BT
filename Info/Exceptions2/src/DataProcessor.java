import java.util.ArrayList;
import java.util.List;

public class DataProcessor {
    public static class DataProcessingException extends Exception {
        public DataProcessingException(String message, Throwable cause) {
            super(message, cause);
        }
    }

    public static void processData(List<Object> data) throws DataProcessingException {
        for (Object object : data) {
            try {
                processObject(object);
            } catch (NullPointerException e){
                throw new DataProcessingException("Ungültiges Datenobjekt: Null Wert gefunden", e);
            } catch (Exception e){
                throw new DataProcessingException("Fehler bei der Verarbeitung des Datenobjects", e);
            }
        }
    }

    public static void processObject(Object object) {
        if (object instanceof String) {
            System.out.println("String: " + object);
        } else if (object instanceof Integer) {
            System.out.println("Integer: " + object);
        }else if(object == null){
            throw new NullPointerException("Nullpointer: " + object);
        }
        else {
            throw new IllegalArgumentException("Ungültiges Datenobjekt: " + object);
        }
    }

    public static void main(String[] args) throws DataProcessingException {
        List<Object> data = new ArrayList<>();
        data.add(10);
        data.add("Hello");
        data.add(null);
        processData(data);
    }
}
