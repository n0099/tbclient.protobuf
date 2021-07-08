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
import tbclient.Quote;
import tbclient.Zan;
/* loaded from: classes9.dex */
public final class MagicPostList extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_CONTENT_TEXT = "";
    public static final Integer DEFAULT_CREATE_TIME;
    public static final Integer DEFAULT_IS_COMMENT;
    public static final Long DEFAULT_POST_ID;
    public static final Integer DEFAULT_POST_NO;
    public static final Long DEFAULT_THREAD_ID;
    public static final String DEFAULT_TITLE = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String content_text;
    @ProtoField(tag = 6, type = Message.Datatype.UINT32)
    public final Integer create_time;
    @ProtoField(tag = 8, type = Message.Datatype.UINT32)
    public final Integer is_comment;
    @ProtoField(tag = 2, type = Message.Datatype.UINT64)
    public final Long post_id;
    @ProtoField(tag = 7, type = Message.Datatype.UINT32)
    public final Integer post_no;
    @ProtoField(tag = 10)
    public final Quote quote;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long thread_id;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String title;
    @ProtoField(tag = 3)
    public final UserInfo user_info;
    @ProtoField(tag = 9)
    public final Zan zan;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<MagicPostList> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String content_text;
        public Integer create_time;
        public Integer is_comment;
        public Long post_id;
        public Integer post_no;
        public Quote quote;
        public Long thread_id;
        public String title;
        public UserInfo user_info;
        public Zan zan;

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
        public Builder(MagicPostList magicPostList) {
            super(magicPostList);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {magicPostList};
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
            if (magicPostList == null) {
                return;
            }
            this.thread_id = magicPostList.thread_id;
            this.post_id = magicPostList.post_id;
            this.user_info = magicPostList.user_info;
            this.title = magicPostList.title;
            this.content_text = magicPostList.content_text;
            this.create_time = magicPostList.create_time;
            this.post_no = magicPostList.post_no;
            this.is_comment = magicPostList.is_comment;
            this.zan = magicPostList.zan;
            this.quote = magicPostList.quote;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public MagicPostList build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new MagicPostList(this, z, null) : (MagicPostList) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-717828077, "Ltbclient/Hottopic/MagicPostList;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-717828077, "Ltbclient/Hottopic/MagicPostList;");
                return;
            }
        }
        DEFAULT_THREAD_ID = 0L;
        DEFAULT_POST_ID = 0L;
        DEFAULT_CREATE_TIME = 0;
        DEFAULT_POST_NO = 0;
        DEFAULT_IS_COMMENT = 0;
    }

    public /* synthetic */ MagicPostList(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MagicPostList(Builder builder, boolean z) {
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
            Long l = builder.thread_id;
            if (l == null) {
                this.thread_id = DEFAULT_THREAD_ID;
            } else {
                this.thread_id = l;
            }
            Long l2 = builder.post_id;
            if (l2 == null) {
                this.post_id = DEFAULT_POST_ID;
            } else {
                this.post_id = l2;
            }
            this.user_info = builder.user_info;
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            String str2 = builder.content_text;
            if (str2 == null) {
                this.content_text = "";
            } else {
                this.content_text = str2;
            }
            Integer num = builder.create_time;
            if (num == null) {
                this.create_time = DEFAULT_CREATE_TIME;
            } else {
                this.create_time = num;
            }
            Integer num2 = builder.post_no;
            if (num2 == null) {
                this.post_no = DEFAULT_POST_NO;
            } else {
                this.post_no = num2;
            }
            Integer num3 = builder.is_comment;
            if (num3 == null) {
                this.is_comment = DEFAULT_IS_COMMENT;
            } else {
                this.is_comment = num3;
            }
            this.zan = builder.zan;
            this.quote = builder.quote;
            return;
        }
        this.thread_id = builder.thread_id;
        this.post_id = builder.post_id;
        this.user_info = builder.user_info;
        this.title = builder.title;
        this.content_text = builder.content_text;
        this.create_time = builder.create_time;
        this.post_no = builder.post_no;
        this.is_comment = builder.is_comment;
        this.zan = builder.zan;
        this.quote = builder.quote;
    }
}
