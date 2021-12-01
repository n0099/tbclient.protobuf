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
/* loaded from: classes4.dex */
public final class ModuleInfo extends Message {
    public static /* synthetic */ Interceptable $ic;
    public static final Integer DEFAULT_MAX_MODULE_NUM;
    public static final Integer DEFAULT_MAX_MODULE_THREAD_NUM;
    public static final List<ThreadModule> DEFAULT_MODULE_LIST;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer max_module_num;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer max_module_thread_num;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<ThreadModule> module_list;

    /* loaded from: classes4.dex */
    public static final class Builder extends Message.Builder<ModuleInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer max_module_num;
        public Integer max_module_thread_num;
        public List<ThreadModule> module_list;

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
        public Builder(ModuleInfo moduleInfo) {
            super(moduleInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {moduleInfo};
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
            if (moduleInfo == null) {
                return;
            }
            this.module_list = Message.copyOf(moduleInfo.module_list);
            this.max_module_num = moduleInfo.max_module_num;
            this.max_module_thread_num = moduleInfo.max_module_thread_num;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ModuleInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new ModuleInfo(this, z, null) : (ModuleInfo) invokeZ.objValue;
        }
    }

    /* loaded from: classes4.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(397594391, "Ltbclient/ModuleInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(397594391, "Ltbclient/ModuleInfo;");
                return;
            }
        }
        DEFAULT_MODULE_LIST = Collections.emptyList();
        DEFAULT_MAX_MODULE_NUM = 0;
        DEFAULT_MAX_MODULE_THREAD_NUM = 0;
    }

    public /* synthetic */ ModuleInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModuleInfo(Builder builder, boolean z) {
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
            List<ThreadModule> list = builder.module_list;
            if (list == null) {
                this.module_list = DEFAULT_MODULE_LIST;
            } else {
                this.module_list = Message.immutableCopyOf(list);
            }
            Integer num = builder.max_module_num;
            if (num == null) {
                this.max_module_num = DEFAULT_MAX_MODULE_NUM;
            } else {
                this.max_module_num = num;
            }
            Integer num2 = builder.max_module_thread_num;
            if (num2 == null) {
                this.max_module_thread_num = DEFAULT_MAX_MODULE_THREAD_NUM;
                return;
            } else {
                this.max_module_thread_num = num2;
                return;
            }
        }
        this.module_list = Message.immutableCopyOf(builder.module_list);
        this.max_module_num = builder.max_module_num;
        this.max_module_thread_num = builder.max_module_thread_num;
    }
}
