package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class BaseInfo extends Message {
    public static final String DEFAULT_ACTIVE_ID = "";
    public static final String DEFAULT_ACT_STEP = "";
    public static final String DEFAULT_APP_VERSION = "";
    public static final String DEFAULT_BRAND = "";
    public static final String DEFAULT_BRAND_TYPE = "";
    public static final String DEFAULT_CLIENT_IP = "";
    public static final String DEFAULT_CLIENT_TIMESTAMP = "";
    public static final String DEFAULT_CUID = "";
    public static final String DEFAULT_FROM = "";
    public static final String DEFAULT_LIB_VERSION = "";
    public static final String DEFAULT_MISSION_ID = "";
    public static final String DEFAULT_MODEL = "";
    public static final String DEFAULT_NETWORK = "";
    public static final String DEFAULT_OS_TYPE = "";
    public static final String DEFAULT_OS_VERSION = "";
    public static final String DEFAULT_SHOUBAI_CUID = "";
    @ProtoField(tag = 18, type = Message.Datatype.STRING)
    public final String act_step;
    @ProtoField(tag = 15, type = Message.Datatype.STRING)
    public final String active_id;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String app_version;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String brand;
    @ProtoField(tag = 13, type = Message.Datatype.STRING)
    public final String brand_type;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String client_ip;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String client_timestamp;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String cuid;
    @ProtoField(tag = 14, type = Message.Datatype.STRING)
    public final String from;
    @ProtoField(tag = 12, type = Message.Datatype.STRING)
    public final String lib_version;
    @ProtoField(tag = 19, type = Message.Datatype.INT32)
    public final Integer log_type;
    @ProtoField(tag = 17, type = Message.Datatype.STRING)
    public final String mission_id;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String model;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String network;
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String os_type;
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String os_version;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String shoubai_cuid;
    @ProtoField(tag = 16, type = Message.Datatype.INT64)
    public final Long uid;
    public static final Long DEFAULT_UID = 0L;
    public static final Integer DEFAULT_LOG_TYPE = 0;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<BaseInfo> {
        public String act_step;
        public String active_id;
        public String app_version;
        public String brand;
        public String brand_type;
        public String client_ip;
        public String client_timestamp;
        public String cuid;
        public String from;
        public String lib_version;
        public Integer log_type;
        public String mission_id;
        public String model;
        public String network;
        public String os_type;
        public String os_version;
        public String shoubai_cuid;
        public Long uid;

        public Builder() {
        }

        public Builder(BaseInfo baseInfo) {
            super(baseInfo);
            if (baseInfo == null) {
                return;
            }
            this.app_version = baseInfo.app_version;
            this.client_ip = baseInfo.client_ip;
            this.client_timestamp = baseInfo.client_timestamp;
            this.cuid = baseInfo.cuid;
            this.shoubai_cuid = baseInfo.shoubai_cuid;
            this.network = baseInfo.network;
            this.model = baseInfo.model;
            this.brand = baseInfo.brand;
            this.os_type = baseInfo.os_type;
            this.os_version = baseInfo.os_version;
            this.lib_version = baseInfo.lib_version;
            this.brand_type = baseInfo.brand_type;
            this.from = baseInfo.from;
            this.active_id = baseInfo.active_id;
            this.uid = baseInfo.uid;
            this.mission_id = baseInfo.mission_id;
            this.act_step = baseInfo.act_step;
            this.log_type = baseInfo.log_type;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public BaseInfo build(boolean z) {
            return new BaseInfo(this, z);
        }
    }

    public BaseInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.app_version;
            if (str == null) {
                this.app_version = "";
            } else {
                this.app_version = str;
            }
            String str2 = builder.client_ip;
            if (str2 == null) {
                this.client_ip = "";
            } else {
                this.client_ip = str2;
            }
            String str3 = builder.client_timestamp;
            if (str3 == null) {
                this.client_timestamp = "";
            } else {
                this.client_timestamp = str3;
            }
            String str4 = builder.cuid;
            if (str4 == null) {
                this.cuid = "";
            } else {
                this.cuid = str4;
            }
            String str5 = builder.shoubai_cuid;
            if (str5 == null) {
                this.shoubai_cuid = "";
            } else {
                this.shoubai_cuid = str5;
            }
            String str6 = builder.network;
            if (str6 == null) {
                this.network = "";
            } else {
                this.network = str6;
            }
            String str7 = builder.model;
            if (str7 == null) {
                this.model = "";
            } else {
                this.model = str7;
            }
            String str8 = builder.brand;
            if (str8 == null) {
                this.brand = "";
            } else {
                this.brand = str8;
            }
            String str9 = builder.os_type;
            if (str9 == null) {
                this.os_type = "";
            } else {
                this.os_type = str9;
            }
            String str10 = builder.os_version;
            if (str10 == null) {
                this.os_version = "";
            } else {
                this.os_version = str10;
            }
            String str11 = builder.lib_version;
            if (str11 == null) {
                this.lib_version = "";
            } else {
                this.lib_version = str11;
            }
            String str12 = builder.brand_type;
            if (str12 == null) {
                this.brand_type = "";
            } else {
                this.brand_type = str12;
            }
            String str13 = builder.from;
            if (str13 == null) {
                this.from = "";
            } else {
                this.from = str13;
            }
            String str14 = builder.active_id;
            if (str14 == null) {
                this.active_id = "";
            } else {
                this.active_id = str14;
            }
            Long l = builder.uid;
            if (l == null) {
                this.uid = DEFAULT_UID;
            } else {
                this.uid = l;
            }
            String str15 = builder.mission_id;
            if (str15 == null) {
                this.mission_id = "";
            } else {
                this.mission_id = str15;
            }
            String str16 = builder.act_step;
            if (str16 == null) {
                this.act_step = "";
            } else {
                this.act_step = str16;
            }
            Integer num = builder.log_type;
            if (num == null) {
                this.log_type = DEFAULT_LOG_TYPE;
                return;
            } else {
                this.log_type = num;
                return;
            }
        }
        this.app_version = builder.app_version;
        this.client_ip = builder.client_ip;
        this.client_timestamp = builder.client_timestamp;
        this.cuid = builder.cuid;
        this.shoubai_cuid = builder.shoubai_cuid;
        this.network = builder.network;
        this.model = builder.model;
        this.brand = builder.brand;
        this.os_type = builder.os_type;
        this.os_version = builder.os_version;
        this.lib_version = builder.lib_version;
        this.brand_type = builder.brand_type;
        this.from = builder.from;
        this.active_id = builder.active_id;
        this.uid = builder.uid;
        this.mission_id = builder.mission_id;
        this.act_step = builder.act_step;
        this.log_type = builder.log_type;
    }
}
