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
/* loaded from: classes5.dex */
public final class VideoDesc extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_VIDEO_HEIGHT = "";
    public static final Integer DEFAULT_VIDEO_ID;
    public static final String DEFAULT_VIDEO_MD5 = "";
    public static final String DEFAULT_VIDEO_URL = "";
    public static final String DEFAULT_VIDEO_WIDTH = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String video_height;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer video_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String video_md5;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String video_url;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String video_width;

    /* loaded from: classes5.dex */
    public static final class Builder extends Message.Builder<VideoDesc> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String video_height;
        public Integer video_id;
        public String video_md5;
        public String video_url;
        public String video_width;

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
        public Builder(VideoDesc videoDesc) {
            super(videoDesc);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {videoDesc};
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
            if (videoDesc == null) {
                return;
            }
            this.video_id = videoDesc.video_id;
            this.video_md5 = videoDesc.video_md5;
            this.video_url = videoDesc.video_url;
            this.video_width = videoDesc.video_width;
            this.video_height = videoDesc.video_height;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public VideoDesc build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new VideoDesc(this, z, null) : (VideoDesc) invokeZ.objValue;
        }
    }

    /* loaded from: classes5.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-344268679, "Ltbclient/VideoDesc;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-344268679, "Ltbclient/VideoDesc;");
                return;
            }
        }
        DEFAULT_VIDEO_ID = 0;
    }

    public /* synthetic */ VideoDesc(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoDesc(Builder builder, boolean z) {
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
            Integer num = builder.video_id;
            if (num == null) {
                this.video_id = DEFAULT_VIDEO_ID;
            } else {
                this.video_id = num;
            }
            String str = builder.video_md5;
            if (str == null) {
                this.video_md5 = "";
            } else {
                this.video_md5 = str;
            }
            String str2 = builder.video_url;
            if (str2 == null) {
                this.video_url = "";
            } else {
                this.video_url = str2;
            }
            String str3 = builder.video_width;
            if (str3 == null) {
                this.video_width = "";
            } else {
                this.video_width = str3;
            }
            String str4 = builder.video_height;
            if (str4 == null) {
                this.video_height = "";
                return;
            } else {
                this.video_height = str4;
                return;
            }
        }
        this.video_id = builder.video_id;
        this.video_md5 = builder.video_md5;
        this.video_url = builder.video_url;
        this.video_width = builder.video_width;
        this.video_height = builder.video_height;
    }
}
