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
/* loaded from: classes10.dex */
public final class Position extends Message {
    public static /* synthetic */ Interceptable $ic;
    public static final Integer DEFAULT_CARD;
    public static final Integer DEFAULT_FRS;
    public static final Integer DEFAULT_HOME;
    public static final Integer DEFAULT_PB;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer card;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer frs;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer home;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer pb;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<Position> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer card;
        public Integer frs;
        public Integer home;
        public Integer pb;

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
        public Builder(Position position) {
            super(position);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {position};
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
            if (position == null) {
                return;
            }
            this.frs = position.frs;
            this.pb = position.pb;
            this.home = position.home;
            this.card = position.card;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Position build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new Position(this, z, null) : (Position) invokeZ.objValue;
        }
    }

    /* loaded from: classes10.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(1610472072, "Ltbclient/Position;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(1610472072, "Ltbclient/Position;");
                return;
            }
        }
        DEFAULT_FRS = 0;
        DEFAULT_PB = 0;
        DEFAULT_HOME = 0;
        DEFAULT_CARD = 0;
    }

    public /* synthetic */ Position(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Position(Builder builder, boolean z) {
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
            Integer num = builder.frs;
            if (num == null) {
                this.frs = DEFAULT_FRS;
            } else {
                this.frs = num;
            }
            Integer num2 = builder.pb;
            if (num2 == null) {
                this.pb = DEFAULT_PB;
            } else {
                this.pb = num2;
            }
            Integer num3 = builder.home;
            if (num3 == null) {
                this.home = DEFAULT_HOME;
            } else {
                this.home = num3;
            }
            Integer num4 = builder.card;
            if (num4 == null) {
                this.card = DEFAULT_CARD;
                return;
            } else {
                this.card = num4;
                return;
            }
        }
        this.frs = builder.frs;
        this.pb = builder.pb;
        this.home = builder.home;
        this.card = builder.card;
    }
}
