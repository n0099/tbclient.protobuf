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
/* loaded from: classes3.dex */
public final class Balv extends Message {
    public static /* synthetic */ Interceptable $ic;
    public static final Integer DEFAULT_DAYS_TOFREE;
    public static final Integer DEFAULT_IS_BLACK;
    public static final Integer DEFAULT_IS_BLOCK;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer days_tofree;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer is_black;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer is_block;

    /* loaded from: classes3.dex */
    public static final class Builder extends Message.Builder<Balv> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer days_tofree;
        public Integer is_black;
        public Integer is_block;

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
        public Builder(Balv balv) {
            super(balv);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {balv};
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
            if (balv == null) {
                return;
            }
            this.is_black = balv.is_black;
            this.is_block = balv.is_block;
            this.days_tofree = balv.days_tofree;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Balv build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new Balv(this, z, null) : (Balv) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-1104108376, "Ltbclient/Balv;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-1104108376, "Ltbclient/Balv;");
                return;
            }
        }
        DEFAULT_IS_BLACK = 0;
        DEFAULT_IS_BLOCK = 0;
        DEFAULT_DAYS_TOFREE = 0;
    }

    public /* synthetic */ Balv(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Balv(Builder builder, boolean z) {
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
            Integer num = builder.is_black;
            if (num == null) {
                this.is_black = DEFAULT_IS_BLACK;
            } else {
                this.is_black = num;
            }
            Integer num2 = builder.is_block;
            if (num2 == null) {
                this.is_block = DEFAULT_IS_BLOCK;
            } else {
                this.is_block = num2;
            }
            Integer num3 = builder.days_tofree;
            if (num3 == null) {
                this.days_tofree = DEFAULT_DAYS_TOFREE;
                return;
            } else {
                this.days_tofree = num3;
                return;
            }
        }
        this.is_black = builder.is_black;
        this.is_block = builder.is_block;
        this.days_tofree = builder.days_tofree;
    }
}
