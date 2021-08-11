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
/* loaded from: classes2.dex */
public final class HotPost extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final List<PbContent> DEFAULT_CONTENT;
    public static final Integer DEFAULT_CREATE_TIME;
    public static final Integer DEFAULT_FLOOR;
    public static final String DEFAULT_PORTRAIT = "";
    public static final Long DEFAULT_POST_ID;
    public static final Integer DEFAULT_POST_NUM;
    public static final Long DEFAULT_THREAD_ID;
    public static final Long DEFAULT_USER_ID;
    public static final String DEFAULT_USER_NAME = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(label = Message.Label.REPEATED, tag = 7)
    public final List<PbContent> content;
    @ProtoField(tag = 8, type = Message.Datatype.UINT32)
    public final Integer create_time;
    @ProtoField(tag = 9, type = Message.Datatype.UINT32)
    public final Integer floor;
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String portrait;
    @ProtoField(tag = 2, type = Message.Datatype.UINT64)
    public final Long post_id;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer post_num;
    @ProtoField(tag = 5)
    public final PbPostZan post_zan;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long thread_id;
    @ProtoField(tag = 4, type = Message.Datatype.UINT64)
    public final Long user_id;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String user_name;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<HotPost> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public List<PbContent> content;
        public Integer create_time;
        public Integer floor;
        public String portrait;
        public Long post_id;
        public Integer post_num;
        public PbPostZan post_zan;
        public Long thread_id;
        public Long user_id;
        public String user_name;

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
        public Builder(HotPost hotPost) {
            super(hotPost);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {hotPost};
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
            if (hotPost == null) {
                return;
            }
            this.thread_id = hotPost.thread_id;
            this.post_id = hotPost.post_id;
            this.user_name = hotPost.user_name;
            this.user_id = hotPost.user_id;
            this.post_zan = hotPost.post_zan;
            this.post_num = hotPost.post_num;
            this.content = Message.copyOf(hotPost.content);
            this.create_time = hotPost.create_time;
            this.floor = hotPost.floor;
            this.portrait = hotPost.portrait;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public HotPost build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new HotPost(this, z, null) : (HotPost) invokeZ.objValue;
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
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(-30396872, "Ltbclient/HotPost;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(-30396872, "Ltbclient/HotPost;");
                return;
            }
        }
        DEFAULT_THREAD_ID = 0L;
        DEFAULT_POST_ID = 0L;
        DEFAULT_USER_ID = 0L;
        DEFAULT_POST_NUM = 0;
        DEFAULT_CONTENT = Collections.emptyList();
        DEFAULT_CREATE_TIME = 0;
        DEFAULT_FLOOR = 0;
    }

    public /* synthetic */ HotPost(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotPost(Builder builder, boolean z) {
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
            String str = builder.user_name;
            if (str == null) {
                this.user_name = "";
            } else {
                this.user_name = str;
            }
            Long l3 = builder.user_id;
            if (l3 == null) {
                this.user_id = DEFAULT_USER_ID;
            } else {
                this.user_id = l3;
            }
            this.post_zan = builder.post_zan;
            Integer num = builder.post_num;
            if (num == null) {
                this.post_num = DEFAULT_POST_NUM;
            } else {
                this.post_num = num;
            }
            List<PbContent> list = builder.content;
            if (list == null) {
                this.content = DEFAULT_CONTENT;
            } else {
                this.content = Message.immutableCopyOf(list);
            }
            Integer num2 = builder.create_time;
            if (num2 == null) {
                this.create_time = DEFAULT_CREATE_TIME;
            } else {
                this.create_time = num2;
            }
            Integer num3 = builder.floor;
            if (num3 == null) {
                this.floor = DEFAULT_FLOOR;
            } else {
                this.floor = num3;
            }
            String str2 = builder.portrait;
            if (str2 == null) {
                this.portrait = "";
                return;
            } else {
                this.portrait = str2;
                return;
            }
        }
        this.thread_id = builder.thread_id;
        this.post_id = builder.post_id;
        this.user_name = builder.user_name;
        this.user_id = builder.user_id;
        this.post_zan = builder.post_zan;
        this.post_num = builder.post_num;
        this.content = Message.immutableCopyOf(builder.content);
        this.create_time = builder.create_time;
        this.floor = builder.floor;
        this.portrait = builder.portrait;
    }
}
