package tbclient.HotThreadList;

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
import tbclient.FrsTabInfo;
import tbclient.RecomTopicList;
import tbclient.ThreadInfo;
/* loaded from: classes9.dex */
public final class DataRes extends Message {
    public static /* synthetic */ Interceptable $ic;
    public static final List<FrsTabInfo> DEFAULT_HOT_THREAD_TAB_INFO;
    public static final List<InnerTabInfo> DEFAULT_INNER_TABS;
    public static final List<ThreadInfo> DEFAULT_THREAD_INFO;
    public static final List<RecomTopicList> DEFAULT_TOPIC_LIST;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<FrsTabInfo> hot_thread_tab_info;
    @ProtoField(label = Message.Label.REPEATED, tag = 4)
    public final List<InnerTabInfo> inner_tabs;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<ThreadInfo> thread_info;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<RecomTopicList> topic_list;

    /* loaded from: classes9.dex */
    public /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public final class Builder extends Message.Builder {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public List hot_thread_tab_info;
        public List inner_tabs;
        public List thread_info;
        public List topic_list;

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
        public Builder(DataRes dataRes) {
            super(dataRes);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {dataRes};
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
            if (dataRes == null) {
                return;
            }
            this.topic_list = Message.copyOf(dataRes.topic_list);
            this.thread_info = Message.copyOf(dataRes.thread_info);
            this.hot_thread_tab_info = Message.copyOf(dataRes.hot_thread_tab_info);
            this.inner_tabs = Message.copyOf(dataRes.inner_tabs);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new DataRes(this, z, null);
            }
            return (DataRes) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-1866146103, "Ltbclient/HotThreadList/DataRes;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-1866146103, "Ltbclient/HotThreadList/DataRes;");
                return;
            }
        }
        DEFAULT_TOPIC_LIST = Collections.emptyList();
        DEFAULT_THREAD_INFO = Collections.emptyList();
        DEFAULT_HOT_THREAD_TAB_INFO = Collections.emptyList();
        DEFAULT_INNER_TABS = Collections.emptyList();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataRes(Builder builder, boolean z) {
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
            List list = builder.topic_list;
            if (list == null) {
                this.topic_list = DEFAULT_TOPIC_LIST;
            } else {
                this.topic_list = Message.immutableCopyOf(list);
            }
            List list2 = builder.thread_info;
            if (list2 == null) {
                this.thread_info = DEFAULT_THREAD_INFO;
            } else {
                this.thread_info = Message.immutableCopyOf(list2);
            }
            List list3 = builder.hot_thread_tab_info;
            if (list3 == null) {
                this.hot_thread_tab_info = DEFAULT_HOT_THREAD_TAB_INFO;
            } else {
                this.hot_thread_tab_info = Message.immutableCopyOf(list3);
            }
            List list4 = builder.inner_tabs;
            if (list4 == null) {
                this.inner_tabs = DEFAULT_INNER_TABS;
                return;
            } else {
                this.inner_tabs = Message.immutableCopyOf(list4);
                return;
            }
        }
        this.topic_list = Message.immutableCopyOf(builder.topic_list);
        this.thread_info = Message.immutableCopyOf(builder.thread_info);
        this.hot_thread_tab_info = Message.immutableCopyOf(builder.hot_thread_tab_info);
        this.inner_tabs = Message.immutableCopyOf(builder.inner_tabs);
    }

    public /* synthetic */ DataRes(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
