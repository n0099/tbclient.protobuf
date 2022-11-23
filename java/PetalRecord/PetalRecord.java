package tbclient.PetalRecord;

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
public final class PetalRecord extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Long DEFAULT_CREATE_TIME;
    public static final String DEFAULT_FLOW_TYPE = "";
    public static final Integer DEFAULT_PETAL_NUM;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 3, type = Message.Datatype.UINT64)
    public final Long create_time;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String flow_type;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer petal_num;

    /* loaded from: classes9.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<PetalRecord> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Long create_time;
        public String flow_type;
        public Integer petal_num;

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
        public Builder(PetalRecord petalRecord) {
            super(petalRecord);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {petalRecord};
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
            if (petalRecord == null) {
                return;
            }
            this.flow_type = petalRecord.flow_type;
            this.petal_num = petalRecord.petal_num;
            this.create_time = petalRecord.create_time;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PetalRecord build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new PetalRecord(this, z, null);
            }
            return (PetalRecord) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-939820226, "Ltbclient/PetalRecord/PetalRecord;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-939820226, "Ltbclient/PetalRecord/PetalRecord;");
                return;
            }
        }
        DEFAULT_PETAL_NUM = 0;
        DEFAULT_CREATE_TIME = 0L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PetalRecord(Builder builder, boolean z) {
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
            String str = builder.flow_type;
            if (str == null) {
                this.flow_type = "";
            } else {
                this.flow_type = str;
            }
            Integer num = builder.petal_num;
            if (num == null) {
                this.petal_num = DEFAULT_PETAL_NUM;
            } else {
                this.petal_num = num;
            }
            Long l = builder.create_time;
            if (l == null) {
                this.create_time = DEFAULT_CREATE_TIME;
                return;
            } else {
                this.create_time = l;
                return;
            }
        }
        this.flow_type = builder.flow_type;
        this.petal_num = builder.petal_num;
        this.create_time = builder.create_time;
    }

    public /* synthetic */ PetalRecord(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
