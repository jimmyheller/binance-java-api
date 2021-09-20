package com.binance.api.client.domain.account.request;


import com.binance.api.client.constant.BinanceApiConstants;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Request object to retrieve all the open orders without symbol
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class AllOpenOrdersRequest {

    private Long recvWindow;

    private Long timestamp;

    public AllOpenOrdersRequest() {
        this.timestamp = System.currentTimeMillis();
        this.recvWindow = BinanceApiConstants.DEFAULT_RECEIVING_WINDOW;
    }

    public Long getRecvWindow() {
        return recvWindow;
    }

    public AllOpenOrdersRequest recvWindow(Long recvWindow) {
        this.recvWindow = recvWindow;
        return this;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public AllOpenOrdersRequest timestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE)
                .append("recvWindow", recvWindow)
                .append("timestamp", timestamp)
                .toString();
    }

}
