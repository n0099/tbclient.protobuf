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
/* loaded from: classes10.dex */
public final class ThemeCardPropMain extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_ACTIVITY_URL = "";
    public static final String DEFAULT_DESCRIPTION = "";
    public static final String DEFAULT_EXAMPLE_URL = "";
    public static final Integer DEFAULT_FREE_USER_LEVEL;
    public static final Integer DEFAULT_IN_USE;
    public static final Integer DEFAULT_IS_FINISHED;
    public static final String DEFAULT_PERMISSION = "";
    public static final Long DEFAULT_PROPS_ID;
    public static final String DEFAULT_PROPS_STATE_IMG = "";
    public static final String DEFAULT_TITLE = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String activity_url;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String description;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String example_url;
    @ProtoField(tag = 8, type = Message.Datatype.UINT32)
    public final Integer free_user_level;
    @ProtoField(tag = 7, type = Message.Datatype.UINT32)
    public final Integer in_use;
    @ProtoField(tag = 10, type = Message.Datatype.UINT32)
    public final Integer is_finished;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String permission;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long props_id;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String props_state_img;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String title;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<ThemeCardPropMain> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String activity_url;
        public String description;
        public String example_url;
        public Integer free_user_level;
        public Integer in_use;
        public Integer is_finished;
        public String permission;
        public Long props_id;
        public String props_state_img;
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
        public Builder(ThemeCardPropMain themeCardPropMain) {
            super(themeCardPropMain);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {themeCardPropMain};
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
            if (themeCardPropMain == null) {
                return;
            }
            this.props_id = themeCardPropMain.props_id;
            this.title = themeCardPropMain.title;
            this.description = themeCardPropMain.description;
            this.example_url = themeCardPropMain.example_url;
            this.permission = themeCardPropMain.permission;
            this.props_state_img = themeCardPropMain.props_state_img;
            this.in_use = themeCardPropMain.in_use;
            this.free_user_level = themeCardPropMain.free_user_level;
            this.activity_url = themeCardPropMain.activity_url;
            this.is_finished = themeCardPropMain.is_finished;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ThemeCardPropMain build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new ThemeCardPropMain(this, z, null) : (ThemeCardPropMain) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(1011119600, "Ltbclient/ThemeCardPropMain;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(1011119600, "Ltbclient/ThemeCardPropMain;");
                return;
            }
        }
        DEFAULT_PROPS_ID = 0L;
        DEFAULT_IN_USE = 0;
        DEFAULT_FREE_USER_LEVEL = 0;
        DEFAULT_IS_FINISHED = 0;
    }

    public /* synthetic */ ThemeCardPropMain(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThemeCardPropMain(Builder builder, boolean z) {
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
            Long l = builder.props_id;
            if (l == null) {
                this.props_id = DEFAULT_PROPS_ID;
            } else {
                this.props_id = l;
            }
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            String str2 = builder.description;
            if (str2 == null) {
                this.description = "";
            } else {
                this.description = str2;
            }
            String str3 = builder.example_url;
            if (str3 == null) {
                this.example_url = "";
            } else {
                this.example_url = str3;
            }
            String str4 = builder.permission;
            if (str4 == null) {
                this.permission = "";
            } else {
                this.permission = str4;
            }
            String str5 = builder.props_state_img;
            if (str5 == null) {
                this.props_state_img = "";
            } else {
                this.props_state_img = str5;
            }
            Integer num = builder.in_use;
            if (num == null) {
                this.in_use = DEFAULT_IN_USE;
            } else {
                this.in_use = num;
            }
            Integer num2 = builder.free_user_level;
            if (num2 == null) {
                this.free_user_level = DEFAULT_FREE_USER_LEVEL;
            } else {
                this.free_user_level = num2;
            }
            String str6 = builder.activity_url;
            if (str6 == null) {
                this.activity_url = "";
            } else {
                this.activity_url = str6;
            }
            Integer num3 = builder.is_finished;
            if (num3 == null) {
                this.is_finished = DEFAULT_IS_FINISHED;
                return;
            } else {
                this.is_finished = num3;
                return;
            }
        }
        this.props_id = builder.props_id;
        this.title = builder.title;
        this.description = builder.description;
        this.example_url = builder.example_url;
        this.permission = builder.permission;
        this.props_state_img = builder.props_state_img;
        this.in_use = builder.in_use;
        this.free_user_level = builder.free_user_level;
        this.activity_url = builder.activity_url;
        this.is_finished = builder.is_finished;
    }
}
