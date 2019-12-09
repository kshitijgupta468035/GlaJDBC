package practice3;

public class Room {
    public boolean AC_ON;
    public boolean HOME_THEATRE_ON;
    boolean FAN_ON;
    boolean LIGHT_ON;

    public Room(boolean AC_ON, boolean HOME_THEATRE_ON, boolean FAN_ON, boolean LIGHT_ON) {
        this.AC_ON = AC_ON;
        this.HOME_THEATRE_ON = HOME_THEATRE_ON;
        this.FAN_ON = FAN_ON;
        this.LIGHT_ON = LIGHT_ON;
    }

    public boolean overloadCondition() {
        int c = 0;
        if (AC_ON == true) {
            c = c + 1200;
        }
        if (HOME_THEATRE_ON == true) {
            c = c + 600;
        }
        if (FAN_ON == true) {
            c = c + 400;
        }
        if (LIGHT_ON == true) {
            c = c + 100;
        }

        if ( c > 2000) {
            return true;
        } else {
            return false;
        }
    }
}
