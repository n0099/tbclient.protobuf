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
/* loaded from: classes4.dex */
public final class Fans extends Message {
    public static /* synthetic */ Interceptable $ic;
    public static final Integer DEFAULT_IS_GET;
    public static final Integer DEFAULT_LEFT_TIME;
    public static final Integer DEFAULT_NUM;
    public static final Integer DEFAULT_OPEN;
    public static final Integer DEFAULT_START_TIME;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer is_get;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer left_time;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer num;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer open;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer start_time;

    /* loaded from: classes4.dex */
    public static final class Builder extends Message.Builder<Fans> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer is_get;
        public Integer left_time;
        public Integer num;
        public Integer open;
        public Integer start_time;

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
        public Builder(Fans fans) {
            super(fans);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {fans};
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
            if (fans == null) {
                return;
            }
            this.start_time = fans.start_time;
            this.left_time = fans.left_time;
            this.open = fans.open;
            this.is_get = fans.is_get;
            this.num = fans.num;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Fans build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new Fans(this, z, null) : (Fans) invokeZ.objValue;
        }
    }

    /* loaded from: classes4.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-1086682952, "Ltbclient/FrsPage/Fans;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-1086682952, "Ltbclient/FrsPage/Fans;");
                return;
            }
        }
        DEFAULT_START_TIME = 0;
        DEFAULT_LEFT_TIME = 0;
        DEFAULT_OPEN = 0;
        DEFAULT_IS_GET = 0;
        DEFAULT_NUM = 0;
    }

    public /* synthetic */ Fans(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Fans(Builder builder, boolean z) {
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
            Integer num = builder.start_time;
            if (num == null) {
                this.start_time = DEFAULT_START_TIME;
            } else {
                this.start_time = num;
            }
            Integer num2 = builder.left_time;
            if (num2 == null) {
                this.left_time = DEFAULT_LEFT_TIME;
            } else {
                this.left_time = num2;
            }
            Integer num3 = builder.open;
            if (num3 == null) {
                this.open = DEFAULT_OPEN;
            } else {
                this.open = num3;
            }
            Integer num4 = builder.is_get;
            if (num4 == null) {
                this.is_get = DEFAULT_IS_GET;
            } else {
                this.is_get = num4;
            }
            Integer num5 = builder.num;
            if (num5 == null) {
                this.num = DEFAULT_NUM;
                return;
            } else {
                this.num = num5;
                return;
            }
        }
        this.start_time = builder.start_time;
        this.left_time = builder.left_time;
        this.open = builder.open;
        this.is_get = builder.is_get;
        this.num = builder.num;
    }
}
