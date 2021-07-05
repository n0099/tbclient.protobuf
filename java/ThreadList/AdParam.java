package tbclient.ThreadList;

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
public final class AdParam extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Integer DEFAULT_LOAD_COUNT;
    public static final Integer DEFAULT_REFRESH_COUNT;
    public static final String DEFAULT_YOGA_LIB_VERSION = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer load_count;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer refresh_count;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String yoga_lib_version;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<AdParam> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer load_count;
        public Integer refresh_count;
        public String yoga_lib_version;

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
        public Builder(AdParam adParam) {
            super(adParam);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {adParam};
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
            if (adParam == null) {
                return;
            }
            this.load_count = adParam.load_count;
            this.refresh_count = adParam.refresh_count;
            this.yoga_lib_version = adParam.yoga_lib_version;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AdParam build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new AdParam(this, z, null) : (AdParam) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(1580830382, "Ltbclient/ThreadList/AdParam;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(1580830382, "Ltbclient/ThreadList/AdParam;");
                return;
            }
        }
        DEFAULT_LOAD_COUNT = 0;
        DEFAULT_REFRESH_COUNT = 0;
    }

    public /* synthetic */ AdParam(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdParam(Builder builder, boolean z) {
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
            Integer num = builder.load_count;
            if (num == null) {
                this.load_count = DEFAULT_LOAD_COUNT;
            } else {
                this.load_count = num;
            }
            Integer num2 = builder.refresh_count;
            if (num2 == null) {
                this.refresh_count = DEFAULT_REFRESH_COUNT;
            } else {
                this.refresh_count = num2;
            }
            String str = builder.yoga_lib_version;
            if (str == null) {
                this.yoga_lib_version = "";
                return;
            } else {
                this.yoga_lib_version = str;
                return;
            }
        }
        this.load_count = builder.load_count;
        this.refresh_count = builder.refresh_count;
        this.yoga_lib_version = builder.yoga_lib_version;
    }
}
