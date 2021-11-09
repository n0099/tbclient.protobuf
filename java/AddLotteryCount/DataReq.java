package tbclient.AddLotteryCount;

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
/* loaded from: classes3.dex */
public final class DataReq extends Message {
    public static /* synthetic */ Interceptable $ic;
    public static final Long DEFAULT_AWARD_ACT_ID;
    public static final Integer DEFAULT_FROM_TYPE;
    public static final Long DEFAULT_THREAD_ID;
    public static final Long DEFAULT_USER_ID;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long award_act_id;
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f72738common;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer from_type;
    @ProtoField(tag = 5, type = Message.Datatype.INT64)
    public final Long thread_id;
    @ProtoField(tag = 3, type = Message.Datatype.INT64)
    public final Long user_id;

    /* loaded from: classes3.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Long award_act_id;

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f72739common;
        public Integer from_type;
        public Long thread_id;
        public Long user_id;

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
            this.f72739common = dataReq.f72738common;
            this.award_act_id = dataReq.award_act_id;
            this.user_id = dataReq.user_id;
            this.from_type = dataReq.from_type;
            this.thread_id = dataReq.thread_id;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new DataReq(this, z, null) : (DataReq) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(1848143801, "Ltbclient/AddLotteryCount/DataReq;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(1848143801, "Ltbclient/AddLotteryCount/DataReq;");
                return;
            }
        }
        DEFAULT_AWARD_ACT_ID = 0L;
        DEFAULT_USER_ID = 0L;
        DEFAULT_FROM_TYPE = 0;
        DEFAULT_THREAD_ID = 0L;
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
            this.f72738common = builder.f72739common;
            Long l = builder.award_act_id;
            if (l == null) {
                this.award_act_id = DEFAULT_AWARD_ACT_ID;
            } else {
                this.award_act_id = l;
            }
            Long l2 = builder.user_id;
            if (l2 == null) {
                this.user_id = DEFAULT_USER_ID;
            } else {
                this.user_id = l2;
            }
            Integer num = builder.from_type;
            if (num == null) {
                this.from_type = DEFAULT_FROM_TYPE;
            } else {
                this.from_type = num;
            }
            Long l3 = builder.thread_id;
            if (l3 == null) {
                this.thread_id = DEFAULT_THREAD_ID;
                return;
            } else {
                this.thread_id = l3;
                return;
            }
        }
        this.f72738common = builder.f72739common;
        this.award_act_id = builder.award_act_id;
        this.user_id = builder.user_id;
        this.from_type = builder.from_type;
        this.thread_id = builder.thread_id;
    }
}
