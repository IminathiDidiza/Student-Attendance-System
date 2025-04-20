package za.ac.cput.Factory;

import za.ac.cput.Domain.AbsenceRequest;
import za.ac.cput.Util.Helper;

import java.time.LocalDateTime;
import java.util.List;

public class AbsenceRequestFactory {

    public static AbsenceRequest createAbsenceRequest(String reason,
                                                      List<String> supportingDocuments) {
        String requestId = Helper.generateUniqueId();
        LocalDateTime submissionDate = Helper.getCurrentDateTime();

        AbsenceRequest request = new AbsenceRequest(requestId, reason, submissionDate);

        if (supportingDocuments != null && !supportingDocuments.isEmpty()) {
            for (String doc : supportingDocuments) {
                request.uploadDocument(doc);
            }
        }
        return request;
    }
}

