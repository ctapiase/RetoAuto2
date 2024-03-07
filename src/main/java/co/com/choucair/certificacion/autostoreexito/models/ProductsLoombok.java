package co.com.choucair.certificacion.autostoreexito.models;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
@Data
public class ProductsLoombok {
    private String pro1;
    private String pro2;
    private String pro3;
    private String pro4;
    private String pro5;

    public static List<ProductsLoombok> setData(DataTable dataTable) {
        List<ProductsLoombok> dates = new ArrayList<>();
        List<Map<String, String>> mapInfo = dataTable.asMaps();
        for (Map<String, String> map : mapInfo) {
            dates.add(new ObjectMapper().convertValue(map, ProductsLoombok.class));
        }
        return dates;
    }

}
