package tbclient.StoryReply;

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
import tbclient.User;
/* loaded from: classes9.dex */
public final class StoryReplyInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_CONTENT_TEXT = "";
    public static final Long DEFAULT_POST_ID;
    public static final Long DEFAULT_THREAD_ID;
    public static final Long DEFAULT_USER_ID;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 5)
    public final User author;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String content_text;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long post_id;
    @ProtoField(tag = 4, type = Message.Datatype.INT64)
    public final Long thread_id;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long user_id;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<StoryReplyInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public User author;
        public String content_text;
        public Long post_id;
        public Long thread_id;
        public Long user_id;

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
        public Builder(StoryReplyInfo storyReplyInfo) {
            super(storyReplyInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {storyReplyInfo};
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
            if (storyReplyInfo == null) {
                return;
            }
            this.post_id = storyReplyInfo.post_id;
            this.user_id = storyReplyInfo.user_id;
            this.content_text = storyReplyInfo.content_text;
            this.thread_id = storyReplyInfo.thread_id;
            this.author = storyReplyInfo.author;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public StoryReplyInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new StoryReplyInfo(this, z, null) : (StoryReplyInfo) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(659170440, "Ltbclient/StoryReply/StoryReplyInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(659170440, "Ltbclient/StoryReply/StoryReplyInfo;");
                return;
            }
        }
        DEFAULT_POST_ID = 0L;
        DEFAULT_USER_ID = 0L;
        DEFAULT_THREAD_ID = 0L;
    }

    public /* synthetic */ StoryReplyInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoryReplyInfo(Builder builder, boolean z) {
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
            Long l = builder.post_id;
            if (l == null) {
                this.post_id = DEFAULT_POST_ID;
            } else {
                this.post_id = l;
            }
            Long l2 = builder.user_id;
            if (l2 == null) {
                this.user_id = DEFAULT_USER_ID;
            } else {
                this.user_id = l2;
            }
            String str = builder.content_text;
            if (str == null) {
                this.content_text = "";
            } else {
                this.content_text = str;
            }
            Long l3 = builder.thread_id;
            if (l3 == null) {
                this.thread_id = DEFAULT_THREAD_ID;
            } else {
                this.thread_id = l3;
            }
            this.author = builder.author;
            return;
        }
        this.post_id = builder.post_id;
        this.user_id = builder.user_id;
        this.content_text = builder.content_text;
        this.thread_id = builder.thread_id;
        this.author = builder.author;
    }
}
