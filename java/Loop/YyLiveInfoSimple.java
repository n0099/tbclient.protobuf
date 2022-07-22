package tbclient.Loop;

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
import tbclient.YyExt;
/* loaded from: classes8.dex */
public final class YyLiveInfoSimple extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_BTN_TEXT = "";
    public static final Integer DEFAULT_DAY_MAX_NUM;
    public static final String DEFAULT_DESC = "";
    public static final Integer DEFAULT_DESC_GLOBAL_MAX_NUM;
    public static final Integer DEFAULT_DISAPPEAR_SECOND;
    public static final Integer DEFAULT_DISAPPEAR_TYPE;
    public static final String DEFAULT_FEED_ID = "";
    public static final String DEFAULT_ICON_SCHEME = "";
    public static final String DEFAULT_ICON_URL = "";
    public static final Integer DEFAULT_MIN_STEP_SECOND;
    public static final String DEFAULT_PORTRAIT = "";
    public static final Integer DEFAULT_REMIND_TYPE;
    public static final Long DEFAULT_ROOM_ID;
    public static final Integer DEFAULT_SHOW_PAGE;
    public static final Integer DEFAULT_SINGLE_OPEN_MAX_NUM;
    public static final String DEFAULT_TITLE = "";
    public static final String DEFAULT_USER_NAME = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 15, type = Message.Datatype.STRING)
    public final String btn_text;
    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer day_max_num;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String desc;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer desc_global_max_num;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer disappear_second;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer disappear_type;
    @ProtoField(tag = 16, type = Message.Datatype.STRING)
    public final String feed_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String icon_scheme;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String icon_url;
    @ProtoField(tag = 9, type = Message.Datatype.INT32)
    public final Integer min_step_second;
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String portrait;
    @ProtoField(tag = 17, type = Message.Datatype.INT32)
    public final Integer remind_type;
    @ProtoField(tag = 14, type = Message.Datatype.UINT64)
    public final Long room_id;
    @ProtoField(tag = 18, type = Message.Datatype.INT32)
    public final Integer show_page;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer single_open_max_num;
    @ProtoField(tag = 12, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String user_name;
    @ProtoField(tag = 13)
    public final YyExt yy_ext;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<YyLiveInfoSimple> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String btn_text;
        public Integer day_max_num;
        public String desc;
        public Integer desc_global_max_num;
        public Integer disappear_second;
        public Integer disappear_type;
        public String feed_id;
        public String icon_scheme;
        public String icon_url;
        public Integer min_step_second;
        public String portrait;
        public Integer remind_type;
        public Long room_id;
        public Integer show_page;
        public Integer single_open_max_num;
        public String title;
        public String user_name;
        public YyExt yy_ext;

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
        public Builder(YyLiveInfoSimple yyLiveInfoSimple) {
            super(yyLiveInfoSimple);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {yyLiveInfoSimple};
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
            if (yyLiveInfoSimple == null) {
                return;
            }
            this.icon_url = yyLiveInfoSimple.icon_url;
            this.icon_scheme = yyLiveInfoSimple.icon_scheme;
            this.disappear_type = yyLiveInfoSimple.disappear_type;
            this.disappear_second = yyLiveInfoSimple.disappear_second;
            this.desc = yyLiveInfoSimple.desc;
            this.desc_global_max_num = yyLiveInfoSimple.desc_global_max_num;
            this.single_open_max_num = yyLiveInfoSimple.single_open_max_num;
            this.day_max_num = yyLiveInfoSimple.day_max_num;
            this.min_step_second = yyLiveInfoSimple.min_step_second;
            this.user_name = yyLiveInfoSimple.user_name;
            this.portrait = yyLiveInfoSimple.portrait;
            this.title = yyLiveInfoSimple.title;
            this.yy_ext = yyLiveInfoSimple.yy_ext;
            this.room_id = yyLiveInfoSimple.room_id;
            this.btn_text = yyLiveInfoSimple.btn_text;
            this.feed_id = yyLiveInfoSimple.feed_id;
            this.remind_type = yyLiveInfoSimple.remind_type;
            this.show_page = yyLiveInfoSimple.show_page;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public YyLiveInfoSimple build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new YyLiveInfoSimple(this, z, null) : (YyLiveInfoSimple) invokeZ.objValue;
        }
    }

    /* loaded from: classes8.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-631701746, "Ltbclient/Loop/YyLiveInfoSimple;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-631701746, "Ltbclient/Loop/YyLiveInfoSimple;");
                return;
            }
        }
        DEFAULT_DISAPPEAR_TYPE = 0;
        DEFAULT_DISAPPEAR_SECOND = 0;
        DEFAULT_DESC_GLOBAL_MAX_NUM = 0;
        DEFAULT_SINGLE_OPEN_MAX_NUM = 0;
        DEFAULT_DAY_MAX_NUM = 0;
        DEFAULT_MIN_STEP_SECOND = 0;
        DEFAULT_ROOM_ID = 0L;
        DEFAULT_REMIND_TYPE = 0;
        DEFAULT_SHOW_PAGE = 0;
    }

    public /* synthetic */ YyLiveInfoSimple(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YyLiveInfoSimple(Builder builder, boolean z) {
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
            String str = builder.icon_url;
            if (str == null) {
                this.icon_url = "";
            } else {
                this.icon_url = str;
            }
            String str2 = builder.icon_scheme;
            if (str2 == null) {
                this.icon_scheme = "";
            } else {
                this.icon_scheme = str2;
            }
            Integer num = builder.disappear_type;
            if (num == null) {
                this.disappear_type = DEFAULT_DISAPPEAR_TYPE;
            } else {
                this.disappear_type = num;
            }
            Integer num2 = builder.disappear_second;
            if (num2 == null) {
                this.disappear_second = DEFAULT_DISAPPEAR_SECOND;
            } else {
                this.disappear_second = num2;
            }
            String str3 = builder.desc;
            if (str3 == null) {
                this.desc = "";
            } else {
                this.desc = str3;
            }
            Integer num3 = builder.desc_global_max_num;
            if (num3 == null) {
                this.desc_global_max_num = DEFAULT_DESC_GLOBAL_MAX_NUM;
            } else {
                this.desc_global_max_num = num3;
            }
            Integer num4 = builder.single_open_max_num;
            if (num4 == null) {
                this.single_open_max_num = DEFAULT_SINGLE_OPEN_MAX_NUM;
            } else {
                this.single_open_max_num = num4;
            }
            Integer num5 = builder.day_max_num;
            if (num5 == null) {
                this.day_max_num = DEFAULT_DAY_MAX_NUM;
            } else {
                this.day_max_num = num5;
            }
            Integer num6 = builder.min_step_second;
            if (num6 == null) {
                this.min_step_second = DEFAULT_MIN_STEP_SECOND;
            } else {
                this.min_step_second = num6;
            }
            String str4 = builder.user_name;
            if (str4 == null) {
                this.user_name = "";
            } else {
                this.user_name = str4;
            }
            String str5 = builder.portrait;
            if (str5 == null) {
                this.portrait = "";
            } else {
                this.portrait = str5;
            }
            String str6 = builder.title;
            if (str6 == null) {
                this.title = "";
            } else {
                this.title = str6;
            }
            this.yy_ext = builder.yy_ext;
            Long l = builder.room_id;
            if (l == null) {
                this.room_id = DEFAULT_ROOM_ID;
            } else {
                this.room_id = l;
            }
            String str7 = builder.btn_text;
            if (str7 == null) {
                this.btn_text = "";
            } else {
                this.btn_text = str7;
            }
            String str8 = builder.feed_id;
            if (str8 == null) {
                this.feed_id = "";
            } else {
                this.feed_id = str8;
            }
            Integer num7 = builder.remind_type;
            if (num7 == null) {
                this.remind_type = DEFAULT_REMIND_TYPE;
            } else {
                this.remind_type = num7;
            }
            Integer num8 = builder.show_page;
            if (num8 == null) {
                this.show_page = DEFAULT_SHOW_PAGE;
                return;
            } else {
                this.show_page = num8;
                return;
            }
        }
        this.icon_url = builder.icon_url;
        this.icon_scheme = builder.icon_scheme;
        this.disappear_type = builder.disappear_type;
        this.disappear_second = builder.disappear_second;
        this.desc = builder.desc;
        this.desc_global_max_num = builder.desc_global_max_num;
        this.single_open_max_num = builder.single_open_max_num;
        this.day_max_num = builder.day_max_num;
        this.min_step_second = builder.min_step_second;
        this.user_name = builder.user_name;
        this.portrait = builder.portrait;
        this.title = builder.title;
        this.yy_ext = builder.yy_ext;
        this.room_id = builder.room_id;
        this.btn_text = builder.btn_text;
        this.feed_id = builder.feed_id;
        this.remind_type = builder.remind_type;
        this.show_page = builder.show_page;
    }
}
