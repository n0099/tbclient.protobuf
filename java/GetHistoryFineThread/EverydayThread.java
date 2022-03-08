package tbclient.GetHistoryFineThread;

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
/* loaded from: classes9.dex */
public final class EverydayThread extends Message {
    public static /* synthetic */ Interceptable $ic;
    public static final List<FineThreadInfo> DEFAULT_FINE_THREAD_LIST;
    public static final Integer DEFAULT_SHOW_TIME;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<FineThreadInfo> fine_thread_list;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer show_time;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<EverydayThread> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public List<FineThreadInfo> fine_thread_list;
        public Integer show_time;

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
        public Builder(EverydayThread everydayThread) {
            super(everydayThread);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {everydayThread};
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
            if (everydayThread == null) {
                return;
            }
            this.fine_thread_list = Message.copyOf(everydayThread.fine_thread_list);
            this.show_time = everydayThread.show_time;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public EverydayThread build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new EverydayThread(this, z, null) : (EverydayThread) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-1732311891, "Ltbclient/GetHistoryFineThread/EverydayThread;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-1732311891, "Ltbclient/GetHistoryFineThread/EverydayThread;");
                return;
            }
        }
        DEFAULT_FINE_THREAD_LIST = Collections.emptyList();
        DEFAULT_SHOW_TIME = 0;
    }

    public /* synthetic */ EverydayThread(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EverydayThread(Builder builder, boolean z) {
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
            List<FineThreadInfo> list = builder.fine_thread_list;
            if (list == null) {
                this.fine_thread_list = DEFAULT_FINE_THREAD_LIST;
            } else {
                this.fine_thread_list = Message.immutableCopyOf(list);
            }
            Integer num = builder.show_time;
            if (num == null) {
                this.show_time = DEFAULT_SHOW_TIME;
                return;
            } else {
                this.show_time = num;
                return;
            }
        }
        this.fine_thread_list = Message.immutableCopyOf(builder.fine_thread_list);
        this.show_time = builder.show_time;
    }
}
