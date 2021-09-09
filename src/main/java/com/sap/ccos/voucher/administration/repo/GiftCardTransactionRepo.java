package com.sap.ccos.voucher.administration.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sap.ccos.voucher.administration.models.*;


@Repository
public interface GiftCardTransactionRepo extends JpaRepository<GiftCardTransaction,Long> {


}
