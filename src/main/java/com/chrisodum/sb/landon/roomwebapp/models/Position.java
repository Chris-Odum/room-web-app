package com.chrisodum.sb.landon.roomwebapp.models;

public enum Position {

    HOUSEKEEPING("Housekeeping"), FRONT_DESK("Frontdesk"), SECURITY("Security"), CONCIERGE("Concierge");


    private String regularName;

    Position (String regularName){
        this.regularName = regularName;
    }

    public String toString(){

        switch(this){
            case HOUSEKEEPING:
                return "Housekeeping";

            case CONCIERGE:
                return "Concierge";

            case SECURITY:
                return "Security";

            case FRONT_DESK:
                return "Frontdesk";

            default:
                return "";

        }


    }


}
