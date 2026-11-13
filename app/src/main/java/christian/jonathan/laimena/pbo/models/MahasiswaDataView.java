package christian.jonathan.laimena.pbo.models;

public class MahasiswaDataView extends DataView<Mahasiswa> {
    Mahasiswa data;

    public MahasiswaDataView(Mahasiswa data) {
        this.data = data;
    }

    @Override
    public String getPrimaryKeyValue(Mahasiswa data) {
        return data.getNim();
    }

    @Override
    public String[] getFields() {
        return new String[]{"nim", "nama", "email", "umur"};
    }

    @Override
    public Mahasiswa convertValuesToModel(String[] values) {
        return new Mahasiswa(values[0], values[1], values[2], Integer.parseInt(values[3]));
    }

    @Override
    public String[] convertModelToValues(Mahasiswa data) {
        return new String[]{data.getNim(), data.getNama(), data.getEmail(), String.valueOf(data.getUmur())};
    }
}
