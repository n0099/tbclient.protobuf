package tbclient.PlaceOrder;

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
/* loaded from: classes2.dex */
public final class DataReq extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Long DEFAULT_ACCOUNT_ID;
    public static final Integer DEFAULT_ACCOUNT_TYPE;
    public static final Long DEFAULT_BENEFIT_USERID;
    public static final String DEFAULT_BENEFIT_USERNAME = "";
    public static final Integer DEFAULT_CURRENCY;
    public static final Integer DEFAULT_GIFT_ID;
    public static final Integer DEFAULT_NUM;
    public static final Long DEFAULT_POST_ID;
    public static final String DEFAULT_SCENE_FROM = "";
    public static final Long DEFAULT_THREAD_ID;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 9, type = Message.Datatype.INT64)
    public final Long account_id;
    @ProtoField(tag = 10, type = Message.Datatype.INT32)
    public final Integer account_type;
    @ProtoField(tag = 4, type = Message.Datatype.UINT64)
    public final Long benefit_userid;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String benefit_username;
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f79383common;
    @ProtoField(tag = 13, type = Message.Datatype.UINT32)
    public final Integer currency;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer gift_id;
    @ProtoField(tag = 6, type = Message.Datatype.UINT32)
    public final Integer num;
    @ProtoField(tag = 8, type = Message.Datatype.UINT64)
    public final Long post_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String scene_from;
    @ProtoField(tag = 7, type = Message.Datatype.UINT64)
    public final Long thread_id;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Long account_id;
        public Integer account_type;
        public Long benefit_userid;
        public String benefit_username;

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f79384common;
        public Integer currency;
        public Integer gift_id;
        public Integer num;
        public Long post_id;
        public String scene_from;
        public Long thread_id;

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
            this.f79384common = dataReq.f79383common;
            this.scene_from = dataReq.scene_from;
            this.gift_id = dataReq.gift_id;
            this.benefit_userid = dataReq.benefit_userid;
            this.benefit_username = dataReq.benefit_username;
            this.num = dataReq.num;
            this.thread_id = dataReq.thread_id;
            this.post_id = dataReq.post_id;
            this.account_id = dataReq.account_id;
            this.account_type = dataReq.account_type;
            this.currency = dataReq.currency;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new DataReq(this, z, null) : (DataReq) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(98506661, "Ltbclient/PlaceOrder/DataReq;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(98506661, "Ltbclient/PlaceOrder/DataReq;");
                return;
            }
        }
        DEFAULT_GIFT_ID = 0;
        DEFAULT_BENEFIT_USERID = 0L;
        DEFAULT_NUM = 0;
        DEFAULT_THREAD_ID = 0L;
        DEFAULT_POST_ID = 0L;
        DEFAULT_ACCOUNT_ID = 0L;
        DEFAULT_ACCOUNT_TYPE = 0;
        DEFAULT_CURRENCY = 0;
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
            this.f79383common = builder.f79384common;
            String str = builder.scene_from;
            if (str == null) {
                this.scene_from = "";
            } else {
                this.scene_from = str;
            }
            Integer num = builder.gift_id;
            if (num == null) {
                this.gift_id = DEFAULT_GIFT_ID;
            } else {
                this.gift_id = num;
            }
            Long l = builder.benefit_userid;
            if (l == null) {
                this.benefit_userid = DEFAULT_BENEFIT_USERID;
            } else {
                this.benefit_userid = l;
            }
            String str2 = builder.benefit_username;
            if (str2 == null) {
                this.benefit_username = "";
            } else {
                this.benefit_username = str2;
            }
            Integer num2 = builder.num;
            if (num2 == null) {
                this.num = DEFAULT_NUM;
            } else {
                this.num = num2;
            }
            Long l2 = builder.thread_id;
            if (l2 == null) {
                this.thread_id = DEFAULT_THREAD_ID;
            } else {
                this.thread_id = l2;
            }
            Long l3 = builder.post_id;
            if (l3 == null) {
                this.post_id = DEFAULT_POST_ID;
            } else {
                this.post_id = l3;
            }
            Long l4 = builder.account_id;
            if (l4 == null) {
                this.account_id = DEFAULT_ACCOUNT_ID;
            } else {
                this.account_id = l4;
            }
            Integer num3 = builder.account_type;
            if (num3 == null) {
                this.account_type = DEFAULT_ACCOUNT_TYPE;
            } else {
                this.account_type = num3;
            }
            Integer num4 = builder.currency;
            if (num4 == null) {
                this.currency = DEFAULT_CURRENCY;
                return;
            } else {
                this.currency = num4;
                return;
            }
        }
        this.f79383common = builder.f79384common;
        this.scene_from = builder.scene_from;
        this.gift_id = builder.gift_id;
        this.benefit_userid = builder.benefit_userid;
        this.benefit_username = builder.benefit_username;
        this.num = builder.num;
        this.thread_id = builder.thread_id;
        this.post_id = builder.post_id;
        this.account_id = builder.account_id;
        this.account_type = builder.account_type;
        this.currency = builder.currency;
    }
}
