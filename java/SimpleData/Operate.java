package tbclient.SimpleData;

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
public final class Operate extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_APP_NAME = "";
    public static final Integer DEFAULT_APP_STORE_ID;
    public static final String DEFAULT_DESC = "";
    public static final String DEFAULT_PACKAGE_NAME = "";
    public static final String DEFAULT_TYPE = "";
    public static final String DEFAULT_URL = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String app_name;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer app_store_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String desc;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String package_name;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String type;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String url;

    /* loaded from: classes9.dex */
    public /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public final class Builder extends Message.Builder {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String app_name;
        public Integer app_store_id;
        public String desc;
        public String package_name;
        public String type;
        public String url;

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
        public Builder(Operate operate) {
            super(operate);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {operate};
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
            if (operate == null) {
                return;
            }
            this.type = operate.type;
            this.desc = operate.desc;
            this.app_name = operate.app_name;
            this.app_store_id = operate.app_store_id;
            this.url = operate.url;
            this.package_name = operate.package_name;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Operate build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new Operate(this, z, null);
            }
            return (Operate) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(1090823776, "Ltbclient/SimpleData/Operate;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(1090823776, "Ltbclient/SimpleData/Operate;");
                return;
            }
        }
        DEFAULT_APP_STORE_ID = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Operate(Builder builder, boolean z) {
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
            String str = builder.type;
            if (str == null) {
                this.type = "";
            } else {
                this.type = str;
            }
            String str2 = builder.desc;
            if (str2 == null) {
                this.desc = "";
            } else {
                this.desc = str2;
            }
            String str3 = builder.app_name;
            if (str3 == null) {
                this.app_name = "";
            } else {
                this.app_name = str3;
            }
            Integer num = builder.app_store_id;
            if (num == null) {
                this.app_store_id = DEFAULT_APP_STORE_ID;
            } else {
                this.app_store_id = num;
            }
            String str4 = builder.url;
            if (str4 == null) {
                this.url = "";
            } else {
                this.url = str4;
            }
            String str5 = builder.package_name;
            if (str5 == null) {
                this.package_name = "";
                return;
            } else {
                this.package_name = str5;
                return;
            }
        }
        this.type = builder.type;
        this.desc = builder.desc;
        this.app_name = builder.app_name;
        this.app_store_id = builder.app_store_id;
        this.url = builder.url;
        this.package_name = builder.package_name;
    }

    public /* synthetic */ Operate(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
