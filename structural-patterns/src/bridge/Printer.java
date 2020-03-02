package bridge;

import java.util.List;

//Bridge is here
public abstract class Printer {

    public String print(Formatter formatter) {
        return formatter.format(getHeader(), getDetails());
    }

    abstract List<Detail> getDetails();

    abstract String getHeader();

}
