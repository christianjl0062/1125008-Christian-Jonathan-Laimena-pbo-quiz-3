package christian.jonathan.laimena.pbo.models;
import java.util.ArrayList;
import java.util.List;

public abstract class DataView<T> {
    private List<T> records;

    public DataView() {
        this.records = new ArrayList<>();
    }

    public void printAll() {
        for (int i = 0; i < records.size(); i++) {
            System.out.println(records.get(i));
        }
    }

    public void printByPk(String primaryKey) {
        for (int i = 0; i < records.size(); i++) {
            T recordMahasiswa = records.get(i);
        }
    }
}
