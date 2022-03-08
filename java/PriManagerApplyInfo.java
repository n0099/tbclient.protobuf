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
public final class PriManagerApplyInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Integer DEFAULT_ASSIST_APPLY_STATUS;
    public static final String DEFAULT_ASSIST_APPLY_URL = "";
    public static final Integer DEFAULT_ASSIST_LEFT_NUM;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer assist_apply_status;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String assist_apply_url;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer assist_left_num;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<PriManagerApplyInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer assist_apply_status;
        public String assist_apply_url;
        public Integer assist_left_num;

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
        public Builder(PriManagerApplyInfo priManagerApplyInfo) {
            super(priManagerApplyInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {priManagerApplyInfo};
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
            if (priManagerApplyInfo == null) {
                return;
            }
            this.assist_left_num = priManagerApplyInfo.assist_left_num;
            this.assist_apply_url = priManagerApplyInfo.assist_apply_url;
            this.assist_apply_status = priManagerApplyInfo.assist_apply_status;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PriManagerApplyInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new PriManagerApplyInfo(this, z, null) : (PriManagerApplyInfo) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(628587023, "Ltbclient/PriManagerApplyInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(628587023, "Ltbclient/PriManagerApplyInfo;");
                return;
            }
        }
        DEFAULT_ASSIST_LEFT_NUM = 0;
        DEFAULT_ASSIST_APPLY_STATUS = 0;
    }

    public /* synthetic */ PriManagerApplyInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PriManagerApplyInfo(Builder builder, boolean z) {
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
            Integer num = builder.assist_left_num;
            if (num == null) {
                this.assist_left_num = DEFAULT_ASSIST_LEFT_NUM;
            } else {
                this.assist_left_num = num;
            }
            String str = builder.assist_apply_url;
            if (str == null) {
                this.assist_apply_url = "";
            } else {
                this.assist_apply_url = str;
            }
            Integer num2 = builder.assist_apply_status;
            if (num2 == null) {
                this.assist_apply_status = DEFAULT_ASSIST_APPLY_STATUS;
                return;
            } else {
                this.assist_apply_status = num2;
                return;
            }
        }
        this.assist_left_num = builder.assist_left_num;
        this.assist_apply_url = builder.assist_apply_url;
        this.assist_apply_status = builder.assist_apply_status;
    }
}
