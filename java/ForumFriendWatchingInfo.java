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
public final class ForumFriendWatchingInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_FORUM_AVATAR = "";
    public static final String DEFAULT_FORUM_NAME = "";
    public static final Integer DEFAULT_SHOW_NUM;
    public static final String DEFAULT_SHOW_TYPE = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String forum_avatar;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String forum_name;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer show_num;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String show_type;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<ForumFriendWatchingInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String forum_avatar;
        public String forum_name;
        public Integer show_num;
        public String show_type;

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
        public Builder(ForumFriendWatchingInfo forumFriendWatchingInfo) {
            super(forumFriendWatchingInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {forumFriendWatchingInfo};
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
            if (forumFriendWatchingInfo == null) {
                return;
            }
            this.forum_avatar = forumFriendWatchingInfo.forum_avatar;
            this.forum_name = forumFriendWatchingInfo.forum_name;
            this.show_num = forumFriendWatchingInfo.show_num;
            this.show_type = forumFriendWatchingInfo.show_type;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ForumFriendWatchingInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new ForumFriendWatchingInfo(this, z, null) : (ForumFriendWatchingInfo) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-1713644955, "Ltbclient/ForumFriendWatchingInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-1713644955, "Ltbclient/ForumFriendWatchingInfo;");
                return;
            }
        }
        DEFAULT_SHOW_NUM = 0;
    }

    public /* synthetic */ ForumFriendWatchingInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ForumFriendWatchingInfo(Builder builder, boolean z) {
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
            String str = builder.forum_avatar;
            if (str == null) {
                this.forum_avatar = "";
            } else {
                this.forum_avatar = str;
            }
            String str2 = builder.forum_name;
            if (str2 == null) {
                this.forum_name = "";
            } else {
                this.forum_name = str2;
            }
            Integer num = builder.show_num;
            if (num == null) {
                this.show_num = DEFAULT_SHOW_NUM;
            } else {
                this.show_num = num;
            }
            String str3 = builder.show_type;
            if (str3 == null) {
                this.show_type = "";
                return;
            } else {
                this.show_type = str3;
                return;
            }
        }
        this.forum_avatar = builder.forum_avatar;
        this.forum_name = builder.forum_name;
        this.show_num = builder.show_num;
        this.show_type = builder.show_type;
    }
}
