package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document("checking")
public class Checking extends Account {
    private double insufficientFundFee;
    
   

    public void processingCheck(double checkAmount) {
        if (getBalance() < checkAmount) {
            setBalance(getBalance() - insufficientFundFee);
        } else {
            withdrawal(checkAmount);
        }
    }
    public double getInsufficientFundFee() {
        return insufficientFundFee;
    }

    public void setInsufficientFundFee(double insufficientFundFee) {
        this.insufficientFundFee = insufficientFundFee;
    }

}
