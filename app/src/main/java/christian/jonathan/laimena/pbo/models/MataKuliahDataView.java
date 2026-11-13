package christian.jonathan.laimena.pbo.models;

public class MataKuliahDataView extends DataView<MataKuliah> {
    MataKuliah data;
    
    public MataKuliahDataView(MataKuliah data) {
        this.data = data;
    }

    @Override
    public String getPrimaryKeyValue(MataKuliah data) {
        return data.getKode();
    }

    @Override
    public String[] getFields() {
        return new String[]{"nim", "nama", "email", "umur"};
    }

    @Override
    public MataKuliah convertValuesToModel(String[] values) {
        return new MataKuliah(values[0], values[1], values[2], Integer.parseInt(values[3]));
    }

    @Override
    public String[] convertModelToValues(MahaKuliah data) {
        return new String[]{data.getKode(), data.getNama(), data.getEmail(), String.valueOf(data.getUmur())};
    }
}