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
import java.util.Collections;
import java.util.List;
/* loaded from: classes10.dex */
public final class ThreadModule extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Long DEFAULT_MODULE_ID;
    public static final String DEFAULT_MODULE_NAME = "";
    public static final Long DEFAULT_SHOW_NUM;
    public static final List<ThreadInfo> DEFAULT_THREAD_INFO;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long module_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String module_name;
    @ProtoField(tag = 4, type = Message.Datatype.INT64)
    public final Long show_num;
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<ThreadInfo> thread_info;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<ThreadModule> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Long module_id;
        public String module_name;
        public Long show_num;
        public List<ThreadInfo> thread_info;

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
        public Builder(ThreadModule threadModule) {
            super(threadModule);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {threadModule};
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
            if (threadModule == null) {
                return;
            }
            this.module_id = threadModule.module_id;
            this.module_name = threadModule.module_name;
            this.thread_info = Message.copyOf(threadModule.thread_info);
            this.show_num = threadModule.show_num;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ThreadModule build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new ThreadModule(this, z, null) : (ThreadModule) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(876799291, "Ltbclient/ThreadModule;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(876799291, "Ltbclient/ThreadModule;");
                return;
            }
        }
        DEFAULT_MODULE_ID = 0L;
        DEFAULT_THREAD_INFO = Collections.emptyList();
        DEFAULT_SHOW_NUM = 0L;
    }

    public /* synthetic */ ThreadModule(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThreadModule(Builder builder, boolean z) {
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
            Long l = builder.module_id;
            if (l == null) {
                this.module_id = DEFAULT_MODULE_ID;
            } else {
                this.module_id = l;
            }
            String str = builder.module_name;
            if (str == null) {
                this.module_name = "";
            } else {
                this.module_name = str;
            }
            List<ThreadInfo> list = builder.thread_info;
            if (list == null) {
                this.thread_info = DEFAULT_THREAD_INFO;
            } else {
                this.thread_info = Message.immutableCopyOf(list);
            }
            Long l2 = builder.show_num;
            if (l2 == null) {
                this.show_num = DEFAULT_SHOW_NUM;
                return;
            } else {
                this.show_num = l2;
                return;
            }
        }
        this.module_id = builder.module_id;
        this.module_name = builder.module_name;
        this.thread_info = Message.immutableCopyOf(builder.thread_info);
        this.show_num = builder.show_num;
    }
}
