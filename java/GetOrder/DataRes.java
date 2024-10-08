package tbclient.GetOrder;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class DataRes extends Message {
    public static final String DEFAULT_CALL_TYPE = "";
    public static final String DEFAULT_EXTDATA = "";
    public static final String DEFAULT_IMEI = "";
    public static final String DEFAULT_ITEMINFO = "";
    public static final String DEFAULT_MOBILE = "";
    public static final String DEFAULT_NOTIFYURL = "";
    public static final String DEFAULT_ORDERID = "";
    public static final String DEFAULT_PASSUID = "";
    public static final String DEFAULT_PAY_CHANNEL = "";
    public static final String DEFAULT_PAY_URL = "";
    public static final String DEFAULT_SERVICE = "";
    public static final String DEFAULT_SIGN = "";
    public static final String DEFAULT_TITLE = "";
    public static final String DEFAULT_TN = "";
    public static final String DEFAULT_URL = "";
    @ProtoField(tag = 23, type = Message.Datatype.STRING)
    public final String call_type;
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
    @ProtoField(tag = 24, type = Message.Datatype.STRING)
    public final String pay_channel;
    @ProtoField(tag = 22, type = Message.Datatype.STRING)
    public final String pay_url;
    @ProtoField(tag = 21)
    public final NotifyPopup popup;
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

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public String call_type;
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
        public String pay_channel;
        public String pay_url;
        public NotifyPopup popup;
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
            if (dataRes == null) {
                return;
            }
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
            this.popup = dataRes.popup;
            this.pay_url = dataRes.pay_url;
            this.call_type = dataRes.call_type;
            this.pay_channel = dataRes.pay_channel;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }

    public DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.customerId;
            if (l == null) {
                this.customerId = DEFAULT_CUSTOMERID;
            } else {
                this.customerId = l;
            }
            String str = builder.service;
            if (str == null) {
                this.service = "";
            } else {
                this.service = str;
            }
            String str2 = builder.orderId;
            if (str2 == null) {
                this.orderId = "";
            } else {
                this.orderId = str2;
            }
            Integer num = builder.orderCreateTime;
            if (num == null) {
                this.orderCreateTime = DEFAULT_ORDERCREATETIME;
            } else {
                this.orderCreateTime = num;
            }
            Integer num2 = builder.deviceType;
            if (num2 == null) {
                this.deviceType = DEFAULT_DEVICETYPE;
            } else {
                this.deviceType = num2;
            }
            Long l2 = builder.payAmount;
            if (l2 == null) {
                this.payAmount = DEFAULT_PAYAMOUNT;
            } else {
                this.payAmount = l2;
            }
            Long l3 = builder.originalAmount;
            if (l3 == null) {
                this.originalAmount = DEFAULT_ORIGINALAMOUNT;
            } else {
                this.originalAmount = l3;
            }
            String str3 = builder.notifyUrl;
            if (str3 == null) {
                this.notifyUrl = "";
            } else {
                this.notifyUrl = str3;
            }
            String str4 = builder.passuid;
            if (str4 == null) {
                this.passuid = "";
            } else {
                this.passuid = str4;
            }
            String str5 = builder.title;
            if (str5 == null) {
                this.title = "";
            } else {
                this.title = str5;
            }
            String str6 = builder.tn;
            if (str6 == null) {
                this.tn = "";
            } else {
                this.tn = str6;
            }
            String str7 = builder.url;
            if (str7 == null) {
                this.url = "";
            } else {
                this.url = str7;
            }
            String str8 = builder.mobile;
            if (str8 == null) {
                this.mobile = "";
            } else {
                this.mobile = str8;
            }
            String str9 = builder.itemInfo;
            if (str9 == null) {
                this.itemInfo = "";
            } else {
                this.itemInfo = str9;
            }
            String str10 = builder.imei;
            if (str10 == null) {
                this.imei = "";
            } else {
                this.imei = str10;
            }
            Integer num3 = builder.sdk;
            if (num3 == null) {
                this.sdk = DEFAULT_SDK;
            } else {
                this.sdk = num3;
            }
            Integer num4 = builder.sdkStyle;
            if (num4 == null) {
                this.sdkStyle = DEFAULT_SDKSTYLE;
            } else {
                this.sdkStyle = num4;
            }
            String str11 = builder.extData;
            if (str11 == null) {
                this.extData = "";
            } else {
                this.extData = str11;
            }
            Integer num5 = builder.signType;
            if (num5 == null) {
                this.signType = DEFAULT_SIGNTYPE;
            } else {
                this.signType = num5;
            }
            String str12 = builder.sign;
            if (str12 == null) {
                this.sign = "";
            } else {
                this.sign = str12;
            }
            this.popup = builder.popup;
            String str13 = builder.pay_url;
            if (str13 == null) {
                this.pay_url = "";
            } else {
                this.pay_url = str13;
            }
            String str14 = builder.call_type;
            if (str14 == null) {
                this.call_type = "";
            } else {
                this.call_type = str14;
            }
            String str15 = builder.pay_channel;
            if (str15 == null) {
                this.pay_channel = "";
                return;
            } else {
                this.pay_channel = str15;
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
        this.popup = builder.popup;
        this.pay_url = builder.pay_url;
        this.call_type = builder.call_type;
        this.pay_channel = builder.pay_channel;
    }
}
