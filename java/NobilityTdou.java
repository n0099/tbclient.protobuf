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
public final class NobilityTdou extends Message {
    public static /* synthetic */ Interceptable $ic;
    public static final Integer DEFAULT_CLEAR_TIME;
    public static final Integer DEFAULT_EXPIRE_TIME;
    public static final Integer DEFAULT_STATUS;
    public static final Long DEFAULT_TDOU_NUM;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer clear_time;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer expire_time;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer status;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long tdou_num;

    /* loaded from: classes9.dex */
    public /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public final class Builder extends Message.Builder {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer clear_time;
        public Integer expire_time;
        public Integer status;
        public Long tdou_num;

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
        public Builder(NobilityTdou nobilityTdou) {
            super(nobilityTdou);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {nobilityTdou};
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
            if (nobilityTdou == null) {
                return;
            }
            this.tdou_num = nobilityTdou.tdou_num;
            this.status = nobilityTdou.status;
            this.expire_time = nobilityTdou.expire_time;
            this.clear_time = nobilityTdou.clear_time;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public NobilityTdou build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new NobilityTdou(this, z, null);
            }
            return (NobilityTdou) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-612902511, "Ltbclient/NobilityTdou;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-612902511, "Ltbclient/NobilityTdou;");
                return;
            }
        }
        DEFAULT_TDOU_NUM = 0L;
        DEFAULT_STATUS = 0;
        DEFAULT_EXPIRE_TIME = 0;
        DEFAULT_CLEAR_TIME = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NobilityTdou(Builder builder, boolean z) {
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
            Long l = builder.tdou_num;
            if (l == null) {
                this.tdou_num = DEFAULT_TDOU_NUM;
            } else {
                this.tdou_num = l;
            }
            Integer num = builder.status;
            if (num == null) {
                this.status = DEFAULT_STATUS;
            } else {
                this.status = num;
            }
            Integer num2 = builder.expire_time;
            if (num2 == null) {
                this.expire_time = DEFAULT_EXPIRE_TIME;
            } else {
                this.expire_time = num2;
            }
            Integer num3 = builder.clear_time;
            if (num3 == null) {
                this.clear_time = DEFAULT_CLEAR_TIME;
                return;
            } else {
                this.clear_time = num3;
                return;
            }
        }
        this.tdou_num = builder.tdou_num;
        this.status = builder.status;
        this.expire_time = builder.expire_time;
        this.clear_time = builder.clear_time;
    }

    public /* synthetic */ NobilityTdou(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
