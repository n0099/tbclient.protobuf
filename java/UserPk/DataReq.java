package tbclient.UserPk;

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
    public static final Integer DEFAULT_CLICK_TYPE;
    public static final Long DEFAULT_PK_ID;
    public static final Integer DEFAULT_PK_INDEX;
    public static final Integer DEFAULT_PK_TYPE;
    public static final Long DEFAULT_TOPIC_ID;
    public static final Long DEFAULT_USER_PK_ID;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer click_type;
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f74017common;
    @ProtoField(tag = 2, type = Message.Datatype.UINT64)
    public final Long pk_id;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer pk_index;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer pk_type;
    @ProtoField(tag = 3, type = Message.Datatype.UINT64)
    public final Long topic_id;
    @ProtoField(tag = 7, type = Message.Datatype.UINT64)
    public final Long user_pk_id;

    /* loaded from: classes3.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer click_type;

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f74018common;
        public Long pk_id;
        public Integer pk_index;
        public Integer pk_type;
        public Long topic_id;
        public Long user_pk_id;

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
            this.f74018common = dataReq.f74017common;
            this.pk_id = dataReq.pk_id;
            this.topic_id = dataReq.topic_id;
            this.pk_index = dataReq.pk_index;
            this.click_type = dataReq.click_type;
            this.pk_type = dataReq.pk_type;
            this.user_pk_id = dataReq.user_pk_id;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-607137562, "Ltbclient/UserPk/DataReq;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-607137562, "Ltbclient/UserPk/DataReq;");
                return;
            }
        }
        DEFAULT_PK_ID = 0L;
        DEFAULT_TOPIC_ID = 0L;
        DEFAULT_PK_INDEX = 0;
        DEFAULT_CLICK_TYPE = 0;
        DEFAULT_PK_TYPE = 0;
        DEFAULT_USER_PK_ID = 0L;
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
            this.f74017common = builder.f74018common;
            Long l = builder.pk_id;
            if (l == null) {
                this.pk_id = DEFAULT_PK_ID;
            } else {
                this.pk_id = l;
            }
            Long l2 = builder.topic_id;
            if (l2 == null) {
                this.topic_id = DEFAULT_TOPIC_ID;
            } else {
                this.topic_id = l2;
            }
            Integer num = builder.pk_index;
            if (num == null) {
                this.pk_index = DEFAULT_PK_INDEX;
            } else {
                this.pk_index = num;
            }
            Integer num2 = builder.click_type;
            if (num2 == null) {
                this.click_type = DEFAULT_CLICK_TYPE;
            } else {
                this.click_type = num2;
            }
            Integer num3 = builder.pk_type;
            if (num3 == null) {
                this.pk_type = DEFAULT_PK_TYPE;
            } else {
                this.pk_type = num3;
            }
            Long l3 = builder.user_pk_id;
            if (l3 == null) {
                this.user_pk_id = DEFAULT_USER_PK_ID;
                return;
            } else {
                this.user_pk_id = l3;
                return;
            }
        }
        this.f74017common = builder.f74018common;
        this.pk_id = builder.pk_id;
        this.topic_id = builder.topic_id;
        this.pk_index = builder.pk_index;
        this.click_type = builder.click_type;
        this.pk_type = builder.pk_type;
        this.user_pk_id = builder.user_pk_id;
    }
}
