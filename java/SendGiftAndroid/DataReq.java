package tbclient.SendGiftAndroid;

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
/* loaded from: classes8.dex */
public final class DataReq extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Long DEFAULT_GIFT_FROM;
    public static final Integer DEFAULT_GIFT_ID;
    public static final Integer DEFAULT_NUM;
    public static final String DEFAULT_PASSWORD = "";
    public static final Integer DEFAULT_PRICE;
    public static final Long DEFAULT_RECEIVER_ID;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1300common;
    @ProtoField(tag = 6, type = Message.Datatype.INT64)
    public final Long gift_from;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer gift_id;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer num;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String password;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer price;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long receiver_id;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1301common;
        public Long gift_from;
        public Integer gift_id;
        public Integer num;
        public String password;
        public Integer price;
        public Long receiver_id;

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
            this.f1301common = dataReq.f1300common;
            this.receiver_id = dataReq.receiver_id;
            this.gift_id = dataReq.gift_id;
            this.price = dataReq.price;
            this.num = dataReq.num;
            this.gift_from = dataReq.gift_from;
            this.password = dataReq.password;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new DataReq(this, z, null) : (DataReq) invokeZ.objValue;
        }
    }

    /* loaded from: classes8.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(1458761161, "Ltbclient/SendGiftAndroid/DataReq;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(1458761161, "Ltbclient/SendGiftAndroid/DataReq;");
                return;
            }
        }
        DEFAULT_RECEIVER_ID = 0L;
        DEFAULT_GIFT_ID = 0;
        DEFAULT_PRICE = 0;
        DEFAULT_NUM = 0;
        DEFAULT_GIFT_FROM = 0L;
    }

    public /* synthetic */ DataReq(Builder builder, boolean z, a aVar) {
        this(builder, z);
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
            this.f1300common = builder.f1301common;
            Long l = builder.receiver_id;
            if (l == null) {
                this.receiver_id = DEFAULT_RECEIVER_ID;
            } else {
                this.receiver_id = l;
            }
            Integer num = builder.gift_id;
            if (num == null) {
                this.gift_id = DEFAULT_GIFT_ID;
            } else {
                this.gift_id = num;
            }
            Integer num2 = builder.price;
            if (num2 == null) {
                this.price = DEFAULT_PRICE;
            } else {
                this.price = num2;
            }
            Integer num3 = builder.num;
            if (num3 == null) {
                this.num = DEFAULT_NUM;
            } else {
                this.num = num3;
            }
            Long l2 = builder.gift_from;
            if (l2 == null) {
                this.gift_from = DEFAULT_GIFT_FROM;
            } else {
                this.gift_from = l2;
            }
            String str = builder.password;
            if (str == null) {
                this.password = "";
                return;
            } else {
                this.password = str;
                return;
            }
        }
        this.f1300common = builder.f1301common;
        this.receiver_id = builder.receiver_id;
        this.gift_id = builder.gift_id;
        this.price = builder.price;
        this.num = builder.num;
        this.gift_from = builder.gift_from;
        this.password = builder.password;
    }
}
