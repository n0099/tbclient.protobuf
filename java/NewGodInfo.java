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
public final class NewGodInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Integer DEFAULT_FIELD_ID;
    public static final String DEFAULT_FIELD_NAME = "";
    public static final Integer DEFAULT_STATUS;
    public static final Integer DEFAULT_TYPE;
    public static final String DEFAULT_TYPE_NAME = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer field_id;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String field_name;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer status;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer type;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String type_name;

    /* loaded from: classes9.dex */
    public /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public final class Builder extends Message.Builder {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer field_id;
        public String field_name;
        public Integer status;
        public Integer type;
        public String type_name;

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
        public Builder(NewGodInfo newGodInfo) {
            super(newGodInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {newGodInfo};
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
            if (newGodInfo == null) {
                return;
            }
            this.status = newGodInfo.status;
            this.field_id = newGodInfo.field_id;
            this.field_name = newGodInfo.field_name;
            this.type = newGodInfo.type;
            this.type_name = newGodInfo.type_name;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public NewGodInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new NewGodInfo(this, z, null);
            }
            return (NewGodInfo) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(357899463, "Ltbclient/NewGodInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(357899463, "Ltbclient/NewGodInfo;");
                return;
            }
        }
        DEFAULT_STATUS = 0;
        DEFAULT_FIELD_ID = 0;
        DEFAULT_TYPE = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewGodInfo(Builder builder, boolean z) {
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
            Integer num = builder.status;
            if (num == null) {
                this.status = DEFAULT_STATUS;
            } else {
                this.status = num;
            }
            Integer num2 = builder.field_id;
            if (num2 == null) {
                this.field_id = DEFAULT_FIELD_ID;
            } else {
                this.field_id = num2;
            }
            String str = builder.field_name;
            if (str == null) {
                this.field_name = "";
            } else {
                this.field_name = str;
            }
            Integer num3 = builder.type;
            if (num3 == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = num3;
            }
            String str2 = builder.type_name;
            if (str2 == null) {
                this.type_name = "";
                return;
            } else {
                this.type_name = str2;
                return;
            }
        }
        this.status = builder.status;
        this.field_id = builder.field_id;
        this.field_name = builder.field_name;
        this.type = builder.type;
        this.type_name = builder.type_name;
    }

    public /* synthetic */ NewGodInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
