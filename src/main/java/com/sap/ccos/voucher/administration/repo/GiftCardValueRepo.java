package com.sap.ccos.voucher.administration.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.sap.ccos.voucher.administration.models.GiftCardValue;

@Repository
public interface GiftCardValueRepo extends JpaRepository<GiftCardValue,Long> {


}
