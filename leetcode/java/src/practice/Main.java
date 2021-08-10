package practice;


import java.util.*;

public class Main{
    public static class ErrorInfo{
        public String fileName;
        public int lineCount;
        public int count;
        public ErrorInfo(String fileName, int lineCount, int count){
            this.fileName = fileName;
            this.lineCount = lineCount;
            this.count = count;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();
        List<ErrorInfo> results = new ArrayList<>();
        while (sc.hasNext()){
            String path = sc.next();
            int lineCount = sc.nextInt();
            int getIdx = path.lastIndexOf('\\');
            path = getIdx >= 0 ? path.substring(getIdx + 1, path.length()): path;
            int n = path.length();
            String normalizePath = path;
            if (n > 16){
                normalizePath = normalizePath.substring(n - 16, n);
            }
            String key = path + "_" + String.valueOf(lineCount);
            if (map.containsKey(key)){
                results.get(map.get(key)).count += 1;
            }else{
                map.put(key, results.size());
                ErrorInfo tmpInfo = new ErrorInfo(path, lineCount, 1);
                results.add(tmpInfo);
            }
        }
        Collections.sort(results, new Comparator<ErrorInfo>(){
            @Override
            public int compare(ErrorInfo o1, ErrorInfo o2){
                return o2.lineCount - o1.lineCount;
            }
        });
        for(int i = 0; i < results.size() && i < 8; i++){
            String finalPath = results.get(i).fileName;
            int n = finalPath.length();
            if (n > 16){
                finalPath = finalPath.substring(n - 16, n);
            }
            int lineCount = results.get(i).lineCount;
            int errorCount = results.get(i).count;
            System.out.printf("%s %d %d\n", finalPath,  lineCount, errorCount);
        }
    }
}