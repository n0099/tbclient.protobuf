package tbclient;

import com.baidu.android.imsdk.internal.Constants;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InitContext;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.baidu.titan.sdk.runtime.TitanRuntime;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class CommonReq extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Long DEFAULT_ACTIVE_TIMESTAMP;
    public static final String DEFAULT_AFDI = "";
    public static final String DEFAULT_ANDROID_ID = "";
    public static final String DEFAULT_APID = "";
    public static final String DEFAULT_APPLIST = "";
    public static final String DEFAULT_BDUSS = "";
    public static final String DEFAULT_BRAND = "";
    public static final String DEFAULT_BRAND_TYPE = "";
    public static final String DEFAULT_C3_AID = "";
    public static final String DEFAULT_CAID = "";
    public static final String DEFAULT_CAM = "";
    public static final Integer DEFAULT_CMODE;
    public static final String DEFAULT_CUID = "";
    public static final String DEFAULT_CUID_GALAXY2 = "";
    public static final String DEFAULT_CUID_GID = "";
    public static final String DEFAULT_DI_DIORDNA = "";
    public static final String DEFAULT_EVENT_DAY = "";
    public static final String DEFAULT_EXTRA = "";
    public static final Long DEFAULT_FIRST_INSTALL_TIME;
    public static final String DEFAULT_FRAMEWORK_VER = "";
    public static final String DEFAULT_FROM = "";
    public static final String DEFAULT_IDFA = "";
    public static final String DEFAULT_IDFV = "";
    public static final String DEFAULT_IEMI = "";
    public static final String DEFAULT_IEMIWEN = "";
    public static final Integer DEFAULT_IS_TEENAGER;
    public static final String DEFAULT_KA = "";
    public static final Long DEFAULT_LAST_UPDATE_TIME;
    public static final String DEFAULT_LEGO_LIB_VERSION = "";
    public static final String DEFAULT_MAC = "";
    public static final String DEFAULT_MODEL = "";
    public static final String DEFAULT_M_API = "";
    public static final String DEFAULT_M_COST = "";
    public static final String DEFAULT_M_LOGID = "";
    public static final String DEFAULT_M_RESULT = "";
    public static final String DEFAULT_M_SIZE_D = "";
    public static final String DEFAULT_M_SIZE_U = "";
    public static final Integer DEFAULT_NET_TYPE;
    public static final String DEFAULT_OAID = "";
    public static final Integer DEFAULT_PERSONALIZED_REC_SWITCH;
    public static final String DEFAULT_PVERSION = "";
    public static final Integer DEFAULT_Q_TYPE;
    public static final String DEFAULT_SAMPLE_ID = "";
    public static final Double DEFAULT_SCR_DIP;
    public static final Integer DEFAULT_SCR_H;
    public static final Integer DEFAULT_SCR_W;
    public static final String DEFAULT_SDK_VER = "";
    public static final String DEFAULT_SHOUBAI_CUID = "";
    public static final String DEFAULT_SIGN = "";
    public static final String DEFAULT_SMALLFLOW = "";
    public static final String DEFAULT_START_SCHEME = "";
    public static final Integer DEFAULT_START_TYPE;
    public static final String DEFAULT_STOKEN = "";
    public static final String DEFAULT_SUBAPP_TYPE = "";
    public static final String DEFAULT_SWAN_GAME_VER = "";
    public static final String DEFAULT_TBS = "";
    public static final String DEFAULT_USER_AGENT = "";
    public static final String DEFAULT_VFDI = "";
    public static final String DEFAULT_Z_ID = "";
    public static final String DEFAULT__CLIENT_ID = "";
    public static final Integer DEFAULT__CLIENT_TYPE;
    public static final String DEFAULT__CLIENT_VERSION = "";
    public static final String DEFAULT__OS_VERSION = "";
    public static final String DEFAULT__PHONE_IMEI = "";
    public static final String DEFAULT__PHONE_NEWIMEI = "";
    public static final Long DEFAULT__TIMESTAMP;
    public transient /* synthetic */ FieldHolder $fh;
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
    @ProtoField(tag = 49, type = Message.Datatype.INT64)
    public final Long active_timestamp;
    @ProtoField(tag = 67, type = Message.Datatype.STRING)
    public final String afdi;
    @ProtoField(tag = 54, type = Message.Datatype.STRING)
    public final String android_id;
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
    @ProtoField(tag = 46, type = Message.Datatype.STRING)
    public final String caid;
    @ProtoField(tag = 66, type = Message.Datatype.STRING)
    public final String cam;
    @ProtoField(tag = 55, type = Message.Datatype.INT32)
    public final Integer cmode;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String cuid;
    @ProtoField(tag = 32, type = Message.Datatype.STRING)
    public final String cuid_galaxy2;
    @ProtoField(tag = 33, type = Message.Datatype.STRING)
    public final String cuid_gid;
    @ProtoField(tag = 68, type = Message.Datatype.STRING)
    public final String di_diordna;
    @ProtoField(tag = 53, type = Message.Datatype.STRING)
    public final String event_day;
    @ProtoField(tag = 61, type = Message.Datatype.STRING)
    public final String extra;
    @ProtoField(tag = 50, type = Message.Datatype.INT64)
    public final Long first_install_time;
    @ProtoField(tag = 43, type = Message.Datatype.STRING)
    public final String framework_ver;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String from;
    @ProtoField(tag = 45, type = Message.Datatype.STRING)
    public final String idfa;
    @ProtoField(tag = 60, type = Message.Datatype.STRING)
    public final String idfv;
    @ProtoField(tag = 64, type = Message.Datatype.STRING)
    public final String iemi;
    @ProtoField(tag = 65, type = Message.Datatype.STRING)
    public final String iemiwen;
    @ProtoField(tag = 41, type = Message.Datatype.INT32)
    public final Integer is_teenager;
    @ProtoField(tag = 15, type = Message.Datatype.STRING)
    public final String ka;
    @ProtoField(tag = 51, type = Message.Datatype.INT64)
    public final Long last_update_time;
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
    @ProtoField(tag = 59, type = Message.Datatype.STRING)
    public final String mac;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String model;
    @ProtoField(tag = 12, type = Message.Datatype.INT32)
    public final Integer net_type;
    @ProtoField(tag = 34, type = Message.Datatype.STRING)
    public final String oaid;
    @ProtoField(tag = 63, type = Message.Datatype.INT32)
    public final Integer personalized_rec_switch;
    @ProtoField(tag = 24, type = Message.Datatype.STRING)
    public final String pversion;
    @ProtoField(tag = 40, type = Message.Datatype.INT32)
    public final Integer q_type;
    @ProtoField(tag = 36, type = Message.Datatype.STRING)
    public final String sample_id;
    @ProtoField(tag = 39, type = Message.Datatype.DOUBLE)
    public final Double scr_dip;
    @ProtoField(tag = 38, type = Message.Datatype.INT32)
    public final Integer scr_h;
    @ProtoField(tag = 37, type = Message.Datatype.INT32)
    public final Integer scr_w;
    @ProtoField(tag = 42, type = Message.Datatype.STRING)
    public final String sdk_ver;
    @ProtoField(tag = 58, type = Message.Datatype.STRING)
    public final String shoubai_cuid;
    @ProtoField(tag = 23, type = Message.Datatype.STRING)
    public final String sign;
    @ProtoField(tag = 22, type = Message.Datatype.STRING)
    public final String smallflow;
    @ProtoField(tag = 56, type = Message.Datatype.STRING)
    public final String start_scheme;
    @ProtoField(tag = 57, type = Message.Datatype.INT32)
    public final Integer start_type;
    @ProtoField(tag = 30, type = Message.Datatype.STRING)
    public final String stoken;
    @ProtoField(tag = 13, type = Message.Datatype.STRING)
    public final String subapp_type;
    @ProtoField(tag = 44, type = Message.Datatype.STRING)
    public final String swan_game_ver;
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String tbs;
    @ProtoField(tag = 62, type = Message.Datatype.STRING)
    public final String user_agent;
    @ProtoField(tag = 69, type = Message.Datatype.STRING)
    public final String vfdi;
    @ProtoField(tag = 31, type = Message.Datatype.STRING)
    public final String z_id;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<CommonReq> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String BDUSS;
        public String _client_id;
        public Integer _client_type;
        public String _client_version;
        public String _os_version;
        public String _phone_imei;
        public String _phone_newimei;
        public Long _timestamp;
        public Long active_timestamp;
        public String afdi;
        public String android_id;
        public String apid;
        public String applist;
        public String brand;
        public String brand_type;
        public String c3_aid;
        public String caid;
        public String cam;
        public Integer cmode;
        public String cuid;
        public String cuid_galaxy2;
        public String cuid_gid;
        public String di_diordna;
        public String event_day;
        public String extra;
        public Long first_install_time;
        public String framework_ver;
        public String from;
        public String idfa;
        public String idfv;
        public String iemi;
        public String iemiwen;
        public Integer is_teenager;
        public String ka;
        public Long last_update_time;
        public String lego_lib_version;
        public String m_api;
        public String m_cost;
        public String m_logid;
        public String m_result;
        public String m_size_d;
        public String m_size_u;
        public String mac;
        public String model;
        public Integer net_type;
        public String oaid;
        public Integer personalized_rec_switch;
        public String pversion;
        public Integer q_type;
        public String sample_id;
        public Double scr_dip;
        public Integer scr_h;
        public Integer scr_w;
        public String sdk_ver;
        public String shoubai_cuid;
        public String sign;
        public String smallflow;
        public String start_scheme;
        public Integer start_type;
        public String stoken;
        public String subapp_type;
        public String swan_game_ver;
        public String tbs;
        public String user_agent;
        public String vfdi;
        public String z_id;

        public Builder() {
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                interceptable.invokeUnInit(65536, newInitContext);
                int i2 = newInitContext.flag;
                if ((i2 & 1) != 0) {
                    int i3 = i2 & 2;
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65536, newInitContext);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(CommonReq commonReq) {
            super(commonReq);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {commonReq};
                interceptable.invokeUnInit(65537, newInitContext);
                int i2 = newInitContext.flag;
                if ((i2 & 1) != 0) {
                    int i3 = i2 & 2;
                    super((Message) newInitContext.callArgs[0]);
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65537, newInitContext);
                    return;
                }
            }
            if (commonReq == null) {
                return;
            }
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
            this.scr_w = commonReq.scr_w;
            this.scr_h = commonReq.scr_h;
            this.scr_dip = commonReq.scr_dip;
            this.q_type = commonReq.q_type;
            this.is_teenager = commonReq.is_teenager;
            this.sdk_ver = commonReq.sdk_ver;
            this.framework_ver = commonReq.framework_ver;
            this.swan_game_ver = commonReq.swan_game_ver;
            this.idfa = commonReq.idfa;
            this.caid = commonReq.caid;
            this.active_timestamp = commonReq.active_timestamp;
            this.first_install_time = commonReq.first_install_time;
            this.last_update_time = commonReq.last_update_time;
            this.event_day = commonReq.event_day;
            this.android_id = commonReq.android_id;
            this.cmode = commonReq.cmode;
            this.start_scheme = commonReq.start_scheme;
            this.start_type = commonReq.start_type;
            this.shoubai_cuid = commonReq.shoubai_cuid;
            this.mac = commonReq.mac;
            this.idfv = commonReq.idfv;
            this.extra = commonReq.extra;
            this.user_agent = commonReq.user_agent;
            this.personalized_rec_switch = commonReq.personalized_rec_switch;
            this.iemi = commonReq.iemi;
            this.iemiwen = commonReq.iemiwen;
            this.cam = commonReq.cam;
            this.afdi = commonReq.afdi;
            this.di_diordna = commonReq.di_diordna;
            this.vfdi = commonReq.vfdi;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public CommonReq build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new CommonReq(this, z, null) : (CommonReq) invokeZ.objValue;
        }
    }

    /* loaded from: classes9.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-1811576750, "Ltbclient/CommonReq;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-1811576750, "Ltbclient/CommonReq;");
                return;
            }
        }
        DEFAULT__CLIENT_TYPE = 0;
        DEFAULT__TIMESTAMP = 0L;
        DEFAULT_NET_TYPE = 0;
        DEFAULT_SCR_W = 0;
        DEFAULT_SCR_H = 0;
        DEFAULT_SCR_DIP = Double.valueOf(0.0d);
        DEFAULT_Q_TYPE = 0;
        DEFAULT_IS_TEENAGER = 0;
        DEFAULT_ACTIVE_TIMESTAMP = 0L;
        DEFAULT_FIRST_INSTALL_TIME = 0L;
        DEFAULT_LAST_UPDATE_TIME = 0L;
        DEFAULT_CMODE = 0;
        DEFAULT_START_TYPE = 0;
        DEFAULT_PERSONALIZED_REC_SWITCH = 0;
    }

    public /* synthetic */ CommonReq(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonReq(Builder builder, boolean z) {
        super(builder);
        Interceptable interceptable = $ic;
        if (interceptable != null) {
            InitContext newInitContext = TitanRuntime.newInitContext();
            newInitContext.initArgs = r2;
            Object[] objArr = {builder, Boolean.valueOf(z)};
            interceptable.invokeUnInit(65537, newInitContext);
            int i2 = newInitContext.flag;
            if ((i2 & 1) != 0) {
                int i3 = i2 & 2;
                super((Message.Builder) newInitContext.callArgs[0]);
                newInitContext.thisArg = this;
                interceptable.invokeInitBody(65537, newInitContext);
                return;
            }
        }
        if (z) {
            Integer num = builder._client_type;
            if (num == null) {
                this._client_type = DEFAULT__CLIENT_TYPE;
            } else {
                this._client_type = num;
            }
            String str = builder._client_version;
            if (str == null) {
                this._client_version = "";
            } else {
                this._client_version = str;
            }
            String str2 = builder._client_id;
            if (str2 == null) {
                this._client_id = "";
            } else {
                this._client_id = str2;
            }
            String str3 = builder.apid;
            if (str3 == null) {
                this.apid = "";
            } else {
                this.apid = str3;
            }
            String str4 = builder._phone_imei;
            if (str4 == null) {
                this._phone_imei = "";
            } else {
                this._phone_imei = str4;
            }
            String str5 = builder.from;
            if (str5 == null) {
                this.from = "";
            } else {
                this.from = str5;
            }
            String str6 = builder.cuid;
            if (str6 == null) {
                this.cuid = "";
            } else {
                this.cuid = str6;
            }
            Long l = builder._timestamp;
            if (l == null) {
                this._timestamp = DEFAULT__TIMESTAMP;
            } else {
                this._timestamp = l;
            }
            String str7 = builder.model;
            if (str7 == null) {
                this.model = "";
            } else {
                this.model = str7;
            }
            String str8 = builder.BDUSS;
            if (str8 == null) {
                this.BDUSS = "";
            } else {
                this.BDUSS = str8;
            }
            String str9 = builder.tbs;
            if (str9 == null) {
                this.tbs = "";
            } else {
                this.tbs = str9;
            }
            Integer num2 = builder.net_type;
            if (num2 == null) {
                this.net_type = DEFAULT_NET_TYPE;
            } else {
                this.net_type = num2;
            }
            String str10 = builder.subapp_type;
            if (str10 == null) {
                this.subapp_type = "";
            } else {
                this.subapp_type = str10;
            }
            String str11 = builder._phone_newimei;
            if (str11 == null) {
                this._phone_newimei = "";
            } else {
                this._phone_newimei = str11;
            }
            String str12 = builder.ka;
            if (str12 == null) {
                this.ka = "";
            } else {
                this.ka = str12;
            }
            String str13 = builder.m_api;
            if (str13 == null) {
                this.m_api = "";
            } else {
                this.m_api = str13;
            }
            String str14 = builder.m_logid;
            if (str14 == null) {
                this.m_logid = "";
            } else {
                this.m_logid = str14;
            }
            String str15 = builder.m_cost;
            if (str15 == null) {
                this.m_cost = "";
            } else {
                this.m_cost = str15;
            }
            String str16 = builder.m_result;
            if (str16 == null) {
                this.m_result = "";
            } else {
                this.m_result = str16;
            }
            String str17 = builder.m_size_u;
            if (str17 == null) {
                this.m_size_u = "";
            } else {
                this.m_size_u = str17;
            }
            String str18 = builder.m_size_d;
            if (str18 == null) {
                this.m_size_d = "";
            } else {
                this.m_size_d = str18;
            }
            String str19 = builder.smallflow;
            if (str19 == null) {
                this.smallflow = "";
            } else {
                this.smallflow = str19;
            }
            String str20 = builder.sign;
            if (str20 == null) {
                this.sign = "";
            } else {
                this.sign = str20;
            }
            String str21 = builder.pversion;
            if (str21 == null) {
                this.pversion = "";
            } else {
                this.pversion = str21;
            }
            String str22 = builder._os_version;
            if (str22 == null) {
                this._os_version = "";
            } else {
                this._os_version = str22;
            }
            String str23 = builder.brand;
            if (str23 == null) {
                this.brand = "";
            } else {
                this.brand = str23;
            }
            String str24 = builder.brand_type;
            if (str24 == null) {
                this.brand_type = "";
            } else {
                this.brand_type = str24;
            }
            String str25 = builder.lego_lib_version;
            if (str25 == null) {
                this.lego_lib_version = "";
            } else {
                this.lego_lib_version = str25;
            }
            String str26 = builder.applist;
            if (str26 == null) {
                this.applist = "";
            } else {
                this.applist = str26;
            }
            String str27 = builder.stoken;
            if (str27 == null) {
                this.stoken = "";
            } else {
                this.stoken = str27;
            }
            String str28 = builder.z_id;
            if (str28 == null) {
                this.z_id = "";
            } else {
                this.z_id = str28;
            }
            String str29 = builder.cuid_galaxy2;
            if (str29 == null) {
                this.cuid_galaxy2 = "";
            } else {
                this.cuid_galaxy2 = str29;
            }
            String str30 = builder.cuid_gid;
            if (str30 == null) {
                this.cuid_gid = "";
            } else {
                this.cuid_gid = str30;
            }
            String str31 = builder.oaid;
            if (str31 == null) {
                this.oaid = "";
            } else {
                this.oaid = str31;
            }
            String str32 = builder.c3_aid;
            if (str32 == null) {
                this.c3_aid = "";
            } else {
                this.c3_aid = str32;
            }
            String str33 = builder.sample_id;
            if (str33 == null) {
                this.sample_id = "";
            } else {
                this.sample_id = str33;
            }
            Integer num3 = builder.scr_w;
            if (num3 == null) {
                this.scr_w = DEFAULT_SCR_W;
            } else {
                this.scr_w = num3;
            }
            Integer num4 = builder.scr_h;
            if (num4 == null) {
                this.scr_h = DEFAULT_SCR_H;
            } else {
                this.scr_h = num4;
            }
            Double d2 = builder.scr_dip;
            if (d2 == null) {
                this.scr_dip = DEFAULT_SCR_DIP;
            } else {
                this.scr_dip = d2;
            }
            Integer num5 = builder.q_type;
            if (num5 == null) {
                this.q_type = DEFAULT_Q_TYPE;
            } else {
                this.q_type = num5;
            }
            Integer num6 = builder.is_teenager;
            if (num6 == null) {
                this.is_teenager = DEFAULT_IS_TEENAGER;
            } else {
                this.is_teenager = num6;
            }
            String str34 = builder.sdk_ver;
            if (str34 == null) {
                this.sdk_ver = "";
            } else {
                this.sdk_ver = str34;
            }
            String str35 = builder.framework_ver;
            if (str35 == null) {
                this.framework_ver = "";
            } else {
                this.framework_ver = str35;
            }
            String str36 = builder.swan_game_ver;
            if (str36 == null) {
                this.swan_game_ver = "";
            } else {
                this.swan_game_ver = str36;
            }
            String str37 = builder.idfa;
            if (str37 == null) {
                this.idfa = "";
            } else {
                this.idfa = str37;
            }
            String str38 = builder.caid;
            if (str38 == null) {
                this.caid = "";
            } else {
                this.caid = str38;
            }
            Long l2 = builder.active_timestamp;
            if (l2 == null) {
                this.active_timestamp = DEFAULT_ACTIVE_TIMESTAMP;
            } else {
                this.active_timestamp = l2;
            }
            Long l3 = builder.first_install_time;
            if (l3 == null) {
                this.first_install_time = DEFAULT_FIRST_INSTALL_TIME;
            } else {
                this.first_install_time = l3;
            }
            Long l4 = builder.last_update_time;
            if (l4 == null) {
                this.last_update_time = DEFAULT_LAST_UPDATE_TIME;
            } else {
                this.last_update_time = l4;
            }
            String str39 = builder.event_day;
            if (str39 == null) {
                this.event_day = "";
            } else {
                this.event_day = str39;
            }
            String str40 = builder.android_id;
            if (str40 == null) {
                this.android_id = "";
            } else {
                this.android_id = str40;
            }
            Integer num7 = builder.cmode;
            if (num7 == null) {
                this.cmode = DEFAULT_CMODE;
            } else {
                this.cmode = num7;
            }
            String str41 = builder.start_scheme;
            if (str41 == null) {
                this.start_scheme = "";
            } else {
                this.start_scheme = str41;
            }
            Integer num8 = builder.start_type;
            if (num8 == null) {
                this.start_type = DEFAULT_START_TYPE;
            } else {
                this.start_type = num8;
            }
            String str42 = builder.shoubai_cuid;
            if (str42 == null) {
                this.shoubai_cuid = "";
            } else {
                this.shoubai_cuid = str42;
            }
            String str43 = builder.mac;
            if (str43 == null) {
                this.mac = "";
            } else {
                this.mac = str43;
            }
            String str44 = builder.idfv;
            if (str44 == null) {
                this.idfv = "";
            } else {
                this.idfv = str44;
            }
            String str45 = builder.extra;
            if (str45 == null) {
                this.extra = "";
            } else {
                this.extra = str45;
            }
            String str46 = builder.user_agent;
            if (str46 == null) {
                this.user_agent = "";
            } else {
                this.user_agent = str46;
            }
            Integer num9 = builder.personalized_rec_switch;
            if (num9 == null) {
                this.personalized_rec_switch = DEFAULT_PERSONALIZED_REC_SWITCH;
            } else {
                this.personalized_rec_switch = num9;
            }
            String str47 = builder.iemi;
            if (str47 == null) {
                this.iemi = "";
            } else {
                this.iemi = str47;
            }
            String str48 = builder.iemiwen;
            if (str48 == null) {
                this.iemiwen = "";
            } else {
                this.iemiwen = str48;
            }
            String str49 = builder.cam;
            if (str49 == null) {
                this.cam = "";
            } else {
                this.cam = str49;
            }
            String str50 = builder.afdi;
            if (str50 == null) {
                this.afdi = "";
            } else {
                this.afdi = str50;
            }
            String str51 = builder.di_diordna;
            if (str51 == null) {
                this.di_diordna = "";
            } else {
                this.di_diordna = str51;
            }
            String str52 = builder.vfdi;
            if (str52 == null) {
                this.vfdi = "";
                return;
            } else {
                this.vfdi = str52;
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
        this.scr_w = builder.scr_w;
        this.scr_h = builder.scr_h;
        this.scr_dip = builder.scr_dip;
        this.q_type = builder.q_type;
        this.is_teenager = builder.is_teenager;
        this.sdk_ver = builder.sdk_ver;
        this.framework_ver = builder.framework_ver;
        this.swan_game_ver = builder.swan_game_ver;
        this.idfa = builder.idfa;
        this.caid = builder.caid;
        this.active_timestamp = builder.active_timestamp;
        this.first_install_time = builder.first_install_time;
        this.last_update_time = builder.last_update_time;
        this.event_day = builder.event_day;
        this.android_id = builder.android_id;
        this.cmode = builder.cmode;
        this.start_scheme = builder.start_scheme;
        this.start_type = builder.start_type;
        this.shoubai_cuid = builder.shoubai_cuid;
        this.mac = builder.mac;
        this.idfv = builder.idfv;
        this.extra = builder.extra;
        this.user_agent = builder.user_agent;
        this.personalized_rec_switch = builder.personalized_rec_switch;
        this.iemi = builder.iemi;
        this.iemiwen = builder.iemiwen;
        this.cam = builder.cam;
        this.afdi = builder.afdi;
        this.di_diordna = builder.di_diordna;
        this.vfdi = builder.vfdi;
    }
}
