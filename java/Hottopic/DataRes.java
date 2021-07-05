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
/* loaded from: classes10.dex */
public final class DataRes extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Integer DEFAULT_IS_GLOBAL_BLOCK;
    public static final Integer DEFAULT_IS_NEW_URL;
    public static final List<RelateForum> DEFAULT_POST_FORUM;
    public static final List<RelateForum> DEFAULT_RELATE_FORUM;
    public static final String DEFAULT_RELATE_FORUM_TITLE = "";
    public static final List<SpecialTopic> DEFAULT_SPECIAL_TOPIC;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 7)
    public final CommonInteraction bless_module;
    @ProtoField(tag = 8)
    public final CommonInteraction candle_module;
    @ProtoField(tag = 9)
    public final HotThread good_threads;
    @ProtoField(tag = 3)
    public final HotThread hot_thread;
    @ProtoField(tag = 12, type = Message.Datatype.UINT32)
    public final Integer is_global_block;
    @ProtoField(tag = 10, type = Message.Datatype.INT32)
    public final Integer is_new_url;
    @ProtoField(tag = 2)
    public final MagicPost magic_post;
    @ProtoField(tag = 6)
    public final PkModule pk_module;
    @ProtoField(label = Message.Label.REPEATED, tag = 11)
    public final List<RelateForum> post_forum;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<RelateForum> relate_forum;
    @ProtoField(tag = 14, type = Message.Datatype.STRING)
    public final String relate_forum_title;
    @ProtoField(label = Message.Label.REPEATED, tag = 13)
    public final List<SpecialTopic> special_topic;
    @ProtoField(tag = 5)
    public final ThreadModule thread_module;
    @ProtoField(tag = 4)
    public final TopicInfo topic_info;
    @ProtoField(tag = 15)
    public final CommonInteraction weiguan_module;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public CommonInteraction bless_module;
        public CommonInteraction candle_module;
        public HotThread good_threads;
        public HotThread hot_thread;
        public Integer is_global_block;
        public Integer is_new_url;
        public MagicPost magic_post;
        public PkModule pk_module;
        public List<RelateForum> post_forum;
        public List<RelateForum> relate_forum;
        public String relate_forum_title;
        public List<SpecialTopic> special_topic;
        public ThreadModule thread_module;
        public TopicInfo topic_info;
        public CommonInteraction weiguan_module;

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
            this.relate_forum = Message.copyOf(dataRes.relate_forum);
            this.magic_post = dataRes.magic_post;
            this.hot_thread = dataRes.hot_thread;
            this.topic_info = dataRes.topic_info;
            this.thread_module = dataRes.thread_module;
            this.pk_module = dataRes.pk_module;
            this.bless_module = dataRes.bless_module;
            this.candle_module = dataRes.candle_module;
            this.good_threads = dataRes.good_threads;
            this.is_new_url = dataRes.is_new_url;
            this.post_forum = Message.copyOf(dataRes.post_forum);
            this.is_global_block = dataRes.is_global_block;
            this.special_topic = Message.copyOf(dataRes.special_topic);
            this.relate_forum_title = dataRes.relate_forum_title;
            this.weiguan_module = dataRes.weiguan_module;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new DataRes(this, z, null) : (DataRes) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-1291691704, "Ltbclient/Hottopic/DataRes;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-1291691704, "Ltbclient/Hottopic/DataRes;");
                return;
            }
        }
        DEFAULT_RELATE_FORUM = Collections.emptyList();
        DEFAULT_IS_NEW_URL = 0;
        DEFAULT_POST_FORUM = Collections.emptyList();
        DEFAULT_IS_GLOBAL_BLOCK = 0;
        DEFAULT_SPECIAL_TOPIC = Collections.emptyList();
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
            List<RelateForum> list = builder.relate_forum;
            if (list == null) {
                this.relate_forum = DEFAULT_RELATE_FORUM;
            } else {
                this.relate_forum = Message.immutableCopyOf(list);
            }
            this.magic_post = builder.magic_post;
            this.hot_thread = builder.hot_thread;
            this.topic_info = builder.topic_info;
            this.thread_module = builder.thread_module;
            this.pk_module = builder.pk_module;
            this.bless_module = builder.bless_module;
            this.candle_module = builder.candle_module;
            this.good_threads = builder.good_threads;
            Integer num = builder.is_new_url;
            if (num == null) {
                this.is_new_url = DEFAULT_IS_NEW_URL;
            } else {
                this.is_new_url = num;
            }
            List<RelateForum> list2 = builder.post_forum;
            if (list2 == null) {
                this.post_forum = DEFAULT_POST_FORUM;
            } else {
                this.post_forum = Message.immutableCopyOf(list2);
            }
            Integer num2 = builder.is_global_block;
            if (num2 == null) {
                this.is_global_block = DEFAULT_IS_GLOBAL_BLOCK;
            } else {
                this.is_global_block = num2;
            }
            List<SpecialTopic> list3 = builder.special_topic;
            if (list3 == null) {
                this.special_topic = DEFAULT_SPECIAL_TOPIC;
            } else {
                this.special_topic = Message.immutableCopyOf(list3);
            }
            String str = builder.relate_forum_title;
            if (str == null) {
                this.relate_forum_title = "";
            } else {
                this.relate_forum_title = str;
            }
            this.weiguan_module = builder.weiguan_module;
            return;
        }
        this.relate_forum = Message.immutableCopyOf(builder.relate_forum);
        this.magic_post = builder.magic_post;
        this.hot_thread = builder.hot_thread;
        this.topic_info = builder.topic_info;
        this.thread_module = builder.thread_module;
        this.pk_module = builder.pk_module;
        this.bless_module = builder.bless_module;
        this.candle_module = builder.candle_module;
        this.good_threads = builder.good_threads;
        this.is_new_url = builder.is_new_url;
        this.post_forum = Message.immutableCopyOf(builder.post_forum);
        this.is_global_block = builder.is_global_block;
        this.special_topic = Message.immutableCopyOf(builder.special_topic);
        this.relate_forum_title = builder.relate_forum_title;
        this.weiguan_module = builder.weiguan_module;
    }
}
