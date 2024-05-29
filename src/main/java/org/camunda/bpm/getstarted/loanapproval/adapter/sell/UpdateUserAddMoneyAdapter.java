package org.camunda.bpm.getstarted.loanapproval.adapter.sell;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.springframework.stereotype.Component;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.camunda.bpm.engine.delegate.BpmnError;
import jakarta.inject.Named;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RequiredArgsConstructor
@Component
@Named
@Log4j2
public class UpdateUserAddMoneyAdapter implements JavaDelegate {
    private final String apiURL = "https://your-api-url.com";

    @Override
    public void execute(DelegateExecution delegateExecution) throws BpmnError {
        // try {
        System.out.println("UpdateUserAddMoneyAdapter");

        // } catch (WebClientResponseException ex) {
        // throw new BpmnError("An error has occurred while saving address task : {}",
        // ex.getMessage());
        // }
    }
}
