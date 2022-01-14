package tbclient.ForumPersonas;

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
public final class OnlineTimes extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_END = "";
    public static final Integer DEFAULT_SEQ;
    public static final String DEFAULT_START = "";
    public static final String DEFAULT_TIME = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String end;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer seq;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String start;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String time;

    /* loaded from: classes5.dex */
    public static final class Builder extends Message.Builder<OnlineTimes> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String end;
        public Integer seq;
        public String start;
        public String time;

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
        public Builder(OnlineTimes onlineTimes) {
            super(onlineTimes);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {onlineTimes};
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
            if (onlineTimes == null) {
                return;
            }
            this.time = onlineTimes.time;
            this.start = onlineTimes.start;
            this.end = onlineTimes.end;
            this.seq = onlineTimes.seq;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public OnlineTimes build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new OnlineTimes(this, z, null) : (OnlineTimes) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-765288807, "Ltbclient/ForumPersonas/OnlineTimes;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-765288807, "Ltbclient/ForumPersonas/OnlineTimes;");
                return;
            }
        }
        DEFAULT_SEQ = 0;
    }

    public /* synthetic */ OnlineTimes(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnlineTimes(Builder builder, boolean z) {
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
            String str = builder.time;
            if (str == null) {
                this.time = "";
            } else {
                this.time = str;
            }
            String str2 = builder.start;
            if (str2 == null) {
                this.start = "";
            } else {
                this.start = str2;
            }
            String str3 = builder.end;
            if (str3 == null) {
                this.end = "";
            } else {
                this.end = str3;
            }
            Integer num = builder.seq;
            if (num == null) {
                this.seq = DEFAULT_SEQ;
                return;
            } else {
                this.seq = num;
                return;
            }
        }
        this.time = builder.time;
        this.start = builder.start;
        this.end = builder.end;
        this.seq = builder.seq;
    }
}
