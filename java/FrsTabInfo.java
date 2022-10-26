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
public final class FrsTabInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_CLICK_MONITOR_URL = "";
    public static final String DEFAULT_DEMOTE_URL = "";
    public static final String DEFAULT_EXPOSURE_MONITOR_URL = "";
    public static final Integer DEFAULT_IS_DEFAULT;
    public static final Integer DEFAULT_IS_GENERAL_TAB;
    public static final Integer DEFAULT_NEED_PAGE;
    public static final String DEFAULT_TAB_CODE = "";
    public static final String DEFAULT_TAB_GID = "";
    public static final Integer DEFAULT_TAB_ID;
    public static final String DEFAULT_TAB_NAME = "";
    public static final String DEFAULT_TAB_TITLE = "";
    public static final Integer DEFAULT_TAB_TYPE;
    public static final String DEFAULT_TAB_URL = "";
    public static final Integer DEFAULT_TAB_VERSION;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 14, type = Message.Datatype.STRING)
    public final String click_monitor_url;
    @ProtoField(tag = 15, type = Message.Datatype.STRING)
    public final String demote_url;
    @ProtoField(tag = 13, type = Message.Datatype.STRING)
    public final String exposure_monitor_url;
    @ProtoField(tag = 12)
    public final TabPic head_pics;
    @ProtoField(tag = 10, type = Message.Datatype.INT32)
    public final Integer is_default;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer is_general_tab;
    @ProtoField(tag = 11, type = Message.Datatype.INT32)
    public final Integer need_page;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String tab_code;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String tab_gid;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer tab_id;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String tab_name;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String tab_title;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer tab_type;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String tab_url;
    @ProtoField(tag = 9, type = Message.Datatype.UINT32)
    public final Integer tab_version;

    /* loaded from: classes9.dex */
    public /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public final class Builder extends Message.Builder {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String click_monitor_url;
        public String demote_url;
        public String exposure_monitor_url;
        public TabPic head_pics;
        public Integer is_default;
        public Integer is_general_tab;
        public Integer need_page;
        public String tab_code;
        public String tab_gid;
        public Integer tab_id;
        public String tab_name;
        public String tab_title;
        public Integer tab_type;
        public String tab_url;
        public Integer tab_version;

        public Builder() {
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                interceptable.invokeUnInit(65536, newInitContext);
                int i = newInitContext.flag;
                if ((i & 1) != 0) {
                    int i2 = i & 2;
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65536, newInitContext);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(FrsTabInfo frsTabInfo) {
            super(frsTabInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {frsTabInfo};
                interceptable.invokeUnInit(65537, newInitContext);
                int i = newInitContext.flag;
                if ((i & 1) != 0) {
                    int i2 = i & 2;
                    super((Message) newInitContext.callArgs[0]);
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65537, newInitContext);
                    return;
                }
            }
            if (frsTabInfo == null) {
                return;
            }
            this.tab_id = frsTabInfo.tab_id;
            this.tab_type = frsTabInfo.tab_type;
            this.tab_name = frsTabInfo.tab_name;
            this.tab_url = frsTabInfo.tab_url;
            this.tab_gid = frsTabInfo.tab_gid;
            this.tab_title = frsTabInfo.tab_title;
            this.is_general_tab = frsTabInfo.is_general_tab;
            this.tab_code = frsTabInfo.tab_code;
            this.tab_version = frsTabInfo.tab_version;
            this.is_default = frsTabInfo.is_default;
            this.need_page = frsTabInfo.need_page;
            this.head_pics = frsTabInfo.head_pics;
            this.exposure_monitor_url = frsTabInfo.exposure_monitor_url;
            this.click_monitor_url = frsTabInfo.click_monitor_url;
            this.demote_url = frsTabInfo.demote_url;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FrsTabInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new FrsTabInfo(this, z, null);
            }
            return (FrsTabInfo) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-481893931, "Ltbclient/FrsTabInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-481893931, "Ltbclient/FrsTabInfo;");
                return;
            }
        }
        DEFAULT_TAB_ID = 0;
        DEFAULT_TAB_TYPE = 0;
        DEFAULT_IS_GENERAL_TAB = 0;
        DEFAULT_TAB_VERSION = 0;
        DEFAULT_IS_DEFAULT = 0;
        DEFAULT_NEED_PAGE = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FrsTabInfo(Builder builder, boolean z) {
        super(builder);
        Interceptable interceptable = $ic;
        if (interceptable != null) {
            InitContext newInitContext = TitanRuntime.newInitContext();
            newInitContext.initArgs = r2;
            Object[] objArr = {builder, Boolean.valueOf(z)};
            interceptable.invokeUnInit(65537, newInitContext);
            int i = newInitContext.flag;
            if ((i & 1) != 0) {
                int i2 = i & 2;
                super((Message.Builder) newInitContext.callArgs[0]);
                newInitContext.thisArg = this;
                interceptable.invokeInitBody(65537, newInitContext);
                return;
            }
        }
        if (z) {
            Integer num = builder.tab_id;
            if (num == null) {
                this.tab_id = DEFAULT_TAB_ID;
            } else {
                this.tab_id = num;
            }
            Integer num2 = builder.tab_type;
            if (num2 == null) {
                this.tab_type = DEFAULT_TAB_TYPE;
            } else {
                this.tab_type = num2;
            }
            String str = builder.tab_name;
            if (str == null) {
                this.tab_name = "";
            } else {
                this.tab_name = str;
            }
            String str2 = builder.tab_url;
            if (str2 == null) {
                this.tab_url = "";
            } else {
                this.tab_url = str2;
            }
            String str3 = builder.tab_gid;
            if (str3 == null) {
                this.tab_gid = "";
            } else {
                this.tab_gid = str3;
            }
            String str4 = builder.tab_title;
            if (str4 == null) {
                this.tab_title = "";
            } else {
                this.tab_title = str4;
            }
            Integer num3 = builder.is_general_tab;
            if (num3 == null) {
                this.is_general_tab = DEFAULT_IS_GENERAL_TAB;
            } else {
                this.is_general_tab = num3;
            }
            String str5 = builder.tab_code;
            if (str5 == null) {
                this.tab_code = "";
            } else {
                this.tab_code = str5;
            }
            Integer num4 = builder.tab_version;
            if (num4 == null) {
                this.tab_version = DEFAULT_TAB_VERSION;
            } else {
                this.tab_version = num4;
            }
            Integer num5 = builder.is_default;
            if (num5 == null) {
                this.is_default = DEFAULT_IS_DEFAULT;
            } else {
                this.is_default = num5;
            }
            Integer num6 = builder.need_page;
            if (num6 == null) {
                this.need_page = DEFAULT_NEED_PAGE;
            } else {
                this.need_page = num6;
            }
            this.head_pics = builder.head_pics;
            String str6 = builder.exposure_monitor_url;
            if (str6 == null) {
                this.exposure_monitor_url = "";
            } else {
                this.exposure_monitor_url = str6;
            }
            String str7 = builder.click_monitor_url;
            if (str7 == null) {
                this.click_monitor_url = "";
            } else {
                this.click_monitor_url = str7;
            }
            String str8 = builder.demote_url;
            if (str8 == null) {
                this.demote_url = "";
                return;
            } else {
                this.demote_url = str8;
                return;
            }
        }
        this.tab_id = builder.tab_id;
        this.tab_type = builder.tab_type;
        this.tab_name = builder.tab_name;
        this.tab_url = builder.tab_url;
        this.tab_gid = builder.tab_gid;
        this.tab_title = builder.tab_title;
        this.is_general_tab = builder.is_general_tab;
        this.tab_code = builder.tab_code;
        this.tab_version = builder.tab_version;
        this.is_default = builder.is_default;
        this.need_page = builder.need_page;
        this.head_pics = builder.head_pics;
        this.exposure_monitor_url = builder.exposure_monitor_url;
        this.click_monitor_url = builder.click_monitor_url;
        this.demote_url = builder.demote_url;
    }

    public /* synthetic */ FrsTabInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
