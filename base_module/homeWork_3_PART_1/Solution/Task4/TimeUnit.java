package base_module.HOME_WORK_3_PART_1.Task4;

public class TimeUnit {

    private int hour;
    private int minutes;
    private int seconds;

    TimeUnit(int hour) {
        if (hour > 23 || hour < 0) {
            System.out.println("Введите корректное время");
        } else {
            this.hour = hour;
        }
    }

    TimeUnit(int hour, int minutes) {
        if (hour > 23 || hour < 0 || minutes > 59 || minutes < 0) {
            System.out.println("Введите корректное время");
        } else {
            this.hour = hour;
            this.minutes = minutes;
        }
    }

    TimeUnit(int hour, int minutes, int seconds) {
        if (hour > 23 || hour < 0 || minutes > 59 || minutes < 0 || seconds > 59 || seconds < 0) {

            System.out.println("Введите корректное время");
        } else {
            this.hour = hour;
            this.minutes = minutes;
            this.seconds = seconds;
        }
    }

    public int getHour() {
        return hour;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void printTime() {
        String hourStr;
        String minutesStr;
        String secondsStr;

        if (getHour() < 10) {
            hourStr = "0" + getHour();
        } else {
            hourStr = getHour() + "";
        }
        if (getMinutes() < 10) {
            minutesStr = "0" + getMinutes();
        } else {
            minutesStr = getMinutes() + "";
        }
        if (getSeconds() < 10) {
            secondsStr = "0" + getSeconds();
        } else {
            secondsStr = getSeconds() + "";
        }

        System.out.println(hourStr + ":" + minutesStr + ":" + secondsStr);
    }

    public void printTimeFormat12() {
        String hourStr;
        String minutesStr;
        String secondsStr;
        String ampm;

        if (getHour() <= 12) {
            hourStr = getHour() + "";
            ampm = " am";
        } else {
            hourStr = getHour() - 12 + "";
            ampm = " pm";
        }

        if (getHour() < 10) {
            hourStr = "0" + hourStr;
        }
        if (getMinutes() < 10) {
            minutesStr = "0" + getMinutes();
        } else {
            minutesStr = getMinutes() + "";
        }
        if (getSeconds() < 10) {
            secondsStr = "0" + getSeconds();
        } else {
            secondsStr = getSeconds() + "";
        }

        System.out.println(hourStr + ":" + minutesStr + ":" + secondsStr + ampm);
    }

    public void addTime(int hour, int minutes, int seconds) {
        int tempTime;
        int count;
        if (hour < 0 || minutes < 0 || seconds < 0) {
            System.out.println("Введите корректное время");
        } else {

            tempTime = getSeconds() + seconds;

            if (tempTime > 59) {
                count = tempTime / 60;
                setSeconds(tempTime - 60 * count);
                setMinutes(getMinutes() + count);
            } else {
                setSeconds(tempTime);
            }

            tempTime = getMinutes() + minutes;

            if (tempTime > 59) {
                count = tempTime / 60;
                setMinutes(tempTime - 60 * count);
                setHour(getHour() + count);
            } else {
                setMinutes(tempTime);
            }

            tempTime = getHour() + hour;

            if (tempTime > 23) {
                count = tempTime / 24;
                setHour(tempTime - 24 * count);
                setHour(getHour());
            } else {
                setHour(tempTime);
            }
        }
    }
}


