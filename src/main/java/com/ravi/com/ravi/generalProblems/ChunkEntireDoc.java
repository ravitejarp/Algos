package com.ravi.com.ravi.generalProblems;

import java.util.ArrayList;
import java.util.List;

public class ChunkEntireDoc {
    public static void main(String[] args) {
        ChunkEntireDoc chunkEntireDoc = new ChunkEntireDoc();
        StringBuilder stringBuilder = new StringBuilder();
        //        for(int i=0;i<100000;i++){
        //            if(i%499 ==0){
        //                stringBuilder.append(":");
        //            }
        //            else{
        //                stringBuilder.append("a");
        //            }
        //        }
        List<String> chunkify = chunkEntireDoc.chunkify("a:bb:cc:abcdef:ab:c:d:");
        for (String chunk : chunkify) {
            System.out.println(chunk);
            System.out.println("============");
        }
    }

    public List<String> chunkify(String doc) {
        List<String> chunks = new ArrayList<>();
        int count = 0;
        StringBuilder chunk = new StringBuilder();
        StringBuilder chunkTemp = new StringBuilder();
        for (int i = 0; i < doc.length(); i++) {
            chunk.append(doc.charAt(i));
            if (doc.charAt(i) == ':') {
                if (chunk.length() < 6 && count + chunk.length() <= 6) {
                    chunkTemp.append(chunk.toString());
                    count += chunk.length();
                    chunk = new StringBuilder();
                    continue;
                }
                if (chunk.length() >= 6) {
                    chunks.add(chunkTemp.toString());
                    chunks.add(chunk.toString());
                    chunkTemp = new StringBuilder();
                    chunk = new StringBuilder();
                    count = 0;
                    continue;
                }
                if (count + chunk.length() > 6) {
                    chunks.add(chunkTemp.toString());
                    chunkTemp = new StringBuilder();
                    chunkTemp.append(chunk.toString());
                    count = chunk.length();
                    chunk = new StringBuilder();
                }

            }
        }
        if (chunkTemp.length() > 0) {
            chunks.add(chunkTemp.toString());
        }
        return chunks;
    }
}
