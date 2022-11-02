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
public final class FullLengthNovel extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Integer DEFAULT_BUTTON_HEIGH;
    public static final String DEFAULT_HAS_TRUNCATE = "";
    public static final String DEFAULT_SCHEMA = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer button_heigh;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String has_truncate;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String schema;

    /* loaded from: classes9.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<FullLengthNovel> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer button_heigh;
        public String has_truncate;
        public String schema;

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
        public Builder(FullLengthNovel fullLengthNovel) {
            super(fullLengthNovel);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {fullLengthNovel};
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
            if (fullLengthNovel == null) {
                return;
            }
            this.schema = fullLengthNovel.schema;
            this.has_truncate = fullLengthNovel.has_truncate;
            this.button_heigh = fullLengthNovel.button_heigh;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FullLengthNovel build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new FullLengthNovel(this, z, null);
            }
            return (FullLengthNovel) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-1816235746, "Ltbclient/FullLengthNovel;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-1816235746, "Ltbclient/FullLengthNovel;");
                return;
            }
        }
        DEFAULT_BUTTON_HEIGH = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullLengthNovel(Builder builder, boolean z) {
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
            String str = builder.schema;
            if (str == null) {
                this.schema = "";
            } else {
                this.schema = str;
            }
            String str2 = builder.has_truncate;
            if (str2 == null) {
                this.has_truncate = "";
            } else {
                this.has_truncate = str2;
            }
            Integer num = builder.button_heigh;
            if (num == null) {
                this.button_heigh = DEFAULT_BUTTON_HEIGH;
                return;
            } else {
                this.button_heigh = num;
                return;
            }
        }
        this.schema = builder.schema;
        this.has_truncate = builder.has_truncate;
        this.button_heigh = builder.button_heigh;
    }

    public /* synthetic */ FullLengthNovel(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
