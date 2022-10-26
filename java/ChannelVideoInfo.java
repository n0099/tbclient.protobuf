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
/* loaded from: classes9.dex */
public final class ChannelVideoInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Integer DEFAULT_CREATE_TIME;
    public static final Integer DEFAULT_FORUM_ID;
    public static final String DEFAULT_FORUM_NAME = "";
    public static final Integer DEFAULT_IS_TOP;
    public static final Integer DEFAULT_PLAY_COUNT;
    public static final Long DEFAULT_THREAD_ID;
    public static final Integer DEFAULT_THUMBNAIL_HEIGHT;
    public static final String DEFAULT_THUMBNAIL_URL = "";
    public static final Integer DEFAULT_THUMBNAIL_WIDTH;
    public static final String DEFAULT_TITLE = "";
    public static final Integer DEFAULT_VIDEO_DURATION;
    public static final Integer DEFAULT_VIDEO_HEIGHT;
    public static final Integer DEFAULT_VIDEO_LENGTH;
    public static final Long DEFAULT_VIDEO_TYPE;
    public static final String DEFAULT_VIDEO_URL = "";
    public static final Integer DEFAULT_VIDEO_WIDTH;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 16, type = Message.Datatype.UINT32)
    public final Integer create_time;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer forum_id;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String forum_name;
    @ProtoField(tag = 15, type = Message.Datatype.UINT32)
    public final Integer is_top;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer play_count;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long thread_id;
    @ProtoField(tag = 14, type = Message.Datatype.UINT32)
    public final Integer thumbnail_height;
    @ProtoField(tag = 12, type = Message.Datatype.STRING)
    public final String thumbnail_url;
    @ProtoField(tag = 13, type = Message.Datatype.UINT32)
    public final Integer thumbnail_width;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 7, type = Message.Datatype.UINT32)
    public final Integer video_duration;
    @ProtoField(tag = 9, type = Message.Datatype.UINT32)
    public final Integer video_height;
    @ProtoField(tag = 10, type = Message.Datatype.UINT32)
    public final Integer video_length;
    @ProtoField(tag = 11, type = Message.Datatype.UINT64)
    public final Long video_type;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String video_url;
    @ProtoField(tag = 8, type = Message.Datatype.UINT32)
    public final Integer video_width;

    /* loaded from: classes9.dex */
    public /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public final class Builder extends Message.Builder {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer create_time;
        public Integer forum_id;
        public String forum_name;
        public Integer is_top;
        public Integer play_count;
        public Long thread_id;
        public Integer thumbnail_height;
        public String thumbnail_url;
        public Integer thumbnail_width;
        public String title;
        public Integer video_duration;
        public Integer video_height;
        public Integer video_length;
        public Long video_type;
        public String video_url;
        public Integer video_width;

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
        public Builder(ChannelVideoInfo channelVideoInfo) {
            super(channelVideoInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {channelVideoInfo};
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
            if (channelVideoInfo == null) {
                return;
            }
            this.thread_id = channelVideoInfo.thread_id;
            this.forum_id = channelVideoInfo.forum_id;
            this.forum_name = channelVideoInfo.forum_name;
            this.title = channelVideoInfo.title;
            this.play_count = channelVideoInfo.play_count;
            this.video_url = channelVideoInfo.video_url;
            this.video_duration = channelVideoInfo.video_duration;
            this.video_width = channelVideoInfo.video_width;
            this.video_height = channelVideoInfo.video_height;
            this.video_length = channelVideoInfo.video_length;
            this.video_type = channelVideoInfo.video_type;
            this.thumbnail_url = channelVideoInfo.thumbnail_url;
            this.thumbnail_width = channelVideoInfo.thumbnail_width;
            this.thumbnail_height = channelVideoInfo.thumbnail_height;
            this.is_top = channelVideoInfo.is_top;
            this.create_time = channelVideoInfo.create_time;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ChannelVideoInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new ChannelVideoInfo(this, z, null);
            }
            return (ChannelVideoInfo) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(1870170955, "Ltbclient/ChannelVideoInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(1870170955, "Ltbclient/ChannelVideoInfo;");
                return;
            }
        }
        DEFAULT_THREAD_ID = 0L;
        DEFAULT_FORUM_ID = 0;
        DEFAULT_PLAY_COUNT = 0;
        DEFAULT_VIDEO_DURATION = 0;
        DEFAULT_VIDEO_WIDTH = 0;
        DEFAULT_VIDEO_HEIGHT = 0;
        DEFAULT_VIDEO_LENGTH = 0;
        DEFAULT_VIDEO_TYPE = 0L;
        DEFAULT_THUMBNAIL_WIDTH = 0;
        DEFAULT_THUMBNAIL_HEIGHT = 0;
        DEFAULT_IS_TOP = 0;
        DEFAULT_CREATE_TIME = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelVideoInfo(Builder builder, boolean z) {
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
            Long l = builder.thread_id;
            if (l == null) {
                this.thread_id = DEFAULT_THREAD_ID;
            } else {
                this.thread_id = l;
            }
            Integer num = builder.forum_id;
            if (num == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = num;
            }
            String str = builder.forum_name;
            if (str == null) {
                this.forum_name = "";
            } else {
                this.forum_name = str;
            }
            String str2 = builder.title;
            if (str2 == null) {
                this.title = "";
            } else {
                this.title = str2;
            }
            Integer num2 = builder.play_count;
            if (num2 == null) {
                this.play_count = DEFAULT_PLAY_COUNT;
            } else {
                this.play_count = num2;
            }
            String str3 = builder.video_url;
            if (str3 == null) {
                this.video_url = "";
            } else {
                this.video_url = str3;
            }
            Integer num3 = builder.video_duration;
            if (num3 == null) {
                this.video_duration = DEFAULT_VIDEO_DURATION;
            } else {
                this.video_duration = num3;
            }
            Integer num4 = builder.video_width;
            if (num4 == null) {
                this.video_width = DEFAULT_VIDEO_WIDTH;
            } else {
                this.video_width = num4;
            }
            Integer num5 = builder.video_height;
            if (num5 == null) {
                this.video_height = DEFAULT_VIDEO_HEIGHT;
            } else {
                this.video_height = num5;
            }
            Integer num6 = builder.video_length;
            if (num6 == null) {
                this.video_length = DEFAULT_VIDEO_LENGTH;
            } else {
                this.video_length = num6;
            }
            Long l2 = builder.video_type;
            if (l2 == null) {
                this.video_type = DEFAULT_VIDEO_TYPE;
            } else {
                this.video_type = l2;
            }
            String str4 = builder.thumbnail_url;
            if (str4 == null) {
                this.thumbnail_url = "";
            } else {
                this.thumbnail_url = str4;
            }
            Integer num7 = builder.thumbnail_width;
            if (num7 == null) {
                this.thumbnail_width = DEFAULT_THUMBNAIL_WIDTH;
            } else {
                this.thumbnail_width = num7;
            }
            Integer num8 = builder.thumbnail_height;
            if (num8 == null) {
                this.thumbnail_height = DEFAULT_THUMBNAIL_HEIGHT;
            } else {
                this.thumbnail_height = num8;
            }
            Integer num9 = builder.is_top;
            if (num9 == null) {
                this.is_top = DEFAULT_IS_TOP;
            } else {
                this.is_top = num9;
            }
            Integer num10 = builder.create_time;
            if (num10 == null) {
                this.create_time = DEFAULT_CREATE_TIME;
                return;
            } else {
                this.create_time = num10;
                return;
            }
        }
        this.thread_id = builder.thread_id;
        this.forum_id = builder.forum_id;
        this.forum_name = builder.forum_name;
        this.title = builder.title;
        this.play_count = builder.play_count;
        this.video_url = builder.video_url;
        this.video_duration = builder.video_duration;
        this.video_width = builder.video_width;
        this.video_height = builder.video_height;
        this.video_length = builder.video_length;
        this.video_type = builder.video_type;
        this.thumbnail_url = builder.thumbnail_url;
        this.thumbnail_width = builder.thumbnail_width;
        this.thumbnail_height = builder.thumbnail_height;
        this.is_top = builder.is_top;
        this.create_time = builder.create_time;
    }

    public /* synthetic */ ChannelVideoInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
