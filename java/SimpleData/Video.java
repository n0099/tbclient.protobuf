package tbclient.SimpleData;

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
public final class Video extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Integer DEFAULT_DURATION;
    public static final String DEFAULT_POSTER = "";
    public static final String DEFAULT_URL = "";
    public static final String DEFAULT_VIDEO_TYPE = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer duration;
    @ProtoField(tag = 5)
    public final EncourageInfo encourage_info;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String poster;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String url;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String video_type;

    /* loaded from: classes9.dex */
    public /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public final class Builder extends Message.Builder {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer duration;
        public EncourageInfo encourage_info;
        public String poster;
        public String url;
        public String video_type;

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
        public Builder(Video video) {
            super(video);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {video};
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
            if (video == null) {
                return;
            }
            this.url = video.url;
            this.poster = video.poster;
            this.duration = video.duration;
            this.video_type = video.video_type;
            this.encourage_info = video.encourage_info;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Video build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new Video(this, z, null);
            }
            return (Video) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-1981501303, "Ltbclient/SimpleData/Video;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-1981501303, "Ltbclient/SimpleData/Video;");
                return;
            }
        }
        DEFAULT_DURATION = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Video(Builder builder, boolean z) {
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
            String str = builder.url;
            if (str == null) {
                this.url = "";
            } else {
                this.url = str;
            }
            String str2 = builder.poster;
            if (str2 == null) {
                this.poster = "";
            } else {
                this.poster = str2;
            }
            Integer num = builder.duration;
            if (num == null) {
                this.duration = DEFAULT_DURATION;
            } else {
                this.duration = num;
            }
            String str3 = builder.video_type;
            if (str3 == null) {
                this.video_type = "";
            } else {
                this.video_type = str3;
            }
            this.encourage_info = builder.encourage_info;
            return;
        }
        this.url = builder.url;
        this.poster = builder.poster;
        this.duration = builder.duration;
        this.video_type = builder.video_type;
        this.encourage_info = builder.encourage_info;
    }

    public /* synthetic */ Video(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
