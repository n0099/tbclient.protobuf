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
import java.util.Collections;
import java.util.List;
import tbclient.Page;
import tbclient.ThreadInfo;
/* loaded from: classes9.dex */
public final class HotThread extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_HOT_TITLE = "";
    public static final Integer DEFAULT_IS_NEW_URL;
    public static final List<ThreadInfo> DEFAULT_THREAD_LIST;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String hot_title;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer is_new_url;
    @ProtoField(tag = 3)
    public final Page page;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<ThreadInfo> thread_list;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<HotThread> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String hot_title;
        public Integer is_new_url;
        public Page page;
        public List<ThreadInfo> thread_list;

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
        public Builder(HotThread hotThread) {
            super(hotThread);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {hotThread};
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
            if (hotThread == null) {
                return;
            }
            this.hot_title = hotThread.hot_title;
            this.thread_list = Message.copyOf(hotThread.thread_list);
            this.page = hotThread.page;
            this.is_new_url = hotThread.is_new_url;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public HotThread build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new HotThread(this, z, null) : (HotThread) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(1598032007, "Ltbclient/Hottopic/HotThread;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(1598032007, "Ltbclient/Hottopic/HotThread;");
                return;
            }
        }
        DEFAULT_THREAD_LIST = Collections.emptyList();
        DEFAULT_IS_NEW_URL = 0;
    }

    public /* synthetic */ HotThread(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotThread(Builder builder, boolean z) {
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
            String str = builder.hot_title;
            if (str == null) {
                this.hot_title = "";
            } else {
                this.hot_title = str;
            }
            List<ThreadInfo> list = builder.thread_list;
            if (list == null) {
                this.thread_list = DEFAULT_THREAD_LIST;
            } else {
                this.thread_list = Message.immutableCopyOf(list);
            }
            this.page = builder.page;
            Integer num = builder.is_new_url;
            if (num == null) {
                this.is_new_url = DEFAULT_IS_NEW_URL;
                return;
            } else {
                this.is_new_url = num;
                return;
            }
        }
        this.hot_title = builder.hot_title;
        this.thread_list = Message.immutableCopyOf(builder.thread_list);
        this.page = builder.page;
        this.is_new_url = builder.is_new_url;
    }
}
