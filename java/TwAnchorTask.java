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
/* loaded from: classes3.dex */
public final class TwAnchorTask extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_DESCRIBE = "";
    public static final List<TwAnchorTaskItem> DEFAULT_TASK_LIST;
    public static final String DEFAULT_TASK_NAME = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String describe;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<TwAnchorTaskItem> task_list;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String task_name;

    /* loaded from: classes3.dex */
    public static final class Builder extends Message.Builder<TwAnchorTask> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String describe;
        public List<TwAnchorTaskItem> task_list;
        public String task_name;

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
        public Builder(TwAnchorTask twAnchorTask) {
            super(twAnchorTask);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {twAnchorTask};
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
            if (twAnchorTask == null) {
                return;
            }
            this.describe = twAnchorTask.describe;
            this.task_list = Message.copyOf(twAnchorTask.task_list);
            this.task_name = twAnchorTask.task_name;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public TwAnchorTask build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new TwAnchorTask(this, z, null) : (TwAnchorTask) invokeZ.objValue;
        }
    }

    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-1857036684, "Ltbclient/TwAnchorTask;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-1857036684, "Ltbclient/TwAnchorTask;");
                return;
            }
        }
        DEFAULT_TASK_LIST = Collections.emptyList();
    }

    public /* synthetic */ TwAnchorTask(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TwAnchorTask(Builder builder, boolean z) {
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
            String str = builder.describe;
            if (str == null) {
                this.describe = "";
            } else {
                this.describe = str;
            }
            List<TwAnchorTaskItem> list = builder.task_list;
            if (list == null) {
                this.task_list = DEFAULT_TASK_LIST;
            } else {
                this.task_list = Message.immutableCopyOf(list);
            }
            String str2 = builder.task_name;
            if (str2 == null) {
                this.task_name = "";
                return;
            } else {
                this.task_name = str2;
                return;
            }
        }
        this.describe = builder.describe;
        this.task_list = Message.immutableCopyOf(builder.task_list);
        this.task_name = builder.task_name;
    }
}
