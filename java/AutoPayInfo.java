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
/* loaded from: classes2.dex */
public final class AutoPayInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_AUTOPAY_URL = "";
    public static final Long DEFAULT_BEGIN_TIME;
    public static final Long DEFAULT_CREATE_TIME;
    public static final Integer DEFAULT_PAY_CHANNEL;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String autopay_url;
    @ProtoField(tag = 3, type = Message.Datatype.INT64)
    public final Long begin_time;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long create_time;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer pay_channel;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<AutoPayInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String autopay_url;
        public Long begin_time;
        public Long create_time;
        public Integer pay_channel;

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
        public Builder(AutoPayInfo autoPayInfo) {
            super(autoPayInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {autoPayInfo};
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
            if (autoPayInfo == null) {
                return;
            }
            this.create_time = autoPayInfo.create_time;
            this.pay_channel = autoPayInfo.pay_channel;
            this.begin_time = autoPayInfo.begin_time;
            this.autopay_url = autoPayInfo.autopay_url;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AutoPayInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new AutoPayInfo(this, z, null) : (AutoPayInfo) invokeZ.objValue;
        }
    }

    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-363534786, "Ltbclient/AutoPayInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-363534786, "Ltbclient/AutoPayInfo;");
                return;
            }
        }
        DEFAULT_CREATE_TIME = 0L;
        DEFAULT_PAY_CHANNEL = 0;
        DEFAULT_BEGIN_TIME = 0L;
    }

    public /* synthetic */ AutoPayInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoPayInfo(Builder builder, boolean z) {
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
            Long l = builder.create_time;
            if (l == null) {
                this.create_time = DEFAULT_CREATE_TIME;
            } else {
                this.create_time = l;
            }
            Integer num = builder.pay_channel;
            if (num == null) {
                this.pay_channel = DEFAULT_PAY_CHANNEL;
            } else {
                this.pay_channel = num;
            }
            Long l2 = builder.begin_time;
            if (l2 == null) {
                this.begin_time = DEFAULT_BEGIN_TIME;
            } else {
                this.begin_time = l2;
            }
            String str = builder.autopay_url;
            if (str == null) {
                this.autopay_url = "";
                return;
            } else {
                this.autopay_url = str;
                return;
            }
        }
        this.create_time = builder.create_time;
        this.pay_channel = builder.pay_channel;
        this.begin_time = builder.begin_time;
        this.autopay_url = builder.autopay_url;
    }
}
