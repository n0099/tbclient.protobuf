package tbclient.GetForumsFromForumClass;

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
public final class ForumSpaceForumInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_ABSTRACT = "";
    public static final String DEFAULT_AVATAR = "";
    public static final Long DEFAULT_FORUM_ID;
    public static final String DEFAULT_FORUM_NAME = "";
    public static final Integer DEFAULT_IS_LIKE;
    public static final Integer DEFAULT_LIKE_NUM;
    public static final Integer DEFAULT_POST_NUM;
    public static final Integer DEFAULT_RANK;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String _abstract;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String avatar;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long forum_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String forum_name;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer is_like;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer like_num;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer post_num;
    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer rank;

    /* loaded from: classes5.dex */
    public static final class Builder extends Message.Builder<ForumSpaceForumInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String _abstract;
        public String avatar;
        public Long forum_id;
        public String forum_name;
        public Integer is_like;
        public Integer like_num;
        public Integer post_num;
        public Integer rank;

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
        public Builder(ForumSpaceForumInfo forumSpaceForumInfo) {
            super(forumSpaceForumInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {forumSpaceForumInfo};
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
            if (forumSpaceForumInfo == null) {
                return;
            }
            this.forum_id = forumSpaceForumInfo.forum_id;
            this.forum_name = forumSpaceForumInfo.forum_name;
            this._abstract = forumSpaceForumInfo._abstract;
            this.like_num = forumSpaceForumInfo.like_num;
            this.post_num = forumSpaceForumInfo.post_num;
            this.avatar = forumSpaceForumInfo.avatar;
            this.is_like = forumSpaceForumInfo.is_like;
            this.rank = forumSpaceForumInfo.rank;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ForumSpaceForumInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new ForumSpaceForumInfo(this, z, null) : (ForumSpaceForumInfo) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(1654927009, "Ltbclient/GetForumsFromForumClass/ForumSpaceForumInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(1654927009, "Ltbclient/GetForumsFromForumClass/ForumSpaceForumInfo;");
                return;
            }
        }
        DEFAULT_FORUM_ID = 0L;
        DEFAULT_LIKE_NUM = 0;
        DEFAULT_POST_NUM = 0;
        DEFAULT_IS_LIKE = 0;
        DEFAULT_RANK = 0;
    }

    public /* synthetic */ ForumSpaceForumInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ForumSpaceForumInfo(Builder builder, boolean z) {
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
            Long l = builder.forum_id;
            if (l == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = l;
            }
            String str = builder.forum_name;
            if (str == null) {
                this.forum_name = "";
            } else {
                this.forum_name = str;
            }
            String str2 = builder._abstract;
            if (str2 == null) {
                this._abstract = "";
            } else {
                this._abstract = str2;
            }
            Integer num = builder.like_num;
            if (num == null) {
                this.like_num = DEFAULT_LIKE_NUM;
            } else {
                this.like_num = num;
            }
            Integer num2 = builder.post_num;
            if (num2 == null) {
                this.post_num = DEFAULT_POST_NUM;
            } else {
                this.post_num = num2;
            }
            String str3 = builder.avatar;
            if (str3 == null) {
                this.avatar = "";
            } else {
                this.avatar = str3;
            }
            Integer num3 = builder.is_like;
            if (num3 == null) {
                this.is_like = DEFAULT_IS_LIKE;
            } else {
                this.is_like = num3;
            }
            Integer num4 = builder.rank;
            if (num4 == null) {
                this.rank = DEFAULT_RANK;
                return;
            } else {
                this.rank = num4;
                return;
            }
        }
        this.forum_id = builder.forum_id;
        this.forum_name = builder.forum_name;
        this._abstract = builder._abstract;
        this.like_num = builder.like_num;
        this.post_num = builder.post_num;
        this.avatar = builder.avatar;
        this.is_like = builder.is_like;
        this.rank = builder.rank;
    }
}
