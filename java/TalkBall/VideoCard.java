package tbclient.TalkBall;

import com.baidu.android.imsdk.internal.Constants;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InitContext;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.baidu.titan.sdk.runtime.TitanRuntime;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class VideoCard extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_COVER_IMAGE = "";
    public static final String DEFAULT_THREAD_ID = "";
    public static final String DEFAULT_THREAD_URL = "";
    public static final String DEFAULT_TITLE = "";
    public static final String DEFAULT_TOPIC_TITLE = "";
    public static final String DEFAULT_VIDEO_DURATION = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String cover_image;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String thread_id;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String thread_url;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String topic_title;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String video_duration;

    /* loaded from: classes9.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<VideoCard> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String cover_image;
        public String thread_id;
        public String thread_url;
        public String title;
        public String topic_title;
        public String video_duration;

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
        public Builder(VideoCard videoCard) {
            super(videoCard);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {videoCard};
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
            if (videoCard == null) {
                return;
            }
            this.title = videoCard.title;
            this.cover_image = videoCard.cover_image;
            this.video_duration = videoCard.video_duration;
            this.topic_title = videoCard.topic_title;
            this.thread_id = videoCard.thread_id;
            this.thread_url = videoCard.thread_url;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public VideoCard build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new VideoCard(this, z, null);
            }
            return (VideoCard) invokeZ.objValue;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoCard(Builder builder, boolean z) {
        super(builder);
        Interceptable interceptable = $ic;
        if (interceptable != null) {
            InitContext newInitContext = TitanRuntime.newInitContext();
            newInitContext.initArgs = r2;
            Object[] objArr = {builder, Boolean.valueOf(z)};
            interceptable.invokeUnInit(65536, newInitContext);
            int i = newInitContext.flag;
            if ((i & 1) != 0) {
                int i2 = i & 2;
                super((Message.Builder) newInitContext.callArgs[0]);
                newInitContext.thisArg = this;
                interceptable.invokeInitBody(65536, newInitContext);
                return;
            }
        }
        if (z) {
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            String str2 = builder.cover_image;
            if (str2 == null) {
                this.cover_image = "";
            } else {
                this.cover_image = str2;
            }
            String str3 = builder.video_duration;
            if (str3 == null) {
                this.video_duration = "";
            } else {
                this.video_duration = str3;
            }
            String str4 = builder.topic_title;
            if (str4 == null) {
                this.topic_title = "";
            } else {
                this.topic_title = str4;
            }
            String str5 = builder.thread_id;
            if (str5 == null) {
                this.thread_id = "";
            } else {
                this.thread_id = str5;
            }
            String str6 = builder.thread_url;
            if (str6 == null) {
                this.thread_url = "";
                return;
            } else {
                this.thread_url = str6;
                return;
            }
        }
        this.title = builder.title;
        this.cover_image = builder.cover_image;
        this.video_duration = builder.video_duration;
        this.topic_title = builder.topic_title;
        this.thread_id = builder.thread_id;
        this.thread_url = builder.thread_url;
    }

    public /* synthetic */ VideoCard(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
