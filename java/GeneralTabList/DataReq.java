package tbclient.GeneralTabList;

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
/* loaded from: classes2.dex */
public final class DataReq extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_AD_EXT_PARAMS = "";
    public static final Long DEFAULT_FORUM_ID;
    public static final Integer DEFAULT_IS_DEFAULT_NAVTAB;
    public static final Integer DEFAULT_IS_GENERAL_TAB;
    public static final Long DEFAULT_LAST_THREAD_ID;
    public static final Integer DEFAULT_PN;
    public static final Integer DEFAULT_RN;
    public static final Integer DEFAULT_SCR_DIP;
    public static final Integer DEFAULT_SCR_H;
    public static final Integer DEFAULT_SCR_W;
    public static final Integer DEFAULT_SORT_TYPE;
    public static final Integer DEFAULT_TAB_ID;
    public static final String DEFAULT_TAB_NAME = "";
    public static final Integer DEFAULT_TAB_TYPE;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 15, type = Message.Datatype.STRING)
    public final String ad_ext_params;
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f79388common;
    @ProtoField(tag = 3, type = Message.Datatype.INT64)
    public final Long forum_id;
    @ProtoField(tag = 10, type = Message.Datatype.INT32)
    public final Integer is_default_navtab;
    @ProtoField(tag = 12, type = Message.Datatype.INT32)
    public final Integer is_general_tab;
    @ProtoField(tag = 9, type = Message.Datatype.INT64)
    public final Long last_thread_id;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer pn;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer rn;
    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer scr_dip;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer scr_h;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer scr_w;
    @ProtoField(tag = 13, type = Message.Datatype.INT32)
    public final Integer sort_type;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer tab_id;
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String tab_name;
    @ProtoField(tag = 14, type = Message.Datatype.INT32)
    public final Integer tab_type;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String ad_ext_params;

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f79389common;
        public Long forum_id;
        public Integer is_default_navtab;
        public Integer is_general_tab;
        public Long last_thread_id;
        public Integer pn;
        public Integer rn;
        public Integer scr_dip;
        public Integer scr_h;
        public Integer scr_w;
        public Integer sort_type;
        public Integer tab_id;
        public String tab_name;
        public Integer tab_type;

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
            this.f79389common = dataReq.f79388common;
            this.tab_id = dataReq.tab_id;
            this.forum_id = dataReq.forum_id;
            this.pn = dataReq.pn;
            this.rn = dataReq.rn;
            this.scr_w = dataReq.scr_w;
            this.scr_h = dataReq.scr_h;
            this.scr_dip = dataReq.scr_dip;
            this.last_thread_id = dataReq.last_thread_id;
            this.is_default_navtab = dataReq.is_default_navtab;
            this.tab_name = dataReq.tab_name;
            this.is_general_tab = dataReq.is_general_tab;
            this.sort_type = dataReq.sort_type;
            this.tab_type = dataReq.tab_type;
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

    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(1617356769, "Ltbclient/GeneralTabList/DataReq;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(1617356769, "Ltbclient/GeneralTabList/DataReq;");
                return;
            }
        }
        DEFAULT_TAB_ID = 0;
        DEFAULT_FORUM_ID = 0L;
        DEFAULT_PN = 0;
        DEFAULT_RN = 0;
        DEFAULT_SCR_W = 0;
        DEFAULT_SCR_H = 0;
        DEFAULT_SCR_DIP = 0;
        DEFAULT_LAST_THREAD_ID = 0L;
        DEFAULT_IS_DEFAULT_NAVTAB = 0;
        DEFAULT_IS_GENERAL_TAB = 0;
        DEFAULT_SORT_TYPE = 0;
        DEFAULT_TAB_TYPE = 0;
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
            this.f79388common = builder.f79389common;
            Integer num = builder.tab_id;
            if (num == null) {
                this.tab_id = DEFAULT_TAB_ID;
            } else {
                this.tab_id = num;
            }
            Long l = builder.forum_id;
            if (l == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = l;
            }
            Integer num2 = builder.pn;
            if (num2 == null) {
                this.pn = DEFAULT_PN;
            } else {
                this.pn = num2;
            }
            Integer num3 = builder.rn;
            if (num3 == null) {
                this.rn = DEFAULT_RN;
            } else {
                this.rn = num3;
            }
            Integer num4 = builder.scr_w;
            if (num4 == null) {
                this.scr_w = DEFAULT_SCR_W;
            } else {
                this.scr_w = num4;
            }
            Integer num5 = builder.scr_h;
            if (num5 == null) {
                this.scr_h = DEFAULT_SCR_H;
            } else {
                this.scr_h = num5;
            }
            Integer num6 = builder.scr_dip;
            if (num6 == null) {
                this.scr_dip = DEFAULT_SCR_DIP;
            } else {
                this.scr_dip = num6;
            }
            Long l2 = builder.last_thread_id;
            if (l2 == null) {
                this.last_thread_id = DEFAULT_LAST_THREAD_ID;
            } else {
                this.last_thread_id = l2;
            }
            Integer num7 = builder.is_default_navtab;
            if (num7 == null) {
                this.is_default_navtab = DEFAULT_IS_DEFAULT_NAVTAB;
            } else {
                this.is_default_navtab = num7;
            }
            String str = builder.tab_name;
            if (str == null) {
                this.tab_name = "";
            } else {
                this.tab_name = str;
            }
            Integer num8 = builder.is_general_tab;
            if (num8 == null) {
                this.is_general_tab = DEFAULT_IS_GENERAL_TAB;
            } else {
                this.is_general_tab = num8;
            }
            Integer num9 = builder.sort_type;
            if (num9 == null) {
                this.sort_type = DEFAULT_SORT_TYPE;
            } else {
                this.sort_type = num9;
            }
            Integer num10 = builder.tab_type;
            if (num10 == null) {
                this.tab_type = DEFAULT_TAB_TYPE;
            } else {
                this.tab_type = num10;
            }
            String str2 = builder.ad_ext_params;
            if (str2 == null) {
                this.ad_ext_params = "";
                return;
            } else {
                this.ad_ext_params = str2;
                return;
            }
        }
        this.f79388common = builder.f79389common;
        this.tab_id = builder.tab_id;
        this.forum_id = builder.forum_id;
        this.pn = builder.pn;
        this.rn = builder.rn;
        this.scr_w = builder.scr_w;
        this.scr_h = builder.scr_h;
        this.scr_dip = builder.scr_dip;
        this.last_thread_id = builder.last_thread_id;
        this.is_default_navtab = builder.is_default_navtab;
        this.tab_name = builder.tab_name;
        this.is_general_tab = builder.is_general_tab;
        this.sort_type = builder.sort_type;
        this.tab_type = builder.tab_type;
        this.ad_ext_params = builder.ad_ext_params;
    }
}
