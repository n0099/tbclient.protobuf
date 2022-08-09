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
/* loaded from: classes9.dex */
public final class NewTopicList extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Long DEFAULT_DISCUSS_NUM;
    public static final Integer DEFAULT_IS_VIDEO_TOPIC;
    public static final String DEFAULT_TOPIC_DESC = "";
    public static final Long DEFAULT_TOPIC_ID;
    public static final String DEFAULT_TOPIC_IMAGE = "";
    public static final String DEFAULT_TOPIC_NAME = "";
    public static final Integer DEFAULT_TOPIC_TAG;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 4, type = Message.Datatype.INT64)
    public final Long discuss_num;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer is_video_topic;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String topic_desc;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long topic_id;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String topic_image;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String topic_name;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer topic_tag;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<NewTopicList> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Long discuss_num;
        public Integer is_video_topic;
        public String topic_desc;
        public Long topic_id;
        public String topic_image;
        public String topic_name;
        public Integer topic_tag;

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
        public Builder(NewTopicList newTopicList) {
            super(newTopicList);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {newTopicList};
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
            if (newTopicList == null) {
                return;
            }
            this.topic_id = newTopicList.topic_id;
            this.topic_name = newTopicList.topic_name;
            this.topic_desc = newTopicList.topic_desc;
            this.discuss_num = newTopicList.discuss_num;
            this.topic_image = newTopicList.topic_image;
            this.topic_tag = newTopicList.topic_tag;
            this.is_video_topic = newTopicList.is_video_topic;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public NewTopicList build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new NewTopicList(this, z, null) : (NewTopicList) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-113853246, "Ltbclient/TopicList/NewTopicList;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-113853246, "Ltbclient/TopicList/NewTopicList;");
                return;
            }
        }
        DEFAULT_TOPIC_ID = 0L;
        DEFAULT_DISCUSS_NUM = 0L;
        DEFAULT_TOPIC_TAG = 0;
        DEFAULT_IS_VIDEO_TOPIC = 0;
    }

    public /* synthetic */ NewTopicList(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewTopicList(Builder builder, boolean z) {
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
            Long l = builder.topic_id;
            if (l == null) {
                this.topic_id = DEFAULT_TOPIC_ID;
            } else {
                this.topic_id = l;
            }
            String str = builder.topic_name;
            if (str == null) {
                this.topic_name = "";
            } else {
                this.topic_name = str;
            }
            String str2 = builder.topic_desc;
            if (str2 == null) {
                this.topic_desc = "";
            } else {
                this.topic_desc = str2;
            }
            Long l2 = builder.discuss_num;
            if (l2 == null) {
                this.discuss_num = DEFAULT_DISCUSS_NUM;
            } else {
                this.discuss_num = l2;
            }
            String str3 = builder.topic_image;
            if (str3 == null) {
                this.topic_image = "";
            } else {
                this.topic_image = str3;
            }
            Integer num = builder.topic_tag;
            if (num == null) {
                this.topic_tag = DEFAULT_TOPIC_TAG;
            } else {
                this.topic_tag = num;
            }
            Integer num2 = builder.is_video_topic;
            if (num2 == null) {
                this.is_video_topic = DEFAULT_IS_VIDEO_TOPIC;
                return;
            } else {
                this.is_video_topic = num2;
                return;
            }
        }
        this.topic_id = builder.topic_id;
        this.topic_name = builder.topic_name;
        this.topic_desc = builder.topic_desc;
        this.discuss_num = builder.discuss_num;
        this.topic_image = builder.topic_image;
        this.topic_tag = builder.topic_tag;
        this.is_video_topic = builder.is_video_topic;
    }
}
