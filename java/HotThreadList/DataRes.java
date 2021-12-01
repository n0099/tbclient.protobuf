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
/* loaded from: classes4.dex */
public final class DataRes extends Message {
    public static /* synthetic */ Interceptable $ic;
    public static final List<FrsTabInfo> DEFAULT_HOT_THREAD_TAB_INFO;
    public static final List<ThreadInfo> DEFAULT_THREAD_INFO;
    public static final List<RecomTopicList> DEFAULT_TOPIC_LIST;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<FrsTabInfo> hot_thread_tab_info;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<ThreadInfo> thread_info;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<RecomTopicList> topic_list;

    /* loaded from: classes4.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public List<FrsTabInfo> hot_thread_tab_info;
        public List<ThreadInfo> thread_info;
        public List<RecomTopicList> topic_list;

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
        public Builder(DataRes dataRes) {
            super(dataRes);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {dataRes};
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
            if (dataRes == null) {
                return;
            }
            this.topic_list = Message.copyOf(dataRes.topic_list);
            this.thread_info = Message.copyOf(dataRes.thread_info);
            this.hot_thread_tab_info = Message.copyOf(dataRes.hot_thread_tab_info);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new DataRes(this, z, null) : (DataRes) invokeZ.objValue;
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
    }

    public /* synthetic */ DataRes(Builder builder, boolean z, a aVar) {
        this(builder, z);
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
            List<RecomTopicList> list = builder.topic_list;
            if (list == null) {
                this.topic_list = DEFAULT_TOPIC_LIST;
            } else {
                this.topic_list = Message.immutableCopyOf(list);
            }
            List<ThreadInfo> list2 = builder.thread_info;
            if (list2 == null) {
                this.thread_info = DEFAULT_THREAD_INFO;
            } else {
                this.thread_info = Message.immutableCopyOf(list2);
            }
            List<FrsTabInfo> list3 = builder.hot_thread_tab_info;
            if (list3 == null) {
                this.hot_thread_tab_info = DEFAULT_HOT_THREAD_TAB_INFO;
                return;
            } else {
                this.hot_thread_tab_info = Message.immutableCopyOf(list3);
                return;
            }
        }
        this.topic_list = Message.immutableCopyOf(builder.topic_list);
        this.thread_info = Message.immutableCopyOf(builder.thread_info);
        this.hot_thread_tab_info = Message.immutableCopyOf(builder.hot_thread_tab_info);
    }
}
