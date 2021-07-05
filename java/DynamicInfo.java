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
public final class DynamicInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Long DEFAULT_DYNAMIC_TIMESTAMP;
    public static final String DEFAULT_IS_HIDE = "";
    public static final Integer DEFAULT_TYPE;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long dynamic_timestamp;
    @ProtoField(tag = 3)
    public final ForumDynamic forum_dynamic;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String is_hide;
    @ProtoField(tag = 1)
    public final ThreadInfo thread_dynamic;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer type;
    @ProtoField(tag = 4)
    public final UserDynamic user_dynamic;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<DynamicInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Long dynamic_timestamp;
        public ForumDynamic forum_dynamic;
        public String is_hide;
        public ThreadInfo thread_dynamic;
        public Integer type;
        public UserDynamic user_dynamic;

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
        public Builder(DynamicInfo dynamicInfo) {
            super(dynamicInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {dynamicInfo};
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
            if (dynamicInfo == null) {
                return;
            }
            this.thread_dynamic = dynamicInfo.thread_dynamic;
            this.dynamic_timestamp = dynamicInfo.dynamic_timestamp;
            this.forum_dynamic = dynamicInfo.forum_dynamic;
            this.user_dynamic = dynamicInfo.user_dynamic;
            this.type = dynamicInfo.type;
            this.is_hide = dynamicInfo.is_hide;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DynamicInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new DynamicInfo(this, z, null) : (DynamicInfo) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-978372040, "Ltbclient/DynamicInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-978372040, "Ltbclient/DynamicInfo;");
                return;
            }
        }
        DEFAULT_DYNAMIC_TIMESTAMP = 0L;
        DEFAULT_TYPE = 0;
    }

    public /* synthetic */ DynamicInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DynamicInfo(Builder builder, boolean z) {
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
            this.thread_dynamic = builder.thread_dynamic;
            Long l = builder.dynamic_timestamp;
            if (l == null) {
                this.dynamic_timestamp = DEFAULT_DYNAMIC_TIMESTAMP;
            } else {
                this.dynamic_timestamp = l;
            }
            this.forum_dynamic = builder.forum_dynamic;
            this.user_dynamic = builder.user_dynamic;
            Integer num = builder.type;
            if (num == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = num;
            }
            String str = builder.is_hide;
            if (str == null) {
                this.is_hide = "";
                return;
            } else {
                this.is_hide = str;
                return;
            }
        }
        this.thread_dynamic = builder.thread_dynamic;
        this.dynamic_timestamp = builder.dynamic_timestamp;
        this.forum_dynamic = builder.forum_dynamic;
        this.user_dynamic = builder.user_dynamic;
        this.type = builder.type;
        this.is_hide = builder.is_hide;
    }
}
