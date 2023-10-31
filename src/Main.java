import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Pars parsData = new Pars();
        String newFileName = null;
        WriteFile writeFile = new WriteFile();

        HashMap<String, Object> data = parsData.parsInputData();
        while (data.size() != 6) {
            try {
                throw new DataException();
            } catch (DataException e) {
                data = parsData.parsInputData();
            }
        }

        newFileName = data.get("lastName") + ".txt";
        StringBuilder sb = new StringBuilder();

        sb.append(data.get("lastName"));
        sb.append(" ");
        sb.append(data.get("firstName"));
        sb.append(" ");
        sb.append(data.get("patronymic"));
        sb.append(" ");
        sb.append(data.get("date"));
        sb.append(" ");
        sb.append(data.get("tel"));
        sb.append(" ");
        sb.append(data.get("sex"));
        sb.append(" ");


        System.out.println(data);
        String filePath = newFileName;
        System.out.println(filePath);
        writeFile.writeData(String.valueOf(sb), filePath);

    }
}