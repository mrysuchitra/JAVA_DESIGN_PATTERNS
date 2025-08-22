package sample1;

import java.util.ArrayList;
import java.util.List;

public class ItemOperationExecutor {

    List<ItemOperation> operationList = new ArrayList<>();

    public void queueOperation(ItemOperation operation) {
        operationList.add(operation);
    }

    public void checkout() {
        for (ItemOperation operation : operationList) {
            operation.execute();
        }
        operationList.clear(); // Clear the list after executing all operations
    }
}
