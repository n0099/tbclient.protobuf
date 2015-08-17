package tbclient.GetOrder;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class DataRes extends Message {
    public static final String DEFAULT_EXTDATA = "";
    public static final String DEFAULT_IMEI = "";
    public static final String DEFAULT_ITEMINFO = "";
    public static final String DEFAULT_MOBILE = "";
    public static final String DEFAULT_NOTIFYURL = "";
    public static final String DEFAULT_ORDERID = "";
    public static final String DEFAULT_PASSUID = "";
    public static final String DEFAULT_SERVICE = "";
    public static final String DEFAULT_SIGN = "";
    public static final String DEFAULT_TITLE = "";
    public static final String DEFAULT_TN = "";
    public static final String DEFAULT_URL = "";
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long customerId;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer deviceType;
    @ProtoField(tag = 18, type = Message.Datatype.STRING)
    public final String extData;
    @ProtoField(tag = 15, type = Message.Datatype.STRING)
    public final String imei;
    @ProtoField(tag = 14, type = Message.Datatype.STRING)
    public final String itemInfo;
    @ProtoField(tag = 13, type = Message.Datatype.STRING)
    public final String mobile;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String notifyUrl;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer orderCreateTime;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String orderId;
    @ProtoField(tag = 7, type = Message.Datatype.UINT64)
    public final Long originalAmount;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String passuid;
    @ProtoField(tag = 6, type = Message.Datatype.UINT64)
    public final Long payAmount;
    @ProtoField(tag = 16, type = Message.Datatype.UINT32)
    public final Integer sdk;
    @ProtoField(tag = 17, type = Message.Datatype.UINT32)
    public final Integer sdkStyle;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String service;
    @ProtoField(tag = 20, type = Message.Datatype.STRING)
    public final String sign;
    @ProtoField(tag = 19, type = Message.Datatype.UINT32)
    public final Integer signType;
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String tn;
    @ProtoField(tag = 12, type = Message.Datatype.STRING)
    public final String url;
    public static final Long DEFAULT_CUSTOMERID = 0L;
    public static final Integer DEFAULT_ORDERCREATETIME = 0;
    public static final Integer DEFAULT_DEVICETYPE = 0;
    public static final Long DEFAULT_PAYAMOUNT = 0L;
    public static final Long DEFAULT_ORIGINALAMOUNT = 0L;
    public static final Integer DEFAULT_SDK = 0;
    public static final Integer DEFAULT_SDKSTYLE = 0;
    public static final Integer DEFAULT_SIGNTYPE = 0;

    /* synthetic */ DataRes(Builder builder, boolean z, DataRes dataRes) {
        this(builder, z);
    }

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.customerId == null) {
                this.customerId = DEFAULT_CUSTOMERID;
            } else {
                this.customerId = builder.customerId;
            }
            if (builder.service == null) {
                this.service = "";
            } else {
                this.service = builder.service;
            }
            if (builder.orderId == null) {
                this.orderId = "";
            } else {
                this.orderId = builder.orderId;
            }
            if (builder.orderCreateTime == null) {
                this.orderCreateTime = DEFAULT_ORDERCREATETIME;
            } else {
                this.orderCreateTime = builder.orderCreateTime;
            }
            if (builder.deviceType == null) {
                this.deviceType = DEFAULT_DEVICETYPE;
            } else {
                this.deviceType = builder.deviceType;
            }
            if (builder.payAmount == null) {
                this.payAmount = DEFAULT_PAYAMOUNT;
            } else {
                this.payAmount = builder.payAmount;
            }
            if (builder.originalAmount == null) {
                this.originalAmount = DEFAULT_ORIGINALAMOUNT;
            } else {
                this.originalAmount = builder.originalAmount;
            }
            if (builder.notifyUrl == null) {
                this.notifyUrl = "";
            } else {
                this.notifyUrl = builder.notifyUrl;
            }
            if (builder.passuid == null) {
                this.passuid = "";
            } else {
                this.passuid = builder.passuid;
            }
            if (builder.title == null) {
                this.title = "";
            } else {
                this.title = builder.title;
            }
            if (builder.tn == null) {
                this.tn = "";
            } else {
                this.tn = builder.tn;
            }
            if (builder.url == null) {
                this.url = "";
            } else {
                this.url = builder.url;
            }
            if (builder.mobile == null) {
                this.mobile = "";
            } else {
                this.mobile = builder.mobile;
            }
            if (builder.itemInfo == null) {
                this.itemInfo = "";
            } else {
                this.itemInfo = builder.itemInfo;
            }
            if (builder.imei == null) {
                this.imei = "";
            } else {
                this.imei = builder.imei;
            }
            if (builder.sdk == null) {
                this.sdk = DEFAULT_SDK;
            } else {
                this.sdk = builder.sdk;
            }
            if (builder.sdkStyle == null) {
                this.sdkStyle = DEFAULT_SDKSTYLE;
            } else {
                this.sdkStyle = builder.sdkStyle;
            }
            if (builder.extData == null) {
                this.extData = "";
            } else {
                this.extData = builder.extData;
            }
            if (builder.signType == null) {
                this.signType = DEFAULT_SIGNTYPE;
            } else {
                this.signType = builder.signType;
            }
            if (builder.sign == null) {
                this.sign = "";
                return;
            } else {
                this.sign = builder.sign;
                return;
            }
        }
        this.customerId = builder.customerId;
        this.service = builder.service;
        this.orderId = builder.orderId;
        this.orderCreateTime = builder.orderCreateTime;
        this.deviceType = builder.deviceType;
        this.payAmount = builder.payAmount;
        this.originalAmount = builder.originalAmount;
        this.notifyUrl = builder.notifyUrl;
        this.passuid = builder.passuid;
        this.title = builder.title;
        this.tn = builder.tn;
        this.url = builder.url;
        this.mobile = builder.mobile;
        this.itemInfo = builder.itemInfo;
        this.imei = builder.imei;
        this.sdk = builder.sdk;
        this.sdkStyle = builder.sdkStyle;
        this.extData = builder.extData;
        this.signType = builder.signType;
        this.sign = builder.sign;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public Long customerId;
        public Integer deviceType;
        public String extData;
        public String imei;
        public String itemInfo;
        public String mobile;
        public String notifyUrl;
        public Integer orderCreateTime;
        public String orderId;
        public Long originalAmount;
        public String passuid;
        public Long payAmount;
        public Integer sdk;
        public Integer sdkStyle;
        public String service;
        public String sign;
        public Integer signType;
        public String title;
        public String tn;
        public String url;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.customerId = dataRes.customerId;
                this.service = dataRes.service;
                this.orderId = dataRes.orderId;
                this.orderCreateTime = dataRes.orderCreateTime;
                this.deviceType = dataRes.deviceType;
                this.payAmount = dataRes.payAmount;
                this.originalAmount = dataRes.originalAmount;
                this.notifyUrl = dataRes.notifyUrl;
                this.passuid = dataRes.passuid;
                this.title = dataRes.title;
                this.tn = dataRes.tn;
                this.url = dataRes.url;
                this.mobile = dataRes.mobile;
                this.itemInfo = dataRes.itemInfo;
                this.imei = dataRes.imei;
                this.sdk = dataRes.sdk;
                this.sdkStyle = dataRes.sdkStyle;
                this.extData = dataRes.extData;
                this.signType = dataRes.signType;
                this.sign = dataRes.sign;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z, null);
        }
    }
}
