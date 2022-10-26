package tbclient.GetGambleResult;

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
public final class Winnner extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_PORTRAIT = "";
    public static final Integer DEFAULT_SCORE;
    public static final Integer DEFAULT_TIME;
    public static final Integer DEFAULT_TYPE;
    public static final String DEFAULT_USER_NAME = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String portrait;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer score;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer time;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer type;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String user_name;

    /* loaded from: classes9.dex */
    public /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public final class Builder extends Message.Builder {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String portrait;
        public Integer score;
        public Integer time;
        public Integer type;
        public String user_name;

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
        public Builder(Winnner winnner) {
            super(winnner);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {winnner};
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
            if (winnner == null) {
                return;
            }
            this.user_name = winnner.user_name;
            this.portrait = winnner.portrait;
            this.score = winnner.score;
            this.time = winnner.time;
            this.type = winnner.type;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Winnner build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new Winnner(this, z, null);
            }
            return (Winnner) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-1611393712, "Ltbclient/GetGambleResult/Winnner;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-1611393712, "Ltbclient/GetGambleResult/Winnner;");
                return;
            }
        }
        DEFAULT_SCORE = 0;
        DEFAULT_TIME = 0;
        DEFAULT_TYPE = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Winnner(Builder builder, boolean z) {
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
            String str = builder.user_name;
            if (str == null) {
                this.user_name = "";
            } else {
                this.user_name = str;
            }
            String str2 = builder.portrait;
            if (str2 == null) {
                this.portrait = "";
            } else {
                this.portrait = str2;
            }
            Integer num = builder.score;
            if (num == null) {
                this.score = DEFAULT_SCORE;
            } else {
                this.score = num;
            }
            Integer num2 = builder.time;
            if (num2 == null) {
                this.time = DEFAULT_TIME;
            } else {
                this.time = num2;
            }
            Integer num3 = builder.type;
            if (num3 == null) {
                this.type = DEFAULT_TYPE;
                return;
            } else {
                this.type = num3;
                return;
            }
        }
        this.user_name = builder.user_name;
        this.portrait = builder.portrait;
        this.score = builder.score;
        this.time = builder.time;
        this.type = builder.type;
    }

    public /* synthetic */ Winnner(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
