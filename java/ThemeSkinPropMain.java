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
public final class ThemeSkinPropMain extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_ACTIVITY_URL = "";
    public static final Integer DEFAULT_DAILY_PRIVILEGE_STATUS;
    public static final Long DEFAULT_END_TIME;
    public static final String DEFAULT_EXAMPLE_URL = "";
    public static final Integer DEFAULT_FREE_USER_LEVEL;
    public static final Integer DEFAULT_IS_FINISHED;
    public static final String DEFAULT_PACKAGE_KEY = "";
    public static final String DEFAULT_PACKAGE_SIZE = "";
    public static final String DEFAULT_PACKAGE_URL = "";
    public static final String DEFAULT_PERMISSION = "";
    public static final Integer DEFAULT_PROPS_ID;
    public static final String DEFAULT_PROPS_STATE_IMG = "";
    public static final Integer DEFAULT_PROPS_VERSION;
    public static final String DEFAULT_TITLE = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String activity_url;
    @ProtoField(tag = 13, type = Message.Datatype.UINT32)
    public final Integer daily_privilege_status;
    @ProtoField(tag = 14, type = Message.Datatype.INT64)
    public final Long end_time;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String example_url;
    @ProtoField(tag = 9, type = Message.Datatype.UINT32)
    public final Integer free_user_level;
    @ProtoField(tag = 11, type = Message.Datatype.INT32)
    public final Integer is_finished;
    @ProtoField(tag = 12, type = Message.Datatype.STRING)
    public final String package_key;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String package_size;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String package_url;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String permission;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer props_id;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String props_state_img;
    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer props_version;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String title;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<ThemeSkinPropMain> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String activity_url;
        public Integer daily_privilege_status;
        public Long end_time;
        public String example_url;
        public Integer free_user_level;
        public Integer is_finished;
        public String package_key;
        public String package_size;
        public String package_url;
        public String permission;
        public Integer props_id;
        public String props_state_img;
        public Integer props_version;
        public String title;

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
        public Builder(ThemeSkinPropMain themeSkinPropMain) {
            super(themeSkinPropMain);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {themeSkinPropMain};
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
            if (themeSkinPropMain == null) {
                return;
            }
            this.props_id = themeSkinPropMain.props_id;
            this.title = themeSkinPropMain.title;
            this.example_url = themeSkinPropMain.example_url;
            this.permission = themeSkinPropMain.permission;
            this.props_state_img = themeSkinPropMain.props_state_img;
            this.package_url = themeSkinPropMain.package_url;
            this.package_size = themeSkinPropMain.package_size;
            this.props_version = themeSkinPropMain.props_version;
            this.free_user_level = themeSkinPropMain.free_user_level;
            this.activity_url = themeSkinPropMain.activity_url;
            this.is_finished = themeSkinPropMain.is_finished;
            this.package_key = themeSkinPropMain.package_key;
            this.daily_privilege_status = themeSkinPropMain.daily_privilege_status;
            this.end_time = themeSkinPropMain.end_time;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ThemeSkinPropMain build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new ThemeSkinPropMain(this, z, null) : (ThemeSkinPropMain) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-1069976029, "Ltbclient/ThemeSkinPropMain;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-1069976029, "Ltbclient/ThemeSkinPropMain;");
                return;
            }
        }
        DEFAULT_PROPS_ID = 0;
        DEFAULT_PROPS_VERSION = 0;
        DEFAULT_FREE_USER_LEVEL = 0;
        DEFAULT_IS_FINISHED = 0;
        DEFAULT_DAILY_PRIVILEGE_STATUS = 0;
        DEFAULT_END_TIME = 0L;
    }

    public /* synthetic */ ThemeSkinPropMain(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThemeSkinPropMain(Builder builder, boolean z) {
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
            Integer num = builder.props_id;
            if (num == null) {
                this.props_id = DEFAULT_PROPS_ID;
            } else {
                this.props_id = num;
            }
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            String str2 = builder.example_url;
            if (str2 == null) {
                this.example_url = "";
            } else {
                this.example_url = str2;
            }
            String str3 = builder.permission;
            if (str3 == null) {
                this.permission = "";
            } else {
                this.permission = str3;
            }
            String str4 = builder.props_state_img;
            if (str4 == null) {
                this.props_state_img = "";
            } else {
                this.props_state_img = str4;
            }
            String str5 = builder.package_url;
            if (str5 == null) {
                this.package_url = "";
            } else {
                this.package_url = str5;
            }
            String str6 = builder.package_size;
            if (str6 == null) {
                this.package_size = "";
            } else {
                this.package_size = str6;
            }
            Integer num2 = builder.props_version;
            if (num2 == null) {
                this.props_version = DEFAULT_PROPS_VERSION;
            } else {
                this.props_version = num2;
            }
            Integer num3 = builder.free_user_level;
            if (num3 == null) {
                this.free_user_level = DEFAULT_FREE_USER_LEVEL;
            } else {
                this.free_user_level = num3;
            }
            String str7 = builder.activity_url;
            if (str7 == null) {
                this.activity_url = "";
            } else {
                this.activity_url = str7;
            }
            Integer num4 = builder.is_finished;
            if (num4 == null) {
                this.is_finished = DEFAULT_IS_FINISHED;
            } else {
                this.is_finished = num4;
            }
            String str8 = builder.package_key;
            if (str8 == null) {
                this.package_key = "";
            } else {
                this.package_key = str8;
            }
            Integer num5 = builder.daily_privilege_status;
            if (num5 == null) {
                this.daily_privilege_status = DEFAULT_DAILY_PRIVILEGE_STATUS;
            } else {
                this.daily_privilege_status = num5;
            }
            Long l = builder.end_time;
            if (l == null) {
                this.end_time = DEFAULT_END_TIME;
                return;
            } else {
                this.end_time = l;
                return;
            }
        }
        this.props_id = builder.props_id;
        this.title = builder.title;
        this.example_url = builder.example_url;
        this.permission = builder.permission;
        this.props_state_img = builder.props_state_img;
        this.package_url = builder.package_url;
        this.package_size = builder.package_size;
        this.props_version = builder.props_version;
        this.free_user_level = builder.free_user_level;
        this.activity_url = builder.activity_url;
        this.is_finished = builder.is_finished;
        this.package_key = builder.package_key;
        this.daily_privilege_status = builder.daily_privilege_status;
        this.end_time = builder.end_time;
    }
}
