package bridge;

import java.util.List;

public class PrintFormatter implements Formatter {
    @Override
    public String format(String header, List<Detail> detailList) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(header);
        stringBuilder.append("\n");
        for (Detail detail : detailList) {
            stringBuilder
                    .append(detail.getLabel()).append(":")
                    .append(detail.getValue()).append("\n");
        }

        return stringBuilder.toString();
    }
}
