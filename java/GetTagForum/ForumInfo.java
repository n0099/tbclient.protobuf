package tbclient.GetTagForum;

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
public final class ForumInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_AVATAR = "";
    public static final Integer DEFAULT_CONCERN_NUM;
    public static final Long DEFAULT_FORUM_ID;
    public static final String DEFAULT_FORUM_NAME = "";
    public static final Integer DEFAULT_POST_NUM;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String avatar;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer concern_num;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long forum_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String forum_name;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer post_num;

    /* loaded from: classes9.dex */
    public /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public final class Builder extends Message.Builder {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String avatar;
        public Integer concern_num;
        public Long forum_id;
        public String forum_name;
        public Integer post_num;

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
        public Builder(ForumInfo forumInfo) {
            super(forumInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {forumInfo};
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
            if (forumInfo == null) {
                return;
            }
            this.forum_id = forumInfo.forum_id;
            this.forum_name = forumInfo.forum_name;
            this.concern_num = forumInfo.concern_num;
            this.post_num = forumInfo.post_num;
            this.avatar = forumInfo.avatar;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ForumInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new ForumInfo(this, z, null);
            }
            return (ForumInfo) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(1486531688, "Ltbclient/GetTagForum/ForumInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(1486531688, "Ltbclient/GetTagForum/ForumInfo;");
                return;
            }
        }
        DEFAULT_FORUM_ID = 0L;
        DEFAULT_CONCERN_NUM = 0;
        DEFAULT_POST_NUM = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ForumInfo(Builder builder, boolean z) {
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
            Integer num = builder.concern_num;
            if (num == null) {
                this.concern_num = DEFAULT_CONCERN_NUM;
            } else {
                this.concern_num = num;
            }
            Integer num2 = builder.post_num;
            if (num2 == null) {
                this.post_num = DEFAULT_POST_NUM;
            } else {
                this.post_num = num2;
            }
            String str2 = builder.avatar;
            if (str2 == null) {
                this.avatar = "";
                return;
            } else {
                this.avatar = str2;
                return;
            }
        }
        this.forum_id = builder.forum_id;
        this.forum_name = builder.forum_name;
        this.concern_num = builder.concern_num;
        this.post_num = builder.post_num;
        this.avatar = builder.avatar;
    }

    public /* synthetic */ ForumInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
