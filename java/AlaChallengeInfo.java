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
/* loaded from: classes2.dex */
public final class AlaChallengeInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Long DEFAULT_CHALLENGE_ID;
    public static final String DEFAULT_EXT = "";
    public static final String DEFAULT_RIVAL_HLS_URL = "";
    public static final String DEFAULT_RIVAL_RTMP_URL = "";
    public static final String DEFAULT_RIVAL_SESSION = "";
    public static final Long DEFAULT_WINNING_NUM;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long challenge_id;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String ext;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String rival_hls_url;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String rival_rtmp_url;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String rival_session;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long winning_num;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<AlaChallengeInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Long challenge_id;
        public String ext;
        public String rival_hls_url;
        public String rival_rtmp_url;
        public String rival_session;
        public Long winning_num;

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
        public Builder(AlaChallengeInfo alaChallengeInfo) {
            super(alaChallengeInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {alaChallengeInfo};
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
            if (alaChallengeInfo == null) {
                return;
            }
            this.challenge_id = alaChallengeInfo.challenge_id;
            this.winning_num = alaChallengeInfo.winning_num;
            this.rival_session = alaChallengeInfo.rival_session;
            this.rival_rtmp_url = alaChallengeInfo.rival_rtmp_url;
            this.rival_hls_url = alaChallengeInfo.rival_hls_url;
            this.ext = alaChallengeInfo.ext;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AlaChallengeInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new AlaChallengeInfo(this, z, null) : (AlaChallengeInfo) invokeZ.objValue;
        }
    }

    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-1021810122, "Ltbclient/AlaChallengeInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-1021810122, "Ltbclient/AlaChallengeInfo;");
                return;
            }
        }
        DEFAULT_CHALLENGE_ID = 0L;
        DEFAULT_WINNING_NUM = 0L;
    }

    public /* synthetic */ AlaChallengeInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlaChallengeInfo(Builder builder, boolean z) {
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
            Long l = builder.challenge_id;
            if (l == null) {
                this.challenge_id = DEFAULT_CHALLENGE_ID;
            } else {
                this.challenge_id = l;
            }
            Long l2 = builder.winning_num;
            if (l2 == null) {
                this.winning_num = DEFAULT_WINNING_NUM;
            } else {
                this.winning_num = l2;
            }
            String str = builder.rival_session;
            if (str == null) {
                this.rival_session = "";
            } else {
                this.rival_session = str;
            }
            String str2 = builder.rival_rtmp_url;
            if (str2 == null) {
                this.rival_rtmp_url = "";
            } else {
                this.rival_rtmp_url = str2;
            }
            String str3 = builder.rival_hls_url;
            if (str3 == null) {
                this.rival_hls_url = "";
            } else {
                this.rival_hls_url = str3;
            }
            String str4 = builder.ext;
            if (str4 == null) {
                this.ext = "";
                return;
            } else {
                this.ext = str4;
                return;
            }
        }
        this.challenge_id = builder.challenge_id;
        this.winning_num = builder.winning_num;
        this.rival_session = builder.rival_session;
        this.rival_rtmp_url = builder.rival_rtmp_url;
        this.rival_hls_url = builder.rival_hls_url;
        this.ext = builder.ext;
    }
}
