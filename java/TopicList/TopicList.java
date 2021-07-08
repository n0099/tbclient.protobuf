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
import tbclient.Media;
import tbclient.VideoInfo;
/* loaded from: classes9.dex */
public final class TopicList extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Long DEFAULT_DISCUSS_NUM;
    public static final List<Media> DEFAULT_MEDIA;
    public static final Integer DEFAULT_TAG;
    public static final String DEFAULT_TOPIC_DESC = "";
    public static final String DEFAULT_TOPIC_H5_URL = "";
    public static final Long DEFAULT_TOPIC_ID;
    public static final String DEFAULT_TOPIC_NAME = "";
    public static final String DEFAULT_TOPIC_PIC = "";
    public static final Integer DEFAULT_TOPIC_THREAD_TYPES;
    public static final Long DEFAULT_TOPIC_TID;
    public static final String DEFAULT_TOPIC_USER_NAME = "";
    public static final Long DEFAULT_UPDATE_TIME;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 3, type = Message.Datatype.UINT64)
    public final Long discuss_num;
    @ProtoField(label = Message.Label.REPEATED, tag = 9)
    public final List<Media> media;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer tag;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String topic_desc;
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String topic_h5_url;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long topic_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String topic_name;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String topic_pic;
    @ProtoField(tag = 13, type = Message.Datatype.INT32)
    public final Integer topic_thread_types;
    @ProtoField(tag = 10, type = Message.Datatype.INT64)
    public final Long topic_tid;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String topic_user_name;
    @ProtoField(tag = 7, type = Message.Datatype.INT64)
    public final Long update_time;
    @ProtoField(tag = 12)
    public final VideoInfo video_info;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<TopicList> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Long discuss_num;
        public List<Media> media;
        public Integer tag;
        public String topic_desc;
        public String topic_h5_url;
        public Long topic_id;
        public String topic_name;
        public String topic_pic;
        public Integer topic_thread_types;
        public Long topic_tid;
        public String topic_user_name;
        public Long update_time;
        public VideoInfo video_info;

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
        public Builder(TopicList topicList) {
            super(topicList);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {topicList};
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
            if (topicList == null) {
                return;
            }
            this.topic_id = topicList.topic_id;
            this.topic_name = topicList.topic_name;
            this.discuss_num = topicList.discuss_num;
            this.tag = topicList.tag;
            this.topic_desc = topicList.topic_desc;
            this.topic_pic = topicList.topic_pic;
            this.update_time = topicList.update_time;
            this.topic_user_name = topicList.topic_user_name;
            this.media = Message.copyOf(topicList.media);
            this.topic_tid = topicList.topic_tid;
            this.topic_h5_url = topicList.topic_h5_url;
            this.video_info = topicList.video_info;
            this.topic_thread_types = topicList.topic_thread_types;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public TopicList build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new TopicList(this, z, null) : (TopicList) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-481615782, "Ltbclient/TopicList/TopicList;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-481615782, "Ltbclient/TopicList/TopicList;");
                return;
            }
        }
        DEFAULT_TOPIC_ID = 0L;
        DEFAULT_DISCUSS_NUM = 0L;
        DEFAULT_TAG = 0;
        DEFAULT_UPDATE_TIME = 0L;
        DEFAULT_MEDIA = Collections.emptyList();
        DEFAULT_TOPIC_TID = 0L;
        DEFAULT_TOPIC_THREAD_TYPES = 0;
    }

    public /* synthetic */ TopicList(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopicList(Builder builder, boolean z) {
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
            Long l2 = builder.discuss_num;
            if (l2 == null) {
                this.discuss_num = DEFAULT_DISCUSS_NUM;
            } else {
                this.discuss_num = l2;
            }
            Integer num = builder.tag;
            if (num == null) {
                this.tag = DEFAULT_TAG;
            } else {
                this.tag = num;
            }
            String str2 = builder.topic_desc;
            if (str2 == null) {
                this.topic_desc = "";
            } else {
                this.topic_desc = str2;
            }
            String str3 = builder.topic_pic;
            if (str3 == null) {
                this.topic_pic = "";
            } else {
                this.topic_pic = str3;
            }
            Long l3 = builder.update_time;
            if (l3 == null) {
                this.update_time = DEFAULT_UPDATE_TIME;
            } else {
                this.update_time = l3;
            }
            String str4 = builder.topic_user_name;
            if (str4 == null) {
                this.topic_user_name = "";
            } else {
                this.topic_user_name = str4;
            }
            List<Media> list = builder.media;
            if (list == null) {
                this.media = DEFAULT_MEDIA;
            } else {
                this.media = Message.immutableCopyOf(list);
            }
            Long l4 = builder.topic_tid;
            if (l4 == null) {
                this.topic_tid = DEFAULT_TOPIC_TID;
            } else {
                this.topic_tid = l4;
            }
            String str5 = builder.topic_h5_url;
            if (str5 == null) {
                this.topic_h5_url = "";
            } else {
                this.topic_h5_url = str5;
            }
            this.video_info = builder.video_info;
            Integer num2 = builder.topic_thread_types;
            if (num2 == null) {
                this.topic_thread_types = DEFAULT_TOPIC_THREAD_TYPES;
                return;
            } else {
                this.topic_thread_types = num2;
                return;
            }
        }
        this.topic_id = builder.topic_id;
        this.topic_name = builder.topic_name;
        this.discuss_num = builder.discuss_num;
        this.tag = builder.tag;
        this.topic_desc = builder.topic_desc;
        this.topic_pic = builder.topic_pic;
        this.update_time = builder.update_time;
        this.topic_user_name = builder.topic_user_name;
        this.media = Message.immutableCopyOf(builder.media);
        this.topic_tid = builder.topic_tid;
        this.topic_h5_url = builder.topic_h5_url;
        this.video_info = builder.video_info;
        this.topic_thread_types = builder.topic_thread_types;
    }
}
