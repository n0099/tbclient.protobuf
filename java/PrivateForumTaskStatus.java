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
public final class PrivateForumTaskStatus extends Message {
    public static /* synthetic */ Interceptable $ic;
    public static final Integer DEFAULT_ACTIVE_STATUS;
    public static final Integer DEFAULT_AUDIT_STATUS;
    public static final Integer DEFAULT_LIKE_STATUS;
    public static final Integer DEFAULT_MAIN_POST_STATUS;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer active_status;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer audit_status;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer like_status;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer main_post_status;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<PrivateForumTaskStatus> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer active_status;
        public Integer audit_status;
        public Integer like_status;
        public Integer main_post_status;

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
        public Builder(PrivateForumTaskStatus privateForumTaskStatus) {
            super(privateForumTaskStatus);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {privateForumTaskStatus};
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
            if (privateForumTaskStatus == null) {
                return;
            }
            this.audit_status = privateForumTaskStatus.audit_status;
            this.like_status = privateForumTaskStatus.like_status;
            this.active_status = privateForumTaskStatus.active_status;
            this.main_post_status = privateForumTaskStatus.main_post_status;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PrivateForumTaskStatus build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new PrivateForumTaskStatus(this, z, null) : (PrivateForumTaskStatus) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-654044964, "Ltbclient/PrivateForumTaskStatus;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-654044964, "Ltbclient/PrivateForumTaskStatus;");
                return;
            }
        }
        DEFAULT_AUDIT_STATUS = 0;
        DEFAULT_LIKE_STATUS = 0;
        DEFAULT_ACTIVE_STATUS = 0;
        DEFAULT_MAIN_POST_STATUS = 0;
    }

    public /* synthetic */ PrivateForumTaskStatus(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrivateForumTaskStatus(Builder builder, boolean z) {
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
            Integer num = builder.audit_status;
            if (num == null) {
                this.audit_status = DEFAULT_AUDIT_STATUS;
            } else {
                this.audit_status = num;
            }
            Integer num2 = builder.like_status;
            if (num2 == null) {
                this.like_status = DEFAULT_LIKE_STATUS;
            } else {
                this.like_status = num2;
            }
            Integer num3 = builder.active_status;
            if (num3 == null) {
                this.active_status = DEFAULT_ACTIVE_STATUS;
            } else {
                this.active_status = num3;
            }
            Integer num4 = builder.main_post_status;
            if (num4 == null) {
                this.main_post_status = DEFAULT_MAIN_POST_STATUS;
                return;
            } else {
                this.main_post_status = num4;
                return;
            }
        }
        this.audit_status = builder.audit_status;
        this.like_status = builder.like_status;
        this.active_status = builder.active_status;
        this.main_post_status = builder.main_post_status;
    }
}
