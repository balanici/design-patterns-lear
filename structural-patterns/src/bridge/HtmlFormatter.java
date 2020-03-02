package bridge;

import java.util.List;

public class HtmlFormatter implements Formatter {

    @Override
    public String format(String header, List<Detail> detailList) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<header>").append(header).append("</header>");
        stringBuilder.append("\n");
        for (Detail detail : detailList) {
            stringBuilder.append("<label>").append(detail.getLabel()).append("</label>")
                    .append("<div class=\"detail\">").append(detail.getValue()).append("</div>");
        }

        return stringBuilder.toString();
    }
}
