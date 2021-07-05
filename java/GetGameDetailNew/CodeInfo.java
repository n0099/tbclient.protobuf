package tbclient.GetGameDetailNew;

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
public final class CodeInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Integer DEFAULT_CODE_STATUS;
    public static final Integer DEFAULT_CODE_TYPE;
    public static final String DEFAULT_GAME_CODE = "";
    public static final String DEFAULT_GIFT_CODE = "";
    public static final Integer DEFAULT_KAIFU_ID;
    public static final Integer DEFAULT_USER_STATUS;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer code_status;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer code_type;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String game_code;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String gift_code;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer kaifu_id;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer user_status;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<CodeInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer code_status;
        public Integer code_type;
        public String game_code;
        public String gift_code;
        public Integer kaifu_id;
        public Integer user_status;

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
        public Builder(CodeInfo codeInfo) {
            super(codeInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {codeInfo};
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
            if (codeInfo == null) {
                return;
            }
            this.user_status = codeInfo.user_status;
            this.code_status = codeInfo.code_status;
            this.kaifu_id = codeInfo.kaifu_id;
            this.code_type = codeInfo.code_type;
            this.gift_code = codeInfo.gift_code;
            this.game_code = codeInfo.game_code;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public CodeInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new CodeInfo(this, z, null) : (CodeInfo) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(1448885154, "Ltbclient/GetGameDetailNew/CodeInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(1448885154, "Ltbclient/GetGameDetailNew/CodeInfo;");
                return;
            }
        }
        DEFAULT_USER_STATUS = 0;
        DEFAULT_CODE_STATUS = 0;
        DEFAULT_KAIFU_ID = 0;
        DEFAULT_CODE_TYPE = 0;
    }

    public /* synthetic */ CodeInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CodeInfo(Builder builder, boolean z) {
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
            Integer num = builder.user_status;
            if (num == null) {
                this.user_status = DEFAULT_USER_STATUS;
            } else {
                this.user_status = num;
            }
            Integer num2 = builder.code_status;
            if (num2 == null) {
                this.code_status = DEFAULT_CODE_STATUS;
            } else {
                this.code_status = num2;
            }
            Integer num3 = builder.kaifu_id;
            if (num3 == null) {
                this.kaifu_id = DEFAULT_KAIFU_ID;
            } else {
                this.kaifu_id = num3;
            }
            Integer num4 = builder.code_type;
            if (num4 == null) {
                this.code_type = DEFAULT_CODE_TYPE;
            } else {
                this.code_type = num4;
            }
            String str = builder.gift_code;
            if (str == null) {
                this.gift_code = "";
            } else {
                this.gift_code = str;
            }
            String str2 = builder.game_code;
            if (str2 == null) {
                this.game_code = "";
                return;
            } else {
                this.game_code = str2;
                return;
            }
        }
        this.user_status = builder.user_status;
        this.code_status = builder.code_status;
        this.kaifu_id = builder.kaifu_id;
        this.code_type = builder.code_type;
        this.gift_code = builder.gift_code;
        this.game_code = builder.game_code;
    }
}
