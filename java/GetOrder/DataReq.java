package tbclient.GetOrder;

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
import tbclient.Wares;
/* loaded from: classes5.dex */
public final class DataReq extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_CLICK_ZONE = "";
    public static final Integer DEFAULT_IS_AUTOPAY;
    public static final Integer DEFAULT_IS_LEFT;
    public static final String DEFAULT_MOBILE = "";
    public static final String DEFAULT_ORDER_URL = "";
    public static final String DEFAULT_PAYMENT_POS_KEY = "";
    public static final Integer DEFAULT_PAY_TYPE;
    public static final String DEFAULT_REFER_PAGE = "";
    public static final String DEFAULT_WALLET_SDK_UA = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String click_zone;
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f65176common;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer is_autopay;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer is_left;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String mobile;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String order_url;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer pay_type;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String payment_pos_key;
    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String refer_page;
    @ProtoField(tag = 12, type = Message.Datatype.STRING)
    public final String wallet_sdk_ua;
    @ProtoField(tag = 6)
    public final Wares wares;

    /* loaded from: classes5.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String click_zone;

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f65177common;
        public Integer is_autopay;
        public Integer is_left;
        public String mobile;
        public String order_url;
        public Integer pay_type;
        public String payment_pos_key;
        public String refer_page;
        public String wallet_sdk_ua;
        public Wares wares;

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
        public Builder(DataReq dataReq) {
            super(dataReq);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {dataReq};
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
            if (dataReq == null) {
                return;
            }
            this.f65177common = dataReq.f65176common;
            this.pay_type = dataReq.pay_type;
            this.is_left = dataReq.is_left;
            this.order_url = dataReq.order_url;
            this.mobile = dataReq.mobile;
            this.wares = dataReq.wares;
            this.is_autopay = dataReq.is_autopay;
            this.payment_pos_key = dataReq.payment_pos_key;
            this.refer_page = dataReq.refer_page;
            this.click_zone = dataReq.click_zone;
            this.wallet_sdk_ua = dataReq.wallet_sdk_ua;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new DataReq(this, z, null) : (DataReq) invokeZ.objValue;
        }
    }

    /* loaded from: classes5.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(1502074164, "Ltbclient/GetOrder/DataReq;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(1502074164, "Ltbclient/GetOrder/DataReq;");
                return;
            }
        }
        DEFAULT_PAY_TYPE = 0;
        DEFAULT_IS_LEFT = 0;
        DEFAULT_IS_AUTOPAY = 0;
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
            this.f65176common = builder.f65177common;
            Integer num = builder.pay_type;
            if (num == null) {
                this.pay_type = DEFAULT_PAY_TYPE;
            } else {
                this.pay_type = num;
            }
            Integer num2 = builder.is_left;
            if (num2 == null) {
                this.is_left = DEFAULT_IS_LEFT;
            } else {
                this.is_left = num2;
            }
            String str = builder.order_url;
            if (str == null) {
                this.order_url = "";
            } else {
                this.order_url = str;
            }
            String str2 = builder.mobile;
            if (str2 == null) {
                this.mobile = "";
            } else {
                this.mobile = str2;
            }
            this.wares = builder.wares;
            Integer num3 = builder.is_autopay;
            if (num3 == null) {
                this.is_autopay = DEFAULT_IS_AUTOPAY;
            } else {
                this.is_autopay = num3;
            }
            String str3 = builder.payment_pos_key;
            if (str3 == null) {
                this.payment_pos_key = "";
            } else {
                this.payment_pos_key = str3;
            }
            String str4 = builder.refer_page;
            if (str4 == null) {
                this.refer_page = "";
            } else {
                this.refer_page = str4;
            }
            String str5 = builder.click_zone;
            if (str5 == null) {
                this.click_zone = "";
            } else {
                this.click_zone = str5;
            }
            String str6 = builder.wallet_sdk_ua;
            if (str6 == null) {
                this.wallet_sdk_ua = "";
                return;
            } else {
                this.wallet_sdk_ua = str6;
                return;
            }
        }
        this.f65176common = builder.f65177common;
        this.pay_type = builder.pay_type;
        this.is_left = builder.is_left;
        this.order_url = builder.order_url;
        this.mobile = builder.mobile;
        this.wares = builder.wares;
        this.is_autopay = builder.is_autopay;
        this.payment_pos_key = builder.payment_pos_key;
        this.refer_page = builder.refer_page;
        this.click_zone = builder.click_zone;
        this.wallet_sdk_ua = builder.wallet_sdk_ua;
    }
}
