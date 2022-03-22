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
/* loaded from: classes8.dex */
public final class PostList extends Message {
    public static /* synthetic */ Interceptable $ic;
    public static final List<Abstract> DEFAULT_ABSTRACT;
    public static final Long DEFAULT_AUTHOR_ID;
    public static final Long DEFAULT_ID;
    public static final List<Media> DEFAULT_MEDIA;
    public static final List<MediaNum> DEFAULT_MEDIA_NUM;
    public static final List<Voice> DEFAULT_VOICE_INFO;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<Abstract> _abstract;
    @ProtoField(tag = 8)
    public final Agree agree;
    @ProtoField(tag = 2)
    public final User author;
    @ProtoField(tag = 7, type = Message.Datatype.INT64)
    public final Long author_id;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long id;
    @ProtoField(label = Message.Label.REPEATED, tag = 4)
    public final List<Media> media;
    @ProtoField(label = Message.Label.REPEATED, tag = 5)
    public final List<MediaNum> media_num;
    @ProtoField(label = Message.Label.REPEATED, tag = 6)
    public final List<Voice> voice_info;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<PostList> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public List<Abstract> _abstract;
        public Agree agree;
        public User author;
        public Long author_id;
        public Long id;
        public List<Media> media;
        public List<MediaNum> media_num;
        public List<Voice> voice_info;

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
        public Builder(PostList postList) {
            super(postList);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {postList};
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
            if (postList == null) {
                return;
            }
            this.id = postList.id;
            this.author = postList.author;
            this._abstract = Message.copyOf(postList._abstract);
            this.media = Message.copyOf(postList.media);
            this.media_num = Message.copyOf(postList.media_num);
            this.voice_info = Message.copyOf(postList.voice_info);
            this.author_id = postList.author_id;
            this.agree = postList.agree;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PostList build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new PostList(this, z, null) : (PostList) invokeZ.objValue;
        }
    }

    /* loaded from: classes8.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(1888455923, "Ltbclient/PostList;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(1888455923, "Ltbclient/PostList;");
                return;
            }
        }
        DEFAULT_ID = 0L;
        DEFAULT_ABSTRACT = Collections.emptyList();
        DEFAULT_MEDIA = Collections.emptyList();
        DEFAULT_MEDIA_NUM = Collections.emptyList();
        DEFAULT_VOICE_INFO = Collections.emptyList();
        DEFAULT_AUTHOR_ID = 0L;
    }

    public /* synthetic */ PostList(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostList(Builder builder, boolean z) {
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
            Long l = builder.id;
            if (l == null) {
                this.id = DEFAULT_ID;
            } else {
                this.id = l;
            }
            this.author = builder.author;
            List<Abstract> list = builder._abstract;
            if (list == null) {
                this._abstract = DEFAULT_ABSTRACT;
            } else {
                this._abstract = Message.immutableCopyOf(list);
            }
            List<Media> list2 = builder.media;
            if (list2 == null) {
                this.media = DEFAULT_MEDIA;
            } else {
                this.media = Message.immutableCopyOf(list2);
            }
            List<MediaNum> list3 = builder.media_num;
            if (list3 == null) {
                this.media_num = DEFAULT_MEDIA_NUM;
            } else {
                this.media_num = Message.immutableCopyOf(list3);
            }
            List<Voice> list4 = builder.voice_info;
            if (list4 == null) {
                this.voice_info = DEFAULT_VOICE_INFO;
            } else {
                this.voice_info = Message.immutableCopyOf(list4);
            }
            Long l2 = builder.author_id;
            if (l2 == null) {
                this.author_id = DEFAULT_AUTHOR_ID;
            } else {
                this.author_id = l2;
            }
            this.agree = builder.agree;
            return;
        }
        this.id = builder.id;
        this.author = builder.author;
        this._abstract = Message.immutableCopyOf(builder._abstract);
        this.media = Message.immutableCopyOf(builder.media);
        this.media_num = Message.immutableCopyOf(builder.media_num);
        this.voice_info = Message.immutableCopyOf(builder.voice_info);
        this.author_id = builder.author_id;
        this.agree = builder.agree;
    }
}
