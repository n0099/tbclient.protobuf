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
public final class GuessLikeThreadInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Long DEFAULT_FORUM_ID;
    public static final String DEFAULT_FORUM_NAME = "";
    public static final String DEFAULT_RECOM_COVER = "";
    public static final String DEFAULT_RECOM_REASON = "";
    public static final Long DEFAULT_REPLY_NUM;
    public static final Long DEFAULT_THREAD_ID;
    public static final String DEFAULT_TITLE = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long forum_id;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String forum_name;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String recom_cover;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String recom_reason;
    @ProtoField(tag = 4, type = Message.Datatype.INT64)
    public final Long reply_num;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long thread_id;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String title;

    /* loaded from: classes9.dex */
    public /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public final class Builder extends Message.Builder {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Long forum_id;
        public String forum_name;
        public String recom_cover;
        public String recom_reason;
        public Long reply_num;
        public Long thread_id;
        public String title;

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
        public Builder(GuessLikeThreadInfo guessLikeThreadInfo) {
            super(guessLikeThreadInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {guessLikeThreadInfo};
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
            if (guessLikeThreadInfo == null) {
                return;
            }
            this.thread_id = guessLikeThreadInfo.thread_id;
            this.forum_id = guessLikeThreadInfo.forum_id;
            this.forum_name = guessLikeThreadInfo.forum_name;
            this.reply_num = guessLikeThreadInfo.reply_num;
            this.recom_cover = guessLikeThreadInfo.recom_cover;
            this.recom_reason = guessLikeThreadInfo.recom_reason;
            this.title = guessLikeThreadInfo.title;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GuessLikeThreadInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new GuessLikeThreadInfo(this, z, null);
            }
            return (GuessLikeThreadInfo) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(324161119, "Ltbclient/GuessLikeThreadInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(324161119, "Ltbclient/GuessLikeThreadInfo;");
                return;
            }
        }
        DEFAULT_THREAD_ID = 0L;
        DEFAULT_FORUM_ID = 0L;
        DEFAULT_REPLY_NUM = 0L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GuessLikeThreadInfo(Builder builder, boolean z) {
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
            Long l2 = builder.forum_id;
            if (l2 == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = l2;
            }
            String str = builder.forum_name;
            if (str == null) {
                this.forum_name = "";
            } else {
                this.forum_name = str;
            }
            Long l3 = builder.reply_num;
            if (l3 == null) {
                this.reply_num = DEFAULT_REPLY_NUM;
            } else {
                this.reply_num = l3;
            }
            String str2 = builder.recom_cover;
            if (str2 == null) {
                this.recom_cover = "";
            } else {
                this.recom_cover = str2;
            }
            String str3 = builder.recom_reason;
            if (str3 == null) {
                this.recom_reason = "";
            } else {
                this.recom_reason = str3;
            }
            String str4 = builder.title;
            if (str4 == null) {
                this.title = "";
                return;
            } else {
                this.title = str4;
                return;
            }
        }
        this.thread_id = builder.thread_id;
        this.forum_id = builder.forum_id;
        this.forum_name = builder.forum_name;
        this.reply_num = builder.reply_num;
        this.recom_cover = builder.recom_cover;
        this.recom_reason = builder.recom_reason;
        this.title = builder.title;
    }

    public /* synthetic */ GuessLikeThreadInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
