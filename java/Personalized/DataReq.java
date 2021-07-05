package tbclient.Personalized;

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
import java.util.Collections;
import java.util.List;
import tbclient.AppPosInfo;
import tbclient.CommonReq;
/* loaded from: classes10.dex */
public final class DataReq extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_AD_CONTEXT_LIST = "";
    public static final String DEFAULT_AD_EXT_PARAMS = "";
    public static final String DEFAULT_AGE_TAG = "";
    public static final String DEFAULT_DA_IDFA = "";
    public static final String DEFAULT_FIRST_DIR = "";
    public static final Long DEFAULT_FROM_TID;
    public static final List<String> DEFAULT_INTEREST_TAG;
    public static final String DEFAULT_INVOKE_SOURCE = "";
    public static final Integer DEFAULT_ISSDK;
    public static final String DEFAULT_LASTIDS = "";
    public static final Integer DEFAULT_LOAD_TYPE;
    public static final Integer DEFAULT_NEED_AGE_MODULE;
    public static final Integer DEFAULT_NEED_FORUMLIST;
    public static final Integer DEFAULT_NEED_TAGS;
    public static final Integer DEFAULT_NEW_INSTALL;
    public static final Integer DEFAULT_NEW_NET_TYPE;
    public static final Integer DEFAULT_PAGE_THREAD_COUNT;
    public static final String DEFAULT_PLATFORM = "";
    public static final Integer DEFAULT_PN;
    public static final Integer DEFAULT_PRE_AD_THREAD_COUNT;
    public static final String DEFAULT_QUERY_EQID = "";
    public static final Integer DEFAULT_Q_TYPE;
    public static final Integer DEFAULT_REQUEST_TIMES;
    public static final Double DEFAULT_SCR_DIP;
    public static final Integer DEFAULT_SCR_H;
    public static final Integer DEFAULT_SCR_W;
    public static final String DEFAULT_SECOND_DIR = "";
    public static final String DEFAULT_SEX_TAG = "";
    public static final String DEFAULT_SHOUBAI_CUID = "";
    public static final Integer DEFAULT_SUG_COUNT;
    public static final Integer DEFAULT_TAG_CHANGED;
    public static final Integer DEFAULT_TAG_CODE;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 30, type = Message.Datatype.STRING)
    public final String ad_context_list;
    @ProtoField(tag = 37, type = Message.Datatype.STRING)
    public final String ad_ext_params;
    @ProtoField(tag = 18, type = Message.Datatype.STRING)
    public final String age_tag;
    @ProtoField(tag = 36)
    public final AppPosInfo app_pos;
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f76582common;
    @ProtoField(tag = 14, type = Message.Datatype.STRING)
    public final String da_idfa;
    @ProtoField(tag = 34, type = Message.Datatype.STRING)
    public final String first_dir;
    @ProtoField(tag = 25, type = Message.Datatype.INT64)
    public final Long from_tid;
    @ProtoField(label = Message.Label.REPEATED, tag = 20, type = Message.Datatype.STRING)
    public final List<String> interest_tag;
    @ProtoField(tag = 29, type = Message.Datatype.STRING)
    public final String invoke_source;
    @ProtoField(tag = 13, type = Message.Datatype.INT32)
    public final Integer issdk;
    @ProtoField(tag = 12, type = Message.Datatype.STRING)
    public final String lastids;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer load_type;
    @ProtoField(tag = 19, type = Message.Datatype.UINT32)
    public final Integer need_age_module;
    @ProtoField(tag = 22, type = Message.Datatype.UINT32)
    public final Integer need_forumlist;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer need_tags;
    @ProtoField(tag = 27, type = Message.Datatype.INT32)
    public final Integer new_install;
    @ProtoField(tag = 23, type = Message.Datatype.UINT32)
    public final Integer new_net_type;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer page_thread_count;
    @ProtoField(tag = 15, type = Message.Datatype.STRING)
    public final String platform;
    @ProtoField(tag = 6, type = Message.Datatype.UINT32)
    public final Integer pn;
    @ProtoField(tag = 26, type = Message.Datatype.INT32)
    public final Integer pre_ad_thread_count;
    @ProtoField(tag = 11, type = Message.Datatype.INT32)
    public final Integer q_type;
    @ProtoField(tag = 33, type = Message.Datatype.STRING)
    public final String query_eqid;
    @ProtoField(tag = 28, type = Message.Datatype.INT32)
    public final Integer request_times;
    @ProtoField(tag = 10, type = Message.Datatype.DOUBLE)
    public final Double scr_dip;
    @ProtoField(tag = 9, type = Message.Datatype.INT32)
    public final Integer scr_h;
    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer scr_w;
    @ProtoField(tag = 35, type = Message.Datatype.STRING)
    public final String second_dir;
    @ProtoField(tag = 17, type = Message.Datatype.STRING)
    public final String sex_tag;
    @ProtoField(tag = 24, type = Message.Datatype.STRING)
    public final String shoubai_cuid;
    @ProtoField(tag = 7, type = Message.Datatype.UINT32)
    public final Integer sug_count;
    @ProtoField(tag = 21, type = Message.Datatype.UINT32)
    public final Integer tag_changed;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer tag_code;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String ad_context_list;
        public String ad_ext_params;
        public String age_tag;
        public AppPosInfo app_pos;

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f76583common;
        public String da_idfa;
        public String first_dir;
        public Long from_tid;
        public List<String> interest_tag;
        public String invoke_source;
        public Integer issdk;
        public String lastids;
        public Integer load_type;
        public Integer need_age_module;
        public Integer need_forumlist;
        public Integer need_tags;
        public Integer new_install;
        public Integer new_net_type;
        public Integer page_thread_count;
        public String platform;
        public Integer pn;
        public Integer pre_ad_thread_count;
        public Integer q_type;
        public String query_eqid;
        public Integer request_times;
        public Double scr_dip;
        public Integer scr_h;
        public Integer scr_w;
        public String second_dir;
        public String sex_tag;
        public String shoubai_cuid;
        public Integer sug_count;
        public Integer tag_changed;
        public Integer tag_code;

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
            this.f76583common = dataReq.f76582common;
            this.tag_code = dataReq.tag_code;
            this.need_tags = dataReq.need_tags;
            this.load_type = dataReq.load_type;
            this.page_thread_count = dataReq.page_thread_count;
            this.pn = dataReq.pn;
            this.sug_count = dataReq.sug_count;
            this.scr_w = dataReq.scr_w;
            this.scr_h = dataReq.scr_h;
            this.scr_dip = dataReq.scr_dip;
            this.q_type = dataReq.q_type;
            this.lastids = dataReq.lastids;
            this.issdk = dataReq.issdk;
            this.da_idfa = dataReq.da_idfa;
            this.platform = dataReq.platform;
            this.sex_tag = dataReq.sex_tag;
            this.age_tag = dataReq.age_tag;
            this.need_age_module = dataReq.need_age_module;
            this.interest_tag = Message.copyOf(dataReq.interest_tag);
            this.tag_changed = dataReq.tag_changed;
            this.need_forumlist = dataReq.need_forumlist;
            this.new_net_type = dataReq.new_net_type;
            this.shoubai_cuid = dataReq.shoubai_cuid;
            this.from_tid = dataReq.from_tid;
            this.pre_ad_thread_count = dataReq.pre_ad_thread_count;
            this.new_install = dataReq.new_install;
            this.request_times = dataReq.request_times;
            this.invoke_source = dataReq.invoke_source;
            this.ad_context_list = dataReq.ad_context_list;
            this.query_eqid = dataReq.query_eqid;
            this.first_dir = dataReq.first_dir;
            this.second_dir = dataReq.second_dir;
            this.app_pos = dataReq.app_pos;
            this.ad_ext_params = dataReq.ad_ext_params;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new DataReq(this, z, null) : (DataReq) invokeZ.objValue;
        }
    }

    /* loaded from: classes10.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-397390084, "Ltbclient/Personalized/DataReq;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-397390084, "Ltbclient/Personalized/DataReq;");
                return;
            }
        }
        DEFAULT_TAG_CODE = 0;
        DEFAULT_NEED_TAGS = 0;
        DEFAULT_LOAD_TYPE = 0;
        DEFAULT_PAGE_THREAD_COUNT = 0;
        DEFAULT_PN = 0;
        DEFAULT_SUG_COUNT = 0;
        DEFAULT_SCR_W = 0;
        DEFAULT_SCR_H = 0;
        DEFAULT_SCR_DIP = Double.valueOf(0.0d);
        DEFAULT_Q_TYPE = 0;
        DEFAULT_ISSDK = 0;
        DEFAULT_NEED_AGE_MODULE = 0;
        DEFAULT_INTEREST_TAG = Collections.emptyList();
        DEFAULT_TAG_CHANGED = 0;
        DEFAULT_NEED_FORUMLIST = 0;
        DEFAULT_NEW_NET_TYPE = 0;
        DEFAULT_FROM_TID = 0L;
        DEFAULT_PRE_AD_THREAD_COUNT = 0;
        DEFAULT_NEW_INSTALL = 0;
        DEFAULT_REQUEST_TIMES = 0;
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
            this.f76582common = builder.f76583common;
            Integer num = builder.tag_code;
            if (num == null) {
                this.tag_code = DEFAULT_TAG_CODE;
            } else {
                this.tag_code = num;
            }
            Integer num2 = builder.need_tags;
            if (num2 == null) {
                this.need_tags = DEFAULT_NEED_TAGS;
            } else {
                this.need_tags = num2;
            }
            Integer num3 = builder.load_type;
            if (num3 == null) {
                this.load_type = DEFAULT_LOAD_TYPE;
            } else {
                this.load_type = num3;
            }
            Integer num4 = builder.page_thread_count;
            if (num4 == null) {
                this.page_thread_count = DEFAULT_PAGE_THREAD_COUNT;
            } else {
                this.page_thread_count = num4;
            }
            Integer num5 = builder.pn;
            if (num5 == null) {
                this.pn = DEFAULT_PN;
            } else {
                this.pn = num5;
            }
            Integer num6 = builder.sug_count;
            if (num6 == null) {
                this.sug_count = DEFAULT_SUG_COUNT;
            } else {
                this.sug_count = num6;
            }
            Integer num7 = builder.scr_w;
            if (num7 == null) {
                this.scr_w = DEFAULT_SCR_W;
            } else {
                this.scr_w = num7;
            }
            Integer num8 = builder.scr_h;
            if (num8 == null) {
                this.scr_h = DEFAULT_SCR_H;
            } else {
                this.scr_h = num8;
            }
            Double d2 = builder.scr_dip;
            if (d2 == null) {
                this.scr_dip = DEFAULT_SCR_DIP;
            } else {
                this.scr_dip = d2;
            }
            Integer num9 = builder.q_type;
            if (num9 == null) {
                this.q_type = DEFAULT_Q_TYPE;
            } else {
                this.q_type = num9;
            }
            String str = builder.lastids;
            if (str == null) {
                this.lastids = "";
            } else {
                this.lastids = str;
            }
            Integer num10 = builder.issdk;
            if (num10 == null) {
                this.issdk = DEFAULT_ISSDK;
            } else {
                this.issdk = num10;
            }
            String str2 = builder.da_idfa;
            if (str2 == null) {
                this.da_idfa = "";
            } else {
                this.da_idfa = str2;
            }
            String str3 = builder.platform;
            if (str3 == null) {
                this.platform = "";
            } else {
                this.platform = str3;
            }
            String str4 = builder.sex_tag;
            if (str4 == null) {
                this.sex_tag = "";
            } else {
                this.sex_tag = str4;
            }
            String str5 = builder.age_tag;
            if (str5 == null) {
                this.age_tag = "";
            } else {
                this.age_tag = str5;
            }
            Integer num11 = builder.need_age_module;
            if (num11 == null) {
                this.need_age_module = DEFAULT_NEED_AGE_MODULE;
            } else {
                this.need_age_module = num11;
            }
            List<String> list = builder.interest_tag;
            if (list == null) {
                this.interest_tag = DEFAULT_INTEREST_TAG;
            } else {
                this.interest_tag = Message.immutableCopyOf(list);
            }
            Integer num12 = builder.tag_changed;
            if (num12 == null) {
                this.tag_changed = DEFAULT_TAG_CHANGED;
            } else {
                this.tag_changed = num12;
            }
            Integer num13 = builder.need_forumlist;
            if (num13 == null) {
                this.need_forumlist = DEFAULT_NEED_FORUMLIST;
            } else {
                this.need_forumlist = num13;
            }
            Integer num14 = builder.new_net_type;
            if (num14 == null) {
                this.new_net_type = DEFAULT_NEW_NET_TYPE;
            } else {
                this.new_net_type = num14;
            }
            String str6 = builder.shoubai_cuid;
            if (str6 == null) {
                this.shoubai_cuid = "";
            } else {
                this.shoubai_cuid = str6;
            }
            Long l = builder.from_tid;
            if (l == null) {
                this.from_tid = DEFAULT_FROM_TID;
            } else {
                this.from_tid = l;
            }
            Integer num15 = builder.pre_ad_thread_count;
            if (num15 == null) {
                this.pre_ad_thread_count = DEFAULT_PRE_AD_THREAD_COUNT;
            } else {
                this.pre_ad_thread_count = num15;
            }
            Integer num16 = builder.new_install;
            if (num16 == null) {
                this.new_install = DEFAULT_NEW_INSTALL;
            } else {
                this.new_install = num16;
            }
            Integer num17 = builder.request_times;
            if (num17 == null) {
                this.request_times = DEFAULT_REQUEST_TIMES;
            } else {
                this.request_times = num17;
            }
            String str7 = builder.invoke_source;
            if (str7 == null) {
                this.invoke_source = "";
            } else {
                this.invoke_source = str7;
            }
            String str8 = builder.ad_context_list;
            if (str8 == null) {
                this.ad_context_list = "";
            } else {
                this.ad_context_list = str8;
            }
            String str9 = builder.query_eqid;
            if (str9 == null) {
                this.query_eqid = "";
            } else {
                this.query_eqid = str9;
            }
            String str10 = builder.first_dir;
            if (str10 == null) {
                this.first_dir = "";
            } else {
                this.first_dir = str10;
            }
            String str11 = builder.second_dir;
            if (str11 == null) {
                this.second_dir = "";
            } else {
                this.second_dir = str11;
            }
            this.app_pos = builder.app_pos;
            String str12 = builder.ad_ext_params;
            if (str12 == null) {
                this.ad_ext_params = "";
                return;
            } else {
                this.ad_ext_params = str12;
                return;
            }
        }
        this.f76582common = builder.f76583common;
        this.tag_code = builder.tag_code;
        this.need_tags = builder.need_tags;
        this.load_type = builder.load_type;
        this.page_thread_count = builder.page_thread_count;
        this.pn = builder.pn;
        this.sug_count = builder.sug_count;
        this.scr_w = builder.scr_w;
        this.scr_h = builder.scr_h;
        this.scr_dip = builder.scr_dip;
        this.q_type = builder.q_type;
        this.lastids = builder.lastids;
        this.issdk = builder.issdk;
        this.da_idfa = builder.da_idfa;
        this.platform = builder.platform;
        this.sex_tag = builder.sex_tag;
        this.age_tag = builder.age_tag;
        this.need_age_module = builder.need_age_module;
        this.interest_tag = Message.immutableCopyOf(builder.interest_tag);
        this.tag_changed = builder.tag_changed;
        this.need_forumlist = builder.need_forumlist;
        this.new_net_type = builder.new_net_type;
        this.shoubai_cuid = builder.shoubai_cuid;
        this.from_tid = builder.from_tid;
        this.pre_ad_thread_count = builder.pre_ad_thread_count;
        this.new_install = builder.new_install;
        this.request_times = builder.request_times;
        this.invoke_source = builder.invoke_source;
        this.ad_context_list = builder.ad_context_list;
        this.query_eqid = builder.query_eqid;
        this.first_dir = builder.first_dir;
        this.second_dir = builder.second_dir;
        this.app_pos = builder.app_pos;
        this.ad_ext_params = builder.ad_ext_params;
    }
}
