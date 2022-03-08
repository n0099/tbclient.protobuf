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
public final class UserBfbInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Integer DEFAULT_ACTIVITY_STATUS;
    public static final String DEFAULT_BFB_URL = "";
    public static final String DEFAULT_MASTE_URL = "";
    public static final Integer DEFAULT_RES_NO;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer activity_status;
    @ProtoField(tag = 5)
    public final AndroidBfbSdk android_bfb_sdk;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String bfb_url;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String maste_url;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer res_no;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<UserBfbInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer activity_status;
        public AndroidBfbSdk android_bfb_sdk;
        public String bfb_url;
        public String maste_url;
        public Integer res_no;

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
        public Builder(UserBfbInfo userBfbInfo) {
            super(userBfbInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {userBfbInfo};
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
            if (userBfbInfo == null) {
                return;
            }
            this.activity_status = userBfbInfo.activity_status;
            this.bfb_url = userBfbInfo.bfb_url;
            this.maste_url = userBfbInfo.maste_url;
            this.res_no = userBfbInfo.res_no;
            this.android_bfb_sdk = userBfbInfo.android_bfb_sdk;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public UserBfbInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new UserBfbInfo(this, z, null) : (UserBfbInfo) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-103066076, "Ltbclient/UserBfbInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-103066076, "Ltbclient/UserBfbInfo;");
                return;
            }
        }
        DEFAULT_ACTIVITY_STATUS = 0;
        DEFAULT_RES_NO = 0;
    }

    public /* synthetic */ UserBfbInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserBfbInfo(Builder builder, boolean z) {
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
            Integer num = builder.activity_status;
            if (num == null) {
                this.activity_status = DEFAULT_ACTIVITY_STATUS;
            } else {
                this.activity_status = num;
            }
            String str = builder.bfb_url;
            if (str == null) {
                this.bfb_url = "";
            } else {
                this.bfb_url = str;
            }
            String str2 = builder.maste_url;
            if (str2 == null) {
                this.maste_url = "";
            } else {
                this.maste_url = str2;
            }
            Integer num2 = builder.res_no;
            if (num2 == null) {
                this.res_no = DEFAULT_RES_NO;
            } else {
                this.res_no = num2;
            }
            this.android_bfb_sdk = builder.android_bfb_sdk;
            return;
        }
        this.activity_status = builder.activity_status;
        this.bfb_url = builder.bfb_url;
        this.maste_url = builder.maste_url;
        this.res_no = builder.res_no;
        this.android_bfb_sdk = builder.android_bfb_sdk;
    }
}
