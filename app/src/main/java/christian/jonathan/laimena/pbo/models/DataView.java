package christian.jonathan.laimena.pbo.models;
import java.util.ArrayList;
import java.util.List;

public abstract class DataView<T> {
    private List<T> records;

    public DataView() {
        this.records = new ArrayList<>();
    }

    public void printAll() {
        String[] fields = this.getFields();
        for (int i = 0; i < records.size(); i++) {
            String[] values = this.convertModelToValues(records.get(i));
            System.out.print(i + ". ");
            for (int j = 0; j < fields.length; j++) {
                System.out.print(values[j] + " ");
            }
            System.out.println();
        }
    }

    public void printByPk(String primaryKey) {
        boolean isPKFound = false;
        for (int i = 0; i < records.size(); i++) {
            T recordMahasiswa = records.get(i);
            if (getPrimaryKeyValue(recordMahasiswa).equals(primaryKey)) {
                System.out.println(recordMahasiswa);
                isPKFound = true;
            }
        }

        if (isPKFound == false) {
            System.out.println("Gak nemu PK nya. maaf.");
        }
    }

    public void showInsertForm() {
        // Menampilkan prompt input berdasarkan daftar nama field dari getFields(), 
        // mengonversi array hasil input menjadi objek T melalui
        // convertValuesToModel(String[] values), lalu menambahkannya ke records.
        boolean isRecordFound = false;
        for (int i = 0; i < records.size(); i++) {
            T recordMahasiswa = records.get(i);
            if (getFields().equals(recordMahasiswa)) {
                System.out.println();
                isRecordFound = true;
            }
        }


        if (isRecordFound == false) {
            System.out.println("Gak nemu nama field nya. maaf.");
        }

    }

    public void showUpdateForm(String primaryKey) {
        // Implementasi form update data

    }

    public void promptDelete() {

    }

    protected abstract String getPrimaryKeyValue(T data);

    protected abstract String[] getFields();

    protected abstract T convertValuesToModel(String[] values);

    protected abstract String[] convertModelToValues(T data);
}
