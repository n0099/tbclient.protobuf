package tbclient;

import com.baidu.android.imsdk.internal.Constants;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InitContext;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.baidu.titan.sdk.runtime.TitanRuntime;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class ThreadEasterEgg extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_ACTIVITY_ID = "";
    public static final String DEFAULT_POP_IMAGEURL = "";
    public static final String DEFAULT_POP_TEXT = "";
    public static final String DEFAULT_VIDEO_URL = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String activity_id;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String pop_imageurl;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String pop_text;
    @ProtoField(tag = 5)
    public final ShareInfo share_info;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String video_url;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<ThreadEasterEgg> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String activity_id;
        public String pop_imageurl;
        public String pop_text;
        public ShareInfo share_info;
        public String video_url;

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
        public Builder(ThreadEasterEgg threadEasterEgg) {
            super(threadEasterEgg);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {threadEasterEgg};
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
            if (threadEasterEgg == null) {
                return;
            }
            this.activity_id = threadEasterEgg.activity_id;
            this.video_url = threadEasterEgg.video_url;
            this.pop_text = threadEasterEgg.pop_text;
            this.pop_imageurl = threadEasterEgg.pop_imageurl;
            this.share_info = threadEasterEgg.share_info;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ThreadEasterEgg build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new ThreadEasterEgg(this, z, null) : (ThreadEasterEgg) invokeZ.objValue;
        }
    }

    /* loaded from: classes9.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    public /* synthetic */ ThreadEasterEgg(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThreadEasterEgg(Builder builder, boolean z) {
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
            String str = builder.activity_id;
            if (str == null) {
                this.activity_id = "";
            } else {
                this.activity_id = str;
            }
            String str2 = builder.video_url;
            if (str2 == null) {
                this.video_url = "";
            } else {
                this.video_url = str2;
            }
            String str3 = builder.pop_text;
            if (str3 == null) {
                this.pop_text = "";
            } else {
                this.pop_text = str3;
            }
            String str4 = builder.pop_imageurl;
            if (str4 == null) {
                this.pop_imageurl = "";
            } else {
                this.pop_imageurl = str4;
            }
            this.share_info = builder.share_info;
            return;
        }
        this.activity_id = builder.activity_id;
        this.video_url = builder.video_url;
        this.pop_text = builder.pop_text;
        this.pop_imageurl = builder.pop_imageurl;
        this.share_info = builder.share_info;
    }
}
