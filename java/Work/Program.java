package Work;

import HomeWork.DataException;

import java.util.HashMap;

public class Program {
        public static void main(String[] args) {
            parsData parsData = new parsData();
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
            for (String str : data.keySet()) {
                sb.append(data.get(str));
                sb.append(" ");
            }


            System.out.println(data);
            String filePath = newFileName;
            System.out.println(filePath);
            writeFile.WriteData(String.valueOf(sb), filePath);

        }
    }
