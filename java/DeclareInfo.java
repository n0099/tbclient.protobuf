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
public final class DeclareInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Integer DEFAULT_DECLARE_ID;
    public static final Long DEFAULT_DECLARE_NUM;
    public static final String DEFAULT_DECLARE_TEXT = "";
    public static final String DEFAULT_DECLARE_URL = "";
    public static final Integer DEFAULT_IS_DECLARE;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer declare_id;
    @ProtoField(tag = 4, type = Message.Datatype.UINT64)
    public final Long declare_num;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String declare_text;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String declare_url;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer is_declare;

    /* loaded from: classes9.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<DeclareInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer declare_id;
        public Long declare_num;
        public String declare_text;
        public String declare_url;
        public Integer is_declare;

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
        public Builder(DeclareInfo declareInfo) {
            super(declareInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {declareInfo};
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
            if (declareInfo == null) {
                return;
            }
            this.declare_id = declareInfo.declare_id;
            this.declare_url = declareInfo.declare_url;
            this.declare_text = declareInfo.declare_text;
            this.declare_num = declareInfo.declare_num;
            this.is_declare = declareInfo.is_declare;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DeclareInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new DeclareInfo(this, z, null);
            }
            return (DeclareInfo) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(76404717, "Ltbclient/DeclareInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(76404717, "Ltbclient/DeclareInfo;");
                return;
            }
        }
        DEFAULT_DECLARE_ID = 0;
        DEFAULT_DECLARE_NUM = 0L;
        DEFAULT_IS_DECLARE = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeclareInfo(Builder builder, boolean z) {
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
            Integer num = builder.declare_id;
            if (num == null) {
                this.declare_id = DEFAULT_DECLARE_ID;
            } else {
                this.declare_id = num;
            }
            String str = builder.declare_url;
            if (str == null) {
                this.declare_url = "";
            } else {
                this.declare_url = str;
            }
            String str2 = builder.declare_text;
            if (str2 == null) {
                this.declare_text = "";
            } else {
                this.declare_text = str2;
            }
            Long l = builder.declare_num;
            if (l == null) {
                this.declare_num = DEFAULT_DECLARE_NUM;
            } else {
                this.declare_num = l;
            }
            Integer num2 = builder.is_declare;
            if (num2 == null) {
                this.is_declare = DEFAULT_IS_DECLARE;
                return;
            } else {
                this.is_declare = num2;
                return;
            }
        }
        this.declare_id = builder.declare_id;
        this.declare_url = builder.declare_url;
        this.declare_text = builder.declare_text;
        this.declare_num = builder.declare_num;
        this.is_declare = builder.is_declare;
    }

    public /* synthetic */ DeclareInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
