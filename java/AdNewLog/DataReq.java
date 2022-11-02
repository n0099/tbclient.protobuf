package tbclient.AdNewLog;

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
import tbclient.CommonReq;
/* loaded from: classes9.dex */
public final class DataReq extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Integer DEFAULT_DA_FROM;
    public static final String DEFAULT_DA_LOCATE = "";
    public static final String DEFAULT_DA_TYPE = "";
    public static final String DEFAULT_EXTRA_PARAM = "";
    public static final String DEFAULT_ORDER_ID = "";
    public static final String DEFAULT_TOKEN = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1096common;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer da_from;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String da_locate;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String da_type;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String extra_param;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String order_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String token;

    /* loaded from: classes9.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1097common;
        public Integer da_from;
        public String da_locate;
        public String da_type;
        public String extra_param;
        public String order_id;
        public String token;

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
        public Builder(DataReq dataReq) {
            super(dataReq);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {dataReq};
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
            if (dataReq == null) {
                return;
            }
            this.f1097common = dataReq.f1096common;
            this.token = dataReq.token;
            this.da_locate = dataReq.da_locate;
            this.da_from = dataReq.da_from;
            this.extra_param = dataReq.extra_param;
            this.order_id = dataReq.order_id;
            this.da_type = dataReq.da_type;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new DataReq(this, z, null);
            }
            return (DataReq) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-400093147, "Ltbclient/AdNewLog/DataReq;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-400093147, "Ltbclient/AdNewLog/DataReq;");
                return;
            }
        }
        DEFAULT_DA_FROM = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataReq(Builder builder, boolean z) {
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
            this.f1096common = builder.f1097common;
            String str = builder.token;
            if (str == null) {
                this.token = "";
            } else {
                this.token = str;
            }
            String str2 = builder.da_locate;
            if (str2 == null) {
                this.da_locate = "";
            } else {
                this.da_locate = str2;
            }
            Integer num = builder.da_from;
            if (num == null) {
                this.da_from = DEFAULT_DA_FROM;
            } else {
                this.da_from = num;
            }
            String str3 = builder.extra_param;
            if (str3 == null) {
                this.extra_param = "";
            } else {
                this.extra_param = str3;
            }
            String str4 = builder.order_id;
            if (str4 == null) {
                this.order_id = "";
            } else {
                this.order_id = str4;
            }
            String str5 = builder.da_type;
            if (str5 == null) {
                this.da_type = "";
                return;
            } else {
                this.da_type = str5;
                return;
            }
        }
        this.f1096common = builder.f1097common;
        this.token = builder.token;
        this.da_locate = builder.da_locate;
        this.da_from = builder.da_from;
        this.extra_param = builder.extra_param;
        this.order_id = builder.order_id;
        this.da_type = builder.da_type;
    }

    public /* synthetic */ DataReq(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
