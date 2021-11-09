package tbclient.UserMuteCheck;

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
    public static final Integer DEFAULT_MUTE_TYPE;
    public static final Long DEFAULT_USER_ID_F;
    public static final Long DEFAULT_USER_ID_T;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f73094common;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer mute_type;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long user_id_f;
    @ProtoField(tag = 3, type = Message.Datatype.INT64)
    public final Long user_id_t;

    /* loaded from: classes3.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f73095common;
        public Integer mute_type;
        public Long user_id_f;
        public Long user_id_t;

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
            this.f73095common = dataReq.f73094common;
            this.user_id_f = dataReq.user_id_f;
            this.user_id_t = dataReq.user_id_t;
            this.mute_type = dataReq.mute_type;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-367363460, "Ltbclient/UserMuteCheck/DataReq;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-367363460, "Ltbclient/UserMuteCheck/DataReq;");
                return;
            }
        }
        DEFAULT_USER_ID_F = 0L;
        DEFAULT_USER_ID_T = 0L;
        DEFAULT_MUTE_TYPE = 0;
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
            this.f73094common = builder.f73095common;
            Long l = builder.user_id_f;
            if (l == null) {
                this.user_id_f = DEFAULT_USER_ID_F;
            } else {
                this.user_id_f = l;
            }
            Long l2 = builder.user_id_t;
            if (l2 == null) {
                this.user_id_t = DEFAULT_USER_ID_T;
            } else {
                this.user_id_t = l2;
            }
            Integer num = builder.mute_type;
            if (num == null) {
                this.mute_type = DEFAULT_MUTE_TYPE;
                return;
            } else {
                this.mute_type = num;
                return;
            }
        }
        this.f73094common = builder.f73095common;
        this.user_id_f = builder.user_id_f;
        this.user_id_t = builder.user_id_t;
        this.mute_type = builder.mute_type;
    }
}
