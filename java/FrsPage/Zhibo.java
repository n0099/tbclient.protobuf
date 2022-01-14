package tbclient.FrsPage;

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
/* loaded from: classes5.dex */
public final class Zhibo extends Message {
    public static /* synthetic */ Interceptable $ic;
    public static final Long DEFAULT_FORUM;
    public static final Integer DEFAULT_HAS_LPOST;
    public static final Integer DEFAULT_INT1;
    public static final Integer DEFAULT_LPOST_TYPE;
    public static final Integer DEFAULT_STATUS;
    public static final Long DEFAULT_TID;
    public static final Integer DEFAULT_TYPE;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long forum;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer has_lpost;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer int1;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer lpost_type;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer status;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long tid;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer type;

    /* loaded from: classes5.dex */
    public static final class Builder extends Message.Builder<Zhibo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Long forum;
        public Integer has_lpost;
        public Integer int1;
        public Integer lpost_type;
        public Integer status;
        public Long tid;
        public Integer type;

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
        public Builder(Zhibo zhibo) {
            super(zhibo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {zhibo};
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
            if (zhibo == null) {
                return;
            }
            this.forum = zhibo.forum;
            this.tid = zhibo.tid;
            this.status = zhibo.status;
            this.type = zhibo.type;
            this.int1 = zhibo.int1;
            this.has_lpost = zhibo.has_lpost;
            this.lpost_type = zhibo.lpost_type;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Zhibo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new Zhibo(this, z, null) : (Zhibo) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(1251450902, "Ltbclient/FrsPage/Zhibo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(1251450902, "Ltbclient/FrsPage/Zhibo;");
                return;
            }
        }
        DEFAULT_FORUM = 0L;
        DEFAULT_TID = 0L;
        DEFAULT_STATUS = 0;
        DEFAULT_TYPE = 0;
        DEFAULT_INT1 = 0;
        DEFAULT_HAS_LPOST = 0;
        DEFAULT_LPOST_TYPE = 0;
    }

    public /* synthetic */ Zhibo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Zhibo(Builder builder, boolean z) {
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
            Long l = builder.forum;
            if (l == null) {
                this.forum = DEFAULT_FORUM;
            } else {
                this.forum = l;
            }
            Long l2 = builder.tid;
            if (l2 == null) {
                this.tid = DEFAULT_TID;
            } else {
                this.tid = l2;
            }
            Integer num = builder.status;
            if (num == null) {
                this.status = DEFAULT_STATUS;
            } else {
                this.status = num;
            }
            Integer num2 = builder.type;
            if (num2 == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = num2;
            }
            Integer num3 = builder.int1;
            if (num3 == null) {
                this.int1 = DEFAULT_INT1;
            } else {
                this.int1 = num3;
            }
            Integer num4 = builder.has_lpost;
            if (num4 == null) {
                this.has_lpost = DEFAULT_HAS_LPOST;
            } else {
                this.has_lpost = num4;
            }
            Integer num5 = builder.lpost_type;
            if (num5 == null) {
                this.lpost_type = DEFAULT_LPOST_TYPE;
                return;
            } else {
                this.lpost_type = num5;
                return;
            }
        }
        this.forum = builder.forum;
        this.tid = builder.tid;
        this.status = builder.status;
        this.type = builder.type;
        this.int1 = builder.int1;
        this.has_lpost = builder.has_lpost;
        this.lpost_type = builder.lpost_type;
    }
}
