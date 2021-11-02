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
/* loaded from: classes3.dex */
public final class AndroidBfbSdk extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_ACTIVITY_NO = "";
    public static final String DEFAULT_ORDER_NO = "";
    public static final String DEFAULT_RETURN_URL = "";
    public static final String DEFAULT_SIGN = "";
    public static final Integer DEFAULT_SIGN_METHOD;
    public static final Integer DEFAULT_SP_NO;
    public static final String DEFAULT_VERSION = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String activity_no;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String order_no;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String return_url;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String sign;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer sign_method;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer sp_no;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String version;

    /* loaded from: classes3.dex */
    public static final class Builder extends Message.Builder<AndroidBfbSdk> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String activity_no;
        public String order_no;
        public String return_url;
        public String sign;
        public Integer sign_method;
        public Integer sp_no;
        public String version;

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
        public Builder(AndroidBfbSdk androidBfbSdk) {
            super(androidBfbSdk);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {androidBfbSdk};
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
            if (androidBfbSdk == null) {
                return;
            }
            this.sp_no = androidBfbSdk.sp_no;
            this.version = androidBfbSdk.version;
            this.activity_no = androidBfbSdk.activity_no;
            this.order_no = androidBfbSdk.order_no;
            this.return_url = androidBfbSdk.return_url;
            this.sign = androidBfbSdk.sign;
            this.sign_method = androidBfbSdk.sign_method;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AndroidBfbSdk build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new AndroidBfbSdk(this, z, null) : (AndroidBfbSdk) invokeZ.objValue;
        }
    }

    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-1744073990, "Ltbclient/AndroidBfbSdk;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-1744073990, "Ltbclient/AndroidBfbSdk;");
                return;
            }
        }
        DEFAULT_SP_NO = 0;
        DEFAULT_SIGN_METHOD = 0;
    }

    public /* synthetic */ AndroidBfbSdk(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidBfbSdk(Builder builder, boolean z) {
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
            Integer num = builder.sp_no;
            if (num == null) {
                this.sp_no = DEFAULT_SP_NO;
            } else {
                this.sp_no = num;
            }
            String str = builder.version;
            if (str == null) {
                this.version = "";
            } else {
                this.version = str;
            }
            String str2 = builder.activity_no;
            if (str2 == null) {
                this.activity_no = "";
            } else {
                this.activity_no = str2;
            }
            String str3 = builder.order_no;
            if (str3 == null) {
                this.order_no = "";
            } else {
                this.order_no = str3;
            }
            String str4 = builder.return_url;
            if (str4 == null) {
                this.return_url = "";
            } else {
                this.return_url = str4;
            }
            String str5 = builder.sign;
            if (str5 == null) {
                this.sign = "";
            } else {
                this.sign = str5;
            }
            Integer num2 = builder.sign_method;
            if (num2 == null) {
                this.sign_method = DEFAULT_SIGN_METHOD;
                return;
            } else {
                this.sign_method = num2;
                return;
            }
        }
        this.sp_no = builder.sp_no;
        this.version = builder.version;
        this.activity_no = builder.activity_no;
        this.order_no = builder.order_no;
        this.return_url = builder.return_url;
        this.sign = builder.sign;
        this.sign_method = builder.sign_method;
    }
}
