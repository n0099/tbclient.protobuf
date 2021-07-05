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
/* loaded from: classes10.dex */
public final class PbTopAgreePost extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_FORUM_TOP_LIST = "";
    public static final List<Long> DEFAULT_POST_ID_LIST;
    public static final List<Post> DEFAULT_POST_LIST;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String forum_top_list;
    @ProtoField(label = Message.Label.REPEATED, tag = 3, type = Message.Datatype.INT64)
    public final List<Long> post_id_list;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<Post> post_list;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<PbTopAgreePost> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String forum_top_list;
        public List<Long> post_id_list;
        public List<Post> post_list;

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
        public Builder(PbTopAgreePost pbTopAgreePost) {
            super(pbTopAgreePost);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {pbTopAgreePost};
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
            if (pbTopAgreePost == null) {
                return;
            }
            this.post_list = Message.copyOf(pbTopAgreePost.post_list);
            this.post_id_list = Message.copyOf(pbTopAgreePost.post_id_list);
            this.forum_top_list = pbTopAgreePost.forum_top_list;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PbTopAgreePost build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new PbTopAgreePost(this, z, null) : (PbTopAgreePost) invokeZ.objValue;
        }
    }

    /* loaded from: classes10.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-2011550584, "Ltbclient/PbTopAgreePost;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-2011550584, "Ltbclient/PbTopAgreePost;");
                return;
            }
        }
        DEFAULT_POST_LIST = Collections.emptyList();
        DEFAULT_POST_ID_LIST = Collections.emptyList();
    }

    public /* synthetic */ PbTopAgreePost(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PbTopAgreePost(Builder builder, boolean z) {
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
            List<Post> list = builder.post_list;
            if (list == null) {
                this.post_list = DEFAULT_POST_LIST;
            } else {
                this.post_list = Message.immutableCopyOf(list);
            }
            List<Long> list2 = builder.post_id_list;
            if (list2 == null) {
                this.post_id_list = DEFAULT_POST_ID_LIST;
            } else {
                this.post_id_list = Message.immutableCopyOf(list2);
            }
            String str = builder.forum_top_list;
            if (str == null) {
                this.forum_top_list = "";
                return;
            } else {
                this.forum_top_list = str;
                return;
            }
        }
        this.post_list = Message.immutableCopyOf(builder.post_list);
        this.post_id_list = Message.immutableCopyOf(builder.post_id_list);
        this.forum_top_list = builder.forum_top_list;
    }
}
