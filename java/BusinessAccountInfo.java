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
/* loaded from: classes8.dex */
public final class BusinessAccountInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_BUSINESS_NAME = "";
    public static final String DEFAULT_IDENTIFI_EXPLAIN = "";
    public static final Integer DEFAULT_IS_BUSINESS_ACCOUNT;
    public static final Integer DEFAULT_IS_FORUM_BUSINESS_ACCOUNT;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String business_name;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String identifi_explain;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer is_business_account;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer is_forum_business_account;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<BusinessAccountInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String business_name;
        public String identifi_explain;
        public Integer is_business_account;
        public Integer is_forum_business_account;

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
        public Builder(BusinessAccountInfo businessAccountInfo) {
            super(businessAccountInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {businessAccountInfo};
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
            if (businessAccountInfo == null) {
                return;
            }
            this.is_business_account = businessAccountInfo.is_business_account;
            this.is_forum_business_account = businessAccountInfo.is_forum_business_account;
            this.business_name = businessAccountInfo.business_name;
            this.identifi_explain = businessAccountInfo.identifi_explain;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public BusinessAccountInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new BusinessAccountInfo(this, z, null) : (BusinessAccountInfo) invokeZ.objValue;
        }
    }

    /* loaded from: classes8.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(924253930, "Ltbclient/BusinessAccountInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(924253930, "Ltbclient/BusinessAccountInfo;");
                return;
            }
        }
        DEFAULT_IS_BUSINESS_ACCOUNT = 0;
        DEFAULT_IS_FORUM_BUSINESS_ACCOUNT = 0;
    }

    public /* synthetic */ BusinessAccountInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BusinessAccountInfo(Builder builder, boolean z) {
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
            Integer num = builder.is_business_account;
            if (num == null) {
                this.is_business_account = DEFAULT_IS_BUSINESS_ACCOUNT;
            } else {
                this.is_business_account = num;
            }
            Integer num2 = builder.is_forum_business_account;
            if (num2 == null) {
                this.is_forum_business_account = DEFAULT_IS_FORUM_BUSINESS_ACCOUNT;
            } else {
                this.is_forum_business_account = num2;
            }
            String str = builder.business_name;
            if (str == null) {
                this.business_name = "";
            } else {
                this.business_name = str;
            }
            String str2 = builder.identifi_explain;
            if (str2 == null) {
                this.identifi_explain = "";
                return;
            } else {
                this.identifi_explain = str2;
                return;
            }
        }
        this.is_business_account = builder.is_business_account;
        this.is_forum_business_account = builder.is_forum_business_account;
        this.business_name = builder.business_name;
        this.identifi_explain = builder.identifi_explain;
    }
}
