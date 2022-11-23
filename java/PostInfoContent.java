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
import java.util.Collections;
import java.util.List;
/* loaded from: classes9.dex */
public final class PostInfoContent extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Long DEFAULT_CREATE_TIME;
    public static final Integer DEFAULT_IS_AUTHOR_VIEW;
    public static final List<Abstract> DEFAULT_POST_CONTENT;
    public static final Long DEFAULT_POST_ID;
    public static final Long DEFAULT_POST_TYPE;
    public static final String DEFAULT_TARGET_SCHEME = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 2, type = Message.Datatype.UINT64)
    public final Long create_time;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer is_author_view;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<Abstract> post_content;
    @ProtoField(tag = 4, type = Message.Datatype.UINT64)
    public final Long post_id;
    @ProtoField(tag = 3, type = Message.Datatype.UINT64)
    public final Long post_type;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String target_scheme;
    @ProtoField(tag = 6)
    public final WorksInfo works_info;

    /* loaded from: classes9.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<PostInfoContent> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Long create_time;
        public Integer is_author_view;
        public List<Abstract> post_content;
        public Long post_id;
        public Long post_type;
        public String target_scheme;
        public WorksInfo works_info;

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
        public Builder(PostInfoContent postInfoContent) {
            super(postInfoContent);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {postInfoContent};
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
            if (postInfoContent == null) {
                return;
            }
            this.post_content = Message.copyOf(postInfoContent.post_content);
            this.create_time = postInfoContent.create_time;
            this.post_type = postInfoContent.post_type;
            this.post_id = postInfoContent.post_id;
            this.is_author_view = postInfoContent.is_author_view;
            this.works_info = postInfoContent.works_info;
            this.target_scheme = postInfoContent.target_scheme;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PostInfoContent build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new PostInfoContent(this, z, null);
            }
            return (PostInfoContent) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-716269734, "Ltbclient/PostInfoContent;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-716269734, "Ltbclient/PostInfoContent;");
                return;
            }
        }
        DEFAULT_POST_CONTENT = Collections.emptyList();
        DEFAULT_CREATE_TIME = 0L;
        DEFAULT_POST_TYPE = 0L;
        DEFAULT_POST_ID = 0L;
        DEFAULT_IS_AUTHOR_VIEW = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostInfoContent(Builder builder, boolean z) {
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
            List<Abstract> list = builder.post_content;
            if (list == null) {
                this.post_content = DEFAULT_POST_CONTENT;
            } else {
                this.post_content = Message.immutableCopyOf(list);
            }
            Long l = builder.create_time;
            if (l == null) {
                this.create_time = DEFAULT_CREATE_TIME;
            } else {
                this.create_time = l;
            }
            Long l2 = builder.post_type;
            if (l2 == null) {
                this.post_type = DEFAULT_POST_TYPE;
            } else {
                this.post_type = l2;
            }
            Long l3 = builder.post_id;
            if (l3 == null) {
                this.post_id = DEFAULT_POST_ID;
            } else {
                this.post_id = l3;
            }
            Integer num = builder.is_author_view;
            if (num == null) {
                this.is_author_view = DEFAULT_IS_AUTHOR_VIEW;
            } else {
                this.is_author_view = num;
            }
            this.works_info = builder.works_info;
            String str = builder.target_scheme;
            if (str == null) {
                this.target_scheme = "";
                return;
            } else {
                this.target_scheme = str;
                return;
            }
        }
        this.post_content = Message.immutableCopyOf(builder.post_content);
        this.create_time = builder.create_time;
        this.post_type = builder.post_type;
        this.post_id = builder.post_id;
        this.is_author_view = builder.is_author_view;
        this.works_info = builder.works_info;
        this.target_scheme = builder.target_scheme;
    }

    public /* synthetic */ PostInfoContent(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
