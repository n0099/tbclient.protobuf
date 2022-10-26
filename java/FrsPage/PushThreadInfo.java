package tbclient.FrsPage;

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
import java.util.Collections;
import java.util.List;
import tbclient.ThreadInfo;
import tbclient.User;
/* loaded from: classes9.dex */
public final class PushThreadInfo extends Message {
    public static /* synthetic */ Interceptable $ic;
    public static final Integer DEFAULT_HAS_PUSHCARD;
    public static final Integer DEFAULT_HAS_PUSHPLACE;
    public static final List<ThreadInfo> DEFAULT_THREAD_LIST;
    public static final List<User> DEFAULT_USER_LIST;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer has_pushcard;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer has_pushplace;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<ThreadInfo> thread_list;
    @ProtoField(label = Message.Label.REPEATED, tag = 4)
    public final List<User> user_list;

    /* loaded from: classes9.dex */
    public /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public final class Builder extends Message.Builder {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer has_pushcard;
        public Integer has_pushplace;
        public List thread_list;
        public List user_list;

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
        public Builder(PushThreadInfo pushThreadInfo) {
            super(pushThreadInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {pushThreadInfo};
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
            if (pushThreadInfo == null) {
                return;
            }
            this.thread_list = Message.copyOf(pushThreadInfo.thread_list);
            this.has_pushcard = pushThreadInfo.has_pushcard;
            this.has_pushplace = pushThreadInfo.has_pushplace;
            this.user_list = Message.copyOf(pushThreadInfo.user_list);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PushThreadInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new PushThreadInfo(this, z, null);
            }
            return (PushThreadInfo) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(41471462, "Ltbclient/FrsPage/PushThreadInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(41471462, "Ltbclient/FrsPage/PushThreadInfo;");
                return;
            }
        }
        DEFAULT_THREAD_LIST = Collections.emptyList();
        DEFAULT_HAS_PUSHCARD = 0;
        DEFAULT_HAS_PUSHPLACE = 0;
        DEFAULT_USER_LIST = Collections.emptyList();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PushThreadInfo(Builder builder, boolean z) {
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
            List list = builder.thread_list;
            if (list == null) {
                this.thread_list = DEFAULT_THREAD_LIST;
            } else {
                this.thread_list = Message.immutableCopyOf(list);
            }
            Integer num = builder.has_pushcard;
            if (num == null) {
                this.has_pushcard = DEFAULT_HAS_PUSHCARD;
            } else {
                this.has_pushcard = num;
            }
            Integer num2 = builder.has_pushplace;
            if (num2 == null) {
                this.has_pushplace = DEFAULT_HAS_PUSHPLACE;
            } else {
                this.has_pushplace = num2;
            }
            List list2 = builder.user_list;
            if (list2 == null) {
                this.user_list = DEFAULT_USER_LIST;
                return;
            } else {
                this.user_list = Message.immutableCopyOf(list2);
                return;
            }
        }
        this.thread_list = Message.immutableCopyOf(builder.thread_list);
        this.has_pushcard = builder.has_pushcard;
        this.has_pushplace = builder.has_pushplace;
        this.user_list = Message.immutableCopyOf(builder.user_list);
    }

    public /* synthetic */ PushThreadInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
