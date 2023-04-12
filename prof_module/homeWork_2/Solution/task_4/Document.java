package prof_module.homeWork_2.task_4;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Document {
    private int id;
    private String name;
    private int pageCount;

    public Map<Integer, Document> organizeDocuments(List<Document> documents) {

        Map<Integer, Document> newDoc = new HashMap<Integer, Document>();

        for (Document document : documents) {
            newDoc.put(document.id, document);
        }

        return newDoc;
    }

}

