package tbclient.UserPost;

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
import tbclient.CommonReq;
/* loaded from: classes4.dex */
public final class DataReq extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Long DEFAULT_BEGIN_THREAD_ID;
    public static final Integer DEFAULT_BEGIN_TIME;
    public static final Integer DEFAULT_CHECK_LOGIN;
    public static final String DEFAULT_COOKIE = "";
    public static final String DEFAULT_EMAIL = "";
    public static final Integer DEFAULT_END_TIME;
    public static final Long DEFAULT_FORUM_ID;
    public static final Integer DEFAULT_FROM_TYPE;
    public static final Integer DEFAULT_IP_INT;
    public static final String DEFAULT_IP_STR = "";
    public static final Integer DEFAULT_IS_THREAD;
    public static final Integer DEFAULT_IS_TWZHIBO;
    public static final Integer DEFAULT_IS_VIEW_CARD;
    public static final Integer DEFAULT_LAST_THREAD_TIME;
    public static final Integer DEFAULT_LOGIN;
    public static final String DEFAULT_MOBILE = "";
    public static final String DEFAULT_MODULE_NAME = "";
    public static final Integer DEFAULT_NEED_CONTENT;
    public static final Integer DEFAULT_NO_UN;
    public static final Integer DEFAULT_OFFSET;
    public static final Integer DEFAULT_PN;
    public static final String DEFAULT_PORTRAIT = "";
    public static final Integer DEFAULT_Q_TYPE;
    public static final Integer DEFAULT_RN;
    public static final Double DEFAULT_SCR_DIP;
    public static final Integer DEFAULT_SCR_H;
    public static final Integer DEFAULT_SCR_W;
    public static final Integer DEFAULT_SMILE_GRADE;
    public static final Integer DEFAULT_ST_PARAM;
    public static final Integer DEFAULT_ST_TYPE;
    public static final Integer DEFAULT_SUBTYPE;
    public static final Integer DEFAULT_SUPPORT_NOUN;
    public static final Integer DEFAULT_TYPE;
    public static final Long DEFAULT_UID;
    public static final Long DEFAULT_USER_ID;
    public static final String DEFAULT_USER_NAME = "";
    public static final Integer DEFAULT_WORK_TAB_ID;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 38, type = Message.Datatype.UINT64)
    public final Long begin_thread_id;
    @ProtoField(tag = 7, type = Message.Datatype.UINT32)
    public final Integer begin_time;
    @ProtoField(tag = 10, type = Message.Datatype.UINT32)
    public final Integer check_login;
    @ProtoField(tag = 27)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f64788common;
    @ProtoField(tag = 25, type = Message.Datatype.STRING)
    public final String cookie;
    @ProtoField(tag = 24, type = Message.Datatype.STRING)
    public final String email;
    @ProtoField(tag = 8, type = Message.Datatype.UINT32)
    public final Integer end_time;
    @ProtoField(tag = 6, type = Message.Datatype.UINT64)
    public final Long forum_id;
    @ProtoField(tag = 37, type = Message.Datatype.UINT32)
    public final Integer from_type;
    @ProtoField(tag = 12, type = Message.Datatype.UINT32)
    public final Integer ip_int;
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String ip_str;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer is_thread;
    @ProtoField(tag = 28, type = Message.Datatype.UINT32)
    public final Integer is_twzhibo;
    @ProtoField(tag = 33, type = Message.Datatype.INT32)
    public final Integer is_view_card;
    @ProtoField(tag = 34, type = Message.Datatype.UINT32)
    public final Integer last_thread_time;
    @ProtoField(tag = 18, type = Message.Datatype.UINT32)
    public final Integer login;
    @ProtoField(tag = 23, type = Message.Datatype.STRING)
    public final String mobile;
    @ProtoField(tag = 13, type = Message.Datatype.STRING)
    public final String module_name;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer need_content;
    @ProtoField(tag = 21, type = Message.Datatype.UINT32)
    public final Integer no_un;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer offset;
    @ProtoField(tag = 26, type = Message.Datatype.UINT32)
    public final Integer pn;
    @ProtoField(tag = 22, type = Message.Datatype.STRING)
    public final String portrait;
    @ProtoField(tag = 32, type = Message.Datatype.INT32)
    public final Integer q_type;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer rn;
    @ProtoField(tag = 31, type = Message.Datatype.DOUBLE)
    public final Double scr_dip;
    @ProtoField(tag = 30, type = Message.Datatype.INT32)
    public final Integer scr_h;
    @ProtoField(tag = 29, type = Message.Datatype.INT32)
    public final Integer scr_w;
    @ProtoField(tag = 16, type = Message.Datatype.UINT32)
    public final Integer smile_grade;
    @ProtoField(tag = 15, type = Message.Datatype.UINT32)
    public final Integer st_param;
    @ProtoField(tag = 14, type = Message.Datatype.UINT32)
    public final Integer st_type;
    @ProtoField(tag = 9, type = Message.Datatype.UINT32)
    public final Integer subtype;
    @ProtoField(tag = 17, type = Message.Datatype.UINT32)
    public final Integer support_noun;
    @ProtoField(tag = 36, type = Message.Datatype.UINT32)
    public final Integer type;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long uid;
    @ProtoField(tag = 19, type = Message.Datatype.INT64)
    public final Long user_id;
    @ProtoField(tag = 20, type = Message.Datatype.STRING)
    public final String user_name;
    @ProtoField(tag = 35, type = Message.Datatype.UINT32)
    public final Integer work_tab_id;

    /* loaded from: classes4.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Long begin_thread_id;
        public Integer begin_time;
        public Integer check_login;

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f64789common;
        public String cookie;
        public String email;
        public Integer end_time;
        public Long forum_id;
        public Integer from_type;
        public Integer ip_int;
        public String ip_str;
        public Integer is_thread;
        public Integer is_twzhibo;
        public Integer is_view_card;
        public Integer last_thread_time;
        public Integer login;
        public String mobile;
        public String module_name;
        public Integer need_content;
        public Integer no_un;
        public Integer offset;
        public Integer pn;
        public String portrait;
        public Integer q_type;
        public Integer rn;
        public Double scr_dip;
        public Integer scr_h;
        public Integer scr_w;
        public Integer smile_grade;
        public Integer st_param;
        public Integer st_type;
        public Integer subtype;
        public Integer support_noun;
        public Integer type;
        public Long uid;
        public Long user_id;
        public String user_name;
        public Integer work_tab_id;

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
        public Builder(DataReq dataReq) {
            super(dataReq);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {dataReq};
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
            if (dataReq == null) {
                return;
            }
            this.uid = dataReq.uid;
            this.rn = dataReq.rn;
            this.offset = dataReq.offset;
            this.is_thread = dataReq.is_thread;
            this.need_content = dataReq.need_content;
            this.forum_id = dataReq.forum_id;
            this.begin_time = dataReq.begin_time;
            this.end_time = dataReq.end_time;
            this.subtype = dataReq.subtype;
            this.check_login = dataReq.check_login;
            this.ip_str = dataReq.ip_str;
            this.ip_int = dataReq.ip_int;
            this.module_name = dataReq.module_name;
            this.st_type = dataReq.st_type;
            this.st_param = dataReq.st_param;
            this.smile_grade = dataReq.smile_grade;
            this.support_noun = dataReq.support_noun;
            this.login = dataReq.login;
            this.user_id = dataReq.user_id;
            this.user_name = dataReq.user_name;
            this.no_un = dataReq.no_un;
            this.portrait = dataReq.portrait;
            this.mobile = dataReq.mobile;
            this.email = dataReq.email;
            this.cookie = dataReq.cookie;
            this.pn = dataReq.pn;
            this.f64789common = dataReq.f64788common;
            this.is_twzhibo = dataReq.is_twzhibo;
            this.scr_w = dataReq.scr_w;
            this.scr_h = dataReq.scr_h;
            this.scr_dip = dataReq.scr_dip;
            this.q_type = dataReq.q_type;
            this.is_view_card = dataReq.is_view_card;
            this.last_thread_time = dataReq.last_thread_time;
            this.work_tab_id = dataReq.work_tab_id;
            this.type = dataReq.type;
            this.from_type = dataReq.from_type;
            this.begin_thread_id = dataReq.begin_thread_id;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new DataReq(this, z, null) : (DataReq) invokeZ.objValue;
        }
    }

    /* loaded from: classes4.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(1788041505, "Ltbclient/UserPost/DataReq;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(1788041505, "Ltbclient/UserPost/DataReq;");
                return;
            }
        }
        DEFAULT_UID = 0L;
        DEFAULT_RN = 0;
        DEFAULT_OFFSET = 0;
        DEFAULT_IS_THREAD = 0;
        DEFAULT_NEED_CONTENT = 0;
        DEFAULT_FORUM_ID = 0L;
        DEFAULT_BEGIN_TIME = 0;
        DEFAULT_END_TIME = 0;
        DEFAULT_SUBTYPE = 0;
        DEFAULT_CHECK_LOGIN = 0;
        DEFAULT_IP_INT = 0;
        DEFAULT_ST_TYPE = 0;
        DEFAULT_ST_PARAM = 0;
        DEFAULT_SMILE_GRADE = 0;
        DEFAULT_SUPPORT_NOUN = 0;
        DEFAULT_LOGIN = 0;
        DEFAULT_USER_ID = 0L;
        DEFAULT_NO_UN = 0;
        DEFAULT_PN = 0;
        DEFAULT_IS_TWZHIBO = 0;
        DEFAULT_SCR_W = 0;
        DEFAULT_SCR_H = 0;
        DEFAULT_SCR_DIP = Double.valueOf(0.0d);
        DEFAULT_Q_TYPE = 0;
        DEFAULT_IS_VIEW_CARD = 0;
        DEFAULT_LAST_THREAD_TIME = 0;
        DEFAULT_WORK_TAB_ID = 0;
        DEFAULT_TYPE = 0;
        DEFAULT_FROM_TYPE = 0;
        DEFAULT_BEGIN_THREAD_ID = 0L;
    }

    public /* synthetic */ DataReq(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataReq(Builder builder, boolean z) {
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
            Long l = builder.uid;
            if (l == null) {
                this.uid = DEFAULT_UID;
            } else {
                this.uid = l;
            }
            Integer num = builder.rn;
            if (num == null) {
                this.rn = DEFAULT_RN;
            } else {
                this.rn = num;
            }
            Integer num2 = builder.offset;
            if (num2 == null) {
                this.offset = DEFAULT_OFFSET;
            } else {
                this.offset = num2;
            }
            Integer num3 = builder.is_thread;
            if (num3 == null) {
                this.is_thread = DEFAULT_IS_THREAD;
            } else {
                this.is_thread = num3;
            }
            Integer num4 = builder.need_content;
            if (num4 == null) {
                this.need_content = DEFAULT_NEED_CONTENT;
            } else {
                this.need_content = num4;
            }
            Long l2 = builder.forum_id;
            if (l2 == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = l2;
            }
            Integer num5 = builder.begin_time;
            if (num5 == null) {
                this.begin_time = DEFAULT_BEGIN_TIME;
            } else {
                this.begin_time = num5;
            }
            Integer num6 = builder.end_time;
            if (num6 == null) {
                this.end_time = DEFAULT_END_TIME;
            } else {
                this.end_time = num6;
            }
            Integer num7 = builder.subtype;
            if (num7 == null) {
                this.subtype = DEFAULT_SUBTYPE;
            } else {
                this.subtype = num7;
            }
            Integer num8 = builder.check_login;
            if (num8 == null) {
                this.check_login = DEFAULT_CHECK_LOGIN;
            } else {
                this.check_login = num8;
            }
            String str = builder.ip_str;
            if (str == null) {
                this.ip_str = "";
            } else {
                this.ip_str = str;
            }
            Integer num9 = builder.ip_int;
            if (num9 == null) {
                this.ip_int = DEFAULT_IP_INT;
            } else {
                this.ip_int = num9;
            }
            String str2 = builder.module_name;
            if (str2 == null) {
                this.module_name = "";
            } else {
                this.module_name = str2;
            }
            Integer num10 = builder.st_type;
            if (num10 == null) {
                this.st_type = DEFAULT_ST_TYPE;
            } else {
                this.st_type = num10;
            }
            Integer num11 = builder.st_param;
            if (num11 == null) {
                this.st_param = DEFAULT_ST_PARAM;
            } else {
                this.st_param = num11;
            }
            Integer num12 = builder.smile_grade;
            if (num12 == null) {
                this.smile_grade = DEFAULT_SMILE_GRADE;
            } else {
                this.smile_grade = num12;
            }
            Integer num13 = builder.support_noun;
            if (num13 == null) {
                this.support_noun = DEFAULT_SUPPORT_NOUN;
            } else {
                this.support_noun = num13;
            }
            Integer num14 = builder.login;
            if (num14 == null) {
                this.login = DEFAULT_LOGIN;
            } else {
                this.login = num14;
            }
            Long l3 = builder.user_id;
            if (l3 == null) {
                this.user_id = DEFAULT_USER_ID;
            } else {
                this.user_id = l3;
            }
            String str3 = builder.user_name;
            if (str3 == null) {
                this.user_name = "";
            } else {
                this.user_name = str3;
            }
            Integer num15 = builder.no_un;
            if (num15 == null) {
                this.no_un = DEFAULT_NO_UN;
            } else {
                this.no_un = num15;
            }
            String str4 = builder.portrait;
            if (str4 == null) {
                this.portrait = "";
            } else {
                this.portrait = str4;
            }
            String str5 = builder.mobile;
            if (str5 == null) {
                this.mobile = "";
            } else {
                this.mobile = str5;
            }
            String str6 = builder.email;
            if (str6 == null) {
                this.email = "";
            } else {
                this.email = str6;
            }
            String str7 = builder.cookie;
            if (str7 == null) {
                this.cookie = "";
            } else {
                this.cookie = str7;
            }
            Integer num16 = builder.pn;
            if (num16 == null) {
                this.pn = DEFAULT_PN;
            } else {
                this.pn = num16;
            }
            this.f64788common = builder.f64789common;
            Integer num17 = builder.is_twzhibo;
            if (num17 == null) {
                this.is_twzhibo = DEFAULT_IS_TWZHIBO;
            } else {
                this.is_twzhibo = num17;
            }
            Integer num18 = builder.scr_w;
            if (num18 == null) {
                this.scr_w = DEFAULT_SCR_W;
            } else {
                this.scr_w = num18;
            }
            Integer num19 = builder.scr_h;
            if (num19 == null) {
                this.scr_h = DEFAULT_SCR_H;
            } else {
                this.scr_h = num19;
            }
            Double d2 = builder.scr_dip;
            if (d2 == null) {
                this.scr_dip = DEFAULT_SCR_DIP;
            } else {
                this.scr_dip = d2;
            }
            Integer num20 = builder.q_type;
            if (num20 == null) {
                this.q_type = DEFAULT_Q_TYPE;
            } else {
                this.q_type = num20;
            }
            Integer num21 = builder.is_view_card;
            if (num21 == null) {
                this.is_view_card = DEFAULT_IS_VIEW_CARD;
            } else {
                this.is_view_card = num21;
            }
            Integer num22 = builder.last_thread_time;
            if (num22 == null) {
                this.last_thread_time = DEFAULT_LAST_THREAD_TIME;
            } else {
                this.last_thread_time = num22;
            }
            Integer num23 = builder.work_tab_id;
            if (num23 == null) {
                this.work_tab_id = DEFAULT_WORK_TAB_ID;
            } else {
                this.work_tab_id = num23;
            }
            Integer num24 = builder.type;
            if (num24 == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = num24;
            }
            Integer num25 = builder.from_type;
            if (num25 == null) {
                this.from_type = DEFAULT_FROM_TYPE;
            } else {
                this.from_type = num25;
            }
            Long l4 = builder.begin_thread_id;
            if (l4 == null) {
                this.begin_thread_id = DEFAULT_BEGIN_THREAD_ID;
                return;
            } else {
                this.begin_thread_id = l4;
                return;
            }
        }
        this.uid = builder.uid;
        this.rn = builder.rn;
        this.offset = builder.offset;
        this.is_thread = builder.is_thread;
        this.need_content = builder.need_content;
        this.forum_id = builder.forum_id;
        this.begin_time = builder.begin_time;
        this.end_time = builder.end_time;
        this.subtype = builder.subtype;
        this.check_login = builder.check_login;
        this.ip_str = builder.ip_str;
        this.ip_int = builder.ip_int;
        this.module_name = builder.module_name;
        this.st_type = builder.st_type;
        this.st_param = builder.st_param;
        this.smile_grade = builder.smile_grade;
        this.support_noun = builder.support_noun;
        this.login = builder.login;
        this.user_id = builder.user_id;
        this.user_name = builder.user_name;
        this.no_un = builder.no_un;
        this.portrait = builder.portrait;
        this.mobile = builder.mobile;
        this.email = builder.email;
        this.cookie = builder.cookie;
        this.pn = builder.pn;
        this.f64788common = builder.f64789common;
        this.is_twzhibo = builder.is_twzhibo;
        this.scr_w = builder.scr_w;
        this.scr_h = builder.scr_h;
        this.scr_dip = builder.scr_dip;
        this.q_type = builder.q_type;
        this.is_view_card = builder.is_view_card;
        this.last_thread_time = builder.last_thread_time;
        this.work_tab_id = builder.work_tab_id;
        this.type = builder.type;
        this.from_type = builder.from_type;
        this.begin_thread_id = builder.begin_thread_id;
    }
}
