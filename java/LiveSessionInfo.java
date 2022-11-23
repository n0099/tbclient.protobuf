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
public final class LiveSessionInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_HLS_URL = "";
    public static final String DEFAULT_RTMP_URL = "";
    public static final String DEFAULT_SESSION_ID = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String hls_url;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String rtmp_url;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String session_id;

    /* loaded from: classes9.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<LiveSessionInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String hls_url;
        public String rtmp_url;
        public String session_id;

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
        public Builder(LiveSessionInfo liveSessionInfo) {
            super(liveSessionInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {liveSessionInfo};
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
            if (liveSessionInfo == null) {
                return;
            }
            this.session_id = liveSessionInfo.session_id;
            this.rtmp_url = liveSessionInfo.rtmp_url;
            this.hls_url = liveSessionInfo.hls_url;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public LiveSessionInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new LiveSessionInfo(this, z, null);
            }
            return (LiveSessionInfo) invokeZ.objValue;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveSessionInfo(Builder builder, boolean z) {
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
            String str = builder.session_id;
            if (str == null) {
                this.session_id = "";
            } else {
                this.session_id = str;
            }
            String str2 = builder.rtmp_url;
            if (str2 == null) {
                this.rtmp_url = "";
            } else {
                this.rtmp_url = str2;
            }
            String str3 = builder.hls_url;
            if (str3 == null) {
                this.hls_url = "";
                return;
            } else {
                this.hls_url = str3;
                return;
            }
        }
        this.session_id = builder.session_id;
        this.rtmp_url = builder.rtmp_url;
        this.hls_url = builder.hls_url;
    }

    public /* synthetic */ LiveSessionInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
