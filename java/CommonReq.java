package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes16.dex */
public final class CommonReq extends Message {
    public static final String DEFAULT_APID = "";
    public static final String DEFAULT_APPLIST = "";
    public static final String DEFAULT_BDUSS = "";
    public static final String DEFAULT_BRAND = "";
    public static final String DEFAULT_BRAND_TYPE = "";
    public static final String DEFAULT_C3_AID = "";
    public static final String DEFAULT_CUID = "";
    public static final String DEFAULT_CUID_GALAXY2 = "";
    public static final String DEFAULT_CUID_GID = "";
    public static final String DEFAULT_FROM = "";
    public static final String DEFAULT_KA = "";
    public static final String DEFAULT_LEGO_LIB_VERSION = "";
    public static final String DEFAULT_MODEL = "";
    public static final String DEFAULT_M_API = "";
    public static final String DEFAULT_M_COST = "";
    public static final String DEFAULT_M_LOGID = "";
    public static final String DEFAULT_M_RESULT = "";
    public static final String DEFAULT_M_SIZE_D = "";
    public static final String DEFAULT_M_SIZE_U = "";
    public static final String DEFAULT_OAID = "";
    public static final String DEFAULT_PVERSION = "";
    public static final String DEFAULT_SAMPLE_ID = "";
    public static final String DEFAULT_SIGN = "";
    public static final String DEFAULT_SMALLFLOW = "";
    public static final String DEFAULT_STOKEN = "";
    public static final String DEFAULT_SUBAPP_TYPE = "";
    public static final String DEFAULT_TBS = "";
    public static final String DEFAULT_Z_ID = "";
    public static final String DEFAULT__CLIENT_ID = "";
    public static final String DEFAULT__CLIENT_VERSION = "";
    public static final String DEFAULT__OS_VERSION = "";
    public static final String DEFAULT__PHONE_IMEI = "";
    public static final String DEFAULT__PHONE_NEWIMEI = "";
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String BDUSS;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String _client_id;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer _client_type;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String _client_version;
    @ProtoField(tag = 25, type = Message.Datatype.STRING)
    public final String _os_version;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String _phone_imei;
    @ProtoField(tag = 14, type = Message.Datatype.STRING)
    public final String _phone_newimei;
    @ProtoField(tag = 8, type = Message.Datatype.INT64)
    public final Long _timestamp;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String apid;
    @ProtoField(tag = 29, type = Message.Datatype.STRING)
    public final String applist;
    @ProtoField(tag = 26, type = Message.Datatype.STRING)
    public final String brand;
    @ProtoField(tag = 27, type = Message.Datatype.STRING)
    public final String brand_type;
    @ProtoField(tag = 35, type = Message.Datatype.STRING)
    public final String c3_aid;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String cuid;
    @ProtoField(tag = 32, type = Message.Datatype.STRING)
    public final String cuid_galaxy2;
    @ProtoField(tag = 33, type = Message.Datatype.STRING)
    public final String cuid_gid;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String from;
    @ProtoField(tag = 15, type = Message.Datatype.STRING)
    public final String ka;
    @ProtoField(tag = 28, type = Message.Datatype.STRING)
    public final String lego_lib_version;
    @ProtoField(tag = 16, type = Message.Datatype.STRING)
    public final String m_api;
    @ProtoField(tag = 18, type = Message.Datatype.STRING)
    public final String m_cost;
    @ProtoField(tag = 17, type = Message.Datatype.STRING)
    public final String m_logid;
    @ProtoField(tag = 19, type = Message.Datatype.STRING)
    public final String m_result;
    @ProtoField(tag = 21, type = Message.Datatype.STRING)
    public final String m_size_d;
    @ProtoField(tag = 20, type = Message.Datatype.STRING)
    public final String m_size_u;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String model;
    @ProtoField(tag = 12, type = Message.Datatype.INT32)
    public final Integer net_type;
    @ProtoField(tag = 34, type = Message.Datatype.STRING)
    public final String oaid;
    @ProtoField(tag = 24, type = Message.Datatype.STRING)
    public final String pversion;
    @ProtoField(tag = 36, type = Message.Datatype.STRING)
    public final String sample_id;
    @ProtoField(tag = 23, type = Message.Datatype.STRING)
    public final String sign;
    @ProtoField(tag = 22, type = Message.Datatype.STRING)
    public final String smallflow;
    @ProtoField(tag = 30, type = Message.Datatype.STRING)
    public final String stoken;
    @ProtoField(tag = 13, type = Message.Datatype.STRING)
    public final String subapp_type;
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String tbs;
    @ProtoField(tag = 31, type = Message.Datatype.STRING)
    public final String z_id;
    public static final Integer DEFAULT__CLIENT_TYPE = 0;
    public static final Long DEFAULT__TIMESTAMP = 0L;
    public static final Integer DEFAULT_NET_TYPE = 0;

    private CommonReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder._client_type == null) {
                this._client_type = DEFAULT__CLIENT_TYPE;
            } else {
                this._client_type = builder._client_type;
            }
            if (builder._client_version == null) {
                this._client_version = "";
            } else {
                this._client_version = builder._client_version;
            }
            if (builder._client_id == null) {
                this._client_id = "";
            } else {
                this._client_id = builder._client_id;
            }
            if (builder.apid == null) {
                this.apid = "";
            } else {
                this.apid = builder.apid;
            }
            if (builder._phone_imei == null) {
                this._phone_imei = "";
            } else {
                this._phone_imei = builder._phone_imei;
            }
            if (builder.from == null) {
                this.from = "";
            } else {
                this.from = builder.from;
            }
            if (builder.cuid == null) {
                this.cuid = "";
            } else {
                this.cuid = builder.cuid;
            }
            if (builder._timestamp == null) {
                this._timestamp = DEFAULT__TIMESTAMP;
            } else {
                this._timestamp = builder._timestamp;
            }
            if (builder.model == null) {
                this.model = "";
            } else {
                this.model = builder.model;
            }
            if (builder.BDUSS == null) {
                this.BDUSS = "";
            } else {
                this.BDUSS = builder.BDUSS;
            }
            if (builder.tbs == null) {
                this.tbs = "";
            } else {
                this.tbs = builder.tbs;
            }
            if (builder.net_type == null) {
                this.net_type = DEFAULT_NET_TYPE;
            } else {
                this.net_type = builder.net_type;
            }
            if (builder.subapp_type == null) {
                this.subapp_type = "";
            } else {
                this.subapp_type = builder.subapp_type;
            }
            if (builder._phone_newimei == null) {
                this._phone_newimei = "";
            } else {
                this._phone_newimei = builder._phone_newimei;
            }
            if (builder.ka == null) {
                this.ka = "";
            } else {
                this.ka = builder.ka;
            }
            if (builder.m_api == null) {
                this.m_api = "";
            } else {
                this.m_api = builder.m_api;
            }
            if (builder.m_logid == null) {
                this.m_logid = "";
            } else {
                this.m_logid = builder.m_logid;
            }
            if (builder.m_cost == null) {
                this.m_cost = "";
            } else {
                this.m_cost = builder.m_cost;
            }
            if (builder.m_result == null) {
                this.m_result = "";
            } else {
                this.m_result = builder.m_result;
            }
            if (builder.m_size_u == null) {
                this.m_size_u = "";
            } else {
                this.m_size_u = builder.m_size_u;
            }
            if (builder.m_size_d == null) {
                this.m_size_d = "";
            } else {
                this.m_size_d = builder.m_size_d;
            }
            if (builder.smallflow == null) {
                this.smallflow = "";
            } else {
                this.smallflow = builder.smallflow;
            }
            if (builder.sign == null) {
                this.sign = "";
            } else {
                this.sign = builder.sign;
            }
            if (builder.pversion == null) {
                this.pversion = "";
            } else {
                this.pversion = builder.pversion;
            }
            if (builder._os_version == null) {
                this._os_version = "";
            } else {
                this._os_version = builder._os_version;
            }
            if (builder.brand == null) {
                this.brand = "";
            } else {
                this.brand = builder.brand;
            }
            if (builder.brand_type == null) {
                this.brand_type = "";
            } else {
                this.brand_type = builder.brand_type;
            }
            if (builder.lego_lib_version == null) {
                this.lego_lib_version = "";
            } else {
                this.lego_lib_version = builder.lego_lib_version;
            }
            if (builder.applist == null) {
                this.applist = "";
            } else {
                this.applist = builder.applist;
            }
            if (builder.stoken == null) {
                this.stoken = "";
            } else {
                this.stoken = builder.stoken;
            }
            if (builder.z_id == null) {
                this.z_id = "";
            } else {
                this.z_id = builder.z_id;
            }
            if (builder.cuid_galaxy2 == null) {
                this.cuid_galaxy2 = "";
            } else {
                this.cuid_galaxy2 = builder.cuid_galaxy2;
            }
            if (builder.cuid_gid == null) {
                this.cuid_gid = "";
            } else {
                this.cuid_gid = builder.cuid_gid;
            }
            if (builder.oaid == null) {
                this.oaid = "";
            } else {
                this.oaid = builder.oaid;
            }
            if (builder.c3_aid == null) {
                this.c3_aid = "";
            } else {
                this.c3_aid = builder.c3_aid;
            }
            if (builder.sample_id == null) {
                this.sample_id = "";
                return;
            } else {
                this.sample_id = builder.sample_id;
                return;
            }
        }
        this._client_type = builder._client_type;
        this._client_version = builder._client_version;
        this._client_id = builder._client_id;
        this.apid = builder.apid;
        this._phone_imei = builder._phone_imei;
        this.from = builder.from;
        this.cuid = builder.cuid;
        this._timestamp = builder._timestamp;
        this.model = builder.model;
        this.BDUSS = builder.BDUSS;
        this.tbs = builder.tbs;
        this.net_type = builder.net_type;
        this.subapp_type = builder.subapp_type;
        this._phone_newimei = builder._phone_newimei;
        this.ka = builder.ka;
        this.m_api = builder.m_api;
        this.m_logid = builder.m_logid;
        this.m_cost = builder.m_cost;
        this.m_result = builder.m_result;
        this.m_size_u = builder.m_size_u;
        this.m_size_d = builder.m_size_d;
        this.smallflow = builder.smallflow;
        this.sign = builder.sign;
        this.pversion = builder.pversion;
        this._os_version = builder._os_version;
        this.brand = builder.brand;
        this.brand_type = builder.brand_type;
        this.lego_lib_version = builder.lego_lib_version;
        this.applist = builder.applist;
        this.stoken = builder.stoken;
        this.z_id = builder.z_id;
        this.cuid_galaxy2 = builder.cuid_galaxy2;
        this.cuid_gid = builder.cuid_gid;
        this.oaid = builder.oaid;
        this.c3_aid = builder.c3_aid;
        this.sample_id = builder.sample_id;
    }

    /* loaded from: classes16.dex */
    public static final class Builder extends Message.Builder<CommonReq> {
        public String BDUSS;
        public String _client_id;
        public Integer _client_type;
        public String _client_version;
        public String _os_version;
        public String _phone_imei;
        public String _phone_newimei;
        public Long _timestamp;
        public String apid;
        public String applist;
        public String brand;
        public String brand_type;
        public String c3_aid;
        public String cuid;
        public String cuid_galaxy2;
        public String cuid_gid;
        public String from;
        public String ka;
        public String lego_lib_version;
        public String m_api;
        public String m_cost;
        public String m_logid;
        public String m_result;
        public String m_size_d;
        public String m_size_u;
        public String model;
        public Integer net_type;
        public String oaid;
        public String pversion;
        public String sample_id;
        public String sign;
        public String smallflow;
        public String stoken;
        public String subapp_type;
        public String tbs;
        public String z_id;

        public Builder() {
        }

        public Builder(CommonReq commonReq) {
            super(commonReq);
            if (commonReq != null) {
                this._client_type = commonReq._client_type;
                this._client_version = commonReq._client_version;
                this._client_id = commonReq._client_id;
                this.apid = commonReq.apid;
                this._phone_imei = commonReq._phone_imei;
                this.from = commonReq.from;
                this.cuid = commonReq.cuid;
                this._timestamp = commonReq._timestamp;
                this.model = commonReq.model;
                this.BDUSS = commonReq.BDUSS;
                this.tbs = commonReq.tbs;
                this.net_type = commonReq.net_type;
                this.subapp_type = commonReq.subapp_type;
                this._phone_newimei = commonReq._phone_newimei;
                this.ka = commonReq.ka;
                this.m_api = commonReq.m_api;
                this.m_logid = commonReq.m_logid;
                this.m_cost = commonReq.m_cost;
                this.m_result = commonReq.m_result;
                this.m_size_u = commonReq.m_size_u;
                this.m_size_d = commonReq.m_size_d;
                this.smallflow = commonReq.smallflow;
                this.sign = commonReq.sign;
                this.pversion = commonReq.pversion;
                this._os_version = commonReq._os_version;
                this.brand = commonReq.brand;
                this.brand_type = commonReq.brand_type;
                this.lego_lib_version = commonReq.lego_lib_version;
                this.applist = commonReq.applist;
                this.stoken = commonReq.stoken;
                this.z_id = commonReq.z_id;
                this.cuid_galaxy2 = commonReq.cuid_galaxy2;
                this.cuid_gid = commonReq.cuid_gid;
                this.oaid = commonReq.oaid;
                this.c3_aid = commonReq.c3_aid;
                this.sample_id = commonReq.sample_id;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public CommonReq build(boolean z) {
            return new CommonReq(this, z);
        }
    }
}
