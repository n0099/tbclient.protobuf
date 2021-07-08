package tbclient.TopicList;

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
public final class DataRes extends Message {
    public static /* synthetic */ Interceptable $ic;
    public static final List<TopicList> DEFAULT_FRS_TAB_TOPIC;
    public static final List<TabList> DEFAULT_TAB_LIST;
    public static final List<NewTopicList> DEFAULT_TOPIC_LIST;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(label = Message.Label.REPEATED, tag = 7)
    public final List<TopicList> frs_tab_topic;
    @ProtoField(tag = 3)
    public final MediaTopic media_topic;
    @ProtoField(label = Message.Label.REPEATED, tag = 6)
    public final List<TabList> tab_list;
    @ProtoField(tag = 1)
    public final TopicListModule topic_bang;
    @ProtoField(label = Message.Label.REPEATED, tag = 8)
    public final List<NewTopicList> topic_list;
    @ProtoField(tag = 2)
    public final TopicListModule topic_manual;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public List<TopicList> frs_tab_topic;
        public MediaTopic media_topic;
        public List<TabList> tab_list;
        public TopicListModule topic_bang;
        public List<NewTopicList> topic_list;
        public TopicListModule topic_manual;

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
            this.topic_bang = dataRes.topic_bang;
            this.topic_manual = dataRes.topic_manual;
            this.media_topic = dataRes.media_topic;
            this.tab_list = Message.copyOf(dataRes.tab_list);
            this.frs_tab_topic = Message.copyOf(dataRes.frs_tab_topic);
            this.topic_list = Message.copyOf(dataRes.topic_list);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new DataRes(this, z, null) : (DataRes) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-860898735, "Ltbclient/TopicList/DataRes;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-860898735, "Ltbclient/TopicList/DataRes;");
                return;
            }
        }
        DEFAULT_TAB_LIST = Collections.emptyList();
        DEFAULT_FRS_TAB_TOPIC = Collections.emptyList();
        DEFAULT_TOPIC_LIST = Collections.emptyList();
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
            this.topic_bang = builder.topic_bang;
            this.topic_manual = builder.topic_manual;
            this.media_topic = builder.media_topic;
            List<TabList> list = builder.tab_list;
            if (list == null) {
                this.tab_list = DEFAULT_TAB_LIST;
            } else {
                this.tab_list = Message.immutableCopyOf(list);
            }
            List<TopicList> list2 = builder.frs_tab_topic;
            if (list2 == null) {
                this.frs_tab_topic = DEFAULT_FRS_TAB_TOPIC;
            } else {
                this.frs_tab_topic = Message.immutableCopyOf(list2);
            }
            List<NewTopicList> list3 = builder.topic_list;
            if (list3 == null) {
                this.topic_list = DEFAULT_TOPIC_LIST;
                return;
            } else {
                this.topic_list = Message.immutableCopyOf(list3);
                return;
            }
        }
        this.topic_bang = builder.topic_bang;
        this.topic_manual = builder.topic_manual;
        this.media_topic = builder.media_topic;
        this.tab_list = Message.immutableCopyOf(builder.tab_list);
        this.frs_tab_topic = Message.immutableCopyOf(builder.frs_tab_topic);
        this.topic_list = Message.immutableCopyOf(builder.topic_list);
    }
}
