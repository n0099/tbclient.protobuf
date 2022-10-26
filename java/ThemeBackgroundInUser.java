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
public final class ThemeBackgroundInUser extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_DYNAMIC = "";
    public static final String DEFAULT_EXCLUSIVE_NO = "";
    public static final String DEFAULT_JUMP_URL = "";
    public static final Long DEFAULT_PROPS_ID;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String dynamic;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String exclusive_no;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String jump_url;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long props_id;

    /* loaded from: classes9.dex */
    public /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public final class Builder extends Message.Builder {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String dynamic;
        public String exclusive_no;
        public String jump_url;
        public Long props_id;

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
        public Builder(ThemeBackgroundInUser themeBackgroundInUser) {
            super(themeBackgroundInUser);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {themeBackgroundInUser};
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
            if (themeBackgroundInUser == null) {
                return;
            }
            this.props_id = themeBackgroundInUser.props_id;
            this.exclusive_no = themeBackgroundInUser.exclusive_no;
            this.jump_url = themeBackgroundInUser.jump_url;
            this.dynamic = themeBackgroundInUser.dynamic;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ThemeBackgroundInUser build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new ThemeBackgroundInUser(this, z, null);
            }
            return (ThemeBackgroundInUser) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(2102056254, "Ltbclient/ThemeBackgroundInUser;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(2102056254, "Ltbclient/ThemeBackgroundInUser;");
                return;
            }
        }
        DEFAULT_PROPS_ID = 0L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThemeBackgroundInUser(Builder builder, boolean z) {
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
            Long l = builder.props_id;
            if (l == null) {
                this.props_id = DEFAULT_PROPS_ID;
            } else {
                this.props_id = l;
            }
            String str = builder.exclusive_no;
            if (str == null) {
                this.exclusive_no = "";
            } else {
                this.exclusive_no = str;
            }
            String str2 = builder.jump_url;
            if (str2 == null) {
                this.jump_url = "";
            } else {
                this.jump_url = str2;
            }
            String str3 = builder.dynamic;
            if (str3 == null) {
                this.dynamic = "";
                return;
            } else {
                this.dynamic = str3;
                return;
            }
        }
        this.props_id = builder.props_id;
        this.exclusive_no = builder.exclusive_no;
        this.jump_url = builder.jump_url;
        this.dynamic = builder.dynamic;
    }

    public /* synthetic */ ThemeBackgroundInUser(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
