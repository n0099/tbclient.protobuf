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
public final class PbHotPost extends Message {
    public static /* synthetic */ Interceptable $ic;
    public static final List<HotPost> DEFAULT_HOT_POST_LIST;
    public static final Integer DEFAULT_NEED_HOT_POST;
    public static final Integer DEFAULT_NEED_POST_ZAN;
    public static final List<Post> DEFAULT_POST_LIST;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(label = Message.Label.REPEATED, tag = 4)
    public final List<HotPost> hot_post_list;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer need_hot_post;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer need_post_zan;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<Post> post_list;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<PbHotPost> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public List<HotPost> hot_post_list;
        public Integer need_hot_post;
        public Integer need_post_zan;
        public List<Post> post_list;

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
        public Builder(PbHotPost pbHotPost) {
            super(pbHotPost);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {pbHotPost};
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
            if (pbHotPost == null) {
                return;
            }
            this.post_list = Message.copyOf(pbHotPost.post_list);
            this.need_hot_post = pbHotPost.need_hot_post;
            this.need_post_zan = pbHotPost.need_post_zan;
            this.hot_post_list = Message.copyOf(pbHotPost.hot_post_list);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PbHotPost build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new PbHotPost(this, z, null) : (PbHotPost) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-512328758, "Ltbclient/PbHotPost;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-512328758, "Ltbclient/PbHotPost;");
                return;
            }
        }
        DEFAULT_POST_LIST = Collections.emptyList();
        DEFAULT_NEED_HOT_POST = 0;
        DEFAULT_NEED_POST_ZAN = 0;
        DEFAULT_HOT_POST_LIST = Collections.emptyList();
    }

    public /* synthetic */ PbHotPost(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PbHotPost(Builder builder, boolean z) {
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
            List<Post> list = builder.post_list;
            if (list == null) {
                this.post_list = DEFAULT_POST_LIST;
            } else {
                this.post_list = Message.immutableCopyOf(list);
            }
            Integer num = builder.need_hot_post;
            if (num == null) {
                this.need_hot_post = DEFAULT_NEED_HOT_POST;
            } else {
                this.need_hot_post = num;
            }
            Integer num2 = builder.need_post_zan;
            if (num2 == null) {
                this.need_post_zan = DEFAULT_NEED_POST_ZAN;
            } else {
                this.need_post_zan = num2;
            }
            List<HotPost> list2 = builder.hot_post_list;
            if (list2 == null) {
                this.hot_post_list = DEFAULT_HOT_POST_LIST;
                return;
            } else {
                this.hot_post_list = Message.immutableCopyOf(list2);
                return;
            }
        }
        this.post_list = Message.immutableCopyOf(builder.post_list);
        this.need_hot_post = builder.need_hot_post;
        this.need_post_zan = builder.need_post_zan;
        this.hot_post_list = Message.immutableCopyOf(builder.hot_post_list);
    }
}
