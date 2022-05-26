package com.chrisodum.sb.landon.roomwebapp.models;

public enum Position {

    HOUSEKEEPING, FRONT_DESK, SECURITY, CONCIERGE;

    public String toString(){
        switch(this){
            case HOUSEKEEPING:
                return "Housekeeping";

            case CONCIERGE:
                return "Concierge";

            case SECURITY:
                return "Security";

            case FRONT_DESK:
                return "Frondesk";

            default:
                return "";

        }


    }


}
