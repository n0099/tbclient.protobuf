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
public final class ForumDynamic extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_AVATAR = "";
    public static final Long DEFAULT_FORUM_ID;
    public static final String DEFAULT_FORUM_NAME = "";
    public static final Integer DEFAULT_IS_LIKE;
    public static final Integer DEFAULT_MEMBER_COUNT;
    public static final String DEFAULT_SLOGAN = "";
    public static final Integer DEFAULT_THREAD_COUNT;
    public static final String DEFAULT_TITLE = "";
    public static final Integer DEFAULT_USER_THREAD_COUNT;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String avatar;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long forum_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String forum_name;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer is_like;
    @ProtoField(tag = 6, type = Message.Datatype.UINT32)
    public final Integer member_count;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String slogan;
    @ProtoField(tag = 7, type = Message.Datatype.UINT32)
    public final Integer thread_count;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 9, type = Message.Datatype.UINT32)
    public final Integer user_thread_count;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<ForumDynamic> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String avatar;
        public Long forum_id;
        public String forum_name;
        public Integer is_like;
        public Integer member_count;
        public String slogan;
        public Integer thread_count;
        public String title;
        public Integer user_thread_count;

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
        public Builder(ForumDynamic forumDynamic) {
            super(forumDynamic);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {forumDynamic};
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
            if (forumDynamic == null) {
                return;
            }
            this.forum_id = forumDynamic.forum_id;
            this.forum_name = forumDynamic.forum_name;
            this.avatar = forumDynamic.avatar;
            this.slogan = forumDynamic.slogan;
            this.is_like = forumDynamic.is_like;
            this.member_count = forumDynamic.member_count;
            this.thread_count = forumDynamic.thread_count;
            this.title = forumDynamic.title;
            this.user_thread_count = forumDynamic.user_thread_count;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ForumDynamic build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new ForumDynamic(this, z, null) : (ForumDynamic) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-1337320589, "Ltbclient/ForumDynamic;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-1337320589, "Ltbclient/ForumDynamic;");
                return;
            }
        }
        DEFAULT_FORUM_ID = 0L;
        DEFAULT_IS_LIKE = 0;
        DEFAULT_MEMBER_COUNT = 0;
        DEFAULT_THREAD_COUNT = 0;
        DEFAULT_USER_THREAD_COUNT = 0;
    }

    public /* synthetic */ ForumDynamic(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ForumDynamic(Builder builder, boolean z) {
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
            String str2 = builder.avatar;
            if (str2 == null) {
                this.avatar = "";
            } else {
                this.avatar = str2;
            }
            String str3 = builder.slogan;
            if (str3 == null) {
                this.slogan = "";
            } else {
                this.slogan = str3;
            }
            Integer num = builder.is_like;
            if (num == null) {
                this.is_like = DEFAULT_IS_LIKE;
            } else {
                this.is_like = num;
            }
            Integer num2 = builder.member_count;
            if (num2 == null) {
                this.member_count = DEFAULT_MEMBER_COUNT;
            } else {
                this.member_count = num2;
            }
            Integer num3 = builder.thread_count;
            if (num3 == null) {
                this.thread_count = DEFAULT_THREAD_COUNT;
            } else {
                this.thread_count = num3;
            }
            String str4 = builder.title;
            if (str4 == null) {
                this.title = "";
            } else {
                this.title = str4;
            }
            Integer num4 = builder.user_thread_count;
            if (num4 == null) {
                this.user_thread_count = DEFAULT_USER_THREAD_COUNT;
                return;
            } else {
                this.user_thread_count = num4;
                return;
            }
        }
        this.forum_id = builder.forum_id;
        this.forum_name = builder.forum_name;
        this.avatar = builder.avatar;
        this.slogan = builder.slogan;
        this.is_like = builder.is_like;
        this.member_count = builder.member_count;
        this.thread_count = builder.thread_count;
        this.title = builder.title;
        this.user_thread_count = builder.user_thread_count;
    }
}
