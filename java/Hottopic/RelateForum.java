package tbclient.Hottopic;

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
public final class RelateForum extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_AVATAR = "";
    public static final String DEFAULT_DESC = "";
    public static final Integer DEFAULT_FORUM_ID;
    public static final String DEFAULT_FORUM_NAME = "";
    public static final Integer DEFAULT_IS_LIKED;
    public static final Integer DEFAULT_MEMBER_NUM;
    public static final Integer DEFAULT_POST_NUM;
    public static final Integer DEFAULT_THREAD_NUM;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String avatar;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String desc;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer forum_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String forum_name;
    @ProtoField(tag = 8, type = Message.Datatype.UINT32)
    public final Integer is_liked;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer member_num;
    @ProtoField(tag = 7, type = Message.Datatype.UINT32)
    public final Integer post_num;
    @ProtoField(tag = 6, type = Message.Datatype.UINT32)
    public final Integer thread_num;

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
        public String desc;
        public Integer forum_id;
        public String forum_name;
        public Integer is_liked;
        public Integer member_num;
        public Integer post_num;
        public Integer thread_num;

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
        public Builder(RelateForum relateForum) {
            super(relateForum);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {relateForum};
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
            if (relateForum == null) {
                return;
            }
            this.forum_id = relateForum.forum_id;
            this.forum_name = relateForum.forum_name;
            this.avatar = relateForum.avatar;
            this.desc = relateForum.desc;
            this.member_num = relateForum.member_num;
            this.thread_num = relateForum.thread_num;
            this.post_num = relateForum.post_num;
            this.is_liked = relateForum.is_liked;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public RelateForum build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new RelateForum(this, z, null);
            }
            return (RelateForum) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-346881706, "Ltbclient/Hottopic/RelateForum;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-346881706, "Ltbclient/Hottopic/RelateForum;");
                return;
            }
        }
        DEFAULT_FORUM_ID = 0;
        DEFAULT_MEMBER_NUM = 0;
        DEFAULT_THREAD_NUM = 0;
        DEFAULT_POST_NUM = 0;
        DEFAULT_IS_LIKED = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RelateForum(Builder builder, boolean z) {
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
            Integer num = builder.forum_id;
            if (num == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = num;
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
            String str3 = builder.desc;
            if (str3 == null) {
                this.desc = "";
            } else {
                this.desc = str3;
            }
            Integer num2 = builder.member_num;
            if (num2 == null) {
                this.member_num = DEFAULT_MEMBER_NUM;
            } else {
                this.member_num = num2;
            }
            Integer num3 = builder.thread_num;
            if (num3 == null) {
                this.thread_num = DEFAULT_THREAD_NUM;
            } else {
                this.thread_num = num3;
            }
            Integer num4 = builder.post_num;
            if (num4 == null) {
                this.post_num = DEFAULT_POST_NUM;
            } else {
                this.post_num = num4;
            }
            Integer num5 = builder.is_liked;
            if (num5 == null) {
                this.is_liked = DEFAULT_IS_LIKED;
                return;
            } else {
                this.is_liked = num5;
                return;
            }
        }
        this.forum_id = builder.forum_id;
        this.forum_name = builder.forum_name;
        this.avatar = builder.avatar;
        this.desc = builder.desc;
        this.member_num = builder.member_num;
        this.thread_num = builder.thread_num;
        this.post_num = builder.post_num;
        this.is_liked = builder.is_liked;
    }

    public /* synthetic */ RelateForum(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
