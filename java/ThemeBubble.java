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
public final class ThemeBubble extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_JUMP_URL = "";
    public static final Integer DEFAULT_PACKAGE_ID;
    public static final Integer DEFAULT_PROPS_ID;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String jump_url;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer package_id;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer props_id;

    /* loaded from: classes9.dex */
    public /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public final class Builder extends Message.Builder {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String jump_url;
        public Integer package_id;
        public Integer props_id;

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
        public Builder(ThemeBubble themeBubble) {
            super(themeBubble);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {themeBubble};
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
            if (themeBubble == null) {
                return;
            }
            this.props_id = themeBubble.props_id;
            this.package_id = themeBubble.package_id;
            this.jump_url = themeBubble.jump_url;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ThemeBubble build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new ThemeBubble(this, z, null);
            }
            return (ThemeBubble) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-1943034608, "Ltbclient/ThemeBubble;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-1943034608, "Ltbclient/ThemeBubble;");
                return;
            }
        }
        DEFAULT_PROPS_ID = 0;
        DEFAULT_PACKAGE_ID = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThemeBubble(Builder builder, boolean z) {
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
            Integer num = builder.props_id;
            if (num == null) {
                this.props_id = DEFAULT_PROPS_ID;
            } else {
                this.props_id = num;
            }
            Integer num2 = builder.package_id;
            if (num2 == null) {
                this.package_id = DEFAULT_PACKAGE_ID;
            } else {
                this.package_id = num2;
            }
            String str = builder.jump_url;
            if (str == null) {
                this.jump_url = "";
                return;
            } else {
                this.jump_url = str;
                return;
            }
        }
        this.props_id = builder.props_id;
        this.package_id = builder.package_id;
        this.jump_url = builder.jump_url;
    }

    public /* synthetic */ ThemeBubble(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
