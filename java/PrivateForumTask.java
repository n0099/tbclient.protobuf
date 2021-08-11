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
/* loaded from: classes2.dex */
public final class PrivateForumTask extends Message {
    public static /* synthetic */ Interceptable $ic;
    public static final Integer DEFAULT_ACTIVE_STATUS;
    public static final Integer DEFAULT_AUDIT_STATUS;
    public static final Integer DEFAULT_LIKE_STATUS;
    public static final Integer DEFAULT_MAIN_POST_STATUS;
    public static final Integer DEFAULT_TASK_LEFT_TIME;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer active_status;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer audit_status;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer like_status;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer main_post_status;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer task_left_time;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<PrivateForumTask> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer active_status;
        public Integer audit_status;
        public Integer like_status;
        public Integer main_post_status;
        public Integer task_left_time;

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
        public Builder(PrivateForumTask privateForumTask) {
            super(privateForumTask);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {privateForumTask};
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
            if (privateForumTask == null) {
                return;
            }
            this.audit_status = privateForumTask.audit_status;
            this.like_status = privateForumTask.like_status;
            this.active_status = privateForumTask.active_status;
            this.main_post_status = privateForumTask.main_post_status;
            this.task_left_time = privateForumTask.task_left_time;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PrivateForumTask build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new PrivateForumTask(this, z, null) : (PrivateForumTask) invokeZ.objValue;
        }
    }

    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-1460085522, "Ltbclient/PrivateForumTask;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-1460085522, "Ltbclient/PrivateForumTask;");
                return;
            }
        }
        DEFAULT_AUDIT_STATUS = 0;
        DEFAULT_LIKE_STATUS = 0;
        DEFAULT_ACTIVE_STATUS = 0;
        DEFAULT_MAIN_POST_STATUS = 0;
        DEFAULT_TASK_LEFT_TIME = 0;
    }

    public /* synthetic */ PrivateForumTask(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrivateForumTask(Builder builder, boolean z) {
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
            } else {
                this.main_post_status = num4;
            }
            Integer num5 = builder.task_left_time;
            if (num5 == null) {
                this.task_left_time = DEFAULT_TASK_LEFT_TIME;
                return;
            } else {
                this.task_left_time = num5;
                return;
            }
        }
        this.audit_status = builder.audit_status;
        this.like_status = builder.like_status;
        this.active_status = builder.active_status;
        this.main_post_status = builder.main_post_status;
        this.task_left_time = builder.task_left_time;
    }
}
