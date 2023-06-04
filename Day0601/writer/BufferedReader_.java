package Day0601.writer;

//做成处理流/包装流
public class BufferedReader_ extends Reader_{

    private Reader_ reader_;//属性是 Reader_类型

    public BufferedReader_(Reader_ reader_) {
        this.reader_ = reader_;
    }

    public void readFile() {//封装一层
        reader_.readFile();
    }

    //让方法更加灵活，多次读取文件
    public void readFiles(int num) {
        for (int i = 0; i < num; i++) {
            reader_.readFile();
        }
    }

    //扩展 readString，批量处理字符串数据
    public void readString(int num) {
        for (int i = 0; i < num; i++) {
            reader_.readString();
        }
    }
}
