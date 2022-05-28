package com.chrisodum.sb.landon.roomwebapp.models;


public class MultipleChoiceQuestion {
    private String question;
    private String answer;
    private String distractor1;
    private String distractor2;
    private String distractor3;
    private String distractor4;


    public MultipleChoiceQuestion(String question, String answer, String distractor1, String distractor2, String distractor3, String distractor4) {
        this.question = question;
        this.answer = answer;
        this.distractor1 = distractor1;
        this.distractor2 = distractor2;
        this.distractor3 = distractor3;
        this.distractor4 = distractor4;
    }

    public String getAnswer() {
        return answer;
    }

    public String getDistractor1() {
        return distractor1;
    }

    public void setDistractor1(String distractor1) {
        this.distractor1 = distractor1;
    }

    public String getDistractor2() {
        return distractor2;
    }

    public void setDistractor2(String distractor2) {
        this.distractor2 = distractor2;
    }

    public String getDistractor3() {
        return distractor3;
    }

    public void setDistractor3(String distractor3) {
        this.distractor3 = distractor3;
    }

    public String getDistractor4() {
        return distractor4;
    }

    public void setDistractor4(String distractor4) {
        this.distractor4 = distractor4;
    }

    @Override
    public String toString() {
        return "MultipleChoiceQuestion{" +
                "question='" + question + '\'' +
                ", answer='" + answer + '\'' +
                ", distractor1='" + distractor1 + '\'' +
                ", distractor2='" + distractor2 + '\'' +
                ", distractor3='" + distractor3 + '\'' +
                ", distractor4='" + distractor4 + '\'' +
                '}';
    }

}
