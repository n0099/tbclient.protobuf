package tbclient.Hottopic;

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
public final class PkModule extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_MODULE_NAME = "";
    public static final Long DEFAULT_PK_ID;
    public static final Integer DEFAULT_PK_TYPE;
    public static final String DEFAULT_QUES_DESC = "";
    public static final Long DEFAULT_USER_PK_ID;
    public static final Integer DEFAULT_USER_PK_INDEX;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String module_name;
    @ProtoField(tag = 3)
    public final PkView pk_1;
    @ProtoField(tag = 4)
    public final PkView pk_2;
    @ProtoField(tag = 5)
    public final PkView pk_3;
    @ProtoField(tag = 8, type = Message.Datatype.UINT64)
    public final Long pk_id;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer pk_type;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String ques_desc;
    @ProtoField(tag = 9, type = Message.Datatype.UINT64)
    public final Long user_pk_id;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer user_pk_index;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<PkModule> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String module_name;
        public PkView pk_1;
        public PkView pk_2;
        public PkView pk_3;
        public Long pk_id;
        public Integer pk_type;
        public String ques_desc;
        public Long user_pk_id;
        public Integer user_pk_index;

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
        public Builder(PkModule pkModule) {
            super(pkModule);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {pkModule};
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
            if (pkModule == null) {
                return;
            }
            this.module_name = pkModule.module_name;
            this.ques_desc = pkModule.ques_desc;
            this.pk_1 = pkModule.pk_1;
            this.pk_2 = pkModule.pk_2;
            this.pk_3 = pkModule.pk_3;
            this.pk_type = pkModule.pk_type;
            this.user_pk_index = pkModule.user_pk_index;
            this.pk_id = pkModule.pk_id;
            this.user_pk_id = pkModule.user_pk_id;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PkModule build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new PkModule(this, z, null) : (PkModule) invokeZ.objValue;
        }
    }

    /* loaded from: classes9.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-1189122479, "Ltbclient/Hottopic/PkModule;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-1189122479, "Ltbclient/Hottopic/PkModule;");
                return;
            }
        }
        DEFAULT_PK_TYPE = 0;
        DEFAULT_USER_PK_INDEX = 0;
        DEFAULT_PK_ID = 0L;
        DEFAULT_USER_PK_ID = 0L;
    }

    public /* synthetic */ PkModule(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PkModule(Builder builder, boolean z) {
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
            String str = builder.module_name;
            if (str == null) {
                this.module_name = "";
            } else {
                this.module_name = str;
            }
            String str2 = builder.ques_desc;
            if (str2 == null) {
                this.ques_desc = "";
            } else {
                this.ques_desc = str2;
            }
            this.pk_1 = builder.pk_1;
            this.pk_2 = builder.pk_2;
            this.pk_3 = builder.pk_3;
            Integer num = builder.pk_type;
            if (num == null) {
                this.pk_type = DEFAULT_PK_TYPE;
            } else {
                this.pk_type = num;
            }
            Integer num2 = builder.user_pk_index;
            if (num2 == null) {
                this.user_pk_index = DEFAULT_USER_PK_INDEX;
            } else {
                this.user_pk_index = num2;
            }
            Long l = builder.pk_id;
            if (l == null) {
                this.pk_id = DEFAULT_PK_ID;
            } else {
                this.pk_id = l;
            }
            Long l2 = builder.user_pk_id;
            if (l2 == null) {
                this.user_pk_id = DEFAULT_USER_PK_ID;
                return;
            } else {
                this.user_pk_id = l2;
                return;
            }
        }
        this.module_name = builder.module_name;
        this.ques_desc = builder.ques_desc;
        this.pk_1 = builder.pk_1;
        this.pk_2 = builder.pk_2;
        this.pk_3 = builder.pk_3;
        this.pk_type = builder.pk_type;
        this.user_pk_index = builder.user_pk_index;
        this.pk_id = builder.pk_id;
        this.user_pk_id = builder.user_pk_id;
    }
}
