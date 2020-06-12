package csvPractice;


import com.csvreader.CsvWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.nio.charset.Charset;


public class Write {
    public static void main(String [] args) throws IOException{

        String filePath = "/Users/dddd/test.csv";


            CsvWriter csvWriter = new CsvWriter(filePath,',', Charset.forName("GBK"));

            String[] headers = {"编号","姓名","年龄"};
            List <String []> info=new ArrayList<String []>();
            String[] content1 = {"12365","张山","34"};
            String[] content2 = {"123657","张二","34"};
            String[] content3 = {"123658","张大","34"};
            String[] content4 = {"123659","张四","34"};
            info.add(content1);
            info.add(content2);
            info.add(content3);
            info.add(content4);

            csvWriter.writeRecord(headers);
            for(int i=0;i<info.size();i++){
                csvWriter.writeRecord(info.get(i));
            }

            csvWriter.close();



    }
}
