package tbclient.PbPage;

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
    public static final Integer DEFAULT_IS_REQ_AD;
    public static final Integer DEFAULT_LOAD_COUNT;
    public static final Integer DEFAULT_REFRESH_COUNT;
    public static final String DEFAULT_YOGA_LIB_VERSION = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer is_req_ad;
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
        public Integer is_req_ad;
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
            this.is_req_ad = adParam.is_req_ad;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-675057675, "Ltbclient/PbPage/AdParam;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-675057675, "Ltbclient/PbPage/AdParam;");
                return;
            }
        }
        DEFAULT_LOAD_COUNT = 0;
        DEFAULT_REFRESH_COUNT = 0;
        DEFAULT_IS_REQ_AD = 0;
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
            } else {
                this.yoga_lib_version = str;
            }
            Integer num3 = builder.is_req_ad;
            if (num3 == null) {
                this.is_req_ad = DEFAULT_IS_REQ_AD;
                return;
            } else {
                this.is_req_ad = num3;
                return;
            }
        }
        this.load_count = builder.load_count;
        this.refresh_count = builder.refresh_count;
        this.yoga_lib_version = builder.yoga_lib_version;
        this.is_req_ad = builder.is_req_ad;
    }
}
