package tbclient.RecommendFriend;

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
/* loaded from: classes3.dex */
public final class LikeUserInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final List<ForumInfo> DEFAULT_FORUM_INFO;
    public static final String DEFAULT_MESSAGE = "";
    public static final List<PostInfo> DEFAULT_POST_INFO;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<ForumInfo> forum_info;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String message;
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<PostInfo> post_info;
    @ProtoField(tag = 1)
    public final UserInfo user_info;

    /* loaded from: classes3.dex */
    public static final class Builder extends Message.Builder<LikeUserInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public List<ForumInfo> forum_info;
        public String message;
        public List<PostInfo> post_info;
        public UserInfo user_info;

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
        public Builder(LikeUserInfo likeUserInfo) {
            super(likeUserInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {likeUserInfo};
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
            if (likeUserInfo == null) {
                return;
            }
            this.user_info = likeUserInfo.user_info;
            this.forum_info = Message.copyOf(likeUserInfo.forum_info);
            this.post_info = Message.copyOf(likeUserInfo.post_info);
            this.message = likeUserInfo.message;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public LikeUserInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new LikeUserInfo(this, z, null) : (LikeUserInfo) invokeZ.objValue;
        }
    }

    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(1047375564, "Ltbclient/RecommendFriend/LikeUserInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(1047375564, "Ltbclient/RecommendFriend/LikeUserInfo;");
                return;
            }
        }
        DEFAULT_FORUM_INFO = Collections.emptyList();
        DEFAULT_POST_INFO = Collections.emptyList();
    }

    public /* synthetic */ LikeUserInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LikeUserInfo(Builder builder, boolean z) {
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
            this.user_info = builder.user_info;
            List<ForumInfo> list = builder.forum_info;
            if (list == null) {
                this.forum_info = DEFAULT_FORUM_INFO;
            } else {
                this.forum_info = Message.immutableCopyOf(list);
            }
            List<PostInfo> list2 = builder.post_info;
            if (list2 == null) {
                this.post_info = DEFAULT_POST_INFO;
            } else {
                this.post_info = Message.immutableCopyOf(list2);
            }
            String str = builder.message;
            if (str == null) {
                this.message = "";
                return;
            } else {
                this.message = str;
                return;
            }
        }
        this.user_info = builder.user_info;
        this.forum_info = Message.immutableCopyOf(builder.forum_info);
        this.post_info = Message.immutableCopyOf(builder.post_info);
        this.message = builder.message;
    }
}
