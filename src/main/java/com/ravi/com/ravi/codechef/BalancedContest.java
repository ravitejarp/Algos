package com.ravi.com.ravi.codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BalancedContest {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numberOfInputs = Integer.parseInt(br.readLine());
        while (numberOfInputs>0){
            String problemsWithCount = br.readLine();
            String[] split = problemsWithCount.split(" ");
            if(split.length==2)
            {
                int numberOfProblems = Integer.parseInt(split[0]);
                int numberOfParticipants = Integer.parseInt(split[1]);
                String numberOfSolutions = br.readLine();
                String[] successfulSubmissions = numberOfSolutions.split(" ");
                if(successfulSubmissions.length==numberOfProblems){
                    int cakewalk=0;
                    int hard=0;
                    for(String solution:successfulSubmissions){
                        int solutionsCount = Integer.parseInt(solution);
                        if(solutionsCount >= numberOfParticipants/2){
                            cakewalk++;
                        }else if(solutionsCount<=numberOfParticipants/10 ){
                            hard++;
                        }
                    }
                    if(cakewalk==1 && hard==2){
                        System.out.println("yes");
                    }else{
                        System.out.println("no");
                    }
                }else{
                    System.out.println("Solutions doesn't match problem");
                }

            }else{

                System.out.println("Invalid input");
            }
            numberOfInputs--;
        }
    }
}
